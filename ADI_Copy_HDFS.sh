# sh ADI_Copy_HDFS.sh /home/inck1s02/input_root/KEU/ECC/INPUT KEU_ECC/INPUT keu.completed /user/inck1s02/SYSTEM_INPUT/SAP
#${absolute.path}|${INT_Path}|${path}|${HDFSPutRoot}|${StagingSchema}|${CodeSubRoot}|${ADICodeRoot}|${file_name}|${HIVEConnectionURL}
 ${absolute.path}|${INT_Path}|${path}|${HDFSPutRoot}|${StagingSchema}|${CodeSubRoot}|${ADICodeRoot}|${filename}|${HIVEConnectionURL}

export SPARK_PATH=/home/nfadmin/projects/adi_base/

hdfs_base=$4/$6/$2
hdfs_base="${hdfs_base,,}"
local_base=$1
replace_ext="_"`date +'%m%d%Y%H%M'`".csv"

###################### LOG ATTRIBUTE ###########################
run_id=$(date +%F%T|sed 's/-//g'|sed 's/://g')
LOAD_DATE=$(date +%Y%m%d)
load_dir=$SPARK_PATH/ADI_log/$LOAD_DATE
if [ ! -d $load_dir ] ; then
mkdir -p $load_dir
chmod -R 777 $load_dir
fi
load_log=$load_dir/$5_Copy_$run_id.log
###################### LOG ATTRIBUTE ###########################


sh $7/RefreshMaster.sh $5 $6 $9 >> $load_log 2>&1
typeset s_stat=$?
if [[ $s_stat -ne 0 ]] 
then 
  echo "Master table refresh failed."
  exit 1
fi 



echo $hdfs_base
echo $local_base
echo $replace_ext

PF_Copied=false

ID_Copied=false
AD_Copied=false

IS_Copied=false
AS_Copied=false

IK_Copied=false
AK_Copied=false

FA_Copied=false
UT_Copied=false
UK_Copied=false
CS_Copied=false

file_name=$8
batch_num=$(echo $file_name | cut -d'_' -f 2 | cut -d'.' -f 1)

for filename in `ls $local_base | awk '{print $NF}' | grep _$batch_num.txt$`; 
do 
  #r_name="${filename/.txt/$replace_ext}"
  r_name=$filename
  #echo `hdfs dfs -cp $filename $r_name`; 
  #hdfs dfs -rm -r -skipTrash $filename

  echo $filename
  leaf_folder=""
  if [[ $filename  = BKPF* ]] ; then
    leaf_folder="PF"
  elif [[ $filename  = BSID* ]] ; then
    leaf_folder="ADID"
  elif [[ $filename  = BSAD* ]] ; then
    leaf_folder="ADID"
  elif [[ $filename  = BSIS* ]] ; then
    leaf_folder="ASIS"
  elif [[ $filename  = BSAS* ]] ; then
    leaf_folder="ASIS"
  elif [[ $filename  = BSIK* ]] ; then
    leaf_folder="AKIK"
  elif [[ $filename  = BSAK* ]] ; then
    leaf_folder="AKIK"
  elif [[ $filename  = FAGLFLEXA* ]] ; then
    leaf_folder="FLX"
  elif [[ $filename  = UKM_TOTALS* ]] ; then
    leaf_folder="UKTABS"
  elif [[ $filename  = UKMBP_CMS_SGM* ]] ; then
    leaf_folder="UKTABS"
  elif [[ $filename  = UKMBP_CMS* ]] ; then
    leaf_folder="UKTABS"
  fi 
  echo $hdfs_base/$leaf_folder/$r_name #>> $load_log 2>&1
  
  #sed -i 's/\¬"/\¬/g' $local_base/$filename
  if [ $leaf_folder != "" ]
  then
    echo "hdfs dfs -put $local_base/$filename $hdfs_base/$leaf_folder/$r_name" >> $load_log 2>&1
    #echo `hdfs dfs -put $local_base/$filename $hdfs_base/$leaf_folder/$r_name` >> $load_log 2>&1
    #hdfs dfs -put $local_base/$filename $hdfs_base/$leaf_folder/$r_name >> $load_log 2>&1
    hdfs dfs -put $local_base/$filename $hdfs_base/$r_name >> $load_log 2>&1
  fi

  if [ 0 = $? ] ; then
    if [ $leaf_folder != "" ]
    then
      rm $local_base/$filename
    fi
    if [[ $filename  = BKPF* ]] ; then 
      PF_Copied=true
    elif [[ $filename  = BSID* ]] ; then
      ID_Copied=true
    elif [[ $filename  = BSAD* ]] ; then
      AD_Copied=true
    elif [[ $filename  = BSIS* ]] ; then
      IS_Copied=true
    elif [[ $filename  = BSAS* ]] ; then
      AS_Copied=true
    elif [[ $filename  = BSIK* ]] ; then
      IK_Copied=true
    elif [[ $filename  = BSAK* ]] ; then
      AK_Copied=true
    elif [[ $filename  = FAGLFLEXA* ]] ; then
      FA_Copied=true
    elif [[ $filename  = UKM_TOTALS* ]] ; then
      UT_Copied=true
    elif [[ $filename  = UKMBP_CMS_SGM* ]] ; then
      CS_Copied=true
    elif [[ $filename  = UKMBP_CMS* ]] ; then
      UK_Copied=true
    fi
  else 
    echo "HDFS Copy Failed : hdfs dfs -put $local_base/$filename $hdfs_base/$leaf_folder/$r_name"
    exit 1
  fi
  

