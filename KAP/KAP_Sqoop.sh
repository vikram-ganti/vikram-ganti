sqoop import --connect 'jdbc:jtds:sqlserver://KeystoneSQLDBPROD;instance=analyticsprod;domain=us.kellogg.com;databasename=kg_views;' --username _dssqoopprodsvc -password Jhmevr3# --table UVW_CUST --num-mappers 1 --hcatalog-database kap_ecc --create-hcatalog-table --hcatalog-table uvw_cust --hcatalog-storage-stanza "stored as orcfile" -- --schema KAP

sqoop import --connect 'jdbc:jtds:sqlserver://KeystoneSQLDBPROD;instance=analyticsprod;domain=us.kellogg.com;databasename=kg_views;' --username _dssqoopprodsvc -password Jhmevr3#   --table UVW_CUST_HIER_UNRVL --num-mappers 1 --hcatalog-database kap_ecc --create-hcatalog-table --hcatalog-table UVW_CUST_HIER_UNRVL --hcatalog-storage-stanza "stored as orcfile"  -- --schema KAP

sqoop import --connect 'jdbc:jtds:sqlserver://KeystoneSQLDBPROD;instance=analyticsprod;domain=us.kellogg.com;databasename=kg_views;' --username _dssqoopprodsvc -password Jhmevr3#  --table UVW_FISC_CAL --num-mappers 1 --hcatalog-database kap_ecc --create-hcatalog-table --hcatalog-table UVW_FISC_CAL --hcatalog-storage-stanza "stored as orcfile"  -- --schema KG


sqoop import --connect 'jdbc:jtds:sqlserver://KeystoneSQLDBPROD;instance=analyticsprod;domain=us.kellogg.com;databasename=kg_views;' --username _dssqoopprodsvc -password Jhmevr3#  --table UVW_FISC_CAL_DY --num-mappers 1 --hcatalog-database kap_ecc --create-hcatalog-table --hcatalog-table UVW_FISC_CAL_DY --hcatalog-storage-stanza "stored as orcfile"  -- --schema KG

sqoop import --connect 'jdbc:jtds:sqlserver://KeystoneSQLDBPROD;instance=analyticsprod;domain=us.kellogg.com;databasename=kg_views;' --username _dssqoopprodsvc -password Jhmevr3# --table UVW_VNDR --num-mappers 1 --hcatalog-database kap_ecc --create-hcatalog-table --hcatalog-table uvw_vndr --hcatalog-storage-stanza "stored as orcfile" -- --schema KAP

sqoop import --connect 'jdbc:jtds:sqlserver://KeystoneSQLDBPROD;instance=analyticsprod;domain=us.kellogg.com;databasename=kg_views;' --username _dssqoopprodsvc -password Jhmevr3# --table UVW_GL_ACCT --num-mappers 1 --hcatalog-database kap_ecc --create-hcatalog-table --hcatalog-table UVW_GL_ACCT --hcatalog-storage-stanza "stored as orcfile" -- --schema KAP

