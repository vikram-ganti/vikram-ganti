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
                    StructField("KUNNR", StringType(), True),
                    StructField("UMSKS", StringType(), True),
                    StructField("UMSKZ", StringType(), True),
                    StructField("AUGDT", StringType(), True),
                    StructField("AUGBL", StringType(), True),
                    StructField("ZUONR", StringType(), True),
                    StructField("GJAHR", ShortType(), True),
                    StructField("BELNR", StringType(), True),
                    StructField("BUZEI", ShortType(), True),
                    StructField("BUDAT", StringType(), True),
                    StructField("BLDAT", StringType(), True),
                    StructField("CPUDT", StringType(), True),
                    StructField("WAERS", StringType(), True),
                    StructField("XBLNR", StringType(), True),
                    StructField("BLART", StringType(), True),
                    StructField("MONAT", ShortType(), True),
                    StructField("BSCHL", StringType(), True),
                    StructField("ZUMSK", StringType(), True),
                    StructField("SHKZG", StringType(), True),
                    StructField("GSBER", StringType(), True),
                    StructField("MWSKZ", StringType(), True),
                    StructField("DMBTR", DecimalType(13,2), True),
                    StructField("WRBTR", DecimalType(13,2), True),
                    StructField("MWSTS", DecimalType(13,2), True),
                    StructField("WMWST", DecimalType(13,2), True),
                    StructField("BDIFF", DecimalType(13,2), True),
                    StructField("BDIF2", DecimalType(13,2), True),
                    StructField("SGTXT", StringType(), True),
                    StructField("PROJN", StringType(), True),
                    StructField("AUFNR", StringType(), True),
                    StructField("ANLN1", StringType(), True),
                    StructField("ANLN2", StringType(), True),
                    StructField("SAKNR", StringType(), True),
                    StructField("HKONT", StringType(), True),
                    StructField("FKONT", ShortType(), True),
                    StructField("FILKD", StringType(), True),
                    StructField("ZFBDT", StringType(), True),
                    StructField("ZTERM", StringType(), True),
                    StructField("ZBD1T", DecimalType(3,0), True),
                    StructField("ZBD2T", DecimalType(3,0), True),
                    StructField("ZBD3T", DecimalType(3,0), True),
                    StructField("ZBD1P", DecimalType(5,3), True),
                    StructField("ZBD2P", DecimalType(5,3), True),
                    StructField("SKFBT", DecimalType(13,2), True),
                    StructField("SKNTO", DecimalType(13,2), True),
                    StructField("WSKTO", DecimalType(13,2), True),
                    StructField("ZLSCH", StringType(), True),
                    StructField("ZLSPR", StringType(), True),
                    StructField("ZBFIX", StringType(), True),
                    StructField("HBKID", StringType(), True),
                    StructField("BVTYP", StringType(), True),
                    StructField("REBZG", StringType(), True),
                    StructField("REBZJ", ShortType(), True),
                    StructField("REBZZ", ShortType(), True),
                    StructField("SAMNR", IntegerType(), True),
                    StructField("ANFBN", StringType(), True),
                    StructField("ANFBJ", ShortType(), True),
                    StructField("ANFBU", StringType(), True),
                    StructField("ANFAE", StringType(), True),
                    StructField("MANSP", StringType(), True),
                    StructField("MSCHL", StringType(), True),
                    StructField("MADAT", StringType(), True),
                    StructField("MANST", ShortType(), True),
                    StructField("MABER", StringType(), True),
                    StructField("XNETB", StringType(), True),
                    StructField("XANET", StringType(), True),
                    StructField("XCPDD", StringType(), True),
                    StructField("XINVE", StringType(), True),
                    StructField("XZAHL", StringType(), True),
                    StructField("MWSK1", StringType(), True),
                    StructField("DMBT1", DecimalType(13,2), True),
                    StructField("WRBT1", DecimalType(13,2), True),
                    StructField("MWSK2", StringType(), True),
                    StructField("DMBT2", DecimalType(13,2), True),
                    StructField("WRBT2", DecimalType(13,2), True),
                    StructField("MWSK3", StringType(), True),
                    StructField("DMBT3", DecimalType(13,2), True),
                    StructField("WRBT3", DecimalType(13,2), True),
                    StructField("BSTAT", StringType(), True),
                    StructField("VBUND", StringType(), True),
                    StructField("VBELN", StringType(), True),
                    StructField("REBZT", StringType(), True),
                    StructField("INFAE", StringType(), True),
                    StructField("STCEG", StringType(), True),
                    StructField("EGBLD", StringType(), True),
                    StructField("EGLLD", StringType(), True),
                    StructField("RSTGR", StringType(), True),
                    StructField("XNOZA", StringType(), True),
                    StructField("VERTT", StringType(), True),
                    StructField("VERTN", StringType(), True),
                    StructField("VBEWA", StringType(), True),
                    StructField("WVERW", StringType(), True),
                    StructField("PROJK", IntegerType(), True),
                    StructField("FIPOS", StringType(), True),
                    StructField("NPLNR", StringType(), True),
                    StructField("AUFPL", DecimalType(10,0), True),
                    StructField("APLZL", DecimalType(8,0), True),
                    StructField("XEGDR", StringType(), True),
                    StructField("DMBE2", DecimalType(13,2), True),
                    StructField("DMBE3", DecimalType(13,2), True),
                    StructField("DMB21", DecimalType(13,2), True),
                    StructField("DMB22", DecimalType(13,2), True),
                    StructField("DMB23", DecimalType(13,2), True),
                    StructField("DMB31", DecimalType(13,2), True),
                    StructField("DMB32", DecimalType(13,2), True),
                    StructField("DMB33", DecimalType(13,2), True),
                    StructField("BDIF3", DecimalType(13,2), True),
                    StructField("XRAGL", StringType(), True),
                    StructField("UZAWE", StringType(), True),
                    StructField("XSTOV", StringType(), True),
                    StructField("MWST2", DecimalType(13,2), True),
                    StructField("MWST3", DecimalType(13,2), True),
                    StructField("SKNT2", DecimalType(13,2), True),
                    StructField("SKNT3", DecimalType(13,2), True),
                    StructField("XREF1", StringType(), True),
                    StructField("XREF2", StringType(), True),
                    StructField("XARCH", StringType(), True),
                    StructField("PSWSL", StringType(), True),
                    StructField("PSWBT", DecimalType(13,2), True),
                    StructField("LZBKZ", StringType(), True),
                    StructField("LANDL", StringType(), True),
                    StructField("IMKEY", StringType(), True),
                    StructField("VBEL2", StringType(), True),
                    StructField("VPOS2", IntegerType(), True),
                    StructField("POSN2", IntegerType(), True),
                    StructField("ETEN2", ShortType(), True),
                    StructField("FISTL", StringType(), True),
                    StructField("GEBER", StringType(), True),
                    StructField("DABRZ", StringType(), True),
                    StructField("XNEGP", StringType(), True),
                    StructField("KOSTL", StringType(), True),
                    StructField("RFZEI", ShortType(), True),
                    StructField("KKBER", StringType(), True),
                    StructField("EMPFB", StringType(), True),
                    StructField("PRCTR", StringType(), True),
                    StructField("XREF3", StringType(), True),
                    StructField("QSSKZ", StringType(), True),
                    StructField("ZINKZ", StringType(), True),
                    StructField("DTWS1", ShortType(), True),
                    StructField("DTWS2", ShortType(), True),
                    StructField("DTWS3", ShortType(), True),
                    StructField("DTWS4", ShortType(), True),
                    StructField("XPYPR", StringType(), True),
                    StructField("KIDNO", StringType(), True),
                    StructField("ABSBT", DecimalType(13,2), True),
                    StructField("CCBTC", StringType(), True),
                    StructField("PYCUR", StringType(), True),
                    StructField("PYAMT", DecimalType(13,2), True),
                    StructField("BUPLA", StringType(), True),
                    StructField("SECCO", StringType(), True),
                    StructField("CESSION_KZ", StringType(), True),
                    StructField("PPDIFF", DecimalType(13,2), True),
                    StructField("PPDIF2", DecimalType(13,2), True),
                    StructField("PPDIF3", DecimalType(13,2), True),
                    StructField("KBLNR", StringType(), True),
                    StructField("KBLPOS", ShortType(), True),
                    StructField("GRANT_NBR", StringType(), True),
                    StructField("GMVKZ", StringType(), True),
                    StructField("SRTYPE", StringType(), True),
                    StructField("LOTKZ", StringType(), True),
                    StructField("FKBER", StringType(), True),
                    StructField("INTRENO", StringType(), True),
                    StructField("PPRCT", StringType(), True),
                    StructField("BUZID", StringType(), True),
                    StructField("AUGGJ", ShortType(), True),
                    StructField("HKTID", StringType(), True),
                    StructField("BUDGET_PD", StringType(), True),
                    StructField("KONTT", StringType(), True),
                    StructField("KONTL", StringType(), True),
                    StructField("UEBGDAT", StringType(), True),
                    StructField("VNAME", StringType(), True),
                    StructField("EGRUP", StringType(), True),
                    StructField("BTYPE", StringType(), True),
                    StructField("PROPMANO", StringType(), True)])
