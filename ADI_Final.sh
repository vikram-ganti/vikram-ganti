#${path};${filename};${StagingSchema};${StageTable};${job.name.initial};${extract.date.file.name}
#${path}|${filename}|${StagingSchema}|${final.table.name}|${final.job.name.initial}|${extract.date.file.name}|${StageTable}|${LoaderViewName}|${completionTriggerLocation}|${HIVEConnectionURL}


# UNIX path under which NiFi will look for all the PySpark Python scripts
export SPARK_PATH=/home/nfadmin/projects/adi_base/
# The File archival path, the "raw" folder name is hardcoded here
export ARCHIVE_PATH=$1/../archive

export SPARK_MAJOR_VERSION=2
export H_Status=0

typeset spark_status=0
typeset spark_status1=0
typeset spark_status2=0
typeset spark_status3=0
typeset line_count_status=0

hdfs_base=$1

###################### LOG ATTRIBUTE ###########################
run_id=$(date +%F%T|sed 's/-//g'|sed 's/://g')
LOAD_DATE=$(date +%Y%m%d)
load_dir=$SPARK_PATH/ADI_log/$LOAD_DATE
if [ ! -d $load_dir ] ; then
mkdir -p $load_dir
chmod -R 777 $load_dir
fi
load_log=$load_dir/$3_$5_Final_Load_$run_id.log
###################### LOG ATTRIBUTE ###########################


# Create archival subdirectory under "raw" with load date as name
hdfs dfs -mkdir -p $ARCHIVE_PATH/$6  >> $load_log 2>&1
# Copy the file to Archival folder
hdfs dfs -cp $1/$2 $ARCHIVE_PATH/$6/  >> $load_log 2>&1
hdfs dfs -rm -skipTrash $1/$2 >> $load_log 2>&1
# Rename the archived file to original name of .txt
hdfs dfs -mv $ARCHIVE_PATH/$6/$2 $ARCHIVE_PATH/$6/$(sed -e s/_$6.csv/.txt/g <<< $2)  >> $load_log 2>&1

# Check if after archival there remains any data file to be processed. 
dir_empty=true
#hdfs_base=$7
for filename in `hdfs dfs -ls $hdfs_base | awk '{print $NF}' | grep .csv$`; 
do 
  dir_empty=false
done

