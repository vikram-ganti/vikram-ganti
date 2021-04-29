# -*- encoding: iso-8859-1 -*-


from pyspark.sql.functions import lit
from pyspark.sql import SparkSession
from pyspark.sql.types import *
import argparse
from datetime import date
import sys

from functools import reduce
from pyspark.sql import DataFrame


time_string = date.today().strftime('%Y%m%d%H%M')
job_name = sys.argv[3] + time_string

spark = SparkSession.builder.master("yarn").appName(job_name).config("spark.sql.crossJoin.enabled", "true").config("hive.exec.dynamic.partition", "true").config("hive.exec.dynamic.partition.mode", "nonstrict").enableHiveSupport().getOrCreate()

df=spark.sql("SELECT BUKRS, GJAHR, BELNR, MAX(LOAD_DATE) AS MDATE FROM " + sys.argv[1] + ".BKPF_STG GROUP BY BUKRS, GJAHR, BELNR")
df.registerTempTable("FILTER_DATA")

#df1=spark.sql("SELECT BUKRS, HKONT, AUGDT, AUGBL, ZUONR, GJAHR, BELNR, BUZEI, BUDAT, BLDAT, WAERS, XBLNR, BLART, MONAT, BSCHL, SHKZG, MWSKZ, DMBTR, WRBTR, MWSTS, WMWST, SGTXT, AUFNR, WERKS,KOSTL, ZFBDT, XOPVW, BDIFF, BDIF2, VBUND, PSWSL, DMBE2, MWST2, XRAGL, PRCTR, PSWBT, XNEGP, XREF3, BUPLA, FKBER, AUGGJ, UZAWE, QSSKZ, load_date, 'I' AS STAB FROM " + sys.argv[1] + ".BSIS_STG where load_date>='" + sys.argv[4] +"' UNION ALL SELECT BUKRS, HKONT, AUGDT, AUGBL, ZUONR, GJAHR, BELNR, BUZEI, BUDAT, BLDAT, WAERS, XBLNR, BLART, MONAT, BSCHL, SHKZG, MWSKZ, DMBTR, WRBTR, MWSTS, WMWST, SGTXT, AUFNR, WERKS,KOSTL, ZFBDT, XOPVW, BDIFF, BDIF2, VBUND, PSWSL, DMBE2, MWST2, XRAGL, PRCTR, PSWBT, XNEGP, XREF3, BUPLA, FKBER, AUGGJ, UZAWE, QSSKZ, load_date, 'A' AS STAB FROM " + sys.argv[1] + ".BSAS_STG where load_date>='" + sys.argv[4] +"'") 
df1=spark.sql("SELECT SOURCE.BUKRS, SOURCE.HKONT, SOURCE.AUGDT, SOURCE.AUGBL, SOURCE.ZUONR, SOURCE.GJAHR, SOURCE.BELNR, SOURCE.BUZEI, SOURCE.BUDAT, SOURCE.BLDAT, SOURCE.WAERS, SOURCE.XBLNR, SOURCE.BLART, SOURCE.MONAT, SOURCE.BSCHL, SOURCE.SHKZG, SOURCE.MWSKZ, SOURCE.DMBTR, SOURCE.WRBTR, SOURCE.MWSTS, SOURCE.WMWST, SOURCE.SGTXT, SOURCE.AUFNR, SOURCE.WERKS, SOURCE.KOSTL, SOURCE.ZFBDT, SOURCE.XOPVW, SOURCE.BDIFF, SOURCE.BDIF2, SOURCE.VBUND, SOURCE.PSWSL, SOURCE.DMBE2, SOURCE.MWST2, SOURCE.XRAGL, SOURCE.PRCTR, SOURCE.PSWBT, SOURCE.XNEGP, SOURCE.XREF3, SOURCE.BUPLA, SOURCE.FKBER, SOURCE.AUGGJ, SOURCE.UZAWE, SOURCE.QSSKZ, SOURCE.load_date FROM " + sys.argv[1] + ".BSIS_STG SOURCE INNER JOIN FILTER_DATA FILDAT ON SOURCE.BUKRS=FILDAT.BUKRS AND SOURCE.GJAHR=FILDAT.GJAHR AND SOURCE.BELNR=FILDAT.BELNR AND SOURCE.load_date=FILDAT.MDATE")
df1.registerTempTable("SOURCE_DATA_I")
df1.printSchema()


