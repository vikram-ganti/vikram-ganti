# -*- encoding: iso-8859-1 -*-

from pyspark.sql.functions import lit
from pyspark.sql import SparkSession
from pyspark.sql.types import *
import argparse
from datetime import date
import sys


retain_partitions=12

time_string = date.today().strftime('%Y%m%d%H%M')
job_name = sys.argv[5] + time_string


file_path = sys.argv[1] + "/" + sys.argv[2]
table_full = sys.argv[3] + "." + sys.argv[4]

spark = SparkSession.builder.master("yarn").appName(job_name).config("spark.sql.crossJoin.enabled", "true").config("hive.exec.dynamic.partition", "true").config("hive.exec.dynamic.partition.mode", "nonstrict").enableHiveSupport().getOrCreate()

schema1=StructType([StructField("SOURCE_SYSTE", StringType(), True), 
                    StructField("RCLNT", StringType(), True), 
                    StructField("RYEAR", IntegerType(), True), 
                    StructField("DOCNR", StringType(), True), 
                    StructField("RLDNR", StringType(), True), 
                    StructField("RBUKRS", StringType(), True), 
                    StructField("DOCLN", StringType(), True), 
                    StructField("ACTIV", StringType(), True), 
                    StructField("RMVCT", StringType(), True), 
                    StructField("RTCUR", StringType(), True), 
                    StructField("RUNIT", StringType(), True), 
                    StructField("AWTYP", StringType(), True), 
                    StructField("RRCTY", StringType(), True), 
                    StructField("RVERS", StringType(), True), 
                    StructField("LOGSYS", StringType(), True), 
                    StructField("RACCT", StringType(), True), 
                    StructField("COST_ELEM", StringType(), True), 
                    StructField("RCNTR", StringType(), True), 
                    StructField("PRCTR", StringType(), True), 
                    StructField("RFAREA", StringType(), True), 
                    StructField("RBUSA", StringType(), True), 
                    StructField("KOKRS", StringType(), True), 
                    StructField("SEGMENT", StringType(), True), 
                    StructField("ZZWERKS", StringType(), True), 
                    StructField("ZZKDGRP", StringType(), True), 
                    StructField("SCNTR", StringType(), True), 
                    StructField("PPRCTR", StringType(), True), 
                    StructField("SFAREA", StringType(), True), 
                    StructField("SBUSA", StringType(), True), 
                    StructField("RASSC", StringType(), True), 
                    StructField("PSEGMENT", StringType(), True), 
                    StructField("TSL", DecimalType(23,2), True), 
                    StructField("HSL", DecimalType(23,2), True), 
                    StructField("KSL", DecimalType(23,2), True), 
                    StructField("OSL", DecimalType(23,2), True), 
                    StructField("MSL", DecimalType(23,2), True), 
                    StructField("WSL", DecimalType(23,2), True), 
                    StructField("DRCRK", StringType(), True), 
                    StructField("POPER", IntegerType(), True), 
                    StructField("RWCUR", StringType(), True), 
                    StructField("GJAHR", IntegerType(), True), 
                    StructField("BUDAT", StringType(), True), 
                    StructField("BELNR", StringType(), True), 
                    StructField("BUZEI", IntegerType(), True), 
                    StructField("BSCHL", StringType(), True), 
                    StructField("BSTAT", StringType(), True), 
                    StructField("LINETYPE", StringType(), True), 
                    StructField("XSPLITMOD", StringType(), True), 
                    StructField("USNAM", StringType(), True), 
                    StructField("TIMESTAMP", DecimalType(15,0), True)])

df1 = spark.read.load(file_path, format="csv", sep="¬", header="true", schema=schema1)
df1 = df1.withColumn("LOAD_DATE", lit(sys.argv[6]))


#df1.collect()

df1.write.insertInto(table_full, overwrite=False)


