# -*- encoding: iso-8859-1 -*-

from pyspark.sql.functions import lit
from pyspark.sql import SparkSession
from pyspark.sql.types import *
import argparse
from datetime import date
import sys

#####################################################################################################################
# =====================================================================
# FileName: EDT_PRD.py
# Location: Hadoop Server -
# =====================================================================
# Objective: This file is responsible for loading the EDT Regular and EDT Market Event Period files to the staging table.
# Invocation Target: bedrock.sh
#
# Tasks performed: 1. File data load to Staging table.
#                  2. Drop older partitions from Staging tables, keep data for only last "retain_partition" no of loads.
#
# Parameter List:
#
# sys.argv[1] = HDFS SOURCE PATH            		$1 = /data/tx/kna/nielsen_connect/edt/src
# sys.argv[2] = SOURCE FILE NAME    	       		$2 = EDT_prd_322157_03262020.csv
# sys.argv[3] = TARGET HIVE SCHEMA or DATABASE     	$3 = KNA_EXTERNAL
# sys.argv[4] = HIVE TARGET TABLE NAME			$4 = STAGE or TARGET HIVE TABLE NAME
# sys.argv[5] = JOB NAME PREFIX (SPARK JOB)             $5 = KEL_EDT_PRD_
# sys.argv[6] = LOAD_DATE		                $6 = 03262020
#
#
#####################################################################################################################

retain_partitions=12

time_string = date.today().strftime('%Y%m%d%H%M')
job_name = sys.argv[5] + time_string

#parser = argparse.ArgumentParser()
#args = parser.parse_args()

file_path = sys.argv[1] + "/" + sys.argv[2]
table_full = sys.argv[3] + "." + sys.argv[4]

spark = SparkSession.builder.master("yarn").appName(job_name).config("spark.sql.crossJoin.enabled", "true").config("hive.exec.dynamic.partition", "true").config("hive.exec.dynamic.partition.mode", "nonstrict").enableHiveSupport().getOrCreate()

