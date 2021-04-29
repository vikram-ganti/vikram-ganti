#${path};${filename};${target.schema};${target.table};${job.name.initial};${extract.date.file.name}
#${path};${filename};${StagingSchema};${StageTable};${StageJobInitial};${extract.date.file.name};${CodeSubRoot};${StageScript}


# UNIX path under which NiFi will look for all the PySpark Python scripts
export SPARK_PATH=/home/nfadmin/projects/adi_base/
#echo $SPARK_PATH
# The File archival path, the "raw" folder name is hardcoded here
#export ARCHIVE_PATH=$7/../ARCHIVE

export SPARK_MAJOR_VERSION=2
export H_Status=0

typeset spark_status=0
typeset line_count_status=0

export pyspark_file=$7/$8

###################### LOG ATTRIBUTE ###########################
run_id=$(date +%F%T|sed 's/-//g'|sed 's/://g')
LOAD_DATE=$(date +%Y%m%d)
load_dir=$SPARK_PATH/ADI_log/$LOAD_DATE
if [ ! -d $load_dir ] ; then
mkdir -p $load_dir
chmod -R 777 $load_dir
fi
load_log=$load_dir/$5_$run_id.log
###################### LOG ATTRIBUTE ###########################


#Log the command in use and then submit the job
echo "Spark Stage Load for Job $5" >> $load_log 2>&1
echo "spark-submit --master yarn-client $SPARK_PATH/$pyspark_file $1 $2 $3 $4 $5 $6" >> $load_log 2>&1
spark-submit --master yarn-client $SPARK_PATH/$pyspark_file $1 $2 $3 $4 $5 $6 >> $load_log 2>&1
spark_status=$?
if [[ $spark_status != 0 ]]
then 
   exit 1
fi

