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


file_path = sys.argv[1] + "/" + sys.argv[2]
table_full = sys.argv[3] + "." + sys.argv[4]

spark = SparkSession.builder.master("yarn").appName(job_name).config("spark.sql.crossJoin.enabled", "true").config("hive.exec.dynamic.partition", "true").config("hive.exec.dynamic.partition.mode", "nonstrict").enableHiveSupport().getOrCreate()

schema1=StructType([StructField("SOURCE_SYSTEM", StringType(), False),
                    StructField("MANDT", StringType(), True),
                    StructField("BUKRS", StringType(), True),
                    StructField("HKONT", StringType(), True),
                    StructField("AUGDT", StringType(), True),
                    StructField("AUGBL", StringType(), True),
                    StructField("ZUONR", StringType(), True),
                    StructField("GJAHR", StringType(), True),
                    StructField("BELNR", StringType(), True),
                    StructField("BUZEI", ShortType(), True),
                    StructField("BUDAT", StringType(), True),
                    StructField("BLDAT", StringType(), True),
                    StructField("WAERS", StringType(), True),
                    StructField("XBLNR", StringType(), True),
                    StructField("BLART", StringType(), True),
                    StructField("MONAT", ShortType(), True),
                    StructField("BSCHL", StringType(), True),
                    StructField("SHKZG", StringType(), True),
                    StructField("GSBER", StringType(), True),
                    StructField("MWSKZ", StringType(), True),
                    StructField("FKONT", ShortType(), True),
                    StructField("DMBTR", DecimalType(13,2), True),
                    StructField("WRBTR", DecimalType(13,2), True),
                    StructField("MWSTS", DecimalType(13,2), True),
                    StructField("WMWST", DecimalType(13,2), True),
                    StructField("SGTXT", StringType(), True),
                    StructField("PROJN", StringType(), True),
                    StructField("AUFNR", StringType(), True),
                    StructField("WERKS", StringType(), True),
                    StructField("KOSTL", StringType(), True),
                    StructField("ZFBDT", StringType(), True),
                    StructField("XOPVW", StringType(), True),
                    StructField("VALUT", StringType(), True),
                    StructField("BSTAT", StringType(), True),
                    StructField("BDIFF", DecimalType(13,2), True),
                    StructField("BDIF2", DecimalType(13,2), True),
                    StructField("VBUND", StringType(), True),
                    StructField("PSWSL", StringType(), True),
                    StructField("WVERW", StringType(), True),
                    StructField("DMBE2", DecimalType(13,2), True),
                    StructField("DMBE3", DecimalType(13,2), True),
                    StructField("MWST2", DecimalType(13,2), True),
                    StructField("MWST3", DecimalType(13,2), True),
                    StructField("BDIF3", DecimalType(13,2), True),
                    StructField("RDIF3", DecimalType(13,2), True),
                    StructField("XRAGL", StringType(), True),
                    StructField("PROJK", IntegerType(), True),
                    StructField("PRCTR", StringType(), True),
                    StructField("XSTOV", StringType(), True),
                    StructField("XARCH", StringType(), True),
                    StructField("PSWBT", DecimalType(13,2), True),
                    StructField("XNEGP", StringType(), True),
                    StructField("RFZEI", ShortType(), True),
                    StructField("CCBTC", StringType(), True),
                    StructField("XREF3", StringType(), True),
                    StructField("BUPLA", StringType(), True),
                    StructField("PPDIFF", DecimalType(13,2), True),
                    StructField("PPDIF2", DecimalType(13,2), True),
                    StructField("PPDIF3", DecimalType(13,2), True),
                    StructField("BEWAR", StringType(), True),
                    StructField("IMKEY", StringType(), True),
                    StructField("DABRZ", StringType(), True),
                    StructField("INTRENO", StringType(), True),
                    StructField("GRANT_NBR", StringType(), True),
                    StructField("FKBER", StringType(), True),
                    StructField("FIPOS", StringType(), True),
                    StructField("FISTL", StringType(), True),
                    StructField("GEBER", StringType(), True),
                    StructField("PPRCT", StringType(), True),
                    StructField("BUZID", StringType(), True),
                    StructField("AUGGJ", ShortType(), True),
                    StructField("UZAWE", StringType(), True),
                    StructField("SEGMENT", StringType(), True),
                    StructField("PSEGMENT", StringType(), True),
                    StructField("PGEBER", StringType(), True),
                    StructField("PGRANT_NBR", StringType(), True),
                    StructField("MEASURE", StringType(), True),
                    StructField("BUDGET_PD", StringType(), True),
                    StructField("PBUDGET_PD", StringType(), True),
                    StructField("KIDNO", StringType(), True),
                    StructField("FIPEX", StringType(), True),
                    StructField("PRODPER", StringType(), True),
                    StructField("QSSKZ", StringType(), True),
                    StructField("PROPMANO", StringType(), True),
                    StructField("INWARD_NO", StringType(), True),
                    StructField("INWARD_DT", StringType(), True)])

df1 = spark.read.load(file_path, format="csv", sep="¬", header="true", schema=schema1, encoding="utf-8")
#df1 = df1.withColumn("INWARD_NO", lit(""))
#df1 = df1.withColumn("INWARD_DT", lit(""))
df1 = df1.withColumn("LOAD_DATE", lit(sys.argv[6]))

df1.write.insertInto(table_full, overwrite=False)