#df1 = spark.read.option("encoding", "...").load(file_path, format="csv", sep="|", header="true", schema=schema1)
#df1 = spark.read.format("com.databricks.spark.csv").option("header","true").option("schema",schema1).option("charset","iso-8859-1").option("encoding","iso-8859-1").option("delimiter",'¬').load(file_path)
df1 = spark.read.load(file_path, format="csv", sep="¬", header="true", schema=schema1)

df1 = df1.withColumn("LOAD_DATE", lit(sys.argv[6]))

#df1.registerTempTable("KEU_ECC_ADI_TEMP")
#df1 = spark.sql("SELECT SOURCE_SYSTEM, MANDT, BUKRS, KUNNR, UMSKS, UMSKZ, REGEXP_REPLACE(AUGDT, '[^0-9]+', ''), AUGBL, ZUONR, GJAHR, BELNR, BUZEI, REGEXP_REPLACE(BUDAT, '[^0-9]+', ''), REGEXP_REPLACE(BLDAT, '[^0-9]+', ''), REGEXP_REPLACE(CPUDT, '[^0-9]+', ''), WAERS, XBLNR, BLART, MONAT, BSCHL, ZUMSK, SHKZG, GSBER, MWSKZ, DMBTR, WRBTR, MWSTS, WMWST, BDIFF, BDIF2, SGTXT, PROJN, AUFNR, ANLN1, ANLN2, SAKNR, HKONT, FKONT, FILKD, REGEXP_REPLACE(ZFBDT, '[^0-9]+', ''), ZTERM, ZBD1T, ZBD2T, ZBD3T, ZBD1P, ZBD2P, SKFBT, SKNTO, WSKTO, ZLSCH, ZLSPR, ZBFIX, HBKID, BVTYP, REBZG, REBZJ, REBZZ, SAMNR, ANFBN, ANFBJ, ANFBU, REGEXP_REPLACE(ANFAE, '[^0-9]+', ''), MANSP, MSCHL, REGEXP_REPLACE(MADAT, '[^0-9]+', ''), MANST, MABER, XNETB, XANET, XCPDD, XINVE, XZAHL, MWSK1, DMBT1, WRBT1, MWSK2, DMBT2, WRBT2, MWSK3, DMBT3, WRBT3, BSTAT, VBUND, VBELN, REBZT, INFAE, STCEG, EGBLD, EGLLD, RSTGR, XNOZA, VERTT, VERTN, VBEWA, WVERW, PROJK, FIPOS, NPLNR, AUFPL, APLZL, XEGDR, DMBE2, DMBE3, DMB21, DMB22, DMB23, DMB31, DMB32, DMB33, BDIF3, XRAGL, UZAWE, XSTOV, MWST2, MWST3, SKNT2, SKNT3, XREF1, XREF2, XARCH, PSWSL, PSWBT, LZBKZ, LANDL, IMKEY, VBEL2, VPOS2, POSN2, ETEN2, FISTL, GEBER, REGEXP_REPLACE(DABRZ, '[^0-9]+', ''), XNEGP, KOSTL, RFZEI, KKBER, EMPFB, PRCTR, XREF3, QSSKZ, ZINKZ, DTWS1, DTWS2, DTWS3, DTWS4, XPYPR, KIDNO, ABSBT, CCBTC, PYCUR, PYAMT, BUPLA, SECCO, CESSION_KZ, PPDIFF, PPDIF2, PPDIF3, KBLNR, KBLPOS, GRANT_NBR, GMVKZ, SRTYPE, LOTKZ, FKBER, INTRENO, PPRCT, BUZID, AUGGJ, HKTID, BUDGET_PD, PAYS_PROV, PAYS_TRAN, MNDID, KONTT, KONTL, REGEXP_REPLACE(UEBGDAT, '[^0-9]+', ''), VNAME, EGRUP, BTYPE, PROPMANO, LOAD_DATE FROM KEU_ECC_ADI_TEMP")

df1.write.insertInto(table_full, overwrite=False)


#df1.collect()
#df1.show()
