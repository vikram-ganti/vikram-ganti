// ORM class for table 'UVW_CUST'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Wed Mar 17 05:58:15 UTC 2021
// For connector: org.apache.sqoop.manager.SQLServerManager
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import com.cloudera.sqoop.lib.JdbcWritableBridge;
import com.cloudera.sqoop.lib.DelimiterSet;
import com.cloudera.sqoop.lib.FieldFormatter;
import com.cloudera.sqoop.lib.RecordParser;
import com.cloudera.sqoop.lib.BooleanParser;
import com.cloudera.sqoop.lib.BlobRef;
import com.cloudera.sqoop.lib.ClobRef;
import com.cloudera.sqoop.lib.LargeObjectLoader;
import com.cloudera.sqoop.lib.SqoopRecord;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class UVW_CUST extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("CUST_NBR", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        CUST_NBR = (String)value;
      }
    });
    setters.put("CUST_NM", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        CUST_NM = (String)value;
      }
    });
    setters.put("CUST_NM2", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        CUST_NM2 = (String)value;
      }
    });
    setters.put("STR", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        STR = (String)value;
      }
    });
    setters.put("CITY", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        CITY = (String)value;
      }
    });
    setters.put("RGN", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        RGN = (String)value;
      }
    });
    setters.put("DSTR", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        DSTR = (String)value;
      }
    });
    setters.put("CTRY", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        CTRY = (String)value;
      }
    });
    setters.put("PSTL_CODE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        PSTL_CODE = (String)value;
      }
    });
    setters.put("SRCH_TRM2", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        SRCH_TRM2 = (String)value;
      }
    });
    setters.put("CRE_DT", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        CRE_DT = (String)value;
      }
    });
    setters.put("ALTN_PAYR_NBR", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ALTN_PAYR_NBR = (String)value;
      }
    });
    setters.put("ACCT_GRP", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ACCT_GRP = (String)value;
      }
    });
    setters.put("ACCT_GRP_DESC", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ACCT_GRP_DESC = (String)value;
      }
    });
    setters.put("PYMT_BLOK", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        PYMT_BLOK = (String)value;
      }
    });
    setters.put("LAB_CUST_GRP", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        LAB_CUST_GRP = (String)value;
      }
    });
    setters.put("ALTN_PAYR_ACCT_IND", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ALTN_PAYR_ACCT_IND = (String)value;
      }
    });
    setters.put("SALES_ORG", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        SALES_ORG = (String)value;
      }
    });
    setters.put("DIST_CHNL", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        DIST_CHNL = (String)value;
      }
    });
    setters.put("DIV", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        DIV = (String)value;
      }
    });
    setters.put("PRC_GRP", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        PRC_GRP = (String)value;
      }
    });
    setters.put("PRC_LST_TYP", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        PRC_LST_TYP = (String)value;
      }
    });
    setters.put("ORDR_BLOK", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ORDR_BLOK = (String)value;
      }
    });
    setters.put("PREV_ACCT_NBR", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        PREV_ACCT_NBR = (String)value;
      }
    });
    setters.put("CTRY_NM", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        CTRY_NM = (String)value;
      }
    });
    setters.put("SALES_ORDR_BLOK", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        SALES_ORDR_BLOK = (String)value;
      }
    });
  }
  public UVW_CUST() {
    init0();
  }
  private String CUST_NBR;
  public String get_CUST_NBR() {
    return CUST_NBR;
  }
  public void set_CUST_NBR(String CUST_NBR) {
    this.CUST_NBR = CUST_NBR;
  }
  public UVW_CUST with_CUST_NBR(String CUST_NBR) {
    this.CUST_NBR = CUST_NBR;
    return this;
  }
  private String CUST_NM;
  public String get_CUST_NM() {
    return CUST_NM;
  }
  public void set_CUST_NM(String CUST_NM) {
    this.CUST_NM = CUST_NM;
  }
  public UVW_CUST with_CUST_NM(String CUST_NM) {
    this.CUST_NM = CUST_NM;
    return this;
  }
  private String CUST_NM2;
  public String get_CUST_NM2() {
    return CUST_NM2;
  }
  public void set_CUST_NM2(String CUST_NM2) {
    this.CUST_NM2 = CUST_NM2;
  }
  public UVW_CUST with_CUST_NM2(String CUST_NM2) {
    this.CUST_NM2 = CUST_NM2;
    return this;
  }
  private String STR;
  public String get_STR() {
    return STR;
  }
  public void set_STR(String STR) {
    this.STR = STR;
  }
  public UVW_CUST with_STR(String STR) {
    this.STR = STR;
    return this;
  }
  private String CITY;
  public String get_CITY() {
    return CITY;
  }
  public void set_CITY(String CITY) {
    this.CITY = CITY;
  }
  public UVW_CUST with_CITY(String CITY) {
    this.CITY = CITY;
    return this;
  }
  private String RGN;
  public String get_RGN() {
    return RGN;
  }
  public void set_RGN(String RGN) {
    this.RGN = RGN;
  }
  public UVW_CUST with_RGN(String RGN) {
    this.RGN = RGN;
    return this;
  }
  private String DSTR;
  public String get_DSTR() {
    return DSTR;
  }
  public void set_DSTR(String DSTR) {
    this.DSTR = DSTR;
  }
  public UVW_CUST with_DSTR(String DSTR) {
    this.DSTR = DSTR;
    return this;
  }
  private String CTRY;
  public String get_CTRY() {
    return CTRY;
  }
  public void set_CTRY(String CTRY) {
    this.CTRY = CTRY;
  }
  public UVW_CUST with_CTRY(String CTRY) {
    this.CTRY = CTRY;
    return this;
  }
  private String PSTL_CODE;
  public String get_PSTL_CODE() {
    return PSTL_CODE;
  }
  public void set_PSTL_CODE(String PSTL_CODE) {
    this.PSTL_CODE = PSTL_CODE;
  }
  public UVW_CUST with_PSTL_CODE(String PSTL_CODE) {
    this.PSTL_CODE = PSTL_CODE;
    return this;
  }
  private String SRCH_TRM2;
  public String get_SRCH_TRM2() {
    return SRCH_TRM2;
  }
  public void set_SRCH_TRM2(String SRCH_TRM2) {
    this.SRCH_TRM2 = SRCH_TRM2;
  }
  public UVW_CUST with_SRCH_TRM2(String SRCH_TRM2) {
    this.SRCH_TRM2 = SRCH_TRM2;
    return this;
  }
  private String CRE_DT;
  public String get_CRE_DT() {
    return CRE_DT;
  }
  public void set_CRE_DT(String CRE_DT) {
    this.CRE_DT = CRE_DT;
  }
  public UVW_CUST with_CRE_DT(String CRE_DT) {
    this.CRE_DT = CRE_DT;
    return this;
  }
  private String ALTN_PAYR_NBR;
  public String get_ALTN_PAYR_NBR() {
    return ALTN_PAYR_NBR;
  }
  public void set_ALTN_PAYR_NBR(String ALTN_PAYR_NBR) {
    this.ALTN_PAYR_NBR = ALTN_PAYR_NBR;
  }
  public UVW_CUST with_ALTN_PAYR_NBR(String ALTN_PAYR_NBR) {
    this.ALTN_PAYR_NBR = ALTN_PAYR_NBR;
    return this;
  }
  private String ACCT_GRP;
  public String get_ACCT_GRP() {
    return ACCT_GRP;
  }
  public void set_ACCT_GRP(String ACCT_GRP) {
    this.ACCT_GRP = ACCT_GRP;
  }
  public UVW_CUST with_ACCT_GRP(String ACCT_GRP) {
    this.ACCT_GRP = ACCT_GRP;
    return this;
  }
  private String ACCT_GRP_DESC;
  public String get_ACCT_GRP_DESC() {
    return ACCT_GRP_DESC;
  }
  public void set_ACCT_GRP_DESC(String ACCT_GRP_DESC) {
    this.ACCT_GRP_DESC = ACCT_GRP_DESC;
  }
  public UVW_CUST with_ACCT_GRP_DESC(String ACCT_GRP_DESC) {
    this.ACCT_GRP_DESC = ACCT_GRP_DESC;
    return this;
  }
  private String PYMT_BLOK;
  public String get_PYMT_BLOK() {
    return PYMT_BLOK;
  }
  public void set_PYMT_BLOK(String PYMT_BLOK) {
    this.PYMT_BLOK = PYMT_BLOK;
  }
  public UVW_CUST with_PYMT_BLOK(String PYMT_BLOK) {
    this.PYMT_BLOK = PYMT_BLOK;
    return this;
  }
  private String LAB_CUST_GRP;
  public String get_LAB_CUST_GRP() {
    return LAB_CUST_GRP;
  }
  public void set_LAB_CUST_GRP(String LAB_CUST_GRP) {
    this.LAB_CUST_GRP = LAB_CUST_GRP;
  }
  public UVW_CUST with_LAB_CUST_GRP(String LAB_CUST_GRP) {
    this.LAB_CUST_GRP = LAB_CUST_GRP;
    return this;
  }
  private String ALTN_PAYR_ACCT_IND;
  public String get_ALTN_PAYR_ACCT_IND() {
    return ALTN_PAYR_ACCT_IND;
  }
  public void set_ALTN_PAYR_ACCT_IND(String ALTN_PAYR_ACCT_IND) {
    this.ALTN_PAYR_ACCT_IND = ALTN_PAYR_ACCT_IND;
  }
  public UVW_CUST with_ALTN_PAYR_ACCT_IND(String ALTN_PAYR_ACCT_IND) {
    this.ALTN_PAYR_ACCT_IND = ALTN_PAYR_ACCT_IND;
    return this;
  }
  private String SALES_ORG;
  public String get_SALES_ORG() {
    return SALES_ORG;
  }
  public void set_SALES_ORG(String SALES_ORG) {
    this.SALES_ORG = SALES_ORG;
  }
  public UVW_CUST with_SALES_ORG(String SALES_ORG) {
    this.SALES_ORG = SALES_ORG;
    return this;
  }
  private String DIST_CHNL;
  public String get_DIST_CHNL() {
    return DIST_CHNL;
  }
  public void set_DIST_CHNL(String DIST_CHNL) {
    this.DIST_CHNL = DIST_CHNL;
  }
  public UVW_CUST with_DIST_CHNL(String DIST_CHNL) {
    this.DIST_CHNL = DIST_CHNL;
    return this;
  }
  private String DIV;
  public String get_DIV() {
    return DIV;
  }
  public void set_DIV(String DIV) {
    this.DIV = DIV;
  }
  public UVW_CUST with_DIV(String DIV) {
    this.DIV = DIV;
    return this;
  }
  private String PRC_GRP;
  public String get_PRC_GRP() {
    return PRC_GRP;
  }
  public void set_PRC_GRP(String PRC_GRP) {
    this.PRC_GRP = PRC_GRP;
  }
  public UVW_CUST with_PRC_GRP(String PRC_GRP) {
    this.PRC_GRP = PRC_GRP;
    return this;
  }
  private String PRC_LST_TYP;
  public String get_PRC_LST_TYP() {
    return PRC_LST_TYP;
  }
  public void set_PRC_LST_TYP(String PRC_LST_TYP) {
    this.PRC_LST_TYP = PRC_LST_TYP;
  }
  public UVW_CUST with_PRC_LST_TYP(String PRC_LST_TYP) {
    this.PRC_LST_TYP = PRC_LST_TYP;
    return this;
  }
  private String ORDR_BLOK;
  public String get_ORDR_BLOK() {
    return ORDR_BLOK;
  }
  public void set_ORDR_BLOK(String ORDR_BLOK) {
    this.ORDR_BLOK = ORDR_BLOK;
  }
  public UVW_CUST with_ORDR_BLOK(String ORDR_BLOK) {
    this.ORDR_BLOK = ORDR_BLOK;
    return this;
  }
  private String PREV_ACCT_NBR;
  public String get_PREV_ACCT_NBR() {
    return PREV_ACCT_NBR;
  }
  public void set_PREV_ACCT_NBR(String PREV_ACCT_NBR) {
    this.PREV_ACCT_NBR = PREV_ACCT_NBR;
  }
  public UVW_CUST with_PREV_ACCT_NBR(String PREV_ACCT_NBR) {
    this.PREV_ACCT_NBR = PREV_ACCT_NBR;
    return this;
  }
  private String CTRY_NM;
  public String get_CTRY_NM() {
    return CTRY_NM;
  }
  public void set_CTRY_NM(String CTRY_NM) {
    this.CTRY_NM = CTRY_NM;
  }
  public UVW_CUST with_CTRY_NM(String CTRY_NM) {
    this.CTRY_NM = CTRY_NM;
    return this;
  }
  private String SALES_ORDR_BLOK;
  public String get_SALES_ORDR_BLOK() {
    return SALES_ORDR_BLOK;
  }
  public void set_SALES_ORDR_BLOK(String SALES_ORDR_BLOK) {
    this.SALES_ORDR_BLOK = SALES_ORDR_BLOK;
  }
  public UVW_CUST with_SALES_ORDR_BLOK(String SALES_ORDR_BLOK) {
    this.SALES_ORDR_BLOK = SALES_ORDR_BLOK;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof UVW_CUST)) {
      return false;
    }
    UVW_CUST that = (UVW_CUST) o;
    boolean equal = true;
    equal = equal && (this.CUST_NBR == null ? that.CUST_NBR == null : this.CUST_NBR.equals(that.CUST_NBR));
    equal = equal && (this.CUST_NM == null ? that.CUST_NM == null : this.CUST_NM.equals(that.CUST_NM));
    equal = equal && (this.CUST_NM2 == null ? that.CUST_NM2 == null : this.CUST_NM2.equals(that.CUST_NM2));
    equal = equal && (this.STR == null ? that.STR == null : this.STR.equals(that.STR));
    equal = equal && (this.CITY == null ? that.CITY == null : this.CITY.equals(that.CITY));
    equal = equal && (this.RGN == null ? that.RGN == null : this.RGN.equals(that.RGN));
    equal = equal && (this.DSTR == null ? that.DSTR == null : this.DSTR.equals(that.DSTR));
    equal = equal && (this.CTRY == null ? that.CTRY == null : this.CTRY.equals(that.CTRY));
    equal = equal && (this.PSTL_CODE == null ? that.PSTL_CODE == null : this.PSTL_CODE.equals(that.PSTL_CODE));
    equal = equal && (this.SRCH_TRM2 == null ? that.SRCH_TRM2 == null : this.SRCH_TRM2.equals(that.SRCH_TRM2));
    equal = equal && (this.CRE_DT == null ? that.CRE_DT == null : this.CRE_DT.equals(that.CRE_DT));
    equal = equal && (this.ALTN_PAYR_NBR == null ? that.ALTN_PAYR_NBR == null : this.ALTN_PAYR_NBR.equals(that.ALTN_PAYR_NBR));
    equal = equal && (this.ACCT_GRP == null ? that.ACCT_GRP == null : this.ACCT_GRP.equals(that.ACCT_GRP));
    equal = equal && (this.ACCT_GRP_DESC == null ? that.ACCT_GRP_DESC == null : this.ACCT_GRP_DESC.equals(that.ACCT_GRP_DESC));
    equal = equal && (this.PYMT_BLOK == null ? that.PYMT_BLOK == null : this.PYMT_BLOK.equals(that.PYMT_BLOK));
    equal = equal && (this.LAB_CUST_GRP == null ? that.LAB_CUST_GRP == null : this.LAB_CUST_GRP.equals(that.LAB_CUST_GRP));
    equal = equal && (this.ALTN_PAYR_ACCT_IND == null ? that.ALTN_PAYR_ACCT_IND == null : this.ALTN_PAYR_ACCT_IND.equals(that.ALTN_PAYR_ACCT_IND));
    equal = equal && (this.SALES_ORG == null ? that.SALES_ORG == null : this.SALES_ORG.equals(that.SALES_ORG));
    equal = equal && (this.DIST_CHNL == null ? that.DIST_CHNL == null : this.DIST_CHNL.equals(that.DIST_CHNL));
    equal = equal && (this.DIV == null ? that.DIV == null : this.DIV.equals(that.DIV));
    equal = equal && (this.PRC_GRP == null ? that.PRC_GRP == null : this.PRC_GRP.equals(that.PRC_GRP));
    equal = equal && (this.PRC_LST_TYP == null ? that.PRC_LST_TYP == null : this.PRC_LST_TYP.equals(that.PRC_LST_TYP));
    equal = equal && (this.ORDR_BLOK == null ? that.ORDR_BLOK == null : this.ORDR_BLOK.equals(that.ORDR_BLOK));
    equal = equal && (this.PREV_ACCT_NBR == null ? that.PREV_ACCT_NBR == null : this.PREV_ACCT_NBR.equals(that.PREV_ACCT_NBR));
    equal = equal && (this.CTRY_NM == null ? that.CTRY_NM == null : this.CTRY_NM.equals(that.CTRY_NM));
    equal = equal && (this.SALES_ORDR_BLOK == null ? that.SALES_ORDR_BLOK == null : this.SALES_ORDR_BLOK.equals(that.SALES_ORDR_BLOK));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof UVW_CUST)) {
      return false;
    }
    UVW_CUST that = (UVW_CUST) o;
    boolean equal = true;
    equal = equal && (this.CUST_NBR == null ? that.CUST_NBR == null : this.CUST_NBR.equals(that.CUST_NBR));
    equal = equal && (this.CUST_NM == null ? that.CUST_NM == null : this.CUST_NM.equals(that.CUST_NM));
    equal = equal && (this.CUST_NM2 == null ? that.CUST_NM2 == null : this.CUST_NM2.equals(that.CUST_NM2));
    equal = equal && (this.STR == null ? that.STR == null : this.STR.equals(that.STR));
    equal = equal && (this.CITY == null ? that.CITY == null : this.CITY.equals(that.CITY));
    equal = equal && (this.RGN == null ? that.RGN == null : this.RGN.equals(that.RGN));
    equal = equal && (this.DSTR == null ? that.DSTR == null : this.DSTR.equals(that.DSTR));
    equal = equal && (this.CTRY == null ? that.CTRY == null : this.CTRY.equals(that.CTRY));
    equal = equal && (this.PSTL_CODE == null ? that.PSTL_CODE == null : this.PSTL_CODE.equals(that.PSTL_CODE));
    equal = equal && (this.SRCH_TRM2 == null ? that.SRCH_TRM2 == null : this.SRCH_TRM2.equals(that.SRCH_TRM2));
    equal = equal && (this.CRE_DT == null ? that.CRE_DT == null : this.CRE_DT.equals(that.CRE_DT));
    equal = equal && (this.ALTN_PAYR_NBR == null ? that.ALTN_PAYR_NBR == null : this.ALTN_PAYR_NBR.equals(that.ALTN_PAYR_NBR));
    equal = equal && (this.ACCT_GRP == null ? that.ACCT_GRP == null : this.ACCT_GRP.equals(that.ACCT_GRP));
    equal = equal && (this.ACCT_GRP_DESC == null ? that.ACCT_GRP_DESC == null : this.ACCT_GRP_DESC.equals(that.ACCT_GRP_DESC));
    equal = equal && (this.PYMT_BLOK == null ? that.PYMT_BLOK == null : this.PYMT_BLOK.equals(that.PYMT_BLOK));
    equal = equal && (this.LAB_CUST_GRP == null ? that.LAB_CUST_GRP == null : this.LAB_CUST_GRP.equals(that.LAB_CUST_GRP));
    equal = equal && (this.ALTN_PAYR_ACCT_IND == null ? that.ALTN_PAYR_ACCT_IND == null : this.ALTN_PAYR_ACCT_IND.equals(that.ALTN_PAYR_ACCT_IND));
    equal = equal && (this.SALES_ORG == null ? that.SALES_ORG == null : this.SALES_ORG.equals(that.SALES_ORG));
    equal = equal && (this.DIST_CHNL == null ? that.DIST_CHNL == null : this.DIST_CHNL.equals(that.DIST_CHNL));
    equal = equal && (this.DIV == null ? that.DIV == null : this.DIV.equals(that.DIV));
    equal = equal && (this.PRC_GRP == null ? that.PRC_GRP == null : this.PRC_GRP.equals(that.PRC_GRP));
    equal = equal && (this.PRC_LST_TYP == null ? that.PRC_LST_TYP == null : this.PRC_LST_TYP.equals(that.PRC_LST_TYP));
    equal = equal && (this.ORDR_BLOK == null ? that.ORDR_BLOK == null : this.ORDR_BLOK.equals(that.ORDR_BLOK));
    equal = equal && (this.PREV_ACCT_NBR == null ? that.PREV_ACCT_NBR == null : this.PREV_ACCT_NBR.equals(that.PREV_ACCT_NBR));
    equal = equal && (this.CTRY_NM == null ? that.CTRY_NM == null : this.CTRY_NM.equals(that.CTRY_NM));
    equal = equal && (this.SALES_ORDR_BLOK == null ? that.SALES_ORDR_BLOK == null : this.SALES_ORDR_BLOK.equals(that.SALES_ORDR_BLOK));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.CUST_NBR = JdbcWritableBridge.readString(1, __dbResults);
    this.CUST_NM = JdbcWritableBridge.readString(2, __dbResults);
    this.CUST_NM2 = JdbcWritableBridge.readString(3, __dbResults);
    this.STR = JdbcWritableBridge.readString(4, __dbResults);
    this.CITY = JdbcWritableBridge.readString(5, __dbResults);
    this.RGN = JdbcWritableBridge.readString(6, __dbResults);
    this.DSTR = JdbcWritableBridge.readString(7, __dbResults);
    this.CTRY = JdbcWritableBridge.readString(8, __dbResults);
    this.PSTL_CODE = JdbcWritableBridge.readString(9, __dbResults);
    this.SRCH_TRM2 = JdbcWritableBridge.readString(10, __dbResults);
    this.CRE_DT = JdbcWritableBridge.readString(11, __dbResults);
    this.ALTN_PAYR_NBR = JdbcWritableBridge.readString(12, __dbResults);
    this.ACCT_GRP = JdbcWritableBridge.readString(13, __dbResults);
    this.ACCT_GRP_DESC = JdbcWritableBridge.readString(14, __dbResults);
    this.PYMT_BLOK = JdbcWritableBridge.readString(15, __dbResults);
    this.LAB_CUST_GRP = JdbcWritableBridge.readString(16, __dbResults);
    this.ALTN_PAYR_ACCT_IND = JdbcWritableBridge.readString(17, __dbResults);
    this.SALES_ORG = JdbcWritableBridge.readString(18, __dbResults);
    this.DIST_CHNL = JdbcWritableBridge.readString(19, __dbResults);
    this.DIV = JdbcWritableBridge.readString(20, __dbResults);
    this.PRC_GRP = JdbcWritableBridge.readString(21, __dbResults);
    this.PRC_LST_TYP = JdbcWritableBridge.readString(22, __dbResults);
    this.ORDR_BLOK = JdbcWritableBridge.readString(23, __dbResults);
    this.PREV_ACCT_NBR = JdbcWritableBridge.readString(24, __dbResults);
    this.CTRY_NM = JdbcWritableBridge.readString(25, __dbResults);
    this.SALES_ORDR_BLOK = JdbcWritableBridge.readString(26, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.CUST_NBR = JdbcWritableBridge.readString(1, __dbResults);
    this.CUST_NM = JdbcWritableBridge.readString(2, __dbResults);
    this.CUST_NM2 = JdbcWritableBridge.readString(3, __dbResults);
    this.STR = JdbcWritableBridge.readString(4, __dbResults);
    this.CITY = JdbcWritableBridge.readString(5, __dbResults);
    this.RGN = JdbcWritableBridge.readString(6, __dbResults);
    this.DSTR = JdbcWritableBridge.readString(7, __dbResults);
    this.CTRY = JdbcWritableBridge.readString(8, __dbResults);
    this.PSTL_CODE = JdbcWritableBridge.readString(9, __dbResults);
    this.SRCH_TRM2 = JdbcWritableBridge.readString(10, __dbResults);
    this.CRE_DT = JdbcWritableBridge.readString(11, __dbResults);
    this.ALTN_PAYR_NBR = JdbcWritableBridge.readString(12, __dbResults);
    this.ACCT_GRP = JdbcWritableBridge.readString(13, __dbResults);
    this.ACCT_GRP_DESC = JdbcWritableBridge.readString(14, __dbResults);
    this.PYMT_BLOK = JdbcWritableBridge.readString(15, __dbResults);
    this.LAB_CUST_GRP = JdbcWritableBridge.readString(16, __dbResults);
    this.ALTN_PAYR_ACCT_IND = JdbcWritableBridge.readString(17, __dbResults);
    this.SALES_ORG = JdbcWritableBridge.readString(18, __dbResults);
    this.DIST_CHNL = JdbcWritableBridge.readString(19, __dbResults);
    this.DIV = JdbcWritableBridge.readString(20, __dbResults);
    this.PRC_GRP = JdbcWritableBridge.readString(21, __dbResults);
    this.PRC_LST_TYP = JdbcWritableBridge.readString(22, __dbResults);
    this.ORDR_BLOK = JdbcWritableBridge.readString(23, __dbResults);
    this.PREV_ACCT_NBR = JdbcWritableBridge.readString(24, __dbResults);
    this.CTRY_NM = JdbcWritableBridge.readString(25, __dbResults);
    this.SALES_ORDR_BLOK = JdbcWritableBridge.readString(26, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void loadLargeObjects0(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(CUST_NBR, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CUST_NM, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CUST_NM2, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(STR, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CITY, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(RGN, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(DSTR, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CTRY, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(PSTL_CODE, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(SRCH_TRM2, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CRE_DT, 11 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ALTN_PAYR_NBR, 12 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ACCT_GRP, 13 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ACCT_GRP_DESC, 14 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(PYMT_BLOK, 15 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(LAB_CUST_GRP, 16 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ALTN_PAYR_ACCT_IND, 17 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(SALES_ORG, 18 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(DIST_CHNL, 19 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(DIV, 20 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(PRC_GRP, 21 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(PRC_LST_TYP, 22 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ORDR_BLOK, 23 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(PREV_ACCT_NBR, 24 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CTRY_NM, 25 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(SALES_ORDR_BLOK, 26 + __off, 12, __dbStmt);
    return 26;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(CUST_NBR, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CUST_NM, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CUST_NM2, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(STR, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CITY, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(RGN, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(DSTR, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CTRY, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(PSTL_CODE, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(SRCH_TRM2, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CRE_DT, 11 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ALTN_PAYR_NBR, 12 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ACCT_GRP, 13 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ACCT_GRP_DESC, 14 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(PYMT_BLOK, 15 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(LAB_CUST_GRP, 16 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ALTN_PAYR_ACCT_IND, 17 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(SALES_ORG, 18 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(DIST_CHNL, 19 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(DIV, 20 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(PRC_GRP, 21 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(PRC_LST_TYP, 22 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ORDR_BLOK, 23 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(PREV_ACCT_NBR, 24 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CTRY_NM, 25 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(SALES_ORDR_BLOK, 26 + __off, 12, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.CUST_NBR = null;
    } else {
    this.CUST_NBR = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CUST_NM = null;
    } else {
    this.CUST_NM = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CUST_NM2 = null;
    } else {
    this.CUST_NM2 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.STR = null;
    } else {
    this.STR = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CITY = null;
    } else {
    this.CITY = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.RGN = null;
    } else {
    this.RGN = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DSTR = null;
    } else {
    this.DSTR = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CTRY = null;
    } else {
    this.CTRY = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.PSTL_CODE = null;
    } else {
    this.PSTL_CODE = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.SRCH_TRM2 = null;
    } else {
    this.SRCH_TRM2 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CRE_DT = null;
    } else {
    this.CRE_DT = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ALTN_PAYR_NBR = null;
    } else {
    this.ALTN_PAYR_NBR = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ACCT_GRP = null;
    } else {
    this.ACCT_GRP = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ACCT_GRP_DESC = null;
    } else {
    this.ACCT_GRP_DESC = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.PYMT_BLOK = null;
    } else {
    this.PYMT_BLOK = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.LAB_CUST_GRP = null;
    } else {
    this.LAB_CUST_GRP = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ALTN_PAYR_ACCT_IND = null;
    } else {
    this.ALTN_PAYR_ACCT_IND = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.SALES_ORG = null;
    } else {
    this.SALES_ORG = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DIST_CHNL = null;
    } else {
    this.DIST_CHNL = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DIV = null;
    } else {
    this.DIV = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.PRC_GRP = null;
    } else {
    this.PRC_GRP = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.PRC_LST_TYP = null;
    } else {
    this.PRC_LST_TYP = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ORDR_BLOK = null;
    } else {
    this.ORDR_BLOK = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.PREV_ACCT_NBR = null;
    } else {
    this.PREV_ACCT_NBR = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CTRY_NM = null;
    } else {
    this.CTRY_NM = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.SALES_ORDR_BLOK = null;
    } else {
    this.SALES_ORDR_BLOK = Text.readString(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.CUST_NBR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CUST_NBR);
    }
    if (null == this.CUST_NM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CUST_NM);
    }
    if (null == this.CUST_NM2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CUST_NM2);
    }
    if (null == this.STR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, STR);
    }
    if (null == this.CITY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CITY);
    }
    if (null == this.RGN) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, RGN);
    }
    if (null == this.DSTR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DSTR);
    }
    if (null == this.CTRY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CTRY);
    }
    if (null == this.PSTL_CODE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, PSTL_CODE);
    }
    if (null == this.SRCH_TRM2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, SRCH_TRM2);
    }
    if (null == this.CRE_DT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CRE_DT);
    }
    if (null == this.ALTN_PAYR_NBR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ALTN_PAYR_NBR);
    }
    if (null == this.ACCT_GRP) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ACCT_GRP);
    }
    if (null == this.ACCT_GRP_DESC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ACCT_GRP_DESC);
    }
    if (null == this.PYMT_BLOK) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, PYMT_BLOK);
    }
    if (null == this.LAB_CUST_GRP) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LAB_CUST_GRP);
    }
    if (null == this.ALTN_PAYR_ACCT_IND) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ALTN_PAYR_ACCT_IND);
    }
    if (null == this.SALES_ORG) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, SALES_ORG);
    }
    if (null == this.DIST_CHNL) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DIST_CHNL);
    }
    if (null == this.DIV) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DIV);
    }
    if (null == this.PRC_GRP) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, PRC_GRP);
    }
    if (null == this.PRC_LST_TYP) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, PRC_LST_TYP);
    }
    if (null == this.ORDR_BLOK) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ORDR_BLOK);
    }
    if (null == this.PREV_ACCT_NBR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, PREV_ACCT_NBR);
    }
    if (null == this.CTRY_NM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CTRY_NM);
    }
    if (null == this.SALES_ORDR_BLOK) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, SALES_ORDR_BLOK);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.CUST_NBR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CUST_NBR);
    }
    if (null == this.CUST_NM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CUST_NM);
    }
    if (null == this.CUST_NM2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CUST_NM2);
    }
    if (null == this.STR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, STR);
    }
    if (null == this.CITY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CITY);
    }
    if (null == this.RGN) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, RGN);
    }
    if (null == this.DSTR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DSTR);
    }
    if (null == this.CTRY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CTRY);
    }
    if (null == this.PSTL_CODE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, PSTL_CODE);
    }
    if (null == this.SRCH_TRM2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, SRCH_TRM2);
    }
    if (null == this.CRE_DT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CRE_DT);
    }
    if (null == this.ALTN_PAYR_NBR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ALTN_PAYR_NBR);
    }
    if (null == this.ACCT_GRP) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ACCT_GRP);
    }
    if (null == this.ACCT_GRP_DESC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ACCT_GRP_DESC);
    }
    if (null == this.PYMT_BLOK) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, PYMT_BLOK);
    }
    if (null == this.LAB_CUST_GRP) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LAB_CUST_GRP);
    }
    if (null == this.ALTN_PAYR_ACCT_IND) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ALTN_PAYR_ACCT_IND);
    }
    if (null == this.SALES_ORG) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, SALES_ORG);
    }
    if (null == this.DIST_CHNL) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DIST_CHNL);
    }
    if (null == this.DIV) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DIV);
    }
    if (null == this.PRC_GRP) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, PRC_GRP);
    }
    if (null == this.PRC_LST_TYP) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, PRC_LST_TYP);
    }
    if (null == this.ORDR_BLOK) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ORDR_BLOK);
    }
    if (null == this.PREV_ACCT_NBR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, PREV_ACCT_NBR);
    }
    if (null == this.CTRY_NM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CTRY_NM);
    }
    if (null == this.SALES_ORDR_BLOK) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, SALES_ORDR_BLOK);
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  public String toString() {
    return toString(__outputDelimiters, true);
  }
  public String toString(DelimiterSet delimiters) {
    return toString(delimiters, true);
  }
  public String toString(boolean useRecordDelim) {
    return toString(__outputDelimiters, useRecordDelim);
  }
  public String toString(DelimiterSet delimiters, boolean useRecordDelim) {
    StringBuilder __sb = new StringBuilder();
    char fieldDelim = delimiters.getFieldsTerminatedBy();
    __sb.append(FieldFormatter.escapeAndEnclose(CUST_NBR==null?"null":CUST_NBR, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CUST_NM==null?"null":CUST_NM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CUST_NM2==null?"null":CUST_NM2, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(STR==null?"null":STR, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CITY==null?"null":CITY, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(RGN==null?"null":RGN, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DSTR==null?"null":DSTR, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CTRY==null?"null":CTRY, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PSTL_CODE==null?"null":PSTL_CODE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SRCH_TRM2==null?"null":SRCH_TRM2, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CRE_DT==null?"null":CRE_DT, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ALTN_PAYR_NBR==null?"null":ALTN_PAYR_NBR, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ACCT_GRP==null?"null":ACCT_GRP, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ACCT_GRP_DESC==null?"null":ACCT_GRP_DESC, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PYMT_BLOK==null?"null":PYMT_BLOK, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LAB_CUST_GRP==null?"null":LAB_CUST_GRP, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ALTN_PAYR_ACCT_IND==null?"null":ALTN_PAYR_ACCT_IND, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SALES_ORG==null?"null":SALES_ORG, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DIST_CHNL==null?"null":DIST_CHNL, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DIV==null?"null":DIV, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PRC_GRP==null?"null":PRC_GRP, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PRC_LST_TYP==null?"null":PRC_LST_TYP, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ORDR_BLOK==null?"null":ORDR_BLOK, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PREV_ACCT_NBR==null?"null":PREV_ACCT_NBR, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CTRY_NM==null?"null":CTRY_NM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SALES_ORDR_BLOK==null?"null":SALES_ORDR_BLOK, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(CUST_NBR==null?"null":CUST_NBR, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CUST_NM==null?"null":CUST_NM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CUST_NM2==null?"null":CUST_NM2, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(STR==null?"null":STR, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CITY==null?"null":CITY, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(RGN==null?"null":RGN, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DSTR==null?"null":DSTR, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CTRY==null?"null":CTRY, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PSTL_CODE==null?"null":PSTL_CODE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SRCH_TRM2==null?"null":SRCH_TRM2, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CRE_DT==null?"null":CRE_DT, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ALTN_PAYR_NBR==null?"null":ALTN_PAYR_NBR, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ACCT_GRP==null?"null":ACCT_GRP, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ACCT_GRP_DESC==null?"null":ACCT_GRP_DESC, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PYMT_BLOK==null?"null":PYMT_BLOK, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LAB_CUST_GRP==null?"null":LAB_CUST_GRP, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ALTN_PAYR_ACCT_IND==null?"null":ALTN_PAYR_ACCT_IND, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SALES_ORG==null?"null":SALES_ORG, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DIST_CHNL==null?"null":DIST_CHNL, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DIV==null?"null":DIV, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PRC_GRP==null?"null":PRC_GRP, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PRC_LST_TYP==null?"null":PRC_LST_TYP, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ORDR_BLOK==null?"null":ORDR_BLOK, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PREV_ACCT_NBR==null?"null":PREV_ACCT_NBR, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CTRY_NM==null?"null":CTRY_NM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SALES_ORDR_BLOK==null?"null":SALES_ORDR_BLOK, delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  private RecordParser __parser;
  public void parse(Text __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharSequence __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(byte [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(char [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(ByteBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  private void __loadFromFields(List<String> fields) {
    Iterator<String> __it = fields.listIterator();
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CUST_NBR = null; } else {
      this.CUST_NBR = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CUST_NM = null; } else {
      this.CUST_NM = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CUST_NM2 = null; } else {
      this.CUST_NM2 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.STR = null; } else {
      this.STR = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CITY = null; } else {
      this.CITY = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.RGN = null; } else {
      this.RGN = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.DSTR = null; } else {
      this.DSTR = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CTRY = null; } else {
      this.CTRY = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.PSTL_CODE = null; } else {
      this.PSTL_CODE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.SRCH_TRM2 = null; } else {
      this.SRCH_TRM2 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CRE_DT = null; } else {
      this.CRE_DT = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ALTN_PAYR_NBR = null; } else {
      this.ALTN_PAYR_NBR = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ACCT_GRP = null; } else {
      this.ACCT_GRP = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ACCT_GRP_DESC = null; } else {
      this.ACCT_GRP_DESC = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.PYMT_BLOK = null; } else {
      this.PYMT_BLOK = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.LAB_CUST_GRP = null; } else {
      this.LAB_CUST_GRP = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ALTN_PAYR_ACCT_IND = null; } else {
      this.ALTN_PAYR_ACCT_IND = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.SALES_ORG = null; } else {
      this.SALES_ORG = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.DIST_CHNL = null; } else {
      this.DIST_CHNL = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.DIV = null; } else {
      this.DIV = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.PRC_GRP = null; } else {
      this.PRC_GRP = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.PRC_LST_TYP = null; } else {
      this.PRC_LST_TYP = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ORDR_BLOK = null; } else {
      this.ORDR_BLOK = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.PREV_ACCT_NBR = null; } else {
      this.PREV_ACCT_NBR = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CTRY_NM = null; } else {
      this.CTRY_NM = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.SALES_ORDR_BLOK = null; } else {
      this.SALES_ORDR_BLOK = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CUST_NBR = null; } else {
      this.CUST_NBR = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CUST_NM = null; } else {
      this.CUST_NM = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CUST_NM2 = null; } else {
      this.CUST_NM2 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.STR = null; } else {
      this.STR = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CITY = null; } else {
      this.CITY = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.RGN = null; } else {
      this.RGN = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.DSTR = null; } else {
      this.DSTR = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CTRY = null; } else {
      this.CTRY = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.PSTL_CODE = null; } else {
      this.PSTL_CODE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.SRCH_TRM2 = null; } else {
      this.SRCH_TRM2 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CRE_DT = null; } else {
      this.CRE_DT = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ALTN_PAYR_NBR = null; } else {
      this.ALTN_PAYR_NBR = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ACCT_GRP = null; } else {
      this.ACCT_GRP = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ACCT_GRP_DESC = null; } else {
      this.ACCT_GRP_DESC = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.PYMT_BLOK = null; } else {
      this.PYMT_BLOK = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.LAB_CUST_GRP = null; } else {
      this.LAB_CUST_GRP = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ALTN_PAYR_ACCT_IND = null; } else {
      this.ALTN_PAYR_ACCT_IND = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.SALES_ORG = null; } else {
      this.SALES_ORG = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.DIST_CHNL = null; } else {
      this.DIST_CHNL = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.DIV = null; } else {
      this.DIV = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.PRC_GRP = null; } else {
      this.PRC_GRP = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.PRC_LST_TYP = null; } else {
      this.PRC_LST_TYP = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ORDR_BLOK = null; } else {
      this.ORDR_BLOK = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.PREV_ACCT_NBR = null; } else {
      this.PREV_ACCT_NBR = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CTRY_NM = null; } else {
      this.CTRY_NM = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.SALES_ORDR_BLOK = null; } else {
      this.SALES_ORDR_BLOK = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    UVW_CUST o = (UVW_CUST) super.clone();
    return o;
  }

  public void clone0(UVW_CUST o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("CUST_NBR", this.CUST_NBR);
    __sqoop$field_map.put("CUST_NM", this.CUST_NM);
    __sqoop$field_map.put("CUST_NM2", this.CUST_NM2);
    __sqoop$field_map.put("STR", this.STR);
    __sqoop$field_map.put("CITY", this.CITY);
    __sqoop$field_map.put("RGN", this.RGN);
    __sqoop$field_map.put("DSTR", this.DSTR);
    __sqoop$field_map.put("CTRY", this.CTRY);
    __sqoop$field_map.put("PSTL_CODE", this.PSTL_CODE);
    __sqoop$field_map.put("SRCH_TRM2", this.SRCH_TRM2);
    __sqoop$field_map.put("CRE_DT", this.CRE_DT);
    __sqoop$field_map.put("ALTN_PAYR_NBR", this.ALTN_PAYR_NBR);
    __sqoop$field_map.put("ACCT_GRP", this.ACCT_GRP);
    __sqoop$field_map.put("ACCT_GRP_DESC", this.ACCT_GRP_DESC);
    __sqoop$field_map.put("PYMT_BLOK", this.PYMT_BLOK);
    __sqoop$field_map.put("LAB_CUST_GRP", this.LAB_CUST_GRP);
    __sqoop$field_map.put("ALTN_PAYR_ACCT_IND", this.ALTN_PAYR_ACCT_IND);
    __sqoop$field_map.put("SALES_ORG", this.SALES_ORG);
    __sqoop$field_map.put("DIST_CHNL", this.DIST_CHNL);
    __sqoop$field_map.put("DIV", this.DIV);
    __sqoop$field_map.put("PRC_GRP", this.PRC_GRP);
    __sqoop$field_map.put("PRC_LST_TYP", this.PRC_LST_TYP);
    __sqoop$field_map.put("ORDR_BLOK", this.ORDR_BLOK);
    __sqoop$field_map.put("PREV_ACCT_NBR", this.PREV_ACCT_NBR);
    __sqoop$field_map.put("CTRY_NM", this.CTRY_NM);
    __sqoop$field_map.put("SALES_ORDR_BLOK", this.SALES_ORDR_BLOK);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("CUST_NBR", this.CUST_NBR);
    __sqoop$field_map.put("CUST_NM", this.CUST_NM);
    __sqoop$field_map.put("CUST_NM2", this.CUST_NM2);
    __sqoop$field_map.put("STR", this.STR);
    __sqoop$field_map.put("CITY", this.CITY);
    __sqoop$field_map.put("RGN", this.RGN);
    __sqoop$field_map.put("DSTR", this.DSTR);
    __sqoop$field_map.put("CTRY", this.CTRY);
    __sqoop$field_map.put("PSTL_CODE", this.PSTL_CODE);
    __sqoop$field_map.put("SRCH_TRM2", this.SRCH_TRM2);
    __sqoop$field_map.put("CRE_DT", this.CRE_DT);
    __sqoop$field_map.put("ALTN_PAYR_NBR", this.ALTN_PAYR_NBR);
    __sqoop$field_map.put("ACCT_GRP", this.ACCT_GRP);
    __sqoop$field_map.put("ACCT_GRP_DESC", this.ACCT_GRP_DESC);
    __sqoop$field_map.put("PYMT_BLOK", this.PYMT_BLOK);
    __sqoop$field_map.put("LAB_CUST_GRP", this.LAB_CUST_GRP);
    __sqoop$field_map.put("ALTN_PAYR_ACCT_IND", this.ALTN_PAYR_ACCT_IND);
    __sqoop$field_map.put("SALES_ORG", this.SALES_ORG);
    __sqoop$field_map.put("DIST_CHNL", this.DIST_CHNL);
    __sqoop$field_map.put("DIV", this.DIV);
    __sqoop$field_map.put("PRC_GRP", this.PRC_GRP);
    __sqoop$field_map.put("PRC_LST_TYP", this.PRC_LST_TYP);
    __sqoop$field_map.put("ORDR_BLOK", this.ORDR_BLOK);
    __sqoop$field_map.put("PREV_ACCT_NBR", this.PREV_ACCT_NBR);
    __sqoop$field_map.put("CTRY_NM", this.CTRY_NM);
    __sqoop$field_map.put("SALES_ORDR_BLOK", this.SALES_ORDR_BLOK);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