# If the directory is empty we can go ahead with the final load process. This was the last file to be
# processed under the source folder.
if [ $dir_empty == true ]
then

  case $7 in
	BSID_STG)
		export pyspark_file=AR_CUST_LOADER
		;;
	BSAD_STG)
		export pyspark_file=AR_CUST_LOADER
		;;
	BSIS_STG)
		export pyspark_file=GL_ACCNT_LOADER
		;;
	BSAS_STG)
		export pyspark_file=GL_ACCNT_LOADER
		;;
	BSIK_STG)
		export pyspark_file=AP_VEND_LOADER
		;;
	BSAK_STG)
		export pyspark_file=AP_VEND_LOADER
		;;
  esac

  # Check if the "pyspark_file" UNIX variable is set, if it is set then this is time for load and
  # we need to submit the PySpark job using the file mentioned by this variable.
  if [ -z ${pyspark_file:+x} ] 
  then
     echo "No final load operation needed for this file type." >> $load_log 2>&1
  else

    #if [[ $(date +%u) -eq 6 && $(date +%d) -lt 8 ]]; then
    #   export pyspark_file="${pyspark_file}_FULL_REFRESH"
    #fi

    echo "Final Spark Data Load Started for Job $1" >> $load_log 2>&1

    #Executor need to be added if any optimization is required  INCOMPLETE, PENDING REQUIREMENT
    #echo "spark-submit --driver-memory 20g --executor-memory 25g --master yarn --num-executors 15 --driver-cores 20 --conf spark.executor.memoryOverhead=2048 --conf spark.dynamicAllocation.enabled="true" --conf spark.shuffle.service.enabled="true" --conf spark.dynamicAllocation.minExecutors=5 --conf spark.dynamicAllocation.maxExecutors=30 --conf spark.dynamicAllocation.initialExecutors=10 --conf spark.scheduler.listenerbus.eventqueue.size=50000 --conf spark.scheduler.listenerbus.eventqueue.capacity=50000 $SPARK_PATH/$pyspark_file.py $3 $4_MINIMAL1 $5 $6" >> $load_log 2>&1
    #spark-submit --driver-memory 20g --executor-memory 25g --master yarn --num-executors 15 --driver-cores 20 --conf spark.executor.memoryOverhead=2048 --conf spark.dynamicAllocation.enabled="true" --conf spark.shuffle.service.enabled="true" --conf spark.dynamicAllocation.minExecutors=5 --conf spark.dynamicAllocation.maxExecutors=30 --conf spark.dynamicAllocation.initialExecutors=10 --conf spark.scheduler.listenerbus.eventqueue.size=50000 --conf spark.scheduler.listenerbus.eventqueue.capacity=50000 $SPARK_PATH/$pyspark_file.py $3 $4 $5 $6 >> $load_log 2>&1

    #echo "beeline -u $10 -e INSERT INTO $3.$4 SELECT * FROM $3.$8;" >> $load_log 2>&1
    #beeline -u $10 -e "INSERT INTO $3.$4 SELECT * FROM $3.$8;"

    spark_status=$?
  fi

  echo STATUS2 $? >> $load_log 2>&1
  # Archive all the non processable files still there in the input location, e.g. Checksum files. The input folder should 
  # be empty for the next batch of delivery. 
  echo "hdfs dfs -mv $hdfs_base/* $ARCHIVE_PATH/$6/" >> $load_log 2>&1
  hdfs dfs -mv $hdfs_base/* $ARCHIVE_PATH/$6/ >> $load_log 2>&1
  echo STATUS3 $? >> $load_log 2>&1
  
  source_dir_empty=true
  for filename in `hdfs dfs -ls -R $1/ | sed '1d;s/  */ /g' | cut -d\  -f 1,8 --output-delimiter=',' | grep ^- | cut -d, -f2`; 
  do 
    echo $filename
    source_dir_empty=false
  done
  echo STATUS4 $? >> $load_log 2>&1
  
  if [ $source_dir_empty == true ]
  then
    spark-submit --driver-memory 20g --executor-memory 25g --master yarn --num-executors 15 --driver-cores 20 --conf spark.executor.memoryOverhead=2048 --conf spark.dynamicAllocation.enabled="true" --conf spark.shuffle.service.enabled="true" --conf spark.dynamicAllocation.minExecutors=5 --conf spark.dynamicAllocation.maxExecutors=30 --conf spark.dynamicAllocation.initialExecutors=10 --conf spark.scheduler.listenerbus.eventqueue.size=50000 --conf spark.scheduler.listenerbus.eventqueue.capacity=50000 $SPARK_PATH/AR_CUST_LOADER.py $3 AR_CUST_VIEW AR_CUST_LOADER_ $6 >> $load_log 2>&1
    spark_status1=$?
    spark-submit --driver-memory 20g --executor-memory 25g --master yarn --num-executors 15 --driver-cores 20 --conf spark.executor.memoryOverhead=2048 --conf spark.dynamicAllocation.enabled="true" --conf spark.shuffle.service.enabled="true" --conf spark.dynamicAllocation.minExecutors=5 --conf spark.dynamicAllocation.maxExecutors=30 --conf spark.dynamicAllocation.initialExecutors=10 --conf spark.scheduler.listenerbus.eventqueue.size=50000 --conf spark.scheduler.listenerbus.eventqueue.capacity=50000 $SPARK_PATH/AP_VEND_LOADER.py $3 AP_VEND_VIEW AP_VEND_LOADER_ $6 >> $load_log 2>&1
    spark_status2=$?
    spark-submit --driver-memory 20g --executor-memory 25g --master yarn --num-executors 15 --driver-cores 20 --conf spark.executor.memoryOverhead=2048 --conf spark.dynamicAllocation.enabled="true" --conf spark.shuffle.service.enabled="true" --conf spark.dynamicAllocation.minExecutors=5 --conf spark.dynamicAllocation.maxExecutors=30 --conf spark.dynamicAllocation.initialExecutors=10 --conf spark.scheduler.listenerbus.eventqueue.size=50000 --conf spark.scheduler.listenerbus.eventqueue.capacity=50000 $SPARK_PATH/GL_ACCNT_LOADER.py $3 GL_ACCNT_VIEW GL_ACCNT_LOADER_ $6 >> $load_log 2>&1
    spark_status3=$?
    # All files processed for this group, touch the trigger file now
    echo "touch $9/$3_BTables_LOAD_COMPLETED.flg" >> $load_log 2>&1
    touch $9/$3_BTables_LOAD_COMPLETED.flg >> $load_log 2>&1
    echo "Flag Creation Status is " $? >> $load_log 2>&1
  fi
  
  if [[ $spark_status1 != 0 || $spark_status2 != 0 || $spark_status3 != 0 ]]
  then 
      exit 1
  fi

fi 
