



beeline -u $3 -e "TRUNCATE TABLE $1.uvw_cust;"

sqoop import --connect 'jdbc:jtds:sqlserver://KeystoneSQLDBPROD;instance=analyticsprod;domain=us.kellogg.com;databasename=kg_views;' --username _dssqoopprodsvc -password Jhmevr3# --table UVW_CUST --num-mappers 1 --hcatalog-database $1 --hcatalog-table uvw_cust --hcatalog-storage-stanza "stored as orcfile" -- --schema $2





beeline -u $3 -e "TRUNCATE TABLE $1.uvw_cust_hier_unrvl;"

sqoop import --connect 'jdbc:jtds:sqlserver://KeystoneSQLDBPROD;instance=analyticsprod;domain=us.kellogg.com;databasename=kg_views;' --username _dssqoopprodsvc -password Jhmevr3#  --table UVW_CUST_HIER_UNRVL --num-mappers 1 --hcatalog-database $1 --hcatalog-table UVW_CUST_HIER_UNRVL --hcatalog-storage-stanza "stored as orcfile"  -- --schema $2





beeline -u $3 -e "TRUNCATE TABLE $1.UVW_FISC_CAL_DY;"

sqoop import --connect 'jdbc:jtds:sqlserver://KeystoneSQLDBPROD;instance=analyticsprod;domain=us.kellogg.com;databasename=kg_views;' --username _dssqoopprodsvc -password Jhmevr3#  --table UVW_FISC_CAL_DY --num-mappers 1 --hcatalog-database $1 --hcatalog-table UVW_FISC_CAL_DY --hcatalog-storage-stanza "stored as orcfile"  -- --schema KG




beeline -u $3 -e "TRUNCATE TABLE $1.UVW_VNDR;"

sqoop import --connect 'jdbc:jtds:sqlserver://KeystoneSQLDBPROD;instance=analyticsprod;domain=us.kellogg.com;databasename=kg_views;' --username _dssqoopprodsvc -password Jhmevr3# --table UVW_VNDR --num-mappers 1 --hcatalog-database $1 --hcatalog-table UVW_VNDR --hcatalog-storage-stanza "stored as orcfile" -- --schema $2






beeline -u $3 -e "TRUNCATE TABLE $1.UVW_GL_ACCT;"

sqoop import --connect 'jdbc:jtds:sqlserver://KeystoneSQLDBPROD;instance=analyticsprod;domain=us.kellogg.com;databasename=kg_views;' --username _dssqoopprodsvc -password Jhmevr3# --table UVW_GL_ACCT --num-mappers 1 --hcatalog-database $1 --hcatalog-table UVW_GL_ACCT --hcatalog-storage-stanza "stored as orcfile" -- --schema $2

