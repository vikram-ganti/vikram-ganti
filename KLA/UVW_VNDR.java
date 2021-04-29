// ORM class for table 'UVW_VNDR'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Wed Mar 17 06:02:23 UTC 2021
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

public class UVW_VNDR extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("VNDR_NBR", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        VNDR_NBR = (String)value;
      }
    });
    setters.put("VNDR_NM", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        VNDR_NM = (String)value;
      }
    });
    setters.put("VNDR_NM2", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        VNDR_NM2 = (String)value;
      }
    });
    setters.put("VNDR_NM3", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        VNDR_NM3 = (String)value;
      }
    });
    setters.put("VNDR_NM4", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        VNDR_NM4 = (String)value;
      }
    });
    setters.put("GRP_KEY", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        GRP_KEY = (String)value;
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
    setters.put("DEL_FLG", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        DEL_FLG = (String)value;
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
    setters.put("DISTR", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        DISTR = (String)value;
      }
    });
    setters.put("RGN", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        RGN = (String)value;
      }
    });
    setters.put("PSTL_CODE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        PSTL_CODE = (String)value;
      }
    });
    setters.put("CTRY", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        CTRY = (String)value;
      }
    });
    setters.put("PO_BOX", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        PO_BOX = (String)value;
      }
    });
    setters.put("PO_BOX_PSTL_CODE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        PO_BOX_PSTL_CODE = (String)value;
      }
    });
    setters.put("SCAC", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        SCAC = (String)value;
      }
    });
    setters.put("CNTRL_PSTNG_BLOK", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        CNTRL_PSTNG_BLOK = (String)value;
      }
    });
    setters.put("CNTRL_PUR_BLOK", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        CNTRL_PUR_BLOK = (String)value;
      }
    });
    setters.put("PYMT_BLOK", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        PYMT_BLOK = (String)value;
      }
    });
    setters.put("CNTRL_DEL_BLOK", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        CNTRL_DEL_BLOK = (String)value;
      }
    });
    setters.put("PHN_NBR", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        PHN_NBR = (String)value;
      }
    });
    setters.put("FAX_NBR", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        FAX_NBR = (String)value;
      }
    });
    setters.put("TX_CODE1", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        TX_CODE1 = (String)value;
      }
    });
    setters.put("TX_CODE2", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        TX_CODE2 = (String)value;
      }
    });
    setters.put("TX_JURIS_CODE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        TX_JURIS_CODE = (String)value;
      }
    });
  }
  public UVW_VNDR() {
    init0();
  }
  private String VNDR_NBR;
  public String get_VNDR_NBR() {
    return VNDR_NBR;
  }
  public void set_VNDR_NBR(String VNDR_NBR) {
    this.VNDR_NBR = VNDR_NBR;
  }
  public UVW_VNDR with_VNDR_NBR(String VNDR_NBR) {
    this.VNDR_NBR = VNDR_NBR;
    return this;
  }
  private String VNDR_NM;
  public String get_VNDR_NM() {
    return VNDR_NM;
  }
  public void set_VNDR_NM(String VNDR_NM) {
    this.VNDR_NM = VNDR_NM;
  }
  public UVW_VNDR with_VNDR_NM(String VNDR_NM) {
    this.VNDR_NM = VNDR_NM;
    return this;
  }
  private String VNDR_NM2;
  public String get_VNDR_NM2() {
    return VNDR_NM2;
  }
  public void set_VNDR_NM2(String VNDR_NM2) {
    this.VNDR_NM2 = VNDR_NM2;
  }
  public UVW_VNDR with_VNDR_NM2(String VNDR_NM2) {
    this.VNDR_NM2 = VNDR_NM2;
    return this;
  }
  private String VNDR_NM3;
  public String get_VNDR_NM3() {
    return VNDR_NM3;
  }
  public void set_VNDR_NM3(String VNDR_NM3) {
    this.VNDR_NM3 = VNDR_NM3;
  }
  public UVW_VNDR with_VNDR_NM3(String VNDR_NM3) {
    this.VNDR_NM3 = VNDR_NM3;
    return this;
  }
  private String VNDR_NM4;
  public String get_VNDR_NM4() {
    return VNDR_NM4;
  }
  public void set_VNDR_NM4(String VNDR_NM4) {
    this.VNDR_NM4 = VNDR_NM4;
  }
  public UVW_VNDR with_VNDR_NM4(String VNDR_NM4) {
    this.VNDR_NM4 = VNDR_NM4;
    return this;
  }
  private String GRP_KEY;
  public String get_GRP_KEY() {
    return GRP_KEY;
  }
  public void set_GRP_KEY(String GRP_KEY) {
    this.GRP_KEY = GRP_KEY;
  }
  public UVW_VNDR with_GRP_KEY(String GRP_KEY) {
    this.GRP_KEY = GRP_KEY;
    return this;
  }
  private String ACCT_GRP;
  public String get_ACCT_GRP() {
    return ACCT_GRP;
  }
  public void set_ACCT_GRP(String ACCT_GRP) {
    this.ACCT_GRP = ACCT_GRP;
  }
  public UVW_VNDR with_ACCT_GRP(String ACCT_GRP) {
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
  public UVW_VNDR with_ACCT_GRP_DESC(String ACCT_GRP_DESC) {
    this.ACCT_GRP_DESC = ACCT_GRP_DESC;
    return this;
  }
  private String DEL_FLG;
  public String get_DEL_FLG() {
    return DEL_FLG;
  }
  public void set_DEL_FLG(String DEL_FLG) {
    this.DEL_FLG = DEL_FLG;
  }
  public UVW_VNDR with_DEL_FLG(String DEL_FLG) {
    this.DEL_FLG = DEL_FLG;
    return this;
  }
  private String STR;
  public String get_STR() {
    return STR;
  }
  public void set_STR(String STR) {
    this.STR = STR;
  }
  public UVW_VNDR with_STR(String STR) {
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
  public UVW_VNDR with_CITY(String CITY) {
    this.CITY = CITY;
    return this;
  }
  private String DISTR;
  public String get_DISTR() {
    return DISTR;
  }
  public void set_DISTR(String DISTR) {
    this.DISTR = DISTR;
  }
  public UVW_VNDR with_DISTR(String DISTR) {
    this.DISTR = DISTR;
    return this;
  }
  private String RGN;
  public String get_RGN() {
    return RGN;
  }
  public void set_RGN(String RGN) {
    this.RGN = RGN;
  }
  public UVW_VNDR with_RGN(String RGN) {
    this.RGN = RGN;
    return this;
  }
  private String PSTL_CODE;
  public String get_PSTL_CODE() {
    return PSTL_CODE;
  }
  public void set_PSTL_CODE(String PSTL_CODE) {
    this.PSTL_CODE = PSTL_CODE;
  }
  public UVW_VNDR with_PSTL_CODE(String PSTL_CODE) {
    this.PSTL_CODE = PSTL_CODE;
    return this;
  }
  private String CTRY;
  public String get_CTRY() {
    return CTRY;
  }
  public void set_CTRY(String CTRY) {
    this.CTRY = CTRY;
  }
  public UVW_VNDR with_CTRY(String CTRY) {
    this.CTRY = CTRY;
    return this;
  }
  private String PO_BOX;
  public String get_PO_BOX() {
    return PO_BOX;
  }
  public void set_PO_BOX(String PO_BOX) {
    this.PO_BOX = PO_BOX;
  }
  public UVW_VNDR with_PO_BOX(String PO_BOX) {
    this.PO_BOX = PO_BOX;
    return this;
  }
  private String PO_BOX_PSTL_CODE;
  public String get_PO_BOX_PSTL_CODE() {
    return PO_BOX_PSTL_CODE;
  }
  public void set_PO_BOX_PSTL_CODE(String PO_BOX_PSTL_CODE) {
    this.PO_BOX_PSTL_CODE = PO_BOX_PSTL_CODE;
  }
  public UVW_VNDR with_PO_BOX_PSTL_CODE(String PO_BOX_PSTL_CODE) {
    this.PO_BOX_PSTL_CODE = PO_BOX_PSTL_CODE;
    return this;
  }
  private String SCAC;
  public String get_SCAC() {
    return SCAC;
  }
  public void set_SCAC(String SCAC) {
    this.SCAC = SCAC;
  }
  public UVW_VNDR with_SCAC(String SCAC) {
    this.SCAC = SCAC;
    return this;
  }
  private String CNTRL_PSTNG_BLOK;
  public String get_CNTRL_PSTNG_BLOK() {
    return CNTRL_PSTNG_BLOK;
  }
  public void set_CNTRL_PSTNG_BLOK(String CNTRL_PSTNG_BLOK) {
    this.CNTRL_PSTNG_BLOK = CNTRL_PSTNG_BLOK;
  }
  public UVW_VNDR with_CNTRL_PSTNG_BLOK(String CNTRL_PSTNG_BLOK) {
    this.CNTRL_PSTNG_BLOK = CNTRL_PSTNG_BLOK;
    return this;
  }
  private String CNTRL_PUR_BLOK;
  public String get_CNTRL_PUR_BLOK() {
    return CNTRL_PUR_BLOK;
  }
  public void set_CNTRL_PUR_BLOK(String CNTRL_PUR_BLOK) {
    this.CNTRL_PUR_BLOK = CNTRL_PUR_BLOK;
  }
  public UVW_VNDR with_CNTRL_PUR_BLOK(String CNTRL_PUR_BLOK) {
    this.CNTRL_PUR_BLOK = CNTRL_PUR_BLOK;
    return this;
  }
  private String PYMT_BLOK;
  public String get_PYMT_BLOK() {
    return PYMT_BLOK;
  }
  public void set_PYMT_BLOK(String PYMT_BLOK) {
    this.PYMT_BLOK = PYMT_BLOK;
  }
  public UVW_VNDR with_PYMT_BLOK(String PYMT_BLOK) {
    this.PYMT_BLOK = PYMT_BLOK;
    return this;
  }
  private String CNTRL_DEL_BLOK;
  public String get_CNTRL_DEL_BLOK() {
    return CNTRL_DEL_BLOK;
  }
  public void set_CNTRL_DEL_BLOK(String CNTRL_DEL_BLOK) {
    this.CNTRL_DEL_BLOK = CNTRL_DEL_BLOK;
  }
  public UVW_VNDR with_CNTRL_DEL_BLOK(String CNTRL_DEL_BLOK) {
    this.CNTRL_DEL_BLOK = CNTRL_DEL_BLOK;
    return this;
  }
  private String PHN_NBR;
  public String get_PHN_NBR() {
    return PHN_NBR;
  }
  public void set_PHN_NBR(String PHN_NBR) {
    this.PHN_NBR = PHN_NBR;
  }
  public UVW_VNDR with_PHN_NBR(String PHN_NBR) {
    this.PHN_NBR = PHN_NBR;
    return this;
  }
  private String FAX_NBR;
  public String get_FAX_NBR() {
    return FAX_NBR;
  }
  public void set_FAX_NBR(String FAX_NBR) {
    this.FAX_NBR = FAX_NBR;
  }
  public UVW_VNDR with_FAX_NBR(String FAX_NBR) {
    this.FAX_NBR = FAX_NBR;
    return this;
  }
  private String TX_CODE1;
  public String get_TX_CODE1() {
    return TX_CODE1;
  }
  public void set_TX_CODE1(String TX_CODE1) {
    this.TX_CODE1 = TX_CODE1;
  }
  public UVW_VNDR with_TX_CODE1(String TX_CODE1) {
    this.TX_CODE1 = TX_CODE1;
    return this;
  }
  private String TX_CODE2;
  public String get_TX_CODE2() {
    return TX_CODE2;
  }
  public void set_TX_CODE2(String TX_CODE2) {
    this.TX_CODE2 = TX_CODE2;
  }
  public UVW_VNDR with_TX_CODE2(String TX_CODE2) {
    this.TX_CODE2 = TX_CODE2;
    return this;
  }
  private String TX_JURIS_CODE;
  public String get_TX_JURIS_CODE() {
    return TX_JURIS_CODE;
  }
  public void set_TX_JURIS_CODE(String TX_JURIS_CODE) {
    this.TX_JURIS_CODE = TX_JURIS_CODE;
  }
  public UVW_VNDR with_TX_JURIS_CODE(String TX_JURIS_CODE) {
    this.TX_JURIS_CODE = TX_JURIS_CODE;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof UVW_VNDR)) {
      return false;
    }
    UVW_VNDR that = (UVW_VNDR) o;
    boolean equal = true;
    equal = equal && (this.VNDR_NBR == null ? that.VNDR_NBR == null : this.VNDR_NBR.equals(that.VNDR_NBR));
    equal = equal && (this.VNDR_NM == null ? that.VNDR_NM == null : this.VNDR_NM.equals(that.VNDR_NM));
    equal = equal && (this.VNDR_NM2 == null ? that.VNDR_NM2 == null : this.VNDR_NM2.equals(that.VNDR_NM2));
    equal = equal && (this.VNDR_NM3 == null ? that.VNDR_NM3 == null : this.VNDR_NM3.equals(that.VNDR_NM3));
    equal = equal && (this.VNDR_NM4 == null ? that.VNDR_NM4 == null : this.VNDR_NM4.equals(that.VNDR_NM4));
    equal = equal && (this.GRP_KEY == null ? that.GRP_KEY == null : this.GRP_KEY.equals(that.GRP_KEY));
    equal = equal && (this.ACCT_GRP == null ? that.ACCT_GRP == null : this.ACCT_GRP.equals(that.ACCT_GRP));
    equal = equal && (this.ACCT_GRP_DESC == null ? that.ACCT_GRP_DESC == null : this.ACCT_GRP_DESC.equals(that.ACCT_GRP_DESC));
    equal = equal && (this.DEL_FLG == null ? that.DEL_FLG == null : this.DEL_FLG.equals(that.DEL_FLG));
    equal = equal && (this.STR == null ? that.STR == null : this.STR.equals(that.STR));
    equal = equal && (this.CITY == null ? that.CITY == null : this.CITY.equals(that.CITY));
    equal = equal && (this.DISTR == null ? that.DISTR == null : this.DISTR.equals(that.DISTR));
    equal = equal && (this.RGN == null ? that.RGN == null : this.RGN.equals(that.RGN));
    equal = equal && (this.PSTL_CODE == null ? that.PSTL_CODE == null : this.PSTL_CODE.equals(that.PSTL_CODE));
    equal = equal && (this.CTRY == null ? that.CTRY == null : this.CTRY.equals(that.CTRY));
    equal = equal && (this.PO_BOX == null ? that.PO_BOX == null : this.PO_BOX.equals(that.PO_BOX));
    equal = equal && (this.PO_BOX_PSTL_CODE == null ? that.PO_BOX_PSTL_CODE == null : this.PO_BOX_PSTL_CODE.equals(that.PO_BOX_PSTL_CODE));
    equal = equal && (this.SCAC == null ? that.SCAC == null : this.SCAC.equals(that.SCAC));
    equal = equal && (this.CNTRL_PSTNG_BLOK == null ? that.CNTRL_PSTNG_BLOK == null : this.CNTRL_PSTNG_BLOK.equals(that.CNTRL_PSTNG_BLOK));
    equal = equal && (this.CNTRL_PUR_BLOK == null ? that.CNTRL_PUR_BLOK == null : this.CNTRL_PUR_BLOK.equals(that.CNTRL_PUR_BLOK));
    equal = equal && (this.PYMT_BLOK == null ? that.PYMT_BLOK == null : this.PYMT_BLOK.equals(that.PYMT_BLOK));
    equal = equal && (this.CNTRL_DEL_BLOK == null ? that.CNTRL_DEL_BLOK == null : this.CNTRL_DEL_BLOK.equals(that.CNTRL_DEL_BLOK));
    equal = equal && (this.PHN_NBR == null ? that.PHN_NBR == null : this.PHN_NBR.equals(that.PHN_NBR));
    equal = equal && (this.FAX_NBR == null ? that.FAX_NBR == null : this.FAX_NBR.equals(that.FAX_NBR));
    equal = equal && (this.TX_CODE1 == null ? that.TX_CODE1 == null : this.TX_CODE1.equals(that.TX_CODE1));
    equal = equal && (this.TX_CODE2 == null ? that.TX_CODE2 == null : this.TX_CODE2.equals(that.TX_CODE2));
    equal = equal && (this.TX_JURIS_CODE == null ? that.TX_JURIS_CODE == null : this.TX_JURIS_CODE.equals(that.TX_JURIS_CODE));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof UVW_VNDR)) {
      return false;
    }
    UVW_VNDR that = (UVW_VNDR) o;
    boolean equal = true;
    equal = equal && (this.VNDR_NBR == null ? that.VNDR_NBR == null : this.VNDR_NBR.equals(that.VNDR_NBR));
    equal = equal && (this.VNDR_NM == null ? that.VNDR_NM == null : this.VNDR_NM.equals(that.VNDR_NM));
    equal = equal && (this.VNDR_NM2 == null ? that.VNDR_NM2 == null : this.VNDR_NM2.equals(that.VNDR_NM2));
    equal = equal && (this.VNDR_NM3 == null ? that.VNDR_NM3 == null : this.VNDR_NM3.equals(that.VNDR_NM3));
    equal = equal && (this.VNDR_NM4 == null ? that.VNDR_NM4 == null : this.VNDR_NM4.equals(that.VNDR_NM4));
    equal = equal && (this.GRP_KEY == null ? that.GRP_KEY == null : this.GRP_KEY.equals(that.GRP_KEY));
    equal = equal && (this.ACCT_GRP == null ? that.ACCT_GRP == null : this.ACCT_GRP.equals(that.ACCT_GRP));
    equal = equal && (this.ACCT_GRP_DESC == null ? that.ACCT_GRP_DESC == null : this.ACCT_GRP_DESC.equals(that.ACCT_GRP_DESC));
    equal = equal && (this.DEL_FLG == null ? that.DEL_FLG == null : this.DEL_FLG.equals(that.DEL_FLG));
    equal = equal && (this.STR == null ? that.STR == null : this.STR.equals(that.STR));
    equal = equal && (this.CITY == null ? that.CITY == null : this.CITY.equals(that.CITY));
    equal = equal && (this.DISTR == null ? that.DISTR == null : this.DISTR.equals(that.DISTR));
    equal = equal && (this.RGN == null ? that.RGN == null : this.RGN.equals(that.RGN));
    equal = equal && (this.PSTL_CODE == null ? that.PSTL_CODE == null : this.PSTL_CODE.equals(that.PSTL_CODE));
    equal = equal && (this.CTRY == null ? that.CTRY == null : this.CTRY.equals(that.CTRY));
    equal = equal && (this.PO_BOX == null ? that.PO_BOX == null : this.PO_BOX.equals(that.PO_BOX));
    equal = equal && (this.PO_BOX_PSTL_CODE == null ? that.PO_BOX_PSTL_CODE == null : this.PO_BOX_PSTL_CODE.equals(that.PO_BOX_PSTL_CODE));
    equal = equal && (this.SCAC == null ? that.SCAC == null : this.SCAC.equals(that.SCAC));
    equal = equal && (this.CNTRL_PSTNG_BLOK == null ? that.CNTRL_PSTNG_BLOK == null : this.CNTRL_PSTNG_BLOK.equals(that.CNTRL_PSTNG_BLOK));
    equal = equal && (this.CNTRL_PUR_BLOK == null ? that.CNTRL_PUR_BLOK == null : this.CNTRL_PUR_BLOK.equals(that.CNTRL_PUR_BLOK));
    equal = equal && (this.PYMT_BLOK == null ? that.PYMT_BLOK == null : this.PYMT_BLOK.equals(that.PYMT_BLOK));
    equal = equal && (this.CNTRL_DEL_BLOK == null ? that.CNTRL_DEL_BLOK == null : this.CNTRL_DEL_BLOK.equals(that.CNTRL_DEL_BLOK));
    equal = equal && (this.PHN_NBR == null ? that.PHN_NBR == null : this.PHN_NBR.equals(that.PHN_NBR));
    equal = equal && (this.FAX_NBR == null ? that.FAX_NBR == null : this.FAX_NBR.equals(that.FAX_NBR));
    equal = equal && (this.TX_CODE1 == null ? that.TX_CODE1 == null : this.TX_CODE1.equals(that.TX_CODE1));
    equal = equal && (this.TX_CODE2 == null ? that.TX_CODE2 == null : this.TX_CODE2.equals(that.TX_CODE2));
    equal = equal && (this.TX_JURIS_CODE == null ? that.TX_JURIS_CODE == null : this.TX_JURIS_CODE.equals(that.TX_JURIS_CODE));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.VNDR_NBR = JdbcWritableBridge.readString(1, __dbResults);
    this.VNDR_NM = JdbcWritableBridge.readString(2, __dbResults);
    this.VNDR_NM2 = JdbcWritableBridge.readString(3, __dbResults);
    this.VNDR_NM3 = JdbcWritableBridge.readString(4, __dbResults);
    this.VNDR_NM4 = JdbcWritableBridge.readString(5, __dbResults);
    this.GRP_KEY = JdbcWritableBridge.readString(6, __dbResults);
    this.ACCT_GRP = JdbcWritableBridge.readString(7, __dbResults);
    this.ACCT_GRP_DESC = JdbcWritableBridge.readString(8, __dbResults);
    this.DEL_FLG = JdbcWritableBridge.readString(9, __dbResults);
    this.STR = JdbcWritableBridge.readString(10, __dbResults);
    this.CITY = JdbcWritableBridge.readString(11, __dbResults);
    this.DISTR = JdbcWritableBridge.readString(12, __dbResults);
    this.RGN = JdbcWritableBridge.readString(13, __dbResults);
    this.PSTL_CODE = JdbcWritableBridge.readString(14, __dbResults);
    this.CTRY = JdbcWritableBridge.readString(15, __dbResults);
    this.PO_BOX = JdbcWritableBridge.readString(16, __dbResults);
    this.PO_BOX_PSTL_CODE = JdbcWritableBridge.readString(17, __dbResults);
    this.SCAC = JdbcWritableBridge.readString(18, __dbResults);
    this.CNTRL_PSTNG_BLOK = JdbcWritableBridge.readString(19, __dbResults);
    this.CNTRL_PUR_BLOK = JdbcWritableBridge.readString(20, __dbResults);
    this.PYMT_BLOK = JdbcWritableBridge.readString(21, __dbResults);
    this.CNTRL_DEL_BLOK = JdbcWritableBridge.readString(22, __dbResults);
    this.PHN_NBR = JdbcWritableBridge.readString(23, __dbResults);
    this.FAX_NBR = JdbcWritableBridge.readString(24, __dbResults);
    this.TX_CODE1 = JdbcWritableBridge.readString(25, __dbResults);
    this.TX_CODE2 = JdbcWritableBridge.readString(26, __dbResults);
    this.TX_JURIS_CODE = JdbcWritableBridge.readString(27, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.VNDR_NBR = JdbcWritableBridge.readString(1, __dbResults);
    this.VNDR_NM = JdbcWritableBridge.readString(2, __dbResults);
    this.VNDR_NM2 = JdbcWritableBridge.readString(3, __dbResults);
    this.VNDR_NM3 = JdbcWritableBridge.readString(4, __dbResults);
    this.VNDR_NM4 = JdbcWritableBridge.readString(5, __dbResults);
    this.GRP_KEY = JdbcWritableBridge.readString(6, __dbResults);
    this.ACCT_GRP = JdbcWritableBridge.readString(7, __dbResults);
    this.ACCT_GRP_DESC = JdbcWritableBridge.readString(8, __dbResults);
    this.DEL_FLG = JdbcWritableBridge.readString(9, __dbResults);
    this.STR = JdbcWritableBridge.readString(10, __dbResults);
    this.CITY = JdbcWritableBridge.readString(11, __dbResults);
    this.DISTR = JdbcWritableBridge.readString(12, __dbResults);
    this.RGN = JdbcWritableBridge.readString(13, __dbResults);
    this.PSTL_CODE = JdbcWritableBridge.readString(14, __dbResults);
    this.CTRY = JdbcWritableBridge.readString(15, __dbResults);
    this.PO_BOX = JdbcWritableBridge.readString(16, __dbResults);
    this.PO_BOX_PSTL_CODE = JdbcWritableBridge.readString(17, __dbResults);
    this.SCAC = JdbcWritableBridge.readString(18, __dbResults);
    this.CNTRL_PSTNG_BLOK = JdbcWritableBridge.readString(19, __dbResults);
    this.CNTRL_PUR_BLOK = JdbcWritableBridge.readString(20, __dbResults);
    this.PYMT_BLOK = JdbcWritableBridge.readString(21, __dbResults);
    this.CNTRL_DEL_BLOK = JdbcWritableBridge.readString(22, __dbResults);
    this.PHN_NBR = JdbcWritableBridge.readString(23, __dbResults);
    this.FAX_NBR = JdbcWritableBridge.readString(24, __dbResults);
    this.TX_CODE1 = JdbcWritableBridge.readString(25, __dbResults);
    this.TX_CODE2 = JdbcWritableBridge.readString(26, __dbResults);
    this.TX_JURIS_CODE = JdbcWritableBridge.readString(27, __dbResults);
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
    JdbcWritableBridge.writeString(VNDR_NBR, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(VNDR_NM, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(VNDR_NM2, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(VNDR_NM3, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(VNDR_NM4, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(GRP_KEY, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ACCT_GRP, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ACCT_GRP_DESC, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(DEL_FLG, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(STR, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CITY, 11 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(DISTR, 12 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(RGN, 13 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(PSTL_CODE, 14 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CTRY, 15 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(PO_BOX, 16 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(PO_BOX_PSTL_CODE, 17 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(SCAC, 18 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CNTRL_PSTNG_BLOK, 19 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CNTRL_PUR_BLOK, 20 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(PYMT_BLOK, 21 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CNTRL_DEL_BLOK, 22 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(PHN_NBR, 23 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(FAX_NBR, 24 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(TX_CODE1, 25 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(TX_CODE2, 26 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(TX_JURIS_CODE, 27 + __off, 12, __dbStmt);
    return 27;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(VNDR_NBR, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(VNDR_NM, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(VNDR_NM2, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(VNDR_NM3, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(VNDR_NM4, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(GRP_KEY, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ACCT_GRP, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ACCT_GRP_DESC, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(DEL_FLG, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(STR, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CITY, 11 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(DISTR, 12 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(RGN, 13 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(PSTL_CODE, 14 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CTRY, 15 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(PO_BOX, 16 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(PO_BOX_PSTL_CODE, 17 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(SCAC, 18 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CNTRL_PSTNG_BLOK, 19 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CNTRL_PUR_BLOK, 20 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(PYMT_BLOK, 21 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CNTRL_DEL_BLOK, 22 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(PHN_NBR, 23 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(FAX_NBR, 24 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(TX_CODE1, 25 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(TX_CODE2, 26 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(TX_JURIS_CODE, 27 + __off, 12, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.VNDR_NBR = null;
    } else {
    this.VNDR_NBR = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.VNDR_NM = null;
    } else {
    this.VNDR_NM = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.VNDR_NM2 = null;
    } else {
    this.VNDR_NM2 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.VNDR_NM3 = null;
    } else {
    this.VNDR_NM3 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.VNDR_NM4 = null;
    } else {
    this.VNDR_NM4 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.GRP_KEY = null;
    } else {
    this.GRP_KEY = Text.readString(__dataIn);
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
        this.DEL_FLG = null;
    } else {
    this.DEL_FLG = Text.readString(__dataIn);
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
        this.DISTR = null;
    } else {
    this.DISTR = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.RGN = null;
    } else {
    this.RGN = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.PSTL_CODE = null;
    } else {
    this.PSTL_CODE = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CTRY = null;
    } else {
    this.CTRY = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.PO_BOX = null;
    } else {
    this.PO_BOX = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.PO_BOX_PSTL_CODE = null;
    } else {
    this.PO_BOX_PSTL_CODE = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.SCAC = null;
    } else {
    this.SCAC = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CNTRL_PSTNG_BLOK = null;
    } else {
    this.CNTRL_PSTNG_BLOK = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CNTRL_PUR_BLOK = null;
    } else {
    this.CNTRL_PUR_BLOK = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.PYMT_BLOK = null;
    } else {
    this.PYMT_BLOK = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CNTRL_DEL_BLOK = null;
    } else {
    this.CNTRL_DEL_BLOK = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.PHN_NBR = null;
    } else {
    this.PHN_NBR = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.FAX_NBR = null;
    } else {
    this.FAX_NBR = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.TX_CODE1 = null;
    } else {
    this.TX_CODE1 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.TX_CODE2 = null;
    } else {
    this.TX_CODE2 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.TX_JURIS_CODE = null;
    } else {
    this.TX_JURIS_CODE = Text.readString(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.VNDR_NBR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, VNDR_NBR);
    }
    if (null == this.VNDR_NM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, VNDR_NM);
    }
    if (null == this.VNDR_NM2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, VNDR_NM2);
    }
    if (null == this.VNDR_NM3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, VNDR_NM3);
    }
    if (null == this.VNDR_NM4) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, VNDR_NM4);
    }
    if (null == this.GRP_KEY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, GRP_KEY);
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
    if (null == this.DEL_FLG) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DEL_FLG);
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
    if (null == this.DISTR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DISTR);
    }
    if (null == this.RGN) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, RGN);
    }
    if (null == this.PSTL_CODE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, PSTL_CODE);
    }
    if (null == this.CTRY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CTRY);
    }
    if (null == this.PO_BOX) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, PO_BOX);
    }
    if (null == this.PO_BOX_PSTL_CODE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, PO_BOX_PSTL_CODE);
    }
    if (null == this.SCAC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, SCAC);
    }
    if (null == this.CNTRL_PSTNG_BLOK) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CNTRL_PSTNG_BLOK);
    }
    if (null == this.CNTRL_PUR_BLOK) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CNTRL_PUR_BLOK);
    }
    if (null == this.PYMT_BLOK) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, PYMT_BLOK);
    }
    if (null == this.CNTRL_DEL_BLOK) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CNTRL_DEL_BLOK);
    }
    if (null == this.PHN_NBR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, PHN_NBR);
    }
    if (null == this.FAX_NBR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FAX_NBR);
    }
    if (null == this.TX_CODE1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, TX_CODE1);
    }
    if (null == this.TX_CODE2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, TX_CODE2);
    }
    if (null == this.TX_JURIS_CODE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, TX_JURIS_CODE);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.VNDR_NBR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, VNDR_NBR);
    }
    if (null == this.VNDR_NM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, VNDR_NM);
    }
    if (null == this.VNDR_NM2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, VNDR_NM2);
    }
    if (null == this.VNDR_NM3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, VNDR_NM3);
    }
    if (null == this.VNDR_NM4) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, VNDR_NM4);
    }
    if (null == this.GRP_KEY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, GRP_KEY);
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
    if (null == this.DEL_FLG) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DEL_FLG);
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
    if (null == this.DISTR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DISTR);
    }
    if (null == this.RGN) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, RGN);
    }
    if (null == this.PSTL_CODE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, PSTL_CODE);
    }
    if (null == this.CTRY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CTRY);
    }
    if (null == this.PO_BOX) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, PO_BOX);
    }
    if (null == this.PO_BOX_PSTL_CODE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, PO_BOX_PSTL_CODE);
    }
    if (null == this.SCAC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, SCAC);
    }
    if (null == this.CNTRL_PSTNG_BLOK) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CNTRL_PSTNG_BLOK);
    }
    if (null == this.CNTRL_PUR_BLOK) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CNTRL_PUR_BLOK);
    }
    if (null == this.PYMT_BLOK) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, PYMT_BLOK);
    }
    if (null == this.CNTRL_DEL_BLOK) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CNTRL_DEL_BLOK);
    }
    if (null == this.PHN_NBR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, PHN_NBR);
    }
    if (null == this.FAX_NBR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FAX_NBR);
    }
    if (null == this.TX_CODE1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, TX_CODE1);
    }
    if (null == this.TX_CODE2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, TX_CODE2);
    }
    if (null == this.TX_JURIS_CODE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, TX_JURIS_CODE);
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
    __sb.append(FieldFormatter.escapeAndEnclose(VNDR_NBR==null?"null":VNDR_NBR, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(VNDR_NM==null?"null":VNDR_NM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(VNDR_NM2==null?"null":VNDR_NM2, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(VNDR_NM3==null?"null":VNDR_NM3, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(VNDR_NM4==null?"null":VNDR_NM4, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(GRP_KEY==null?"null":GRP_KEY, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ACCT_GRP==null?"null":ACCT_GRP, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ACCT_GRP_DESC==null?"null":ACCT_GRP_DESC, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DEL_FLG==null?"null":DEL_FLG, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(STR==null?"null":STR, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CITY==null?"null":CITY, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DISTR==null?"null":DISTR, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(RGN==null?"null":RGN, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PSTL_CODE==null?"null":PSTL_CODE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CTRY==null?"null":CTRY, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PO_BOX==null?"null":PO_BOX, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PO_BOX_PSTL_CODE==null?"null":PO_BOX_PSTL_CODE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SCAC==null?"null":SCAC, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CNTRL_PSTNG_BLOK==null?"null":CNTRL_PSTNG_BLOK, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CNTRL_PUR_BLOK==null?"null":CNTRL_PUR_BLOK, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PYMT_BLOK==null?"null":PYMT_BLOK, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CNTRL_DEL_BLOK==null?"null":CNTRL_DEL_BLOK, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PHN_NBR==null?"null":PHN_NBR, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FAX_NBR==null?"null":FAX_NBR, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TX_CODE1==null?"null":TX_CODE1, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TX_CODE2==null?"null":TX_CODE2, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TX_JURIS_CODE==null?"null":TX_JURIS_CODE, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(VNDR_NBR==null?"null":VNDR_NBR, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(VNDR_NM==null?"null":VNDR_NM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(VNDR_NM2==null?"null":VNDR_NM2, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(VNDR_NM3==null?"null":VNDR_NM3, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(VNDR_NM4==null?"null":VNDR_NM4, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(GRP_KEY==null?"null":GRP_KEY, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ACCT_GRP==null?"null":ACCT_GRP, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ACCT_GRP_DESC==null?"null":ACCT_GRP_DESC, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DEL_FLG==null?"null":DEL_FLG, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(STR==null?"null":STR, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CITY==null?"null":CITY, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DISTR==null?"null":DISTR, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(RGN==null?"null":RGN, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PSTL_CODE==null?"null":PSTL_CODE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CTRY==null?"null":CTRY, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PO_BOX==null?"null":PO_BOX, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PO_BOX_PSTL_CODE==null?"null":PO_BOX_PSTL_CODE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SCAC==null?"null":SCAC, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CNTRL_PSTNG_BLOK==null?"null":CNTRL_PSTNG_BLOK, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CNTRL_PUR_BLOK==null?"null":CNTRL_PUR_BLOK, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PYMT_BLOK==null?"null":PYMT_BLOK, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CNTRL_DEL_BLOK==null?"null":CNTRL_DEL_BLOK, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PHN_NBR==null?"null":PHN_NBR, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FAX_NBR==null?"null":FAX_NBR, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TX_CODE1==null?"null":TX_CODE1, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TX_CODE2==null?"null":TX_CODE2, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TX_JURIS_CODE==null?"null":TX_JURIS_CODE, delimiters));
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
    if (__cur_str.equals("null")) { this.VNDR_NBR = null; } else {
      this.VNDR_NBR = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.VNDR_NM = null; } else {
      this.VNDR_NM = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.VNDR_NM2 = null; } else {
      this.VNDR_NM2 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.VNDR_NM3 = null; } else {
      this.VNDR_NM3 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.VNDR_NM4 = null; } else {
      this.VNDR_NM4 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.GRP_KEY = null; } else {
      this.GRP_KEY = __cur_str;
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
    if (__cur_str.equals("null")) { this.DEL_FLG = null; } else {
      this.DEL_FLG = __cur_str;
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
    if (__cur_str.equals("null")) { this.DISTR = null; } else {
      this.DISTR = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.RGN = null; } else {
      this.RGN = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.PSTL_CODE = null; } else {
      this.PSTL_CODE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CTRY = null; } else {
      this.CTRY = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.PO_BOX = null; } else {
      this.PO_BOX = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.PO_BOX_PSTL_CODE = null; } else {
      this.PO_BOX_PSTL_CODE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.SCAC = null; } else {
      this.SCAC = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CNTRL_PSTNG_BLOK = null; } else {
      this.CNTRL_PSTNG_BLOK = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CNTRL_PUR_BLOK = null; } else {
      this.CNTRL_PUR_BLOK = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.PYMT_BLOK = null; } else {
      this.PYMT_BLOK = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CNTRL_DEL_BLOK = null; } else {
      this.CNTRL_DEL_BLOK = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.PHN_NBR = null; } else {
      this.PHN_NBR = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.FAX_NBR = null; } else {
      this.FAX_NBR = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.TX_CODE1 = null; } else {
      this.TX_CODE1 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.TX_CODE2 = null; } else {
      this.TX_CODE2 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.TX_JURIS_CODE = null; } else {
      this.TX_JURIS_CODE = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.VNDR_NBR = null; } else {
      this.VNDR_NBR = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.VNDR_NM = null; } else {
      this.VNDR_NM = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.VNDR_NM2 = null; } else {
      this.VNDR_NM2 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.VNDR_NM3 = null; } else {
      this.VNDR_NM3 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.VNDR_NM4 = null; } else {
      this.VNDR_NM4 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.GRP_KEY = null; } else {
      this.GRP_KEY = __cur_str;
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
    if (__cur_str.equals("null")) { this.DEL_FLG = null; } else {
      this.DEL_FLG = __cur_str;
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
    if (__cur_str.equals("null")) { this.DISTR = null; } else {
      this.DISTR = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.RGN = null; } else {
      this.RGN = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.PSTL_CODE = null; } else {
      this.PSTL_CODE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CTRY = null; } else {
      this.CTRY = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.PO_BOX = null; } else {
      this.PO_BOX = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.PO_BOX_PSTL_CODE = null; } else {
      this.PO_BOX_PSTL_CODE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.SCAC = null; } else {
      this.SCAC = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CNTRL_PSTNG_BLOK = null; } else {
      this.CNTRL_PSTNG_BLOK = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CNTRL_PUR_BLOK = null; } else {
      this.CNTRL_PUR_BLOK = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.PYMT_BLOK = null; } else {
      this.PYMT_BLOK = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CNTRL_DEL_BLOK = null; } else {
      this.CNTRL_DEL_BLOK = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.PHN_NBR = null; } else {
      this.PHN_NBR = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.FAX_NBR = null; } else {
      this.FAX_NBR = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.TX_CODE1 = null; } else {
      this.TX_CODE1 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.TX_CODE2 = null; } else {
      this.TX_CODE2 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.TX_JURIS_CODE = null; } else {
      this.TX_JURIS_CODE = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    UVW_VNDR o = (UVW_VNDR) super.clone();
    return o;
  }

  public void clone0(UVW_VNDR o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("VNDR_NBR", this.VNDR_NBR);
    __sqoop$field_map.put("VNDR_NM", this.VNDR_NM);
    __sqoop$field_map.put("VNDR_NM2", this.VNDR_NM2);
    __sqoop$field_map.put("VNDR_NM3", this.VNDR_NM3);
    __sqoop$field_map.put("VNDR_NM4", this.VNDR_NM4);
    __sqoop$field_map.put("GRP_KEY", this.GRP_KEY);
    __sqoop$field_map.put("ACCT_GRP", this.ACCT_GRP);
    __sqoop$field_map.put("ACCT_GRP_DESC", this.ACCT_GRP_DESC);
    __sqoop$field_map.put("DEL_FLG", this.DEL_FLG);
    __sqoop$field_map.put("STR", this.STR);
    __sqoop$field_map.put("CITY", this.CITY);
    __sqoop$field_map.put("DISTR", this.DISTR);
    __sqoop$field_map.put("RGN", this.RGN);
    __sqoop$field_map.put("PSTL_CODE", this.PSTL_CODE);
    __sqoop$field_map.put("CTRY", this.CTRY);
    __sqoop$field_map.put("PO_BOX", this.PO_BOX);
    __sqoop$field_map.put("PO_BOX_PSTL_CODE", this.PO_BOX_PSTL_CODE);
    __sqoop$field_map.put("SCAC", this.SCAC);
    __sqoop$field_map.put("CNTRL_PSTNG_BLOK", this.CNTRL_PSTNG_BLOK);
    __sqoop$field_map.put("CNTRL_PUR_BLOK", this.CNTRL_PUR_BLOK);
    __sqoop$field_map.put("PYMT_BLOK", this.PYMT_BLOK);
    __sqoop$field_map.put("CNTRL_DEL_BLOK", this.CNTRL_DEL_BLOK);
    __sqoop$field_map.put("PHN_NBR", this.PHN_NBR);
    __sqoop$field_map.put("FAX_NBR", this.FAX_NBR);
    __sqoop$field_map.put("TX_CODE1", this.TX_CODE1);
    __sqoop$field_map.put("TX_CODE2", this.TX_CODE2);
    __sqoop$field_map.put("TX_JURIS_CODE", this.TX_JURIS_CODE);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("VNDR_NBR", this.VNDR_NBR);
    __sqoop$field_map.put("VNDR_NM", this.VNDR_NM);
    __sqoop$field_map.put("VNDR_NM2", this.VNDR_NM2);
    __sqoop$field_map.put("VNDR_NM3", this.VNDR_NM3);
    __sqoop$field_map.put("VNDR_NM4", this.VNDR_NM4);
    __sqoop$field_map.put("GRP_KEY", this.GRP_KEY);
    __sqoop$field_map.put("ACCT_GRP", this.ACCT_GRP);
    __sqoop$field_map.put("ACCT_GRP_DESC", this.ACCT_GRP_DESC);
    __sqoop$field_map.put("DEL_FLG", this.DEL_FLG);
    __sqoop$field_map.put("STR", this.STR);
    __sqoop$field_map.put("CITY", this.CITY);
    __sqoop$field_map.put("DISTR", this.DISTR);
    __sqoop$field_map.put("RGN", this.RGN);
    __sqoop$field_map.put("PSTL_CODE", this.PSTL_CODE);
    __sqoop$field_map.put("CTRY", this.CTRY);
    __sqoop$field_map.put("PO_BOX", this.PO_BOX);
    __sqoop$field_map.put("PO_BOX_PSTL_CODE", this.PO_BOX_PSTL_CODE);
    __sqoop$field_map.put("SCAC", this.SCAC);
    __sqoop$field_map.put("CNTRL_PSTNG_BLOK", this.CNTRL_PSTNG_BLOK);
    __sqoop$field_map.put("CNTRL_PUR_BLOK", this.CNTRL_PUR_BLOK);
    __sqoop$field_map.put("PYMT_BLOK", this.PYMT_BLOK);
    __sqoop$field_map.put("CNTRL_DEL_BLOK", this.CNTRL_DEL_BLOK);
    __sqoop$field_map.put("PHN_NBR", this.PHN_NBR);
    __sqoop$field_map.put("FAX_NBR", this.FAX_NBR);
    __sqoop$field_map.put("TX_CODE1", this.TX_CODE1);
    __sqoop$field_map.put("TX_CODE2", this.TX_CODE2);
    __sqoop$field_map.put("TX_JURIS_CODE", this.TX_JURIS_CODE);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