df2=spark.sql("SELECT SOURCE.BUKRS, SOURCE.HKONT, SOURCE.AUGDT, SOURCE.AUGBL, SOURCE.ZUONR, SOURCE.GJAHR, SOURCE.BELNR, SOURCE.BUZEI, SOURCE.BUDAT, SOURCE.BLDAT, SOURCE.WAERS, SOURCE.XBLNR, SOURCE.BLART, SOURCE.MONAT, SOURCE.BSCHL, SOURCE.SHKZG, SOURCE.MWSKZ, SOURCE.DMBTR, SOURCE.WRBTR, SOURCE.MWSTS, SOURCE.WMWST, SOURCE.SGTXT, SOURCE.AUFNR, SOURCE.WERKS, SOURCE.KOSTL, SOURCE.ZFBDT, SOURCE.XOPVW, SOURCE.BDIFF, SOURCE.BDIF2, SOURCE.VBUND, SOURCE.PSWSL, SOURCE.DMBE2, SOURCE.MWST2, SOURCE.XRAGL, SOURCE.PRCTR, SOURCE.PSWBT, SOURCE.XNEGP, SOURCE.XREF3, SOURCE.BUPLA, SOURCE.FKBER, SOURCE.AUGGJ, SOURCE.UZAWE, SOURCE.QSSKZ, SOURCE.load_date FROM " + sys.argv[1] + ".BSAS_STG SOURCE INNER JOIN FILTER_DATA FILDAT ON SOURCE.BUKRS=FILDAT.BUKRS AND SOURCE.GJAHR=FILDAT.GJAHR AND SOURCE.BELNR=FILDAT.BELNR AND SOURCE.load_date=FILDAT.MDATE")
df2.registerTempTable("SOURCE_DATA_A")
df2.printSchema()

#df3=spark.sql("SELECT * FROM SOURCE_DATA_I UNION SOURCE_DATA_A")
dfs = [df1, df2]
df3 = reduce(DataFrame.unionAll, dfs)
df3.registerTempTable("BASE_DATA")