#  if [[ ($PF_Copied == true) || ($ID_Copied == true && $AD_Copied == true) || ($IS_Copied == true && $AS_Copied == true) || ($IK_Copied == true && $AK_Copied == true) ]] ; then
#    fname=`date +'%m%d%Y%H%M'`
#    echo "hdfs dfs -touchz $hdfs_base/$leaf_folder/$fname.completed" >> $load_log 2>&1
#    #echo `hdfs dfs -put $local_base/$filename $hdfs_base/$leaf_folder/$fname.completed` >> $load_log 2>&1
#    echo `hdfs dfs -touchz $hdfs_base/$leaf_folder/$fname.completed` >> $load_log 2>&1
#    if [ 0 != $? ] ; then
#      echo "HDFS Flag Creation Failed : hdfs dfs -touchz $hdfs_base/$leaf_folder/"`date +'%m%d%Y%H%M'`".completed"
#      exit 1
#    fi
#  fi

done


#for leaf_folder in {'PF','ADID','ASIS','AKIK'} 
#do 
  #if [[ ($PF_Copied==true && $leaf_folder=='PF') || ($ID_Copied==true && $AD_Copie==true && $leaf_folder=='ADID') || ($IS_Copied==true && $AS_Copied==true && $leaf_folder=='ASIS') || ($IK_Copied==true && $AK_Copied==true && $leaf_folder=='AKIK') || ($UT_Copied==true && $CS_Copied==true && $UK_Copied==true && $leaf_folder=='UKTABS') || ($FA_Copied==true && $leaf_folder=='FLX') ]] ; then
    fname=`date +'%m%d%Y%H%M'`
    echo "hdfs dfs -touchz $hdfs_base/$fname.completed" >> $load_log 2>&1
    #echo `hdfs dfs -put $local_base/$filename $hdfs_base/$leaf_folder/$fname.completed` >> $load_log 2>&1
    #echo `hdfs dfs -touchz $hdfs_base/$leaf_folder/$fname.completed` >> $load_log 2>&1
    #hdfs dfs -touchz $hdfs_base/$leaf_folder/$fname.completed >> $load_log 2>&1
    hdfs dfs -touchz $hdfs_base/$fname.completed >> $load_log 2>&1
    if [ 0 != $? ] ; then
      echo "HDFS Flag Creation Failed : hdfs dfs -touchz $hdfs_base/$leaf_folder/$fname.completed"
      exit 1
    fi
  #fi
#done

rm $1/$3/*.completed >> $load_log 2>&1



