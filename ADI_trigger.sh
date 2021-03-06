#!/bin/bash

hdfs_base=$1
replace_ext="_"`date +'%Y%m%d%H%M'`".csv"

#if [ $2 == *retail_kell_monthly/src ]
#then
#  while true
#  do
#    isEmpty=$(hdfs dfs -count /data/tx/kna/nielsen_connect/retail_kellogg/src | awk '{print $2}')
#    if [ $isEmpty == 0 ]
#    then
#      break
#    fi
#    sleep 10m
#  done
#fi

for filename in `hdfs dfs -ls $hdfs_base | awk '{print $NF}' | grep .txt$ | grep -v _checksum`; 
do 
  r_name="${filename/.txt/$replace_ext}"
  echo `hdfs dfs -cp $filename $r_name`; 
  hdfs dfs -rm -r -skipTrash $filename
done