#df4=spark.sql("SELECT BUKRS  AS  CO_CODE ,HKONT  AS  GL_ACCT_NBR ,gl_acct_desc  AS  GL_ACCT_NBR_NM ,AUGDT  AS  CLRNG_DT ,AUGBL  AS  CLRNG_DOC ,ZUONR  AS  ASGMT_NBR ,GJAHR  AS  FISC_YR ,BELNR  AS  ACCTG_DOC_NBR ,BUZEI  AS  ACCTG_DOC_LINE_NBR ,BUDAT  AS  POSTNG_DT ,BLDAT  AS  DOC_DT ,WAERS  AS  CURR ,XBLNR  AS  REF_DOC_NBR ,BLART  AS  DOC_TYP ,MONAT  AS  FISC_PD ,BSCHL  AS  POSTNG_KEY ,SHKZG  AS  DR_CR_IND ,MWSKZ  AS  SALES_TX_CODE ,DMBTR  AS  AMT_LCL_CURR ,WRBTR  AS  AMT_DOC_CURR ,MWSTS  AS  TX_AMT_LCL_CURR ,WMWST  AS  TX_AMT_DOC_CURR ,SGTXT  AS  ITM_TXT ,AUFNR  AS  ORDR_NBR ,WERKS  AS  PLANT ,KOSTL  AS  COST_CTR ,ZFBDT  AS  BASELINE_DT ,XOPVW  AS  IND_OPN_ITM_MGMT ,BDIFF  AS  VAL_DIFF ,BDIF2  AS  VAL_DIFF_SCND_LCL_CURR ,VBUND  AS  TRADE_PARTNR_CO_ID ,PSWSL  AS  UPDT_CURR ,DMBE2  AS  AMT_SCND_LCL_CURR ,MWST2  AS  TX_AMT_SCND_LCL_CURR ,XRAGL  AS  IND_CLRNG_REVRSD ,PRCTR  AS  PRFT_CTR ,PSWBT  AS  AMT_UPDT_GL ,XNEGP  AS  IND_NEG_POSTNG ,XREF3  AS  LINE_NBR_REF_KEY_3 ,BUPLA  AS  BUS_PLCE ,FKBER  AS  FCN_AREA ,AUGGJ  AS  CLRNG_FISC_YR ,UZAWE  AS  PYMT_METH_SPLMNT ,QSSKZ  AS  WHLD_TX_CODE , coa , gl_acct_desc , cre_dt , bal_sht_acct_flg , pnl_acct_flg , gl_acct_grp , gl_acct_grp_desc , del_flg , cre_blok_flg , postng_blok_flg , plnng_blok_flg   FROM  BASE_DATA  LEFT OUTER JOIN " + sys.argv[1] + ".uvw_gl_acct AS GMASTER ON BASE_DATA.HKONT = GMASTER.gl_acct_nbr")
df4=spark.sql("SELECT BUKRS  AS  CO_CODE ,HKONT  AS  GL_ACCT_NBR ,gl_acct_desc  AS  GL_ACCT_NBR_NM ,AUGDT  AS  CLRNG_DT ,AUGBL  AS  CLRNG_DOC ,ZUONR  AS  ASGMT_NBR ,GJAHR  AS  FISC_YR ,BELNR  AS  ACCTG_DOC_NBR ,BUZEI  AS  ACCTG_DOC_LINE_NBR ,BUDAT  AS  POSTNG_DT ,BLDAT  AS  DOC_DT ,WAERS  AS  CURR ,XBLNR  AS  REF_DOC_NBR ,BLART  AS  DOC_TYP ,MONAT  AS  FISC_PD ,BSCHL  AS  POSTNG_KEY ,SHKZG  AS  DR_CR_IND ,MWSKZ  AS  SALES_TX_CODE ,DMBTR  AS  AMT_LCL_CURR ,WRBTR  AS  AMT_DOC_CURR ,MWSTS  AS  TX_AMT_LCL_CURR ,WMWST  AS  TX_AMT_DOC_CURR ,SGTXT  AS  ITM_TXT ,AUFNR  AS  ORDR_NBR ,WERKS  AS  PLANT ,KOSTL  AS  COST_CTR ,ZFBDT  AS  BASELINE_DT ,XOPVW  AS  IND_OPN_ITM_MGMT ,BDIFF  AS  VAL_DIFF ,BDIF2  AS  VAL_DIFF_SCND_LCL_CURR ,VBUND  AS  TRADE_PARTNR_CO_ID ,PSWSL  AS  UPDT_CURR ,DMBE2  AS  AMT_SCND_LCL_CURR ,MWST2  AS  TX_AMT_SCND_LCL_CURR ,XRAGL  AS  IND_CLRNG_REVRSD ,PRCTR  AS  PRFT_CTR ,PSWBT  AS  AMT_UPDT_GL ,XNEGP  AS  IND_NEG_POSTNG ,XREF3  AS  LINE_NBR_REF_KEY_3 ,BUPLA  AS  BUS_PLCE ,FKBER  AS  FCN_AREA ,AUGGJ  AS  CLRNG_FISC_YR ,UZAWE  AS  PYMT_METH_SPLMNT ,QSSKZ  AS  WHLD_TX_CODE , coa , gl_acct_desc , cre_dt , bal_sht_acct_flg , pnl_acct_flg , gl_acct_grp , gl_acct_grp_desc , del_flg , cre_blok_flg , postng_blok_flg , plnng_blok_flg,  FCAL.fisc_dt AS MSTR_fisc_dt , FCAL.fisc_yr AS MSTR_fisc_yr , FCAL.fisc_qtr AS MSTR_fisc_qtr , FCAL.fisc_pd AS MSTR_fisc_pd , FCAL.fisc_wk AS MSTR_fisc_wk , FCAL.fisc_dy AS MSTR_fisc_dy , FCAL.fisc_wk_of_pd AS MSTR_fisc_wk_of_pd , FCAL.fisc_dy_of_pd AS MSTR_fisc_dy_of_pd , FCAL.fisc_dy_of_wk AS MSTR_fisc_dy_of_wk , FCAL.fisc_wk_strt_dt AS MSTR_fisc_wk_strt_dt , FCAL.fisc_wk_end_dt AS MSTR_fisc_wk_end_dt , FCAL.fisc_yr_qtr AS MSTR_fisc_yr_qtr , FCAL.fisc_yr_pd AS MSTR_fisc_yr_pd , FCAL.fisc_yr_wk AS MSTR_fisc_yr_wk , FCAL.fisc_yr_dy AS MSTR_fisc_yr_dy   FROM  BASE_DATA  LEFT OUTER JOIN " + sys.argv[1] + ".uvw_gl_acct AS GMASTER ON BASE_DATA.HKONT = GMASTER.gl_acct_nbr LEFT OUTER JOIN " + sys.argv[1] + ".UVW_FISC_CAL_DY AS FCAL on BASE_DATA.BUDAT = REGEXP_REPLACE(FCAL.fisc_dt, '[^0-9]+', '.')")


df4.write.insertInto(sys.argv[1] + "." + sys.argv[2] , overwrite=True)