schema1=StructType([StructField("SOURCE_SYSTEM", StringType(), False),
                    StructField("MANDT", StringType(), True),
                    StructField("BUKRS", StringType(), True),
                    StructField("BELNR", StringType(), True),
                    StructField("GJAHR", ShortType(), True),
                    StructField("BLART", StringType(), True),
                    StructField("BLDAT", StringType(), True),
                    StructField("BUDAT", StringType(), True),
                    StructField("MONAT", ShortType(), True),
                    StructField("CPUDT", StringType(), True),
                    StructField("CPUTM", StringType(), True),
                    StructField("AEDAT", StringType(), True),
                    StructField("UPDDT", StringType(), True),
                    StructField("WWERT", StringType(), True),
                    StructField("USNAM", StringType(), True),
                    StructField("TCODE", StringType(), True),
                    StructField("BVORG", StringType(), True),
                    StructField("XBLNR", StringType(), True),
                    StructField("DBBLG", StringType(), True),
                    StructField("STBLG", StringType(), True),
                    StructField("STJAH", ShortType(), True),
                    StructField("BKTXT", StringType(), True),
                    StructField("WAERS", StringType(), True),
                    StructField("KURSF", DecimalType(9,5), True),
                    StructField("KZWRS", StringType(), True),
                    StructField("KZKRS", DecimalType(9,5), True),
                    StructField("BSTAT", StringType(), True),
                    StructField("XNETB", StringType(), True),
                    StructField("FRATH", DecimalType(13,2), True),
                    StructField("XRUEB", StringType(), True),
                    StructField("GLVOR", StringType(), True),
                    StructField("GRPID", StringType(), True),
                    StructField("DOKID", StringType(), True),
                    StructField("ARCID", StringType(), True),
                    StructField("IBLAR", StringType(), True),
                    StructField("AWTYP", StringType(), True),
                    StructField("AWKEY", StringType(), True),
                    StructField("FIKRS", StringType(), True),
                    StructField("HWAER", StringType(), True),
                    StructField("HWAE2", StringType(), True),
                    StructField("HWAE3", StringType(), True),
                    StructField("KURS2", DecimalType(9,5), True),
                    StructField("KURS3", DecimalType(9,5), True),
                    StructField("BASW2", StringType(), True),
                    StructField("BASW3", StringType(), True),
                    StructField("UMRD2", StringType(), True),
                    StructField("UMRD3", StringType(), True),
                    StructField("XSTOV", StringType(), True),
                    StructField("STODT", StringType(), True),
                    StructField("XMWST", StringType(), True),
                    StructField("CURT2", StringType(), True),
                    StructField("CURT3", StringType(), True),
                    StructField("KUTY2", StringType(), True),
                    StructField("KUTY3", StringType(), True),
                    StructField("XSNET", StringType(), True),
                    StructField("AUSBK", StringType(), True),
                    StructField("XUSVR", StringType(), True),
                    StructField("DUEFL", StringType(), True),
                    StructField("AWSYS", StringType(), True),
                    StructField("TXKRS", DecimalType(9,5), True),
                    StructField("CTXKRS", StringType(), True),
                    StructField("LOTKZ", StringType(), True),
                    StructField("XWVOF", StringType(), True),
                    StructField("STGRD", StringType(), True),
                    StructField("PPNAM", StringType(), True),
                    StructField("BRNCH", StringType(), True),
                    StructField("NUMPG", ShortType(), True),
                    StructField("ADISC", StringType(), True),
                    StructField("XREF1_HD", StringType(), True),
                    StructField("XREF2_HD", StringType(), True),
                    StructField("XREVERSAL", StringType(), True),
                    StructField("REINDAT", StringType(), True),
                    StructField("RLDNR", StringType(), True),
                    StructField("LDGRP", StringType(), True),
                    StructField("PROPMANO", StringType(), True),
                    StructField("XBLNR_ALT", StringType(), True),
                    StructField("VATDATE", StringType(), True),
                    StructField("DOCCAT", StringType(), True),
                    StructField("XSPLIT", StringType(), True),
                    StructField("CASH_ALLOC", StringType(), True),
                    StructField("FOLLOW_ON", StringType(), True),
                    StructField("XREORG", StringType(), True),
                    StructField("SUBSET", StringType(), True),
                    StructField("KURST", StringType(), True),
                    StructField("KURSX", StringType(), True),
                    StructField("KUR2X", StringType(), True),
                    StructField("KUR3X", StringType(), True),
                    StructField("XMCA ", StringType(), True),
                    StructField("RESUBMISSION", StringType(), True),
                    StructField("/SAPF15/STATUS", StringType(), True),
                    StructField("PSOTY", StringType(), True),
                    StructField("PSOAK", StringType(), True),
                    StructField("PSOKS", StringType(), True),
                    StructField("PSOSG", StringType(), True),
                    StructField("PSOFN", StringType(), True),
                    StructField("INTFORM", StringType(), True),
                    StructField("INTDATE", StringType(), True),
                    StructField("PSOBT", StringType(), True),
                    StructField("PSOZL", StringType(), True),
                    StructField("PSODT", StringType(), True),
                    StructField("PSOTM", StringType(), True),
                    StructField("FM_UMART", StringType(), True),
                    StructField("CCINS", StringType(), True),
                    StructField("CCNUM", StringType(), True),
                    StructField("SSBLK", StringType(), True),
                    StructField("BATCH", StringType(), True),
                    StructField("SNAME", StringType(), True),
                    StructField("SAMPLED", StringType(), True),
                    StructField("EXCLUDE_FLAG", StringType(), True),
                    StructField("BLIND", StringType(), True),
                    StructField("OFFSET_STATUS", StringType(), True),
                    StructField("OFFSET_REFER_DAT", StringType(), True),
                    StructField("PENRC", StringType(), True),
                    StructField("KNUMV", StringType(), True)])

df1 = spark.read.load(file_path, format="csv", sep="¬", header="true", schema=schema1)
print("#########################")
print("sys.argv[6] = " + sys.argv[6])
print("#########################")
df1 = df1.withColumn("LOAD_DATE", lit(sys.argv[6]))

#df1.collect()
df1.write.insertInto(table_full, overwrite=False)

