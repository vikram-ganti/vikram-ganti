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

schema1=StructType([StructField("SOURCE_SYSTEM", StringType(), True), 
                    StructField("CLIENT", StringType(), True), 
                    StructField("PARTNER", StringType(), True), 
                    StructField("CREDIT_SGMNT", StringType(), True), 
                    StructField("CREDIT_LIMIT", DecimalType(15,2), True), 
                    StructField("XBLOCKED", StringType(), True), 
                    StructField("LIMIT_VALID_DATE", StringType(), True), 
                    StructField("LIMIT_CHG_DATE", StringType(), True), 
                    StructField("COORDINATOR", StringType(), True), 
                    StructField("CUST_GROUP", StringType(), True), 
                    StructField("FOLLOW_UP_DT", StringType(), True), 
                    StructField("CRED_LIM_CALC", DecimalType(15,2), True), 
                    StructField("XCRITICAL", StringType(), True), 
                    StructField("X_LIMIT_ZERO", StringType(), True), 
                    StructField("BLOCK_REASON", StringType(), True), 
                    StructField("CRED_LIM_REQ", DecimalType(15,2), True), 
                    StructField("AUTOMATIC_REQ", StringType(), True), 
                    StructField("LIM_VAL_DATE_REQ", StringType(), True), 
                    StructField("REQ_DATE", StringType(), True), 
                    StructField("ITEM_ERROR", StringType(), True), 
                    StructField("LOG_HNDL", StringType(), True), 
                    StructField("ZZTFLDW8PEHW", StringType(), True), 
                    StructField("ZZTFLDTMPRHW", StringType(), True)])

df1 = spark.read.load(file_path, format="csv", sep="¬", header="true", schema=schema1)
df1 = df1.withColumn("LOAD_DATE", lit(sys.argv[6]))


#df1.collect()

df1.write.insertInto(table_full, overwrite=True)


