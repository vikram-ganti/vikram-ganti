// ORM class for table 'UVW_CUST_HIER_UNRVL'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Wed Mar 17 05:59:23 UTC 2021
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

public class UVW_CUST_HIER_UNRVL extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("HIER_TM_PD", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        HIER_TM_PD = (String)value;
      }
    });
    setters.put("HIER_TYP", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        HIER_TYP = (String)value;
      }
    });
    setters.put("LVL1_CUST_NBR", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        LVL1_CUST_NBR = (String)value;
      }
    });
    setters.put("LVL2_CUST_NBR", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        LVL2_CUST_NBR = (String)value;
      }
    });
    setters.put("LVL3_CUST_NBR", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        LVL3_CUST_NBR = (String)value;
      }
    });
    setters.put("LVL4_CUST_NBR", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        LVL4_CUST_NBR = (String)value;
      }
    });
    setters.put("LVL5_CUST_NBR", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        LVL5_CUST_NBR = (String)value;
      }
    });
    setters.put("LVL6_CUST_NBR", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        LVL6_CUST_NBR = (String)value;
      }
    });
    setters.put("LVL7_CUST_NBR", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        LVL7_CUST_NBR = (String)value;
      }
    });
    setters.put("LVL8_CUST_NBR", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        LVL8_CUST_NBR = (String)value;
      }
    });
    setters.put("LVL9_CUST_NBR", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        LVL9_CUST_NBR = (String)value;
      }
    });
    setters.put("LVL10_CUST_NBR", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        LVL10_CUST_NBR = (String)value;
      }
    });
    setters.put("LVL11_CUST_NBR", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        LVL11_CUST_NBR = (String)value;
      }
    });
    setters.put("LVL12_CUST_NBR", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        LVL12_CUST_NBR = (String)value;
      }
    });
    setters.put("LVL13_CUST_NBR", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        LVL13_CUST_NBR = (String)value;
      }
    });
    setters.put("LVL14_CUST_NBR", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        LVL14_CUST_NBR = (String)value;
      }
    });
    setters.put("LVL15_CUST_NBR", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        LVL15_CUST_NBR = (String)value;
      }
    });
    setters.put("LVL16_CUST_NBR", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        LVL16_CUST_NBR = (String)value;
      }
    });
    setters.put("LVL17_CUST_NBR", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        LVL17_CUST_NBR = (String)value;
      }
    });
    setters.put("LVL18_CUST_NBR", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        LVL18_CUST_NBR = (String)value;
      }
    });
    setters.put("LVL19_CUST_NBR", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        LVL19_CUST_NBR = (String)value;
      }
    });
    setters.put("LVL20_CUST_NBR", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        LVL20_CUST_NBR = (String)value;
      }
    });
    setters.put("LVL1_CUST_NM", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        LVL1_CUST_NM = (String)value;
      }
    });
    setters.put("LVL2_CUST_NM", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        LVL2_CUST_NM = (String)value;
      }
    });
    setters.put("LVL3_CUST_NM", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        LVL3_CUST_NM = (String)value;
      }
    });
    setters.put("LVL4_CUST_NM", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        LVL4_CUST_NM = (String)value;
      }
    });
    setters.put("LVL5_CUST_NM", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        LVL5_CUST_NM = (String)value;
      }
    });
    setters.put("LVL6_CUST_NM", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        LVL6_CUST_NM = (String)value;
      }
    });
    setters.put("LVL7_CUST_NM", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        LVL7_CUST_NM = (String)value;
      }
    });
    setters.put("LVL8_CUST_NM", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        LVL8_CUST_NM = (String)value;
      }
    });
    setters.put("LVL9_CUST_NM", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        LVL9_CUST_NM = (String)value;
      }
    });
    setters.put("LVL10_CUST_NM", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        LVL10_CUST_NM = (String)value;
      }
    });
    setters.put("LVL11_CUST_NM", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        LVL11_CUST_NM = (String)value;
      }
    });
    setters.put("LVL12_CUST_NM", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        LVL12_CUST_NM = (String)value;
      }
    });
    setters.put("LVL13_CUST_NM", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        LVL13_CUST_NM = (String)value;
      }
    });
    setters.put("LVL14_CUST_NM", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        LVL14_CUST_NM = (String)value;
      }
    });
    setters.put("LVL15_CUST_NM", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        LVL15_CUST_NM = (String)value;
      }
    });
    setters.put("LVL16_CUST_NM", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        LVL16_CUST_NM = (String)value;
      }
    });
    setters.put("LVL17_CUST_NM", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        LVL17_CUST_NM = (String)value;
      }
    });
    setters.put("LVL18_CUST_NM", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        LVL18_CUST_NM = (String)value;
      }
    });
    setters.put("LVL19_CUST_NM", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        LVL19_CUST_NM = (String)value;
      }
    });
    setters.put("LVL20_CUST_NM", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        LVL20_CUST_NM = (String)value;
      }
    });
    setters.put("LST_LVL_CUST_NBR", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        LST_LVL_CUST_NBR = (String)value;
      }
    });
    setters.put("LST_LVL_NBR", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        LST_LVL_NBR = (java.math.BigDecimal)value;
      }
    });
  }
  public UVW_CUST_HIER_UNRVL() {
    init0();
  }
  private String HIER_TM_PD;
  public String get_HIER_TM_PD() {
    return HIER_TM_PD;
  }
  public void set_HIER_TM_PD(String HIER_TM_PD) {
    this.HIER_TM_PD = HIER_TM_PD;
  }
  public UVW_CUST_HIER_UNRVL with_HIER_TM_PD(String HIER_TM_PD) {
    this.HIER_TM_PD = HIER_TM_PD;
    return this;
  }
  private String HIER_TYP;
  public String get_HIER_TYP() {
    return HIER_TYP;
  }
  public void set_HIER_TYP(String HIER_TYP) {
    this.HIER_TYP = HIER_TYP;
  }
  public UVW_CUST_HIER_UNRVL with_HIER_TYP(String HIER_TYP) {
    this.HIER_TYP = HIER_TYP;
    return this;
  }
  private String LVL1_CUST_NBR;
  public String get_LVL1_CUST_NBR() {
    return LVL1_CUST_NBR;
  }
  public void set_LVL1_CUST_NBR(String LVL1_CUST_NBR) {
    this.LVL1_CUST_NBR = LVL1_CUST_NBR;
  }
  public UVW_CUST_HIER_UNRVL with_LVL1_CUST_NBR(String LVL1_CUST_NBR) {
    this.LVL1_CUST_NBR = LVL1_CUST_NBR;
    return this;
  }
  private String LVL2_CUST_NBR;
  public String get_LVL2_CUST_NBR() {
    return LVL2_CUST_NBR;
  }
  public void set_LVL2_CUST_NBR(String LVL2_CUST_NBR) {
    this.LVL2_CUST_NBR = LVL2_CUST_NBR;
  }
  public UVW_CUST_HIER_UNRVL with_LVL2_CUST_NBR(String LVL2_CUST_NBR) {
    this.LVL2_CUST_NBR = LVL2_CUST_NBR;
    return this;
  }
  private String LVL3_CUST_NBR;
  public String get_LVL3_CUST_NBR() {
    return LVL3_CUST_NBR;
  }
  public void set_LVL3_CUST_NBR(String LVL3_CUST_NBR) {
    this.LVL3_CUST_NBR = LVL3_CUST_NBR;
  }
  public UVW_CUST_HIER_UNRVL with_LVL3_CUST_NBR(String LVL3_CUST_NBR) {
    this.LVL3_CUST_NBR = LVL3_CUST_NBR;
    return this;
  }
  private String LVL4_CUST_NBR;
  public String get_LVL4_CUST_NBR() {
    return LVL4_CUST_NBR;
  }
  public void set_LVL4_CUST_NBR(String LVL4_CUST_NBR) {
    this.LVL4_CUST_NBR = LVL4_CUST_NBR;
  }
  public UVW_CUST_HIER_UNRVL with_LVL4_CUST_NBR(String LVL4_CUST_NBR) {
    this.LVL4_CUST_NBR = LVL4_CUST_NBR;
    return this;
  }
  private String LVL5_CUST_NBR;
  public String get_LVL5_CUST_NBR() {
    return LVL5_CUST_NBR;
  }
  public void set_LVL5_CUST_NBR(String LVL5_CUST_NBR) {
    this.LVL5_CUST_NBR = LVL5_CUST_NBR;
  }
  public UVW_CUST_HIER_UNRVL with_LVL5_CUST_NBR(String LVL5_CUST_NBR) {
    this.LVL5_CUST_NBR = LVL5_CUST_NBR;
    return this;
  }
  private String LVL6_CUST_NBR;
  public String get_LVL6_CUST_NBR() {
    return LVL6_CUST_NBR;
  }
  public void set_LVL6_CUST_NBR(String LVL6_CUST_NBR) {
    this.LVL6_CUST_NBR = LVL6_CUST_NBR;
  }
  public UVW_CUST_HIER_UNRVL with_LVL6_CUST_NBR(String LVL6_CUST_NBR) {
    this.LVL6_CUST_NBR = LVL6_CUST_NBR;
    return this;
  }
  private String LVL7_CUST_NBR;
  public String get_LVL7_CUST_NBR() {
    return LVL7_CUST_NBR;
  }
  public void set_LVL7_CUST_NBR(String LVL7_CUST_NBR) {
    this.LVL7_CUST_NBR = LVL7_CUST_NBR;
  }
  public UVW_CUST_HIER_UNRVL with_LVL7_CUST_NBR(String LVL7_CUST_NBR) {
    this.LVL7_CUST_NBR = LVL7_CUST_NBR;
    return this;
  }
  private String LVL8_CUST_NBR;
  public String get_LVL8_CUST_NBR() {
    return LVL8_CUST_NBR;
  }
  public void set_LVL8_CUST_NBR(String LVL8_CUST_NBR) {
    this.LVL8_CUST_NBR = LVL8_CUST_NBR;
  }
  public UVW_CUST_HIER_UNRVL with_LVL8_CUST_NBR(String LVL8_CUST_NBR) {
    this.LVL8_CUST_NBR = LVL8_CUST_NBR;
    return this;
  }
  private String LVL9_CUST_NBR;
  public String get_LVL9_CUST_NBR() {
    return LVL9_CUST_NBR;
  }
  public void set_LVL9_CUST_NBR(String LVL9_CUST_NBR) {
    this.LVL9_CUST_NBR = LVL9_CUST_NBR;
  }
  public UVW_CUST_HIER_UNRVL with_LVL9_CUST_NBR(String LVL9_CUST_NBR) {
    this.LVL9_CUST_NBR = LVL9_CUST_NBR;
    return this;
  }
  private String LVL10_CUST_NBR;
  public String get_LVL10_CUST_NBR() {
    return LVL10_CUST_NBR;
  }
  public void set_LVL10_CUST_NBR(String LVL10_CUST_NBR) {
    this.LVL10_CUST_NBR = LVL10_CUST_NBR;
  }
  public UVW_CUST_HIER_UNRVL with_LVL10_CUST_NBR(String LVL10_CUST_NBR) {
    this.LVL10_CUST_NBR = LVL10_CUST_NBR;
    return this;
  }
  private String LVL11_CUST_NBR;
  public String get_LVL11_CUST_NBR() {
    return LVL11_CUST_NBR;
  }
  public void set_LVL11_CUST_NBR(String LVL11_CUST_NBR) {
    this.LVL11_CUST_NBR = LVL11_CUST_NBR;
  }
  public UVW_CUST_HIER_UNRVL with_LVL11_CUST_NBR(String LVL11_CUST_NBR) {
    this.LVL11_CUST_NBR = LVL11_CUST_NBR;
    return this;
  }
  private String LVL12_CUST_NBR;
  public String get_LVL12_CUST_NBR() {
    return LVL12_CUST_NBR;
  }
  public void set_LVL12_CUST_NBR(String LVL12_CUST_NBR) {
    this.LVL12_CUST_NBR = LVL12_CUST_NBR;
  }
  public UVW_CUST_HIER_UNRVL with_LVL12_CUST_NBR(String LVL12_CUST_NBR) {
    this.LVL12_CUST_NBR = LVL12_CUST_NBR;
    return this;
  }
  private String LVL13_CUST_NBR;
  public String get_LVL13_CUST_NBR() {
    return LVL13_CUST_NBR;
  }
  public void set_LVL13_CUST_NBR(String LVL13_CUST_NBR) {
    this.LVL13_CUST_NBR = LVL13_CUST_NBR;
  }
  public UVW_CUST_HIER_UNRVL with_LVL13_CUST_NBR(String LVL13_CUST_NBR) {
    this.LVL13_CUST_NBR = LVL13_CUST_NBR;
    return this;
  }
  private String LVL14_CUST_NBR;
  public String get_LVL14_CUST_NBR() {
    return LVL14_CUST_NBR;
  }
  public void set_LVL14_CUST_NBR(String LVL14_CUST_NBR) {
    this.LVL14_CUST_NBR = LVL14_CUST_NBR;
  }
  public UVW_CUST_HIER_UNRVL with_LVL14_CUST_NBR(String LVL14_CUST_NBR) {
    this.LVL14_CUST_NBR = LVL14_CUST_NBR;
    return this;
  }
  private String LVL15_CUST_NBR;
  public String get_LVL15_CUST_NBR() {
    return LVL15_CUST_NBR;
  }
  public void set_LVL15_CUST_NBR(String LVL15_CUST_NBR) {
    this.LVL15_CUST_NBR = LVL15_CUST_NBR;
  }
  public UVW_CUST_HIER_UNRVL with_LVL15_CUST_NBR(String LVL15_CUST_NBR) {
    this.LVL15_CUST_NBR = LVL15_CUST_NBR;
    return this;
  }
  private String LVL16_CUST_NBR;
  public String get_LVL16_CUST_NBR() {
    return LVL16_CUST_NBR;
  }
  public void set_LVL16_CUST_NBR(String LVL16_CUST_NBR) {
    this.LVL16_CUST_NBR = LVL16_CUST_NBR;
  }
  public UVW_CUST_HIER_UNRVL with_LVL16_CUST_NBR(String LVL16_CUST_NBR) {
    this.LVL16_CUST_NBR = LVL16_CUST_NBR;
    return this;
  }
  private String LVL17_CUST_NBR;
  public String get_LVL17_CUST_NBR() {
    return LVL17_CUST_NBR;
  }
  public void set_LVL17_CUST_NBR(String LVL17_CUST_NBR) {
    this.LVL17_CUST_NBR = LVL17_CUST_NBR;
  }
  public UVW_CUST_HIER_UNRVL with_LVL17_CUST_NBR(String LVL17_CUST_NBR) {
    this.LVL17_CUST_NBR = LVL17_CUST_NBR;
    return this;
  }
  private String LVL18_CUST_NBR;
  public String get_LVL18_CUST_NBR() {
    return LVL18_CUST_NBR;
  }
  public void set_LVL18_CUST_NBR(String LVL18_CUST_NBR) {
    this.LVL18_CUST_NBR = LVL18_CUST_NBR;
  }
  public UVW_CUST_HIER_UNRVL with_LVL18_CUST_NBR(String LVL18_CUST_NBR) {
    this.LVL18_CUST_NBR = LVL18_CUST_NBR;
    return this;
  }
  private String LVL19_CUST_NBR;
  public String get_LVL19_CUST_NBR() {
    return LVL19_CUST_NBR;
  }
  public void set_LVL19_CUST_NBR(String LVL19_CUST_NBR) {
    this.LVL19_CUST_NBR = LVL19_CUST_NBR;
  }
  public UVW_CUST_HIER_UNRVL with_LVL19_CUST_NBR(String LVL19_CUST_NBR) {
    this.LVL19_CUST_NBR = LVL19_CUST_NBR;
    return this;
  }
  private String LVL20_CUST_NBR;
  public String get_LVL20_CUST_NBR() {
    return LVL20_CUST_NBR;
  }
  public void set_LVL20_CUST_NBR(String LVL20_CUST_NBR) {
    this.LVL20_CUST_NBR = LVL20_CUST_NBR;
  }
  public UVW_CUST_HIER_UNRVL with_LVL20_CUST_NBR(String LVL20_CUST_NBR) {
    this.LVL20_CUST_NBR = LVL20_CUST_NBR;
    return this;
  }
  private String LVL1_CUST_NM;
  public String get_LVL1_CUST_NM() {
    return LVL1_CUST_NM;
  }
  public void set_LVL1_CUST_NM(String LVL1_CUST_NM) {
    this.LVL1_CUST_NM = LVL1_CUST_NM;
  }
  public UVW_CUST_HIER_UNRVL with_LVL1_CUST_NM(String LVL1_CUST_NM) {
    this.LVL1_CUST_NM = LVL1_CUST_NM;
    return this;
  }
  private String LVL2_CUST_NM;
  public String get_LVL2_CUST_NM() {
    return LVL2_CUST_NM;
  }
  public void set_LVL2_CUST_NM(String LVL2_CUST_NM) {
    this.LVL2_CUST_NM = LVL2_CUST_NM;
  }
  public UVW_CUST_HIER_UNRVL with_LVL2_CUST_NM(String LVL2_CUST_NM) {
    this.LVL2_CUST_NM = LVL2_CUST_NM;
    return this;
  }
  private String LVL3_CUST_NM;
  public String get_LVL3_CUST_NM() {
    return LVL3_CUST_NM;
  }
  public void set_LVL3_CUST_NM(String LVL3_CUST_NM) {
    this.LVL3_CUST_NM = LVL3_CUST_NM;
  }
  public UVW_CUST_HIER_UNRVL with_LVL3_CUST_NM(String LVL3_CUST_NM) {
    this.LVL3_CUST_NM = LVL3_CUST_NM;
    return this;
  }
  private String LVL4_CUST_NM;
  public String get_LVL4_CUST_NM() {
    return LVL4_CUST_NM;
  }
  public void set_LVL4_CUST_NM(String LVL4_CUST_NM) {
    this.LVL4_CUST_NM = LVL4_CUST_NM;
  }
  public UVW_CUST_HIER_UNRVL with_LVL4_CUST_NM(String LVL4_CUST_NM) {
    this.LVL4_CUST_NM = LVL4_CUST_NM;
    return this;
  }
  private String LVL5_CUST_NM;
  public String get_LVL5_CUST_NM() {
    return LVL5_CUST_NM;
  }
  public void set_LVL5_CUST_NM(String LVL5_CUST_NM) {
    this.LVL5_CUST_NM = LVL5_CUST_NM;
  }
  public UVW_CUST_HIER_UNRVL with_LVL5_CUST_NM(String LVL5_CUST_NM) {
    this.LVL5_CUST_NM = LVL5_CUST_NM;
    return this;
  }
  private String LVL6_CUST_NM;
  public String get_LVL6_CUST_NM() {
    return LVL6_CUST_NM;
  }
  public void set_LVL6_CUST_NM(String LVL6_CUST_NM) {
    this.LVL6_CUST_NM = LVL6_CUST_NM;
  }
  public UVW_CUST_HIER_UNRVL with_LVL6_CUST_NM(String LVL6_CUST_NM) {
    this.LVL6_CUST_NM = LVL6_CUST_NM;
    return this;
  }
  private String LVL7_CUST_NM;
  public String get_LVL7_CUST_NM() {
    return LVL7_CUST_NM;
  }
  public void set_LVL7_CUST_NM(String LVL7_CUST_NM) {
    this.LVL7_CUST_NM = LVL7_CUST_NM;
  }
  public UVW_CUST_HIER_UNRVL with_LVL7_CUST_NM(String LVL7_CUST_NM) {
    this.LVL7_CUST_NM = LVL7_CUST_NM;
    return this;
  }
  private String LVL8_CUST_NM;
  public String get_LVL8_CUST_NM() {
    return LVL8_CUST_NM;
  }
  public void set_LVL8_CUST_NM(String LVL8_CUST_NM) {
    this.LVL8_CUST_NM = LVL8_CUST_NM;
  }
  public UVW_CUST_HIER_UNRVL with_LVL8_CUST_NM(String LVL8_CUST_NM) {
    this.LVL8_CUST_NM = LVL8_CUST_NM;
    return this;
  }
  private String LVL9_CUST_NM;
  public String get_LVL9_CUST_NM() {
    return LVL9_CUST_NM;
  }
  public void set_LVL9_CUST_NM(String LVL9_CUST_NM) {
    this.LVL9_CUST_NM = LVL9_CUST_NM;
  }
  public UVW_CUST_HIER_UNRVL with_LVL9_CUST_NM(String LVL9_CUST_NM) {
    this.LVL9_CUST_NM = LVL9_CUST_NM;
    return this;
  }
  private String LVL10_CUST_NM;
  public String get_LVL10_CUST_NM() {
    return LVL10_CUST_NM;
  }
  public void set_LVL10_CUST_NM(String LVL10_CUST_NM) {
    this.LVL10_CUST_NM = LVL10_CUST_NM;
  }
  public UVW_CUST_HIER_UNRVL with_LVL10_CUST_NM(String LVL10_CUST_NM) {
    this.LVL10_CUST_NM = LVL10_CUST_NM;
    return this;
  }
  private String LVL11_CUST_NM;
  public String get_LVL11_CUST_NM() {
    return LVL11_CUST_NM;
  }
  public void set_LVL11_CUST_NM(String LVL11_CUST_NM) {
    this.LVL11_CUST_NM = LVL11_CUST_NM;
  }
  public UVW_CUST_HIER_UNRVL with_LVL11_CUST_NM(String LVL11_CUST_NM) {
    this.LVL11_CUST_NM = LVL11_CUST_NM;
    return this;
  }
  private String LVL12_CUST_NM;
  public String get_LVL12_CUST_NM() {
    return LVL12_CUST_NM;
  }
  public void set_LVL12_CUST_NM(String LVL12_CUST_NM) {
    this.LVL12_CUST_NM = LVL12_CUST_NM;
  }
  public UVW_CUST_HIER_UNRVL with_LVL12_CUST_NM(String LVL12_CUST_NM) {
    this.LVL12_CUST_NM = LVL12_CUST_NM;
    return this;
  }
  private String LVL13_CUST_NM;
  public String get_LVL13_CUST_NM() {
    return LVL13_CUST_NM;
  }
  public void set_LVL13_CUST_NM(String LVL13_CUST_NM) {
    this.LVL13_CUST_NM = LVL13_CUST_NM;
  }
  public UVW_CUST_HIER_UNRVL with_LVL13_CUST_NM(String LVL13_CUST_NM) {
    this.LVL13_CUST_NM = LVL13_CUST_NM;
    return this;
  }
  private String LVL14_CUST_NM;
  public String get_LVL14_CUST_NM() {
    return LVL14_CUST_NM;
  }
  public void set_LVL14_CUST_NM(String LVL14_CUST_NM) {
    this.LVL14_CUST_NM = LVL14_CUST_NM;
  }
  public UVW_CUST_HIER_UNRVL with_LVL14_CUST_NM(String LVL14_CUST_NM) {
    this.LVL14_CUST_NM = LVL14_CUST_NM;
    return this;
  }
  private String LVL15_CUST_NM;
  public String get_LVL15_CUST_NM() {
    return LVL15_CUST_NM;
  }
  public void set_LVL15_CUST_NM(String LVL15_CUST_NM) {
    this.LVL15_CUST_NM = LVL15_CUST_NM;
  }
  public UVW_CUST_HIER_UNRVL with_LVL15_CUST_NM(String LVL15_CUST_NM) {
    this.LVL15_CUST_NM = LVL15_CUST_NM;
    return this;
  }
  private String LVL16_CUST_NM;
  public String get_LVL16_CUST_NM() {
    return LVL16_CUST_NM;
  }
  public void set_LVL16_CUST_NM(String LVL16_CUST_NM) {
    this.LVL16_CUST_NM = LVL16_CUST_NM;
  }
  public UVW_CUST_HIER_UNRVL with_LVL16_CUST_NM(String LVL16_CUST_NM) {
    this.LVL16_CUST_NM = LVL16_CUST_NM;
    return this;
  }
  private String LVL17_CUST_NM;
  public String get_LVL17_CUST_NM() {
    return LVL17_CUST_NM;
  }
  public void set_LVL17_CUST_NM(String LVL17_CUST_NM) {
    this.LVL17_CUST_NM = LVL17_CUST_NM;
  }
  public UVW_CUST_HIER_UNRVL with_LVL17_CUST_NM(String LVL17_CUST_NM) {
    this.LVL17_CUST_NM = LVL17_CUST_NM;
    return this;
  }
  private String LVL18_CUST_NM;
  public String get_LVL18_CUST_NM() {
    return LVL18_CUST_NM;
  }
  public void set_LVL18_CUST_NM(String LVL18_CUST_NM) {
    this.LVL18_CUST_NM = LVL18_CUST_NM;
  }
  public UVW_CUST_HIER_UNRVL with_LVL18_CUST_NM(String LVL18_CUST_NM) {
    this.LVL18_CUST_NM = LVL18_CUST_NM;
    return this;
  }
  private String LVL19_CUST_NM;
  public String get_LVL19_CUST_NM() {
    return LVL19_CUST_NM;
  }
  public void set_LVL19_CUST_NM(String LVL19_CUST_NM) {
    this.LVL19_CUST_NM = LVL19_CUST_NM;
  }
  public UVW_CUST_HIER_UNRVL with_LVL19_CUST_NM(String LVL19_CUST_NM) {
    this.LVL19_CUST_NM = LVL19_CUST_NM;
    return this;
  }
  private String LVL20_CUST_NM;
  public String get_LVL20_CUST_NM() {
    return LVL20_CUST_NM;
  }
  public void set_LVL20_CUST_NM(String LVL20_CUST_NM) {
    this.LVL20_CUST_NM = LVL20_CUST_NM;
  }
  public UVW_CUST_HIER_UNRVL with_LVL20_CUST_NM(String LVL20_CUST_NM) {
    this.LVL20_CUST_NM = LVL20_CUST_NM;
    return this;
  }
  private String LST_LVL_CUST_NBR;
  public String get_LST_LVL_CUST_NBR() {
    return LST_LVL_CUST_NBR;
  }
  public void set_LST_LVL_CUST_NBR(String LST_LVL_CUST_NBR) {
    this.LST_LVL_CUST_NBR = LST_LVL_CUST_NBR;
  }
  public UVW_CUST_HIER_UNRVL with_LST_LVL_CUST_NBR(String LST_LVL_CUST_NBR) {
    this.LST_LVL_CUST_NBR = LST_LVL_CUST_NBR;
    return this;
  }
  private java.math.BigDecimal LST_LVL_NBR;
  public java.math.BigDecimal get_LST_LVL_NBR() {
    return LST_LVL_NBR;
  }
  public void set_LST_LVL_NBR(java.math.BigDecimal LST_LVL_NBR) {
    this.LST_LVL_NBR = LST_LVL_NBR;
  }
  public UVW_CUST_HIER_UNRVL with_LST_LVL_NBR(java.math.BigDecimal LST_LVL_NBR) {
    this.LST_LVL_NBR = LST_LVL_NBR;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof UVW_CUST_HIER_UNRVL)) {
      return false;
    }
    UVW_CUST_HIER_UNRVL that = (UVW_CUST_HIER_UNRVL) o;
    boolean equal = true;
    equal = equal && (this.HIER_TM_PD == null ? that.HIER_TM_PD == null : this.HIER_TM_PD.equals(that.HIER_TM_PD));
    equal = equal && (this.HIER_TYP == null ? that.HIER_TYP == null : this.HIER_TYP.equals(that.HIER_TYP));
    equal = equal && (this.LVL1_CUST_NBR == null ? that.LVL1_CUST_NBR == null : this.LVL1_CUST_NBR.equals(that.LVL1_CUST_NBR));
    equal = equal && (this.LVL2_CUST_NBR == null ? that.LVL2_CUST_NBR == null : this.LVL2_CUST_NBR.equals(that.LVL2_CUST_NBR));
    equal = equal && (this.LVL3_CUST_NBR == null ? that.LVL3_CUST_NBR == null : this.LVL3_CUST_NBR.equals(that.LVL3_CUST_NBR));
    equal = equal && (this.LVL4_CUST_NBR == null ? that.LVL4_CUST_NBR == null : this.LVL4_CUST_NBR.equals(that.LVL4_CUST_NBR));
    equal = equal && (this.LVL5_CUST_NBR == null ? that.LVL5_CUST_NBR == null : this.LVL5_CUST_NBR.equals(that.LVL5_CUST_NBR));
    equal = equal && (this.LVL6_CUST_NBR == null ? that.LVL6_CUST_NBR == null : this.LVL6_CUST_NBR.equals(that.LVL6_CUST_NBR));
    equal = equal && (this.LVL7_CUST_NBR == null ? that.LVL7_CUST_NBR == null : this.LVL7_CUST_NBR.equals(that.LVL7_CUST_NBR));
    equal = equal && (this.LVL8_CUST_NBR == null ? that.LVL8_CUST_NBR == null : this.LVL8_CUST_NBR.equals(that.LVL8_CUST_NBR));
    equal = equal && (this.LVL9_CUST_NBR == null ? that.LVL9_CUST_NBR == null : this.LVL9_CUST_NBR.equals(that.LVL9_CUST_NBR));
    equal = equal && (this.LVL10_CUST_NBR == null ? that.LVL10_CUST_NBR == null : this.LVL10_CUST_NBR.equals(that.LVL10_CUST_NBR));
    equal = equal && (this.LVL11_CUST_NBR == null ? that.LVL11_CUST_NBR == null : this.LVL11_CUST_NBR.equals(that.LVL11_CUST_NBR));
    equal = equal && (this.LVL12_CUST_NBR == null ? that.LVL12_CUST_NBR == null : this.LVL12_CUST_NBR.equals(that.LVL12_CUST_NBR));
    equal = equal && (this.LVL13_CUST_NBR == null ? that.LVL13_CUST_NBR == null : this.LVL13_CUST_NBR.equals(that.LVL13_CUST_NBR));
    equal = equal && (this.LVL14_CUST_NBR == null ? that.LVL14_CUST_NBR == null : this.LVL14_CUST_NBR.equals(that.LVL14_CUST_NBR));
    equal = equal && (this.LVL15_CUST_NBR == null ? that.LVL15_CUST_NBR == null : this.LVL15_CUST_NBR.equals(that.LVL15_CUST_NBR));
    equal = equal && (this.LVL16_CUST_NBR == null ? that.LVL16_CUST_NBR == null : this.LVL16_CUST_NBR.equals(that.LVL16_CUST_NBR));
    equal = equal && (this.LVL17_CUST_NBR == null ? that.LVL17_CUST_NBR == null : this.LVL17_CUST_NBR.equals(that.LVL17_CUST_NBR));
    equal = equal && (this.LVL18_CUST_NBR == null ? that.LVL18_CUST_NBR == null : this.LVL18_CUST_NBR.equals(that.LVL18_CUST_NBR));
    equal = equal && (this.LVL19_CUST_NBR == null ? that.LVL19_CUST_NBR == null : this.LVL19_CUST_NBR.equals(that.LVL19_CUST_NBR));
    equal = equal && (this.LVL20_CUST_NBR == null ? that.LVL20_CUST_NBR == null : this.LVL20_CUST_NBR.equals(that.LVL20_CUST_NBR));
    equal = equal && (this.LVL1_CUST_NM == null ? that.LVL1_CUST_NM == null : this.LVL1_CUST_NM.equals(that.LVL1_CUST_NM));
    equal = equal && (this.LVL2_CUST_NM == null ? that.LVL2_CUST_NM == null : this.LVL2_CUST_NM.equals(that.LVL2_CUST_NM));
    equal = equal && (this.LVL3_CUST_NM == null ? that.LVL3_CUST_NM == null : this.LVL3_CUST_NM.equals(that.LVL3_CUST_NM));
    equal = equal && (this.LVL4_CUST_NM == null ? that.LVL4_CUST_NM == null : this.LVL4_CUST_NM.equals(that.LVL4_CUST_NM));
    equal = equal && (this.LVL5_CUST_NM == null ? that.LVL5_CUST_NM == null : this.LVL5_CUST_NM.equals(that.LVL5_CUST_NM));
    equal = equal && (this.LVL6_CUST_NM == null ? that.LVL6_CUST_NM == null : this.LVL6_CUST_NM.equals(that.LVL6_CUST_NM));
    equal = equal && (this.LVL7_CUST_NM == null ? that.LVL7_CUST_NM == null : this.LVL7_CUST_NM.equals(that.LVL7_CUST_NM));
    equal = equal && (this.LVL8_CUST_NM == null ? that.LVL8_CUST_NM == null : this.LVL8_CUST_NM.equals(that.LVL8_CUST_NM));
    equal = equal && (this.LVL9_CUST_NM == null ? that.LVL9_CUST_NM == null : this.LVL9_CUST_NM.equals(that.LVL9_CUST_NM));
    equal = equal && (this.LVL10_CUST_NM == null ? that.LVL10_CUST_NM == null : this.LVL10_CUST_NM.equals(that.LVL10_CUST_NM));
    equal = equal && (this.LVL11_CUST_NM == null ? that.LVL11_CUST_NM == null : this.LVL11_CUST_NM.equals(that.LVL11_CUST_NM));
    equal = equal && (this.LVL12_CUST_NM == null ? that.LVL12_CUST_NM == null : this.LVL12_CUST_NM.equals(that.LVL12_CUST_NM));
    equal = equal && (this.LVL13_CUST_NM == null ? that.LVL13_CUST_NM == null : this.LVL13_CUST_NM.equals(that.LVL13_CUST_NM));
    equal = equal && (this.LVL14_CUST_NM == null ? that.LVL14_CUST_NM == null : this.LVL14_CUST_NM.equals(that.LVL14_CUST_NM));
    equal = equal && (this.LVL15_CUST_NM == null ? that.LVL15_CUST_NM == null : this.LVL15_CUST_NM.equals(that.LVL15_CUST_NM));
    equal = equal && (this.LVL16_CUST_NM == null ? that.LVL16_CUST_NM == null : this.LVL16_CUST_NM.equals(that.LVL16_CUST_NM));
    equal = equal && (this.LVL17_CUST_NM == null ? that.LVL17_CUST_NM == null : this.LVL17_CUST_NM.equals(that.LVL17_CUST_NM));
    equal = equal && (this.LVL18_CUST_NM == null ? that.LVL18_CUST_NM == null : this.LVL18_CUST_NM.equals(that.LVL18_CUST_NM));
    equal = equal && (this.LVL19_CUST_NM == null ? that.LVL19_CUST_NM == null : this.LVL19_CUST_NM.equals(that.LVL19_CUST_NM));
    equal = equal && (this.LVL20_CUST_NM == null ? that.LVL20_CUST_NM == null : this.LVL20_CUST_NM.equals(that.LVL20_CUST_NM));
    equal = equal && (this.LST_LVL_CUST_NBR == null ? that.LST_LVL_CUST_NBR == null : this.LST_LVL_CUST_NBR.equals(that.LST_LVL_CUST_NBR));
    equal = equal && (this.LST_LVL_NBR == null ? that.LST_LVL_NBR == null : this.LST_LVL_NBR.equals(that.LST_LVL_NBR));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof UVW_CUST_HIER_UNRVL)) {
      return false;
    }
    UVW_CUST_HIER_UNRVL that = (UVW_CUST_HIER_UNRVL) o;
    boolean equal = true;
    equal = equal && (this.HIER_TM_PD == null ? that.HIER_TM_PD == null : this.HIER_TM_PD.equals(that.HIER_TM_PD));
    equal = equal && (this.HIER_TYP == null ? that.HIER_TYP == null : this.HIER_TYP.equals(that.HIER_TYP));
    equal = equal && (this.LVL1_CUST_NBR == null ? that.LVL1_CUST_NBR == null : this.LVL1_CUST_NBR.equals(that.LVL1_CUST_NBR));
    equal = equal && (this.LVL2_CUST_NBR == null ? that.LVL2_CUST_NBR == null : this.LVL2_CUST_NBR.equals(that.LVL2_CUST_NBR));
    equal = equal && (this.LVL3_CUST_NBR == null ? that.LVL3_CUST_NBR == null : this.LVL3_CUST_NBR.equals(that.LVL3_CUST_NBR));
    equal = equal && (this.LVL4_CUST_NBR == null ? that.LVL4_CUST_NBR == null : this.LVL4_CUST_NBR.equals(that.LVL4_CUST_NBR));
    equal = equal && (this.LVL5_CUST_NBR == null ? that.LVL5_CUST_NBR == null : this.LVL5_CUST_NBR.equals(that.LVL5_CUST_NBR));
    equal = equal && (this.LVL6_CUST_NBR == null ? that.LVL6_CUST_NBR == null : this.LVL6_CUST_NBR.equals(that.LVL6_CUST_NBR));
    equal = equal && (this.LVL7_CUST_NBR == null ? that.LVL7_CUST_NBR == null : this.LVL7_CUST_NBR.equals(that.LVL7_CUST_NBR));
    equal = equal && (this.LVL8_CUST_NBR == null ? that.LVL8_CUST_NBR == null : this.LVL8_CUST_NBR.equals(that.LVL8_CUST_NBR));
    equal = equal && (this.LVL9_CUST_NBR == null ? that.LVL9_CUST_NBR == null : this.LVL9_CUST_NBR.equals(that.LVL9_CUST_NBR));
    equal = equal && (this.LVL10_CUST_NBR == null ? that.LVL10_CUST_NBR == null : this.LVL10_CUST_NBR.equals(that.LVL10_CUST_NBR));
    equal = equal && (this.LVL11_CUST_NBR == null ? that.LVL11_CUST_NBR == null : this.LVL11_CUST_NBR.equals(that.LVL11_CUST_NBR));
    equal = equal && (this.LVL12_CUST_NBR == null ? that.LVL12_CUST_NBR == null : this.LVL12_CUST_NBR.equals(that.LVL12_CUST_NBR));
    equal = equal && (this.LVL13_CUST_NBR == null ? that.LVL13_CUST_NBR == null : this.LVL13_CUST_NBR.equals(that.LVL13_CUST_NBR));
    equal = equal && (this.LVL14_CUST_NBR == null ? that.LVL14_CUST_NBR == null : this.LVL14_CUST_NBR.equals(that.LVL14_CUST_NBR));
    equal = equal && (this.LVL15_CUST_NBR == null ? that.LVL15_CUST_NBR == null : this.LVL15_CUST_NBR.equals(that.LVL15_CUST_NBR));
    equal = equal && (this.LVL16_CUST_NBR == null ? that.LVL16_CUST_NBR == null : this.LVL16_CUST_NBR.equals(that.LVL16_CUST_NBR));
    equal = equal && (this.LVL17_CUST_NBR == null ? that.LVL17_CUST_NBR == null : this.LVL17_CUST_NBR.equals(that.LVL17_CUST_NBR));
    equal = equal && (this.LVL18_CUST_NBR == null ? that.LVL18_CUST_NBR == null : this.LVL18_CUST_NBR.equals(that.LVL18_CUST_NBR));
    equal = equal && (this.LVL19_CUST_NBR == null ? that.LVL19_CUST_NBR == null : this.LVL19_CUST_NBR.equals(that.LVL19_CUST_NBR));
    equal = equal && (this.LVL20_CUST_NBR == null ? that.LVL20_CUST_NBR == null : this.LVL20_CUST_NBR.equals(that.LVL20_CUST_NBR));
    equal = equal && (this.LVL1_CUST_NM == null ? that.LVL1_CUST_NM == null : this.LVL1_CUST_NM.equals(that.LVL1_CUST_NM));
    equal = equal && (this.LVL2_CUST_NM == null ? that.LVL2_CUST_NM == null : this.LVL2_CUST_NM.equals(that.LVL2_CUST_NM));
    equal = equal && (this.LVL3_CUST_NM == null ? that.LVL3_CUST_NM == null : this.LVL3_CUST_NM.equals(that.LVL3_CUST_NM));
    equal = equal && (this.LVL4_CUST_NM == null ? that.LVL4_CUST_NM == null : this.LVL4_CUST_NM.equals(that.LVL4_CUST_NM));
    equal = equal && (this.LVL5_CUST_NM == null ? that.LVL5_CUST_NM == null : this.LVL5_CUST_NM.equals(that.LVL5_CUST_NM));
    equal = equal && (this.LVL6_CUST_NM == null ? that.LVL6_CUST_NM == null : this.LVL6_CUST_NM.equals(that.LVL6_CUST_NM));
    equal = equal && (this.LVL7_CUST_NM == null ? that.LVL7_CUST_NM == null : this.LVL7_CUST_NM.equals(that.LVL7_CUST_NM));
    equal = equal && (this.LVL8_CUST_NM == null ? that.LVL8_CUST_NM == null : this.LVL8_CUST_NM.equals(that.LVL8_CUST_NM));
    equal = equal && (this.LVL9_CUST_NM == null ? that.LVL9_CUST_NM == null : this.LVL9_CUST_NM.equals(that.LVL9_CUST_NM));
    equal = equal && (this.LVL10_CUST_NM == null ? that.LVL10_CUST_NM == null : this.LVL10_CUST_NM.equals(that.LVL10_CUST_NM));
    equal = equal && (this.LVL11_CUST_NM == null ? that.LVL11_CUST_NM == null : this.LVL11_CUST_NM.equals(that.LVL11_CUST_NM));
    equal = equal && (this.LVL12_CUST_NM == null ? that.LVL12_CUST_NM == null : this.LVL12_CUST_NM.equals(that.LVL12_CUST_NM));
    equal = equal && (this.LVL13_CUST_NM == null ? that.LVL13_CUST_NM == null : this.LVL13_CUST_NM.equals(that.LVL13_CUST_NM));
    equal = equal && (this.LVL14_CUST_NM == null ? that.LVL14_CUST_NM == null : this.LVL14_CUST_NM.equals(that.LVL14_CUST_NM));
    equal = equal && (this.LVL15_CUST_NM == null ? that.LVL15_CUST_NM == null : this.LVL15_CUST_NM.equals(that.LVL15_CUST_NM));
    equal = equal && (this.LVL16_CUST_NM == null ? that.LVL16_CUST_NM == null : this.LVL16_CUST_NM.equals(that.LVL16_CUST_NM));
    equal = equal && (this.LVL17_CUST_NM == null ? that.LVL17_CUST_NM == null : this.LVL17_CUST_NM.equals(that.LVL17_CUST_NM));
    equal = equal && (this.LVL18_CUST_NM == null ? that.LVL18_CUST_NM == null : this.LVL18_CUST_NM.equals(that.LVL18_CUST_NM));
    equal = equal && (this.LVL19_CUST_NM == null ? that.LVL19_CUST_NM == null : this.LVL19_CUST_NM.equals(that.LVL19_CUST_NM));
    equal = equal && (this.LVL20_CUST_NM == null ? that.LVL20_CUST_NM == null : this.LVL20_CUST_NM.equals(that.LVL20_CUST_NM));
    equal = equal && (this.LST_LVL_CUST_NBR == null ? that.LST_LVL_CUST_NBR == null : this.LST_LVL_CUST_NBR.equals(that.LST_LVL_CUST_NBR));
    equal = equal && (this.LST_LVL_NBR == null ? that.LST_LVL_NBR == null : this.LST_LVL_NBR.equals(that.LST_LVL_NBR));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.HIER_TM_PD = JdbcWritableBridge.readString(1, __dbResults);
    this.HIER_TYP = JdbcWritableBridge.readString(2, __dbResults);
    this.LVL1_CUST_NBR = JdbcWritableBridge.readString(3, __dbResults);
    this.LVL2_CUST_NBR = JdbcWritableBridge.readString(4, __dbResults);
    this.LVL3_CUST_NBR = JdbcWritableBridge.readString(5, __dbResults);
    this.LVL4_CUST_NBR = JdbcWritableBridge.readString(6, __dbResults);
    this.LVL5_CUST_NBR = JdbcWritableBridge.readString(7, __dbResults);
    this.LVL6_CUST_NBR = JdbcWritableBridge.readString(8, __dbResults);
    this.LVL7_CUST_NBR = JdbcWritableBridge.readString(9, __dbResults);
    this.LVL8_CUST_NBR = JdbcWritableBridge.readString(10, __dbResults);
    this.LVL9_CUST_NBR = JdbcWritableBridge.readString(11, __dbResults);
    this.LVL10_CUST_NBR = JdbcWritableBridge.readString(12, __dbResults);
    this.LVL11_CUST_NBR = JdbcWritableBridge.readString(13, __dbResults);
    this.LVL12_CUST_NBR = JdbcWritableBridge.readString(14, __dbResults);
    this.LVL13_CUST_NBR = JdbcWritableBridge.readString(15, __dbResults);
    this.LVL14_CUST_NBR = JdbcWritableBridge.readString(16, __dbResults);
    this.LVL15_CUST_NBR = JdbcWritableBridge.readString(17, __dbResults);
    this.LVL16_CUST_NBR = JdbcWritableBridge.readString(18, __dbResults);
    this.LVL17_CUST_NBR = JdbcWritableBridge.readString(19, __dbResults);
    this.LVL18_CUST_NBR = JdbcWritableBridge.readString(20, __dbResults);
    this.LVL19_CUST_NBR = JdbcWritableBridge.readString(21, __dbResults);
    this.LVL20_CUST_NBR = JdbcWritableBridge.readString(22, __dbResults);
    this.LVL1_CUST_NM = JdbcWritableBridge.readString(23, __dbResults);
    this.LVL2_CUST_NM = JdbcWritableBridge.readString(24, __dbResults);
    this.LVL3_CUST_NM = JdbcWritableBridge.readString(25, __dbResults);
    this.LVL4_CUST_NM = JdbcWritableBridge.readString(26, __dbResults);
    this.LVL5_CUST_NM = JdbcWritableBridge.readString(27, __dbResults);
    this.LVL6_CUST_NM = JdbcWritableBridge.readString(28, __dbResults);
    this.LVL7_CUST_NM = JdbcWritableBridge.readString(29, __dbResults);
    this.LVL8_CUST_NM = JdbcWritableBridge.readString(30, __dbResults);
    this.LVL9_CUST_NM = JdbcWritableBridge.readString(31, __dbResults);
    this.LVL10_CUST_NM = JdbcWritableBridge.readString(32, __dbResults);
    this.LVL11_CUST_NM = JdbcWritableBridge.readString(33, __dbResults);
    this.LVL12_CUST_NM = JdbcWritableBridge.readString(34, __dbResults);
    this.LVL13_CUST_NM = JdbcWritableBridge.readString(35, __dbResults);
    this.LVL14_CUST_NM = JdbcWritableBridge.readString(36, __dbResults);
    this.LVL15_CUST_NM = JdbcWritableBridge.readString(37, __dbResults);
    this.LVL16_CUST_NM = JdbcWritableBridge.readString(38, __dbResults);
    this.LVL17_CUST_NM = JdbcWritableBridge.readString(39, __dbResults);
    this.LVL18_CUST_NM = JdbcWritableBridge.readString(40, __dbResults);
    this.LVL19_CUST_NM = JdbcWritableBridge.readString(41, __dbResults);
    this.LVL20_CUST_NM = JdbcWritableBridge.readString(42, __dbResults);
    this.LST_LVL_CUST_NBR = JdbcWritableBridge.readString(43, __dbResults);
    this.LST_LVL_NBR = JdbcWritableBridge.readBigDecimal(44, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.HIER_TM_PD = JdbcWritableBridge.readString(1, __dbResults);
    this.HIER_TYP = JdbcWritableBridge.readString(2, __dbResults);
    this.LVL1_CUST_NBR = JdbcWritableBridge.readString(3, __dbResults);
    this.LVL2_CUST_NBR = JdbcWritableBridge.readString(4, __dbResults);
    this.LVL3_CUST_NBR = JdbcWritableBridge.readString(5, __dbResults);
    this.LVL4_CUST_NBR = JdbcWritableBridge.readString(6, __dbResults);
    this.LVL5_CUST_NBR = JdbcWritableBridge.readString(7, __dbResults);
    this.LVL6_CUST_NBR = JdbcWritableBridge.readString(8, __dbResults);
    this.LVL7_CUST_NBR = JdbcWritableBridge.readString(9, __dbResults);
    this.LVL8_CUST_NBR = JdbcWritableBridge.readString(10, __dbResults);
    this.LVL9_CUST_NBR = JdbcWritableBridge.readString(11, __dbResults);
    this.LVL10_CUST_NBR = JdbcWritableBridge.readString(12, __dbResults);
    this.LVL11_CUST_NBR = JdbcWritableBridge.readString(13, __dbResults);
    this.LVL12_CUST_NBR = JdbcWritableBridge.readString(14, __dbResults);
    this.LVL13_CUST_NBR = JdbcWritableBridge.readString(15, __dbResults);
    this.LVL14_CUST_NBR = JdbcWritableBridge.readString(16, __dbResults);
    this.LVL15_CUST_NBR = JdbcWritableBridge.readString(17, __dbResults);
    this.LVL16_CUST_NBR = JdbcWritableBridge.readString(18, __dbResults);
    this.LVL17_CUST_NBR = JdbcWritableBridge.readString(19, __dbResults);
    this.LVL18_CUST_NBR = JdbcWritableBridge.readString(20, __dbResults);
    this.LVL19_CUST_NBR = JdbcWritableBridge.readString(21, __dbResults);
    this.LVL20_CUST_NBR = JdbcWritableBridge.readString(22, __dbResults);
    this.LVL1_CUST_NM = JdbcWritableBridge.readString(23, __dbResults);
    this.LVL2_CUST_NM = JdbcWritableBridge.readString(24, __dbResults);
    this.LVL3_CUST_NM = JdbcWritableBridge.readString(25, __dbResults);
    this.LVL4_CUST_NM = JdbcWritableBridge.readString(26, __dbResults);
    this.LVL5_CUST_NM = JdbcWritableBridge.readString(27, __dbResults);
    this.LVL6_CUST_NM = JdbcWritableBridge.readString(28, __dbResults);
    this.LVL7_CUST_NM = JdbcWritableBridge.readString(29, __dbResults);
    this.LVL8_CUST_NM = JdbcWritableBridge.readString(30, __dbResults);
    this.LVL9_CUST_NM = JdbcWritableBridge.readString(31, __dbResults);
    this.LVL10_CUST_NM = JdbcWritableBridge.readString(32, __dbResults);
    this.LVL11_CUST_NM = JdbcWritableBridge.readString(33, __dbResults);
    this.LVL12_CUST_NM = JdbcWritableBridge.readString(34, __dbResults);
    this.LVL13_CUST_NM = JdbcWritableBridge.readString(35, __dbResults);
    this.LVL14_CUST_NM = JdbcWritableBridge.readString(36, __dbResults);
    this.LVL15_CUST_NM = JdbcWritableBridge.readString(37, __dbResults);
    this.LVL16_CUST_NM = JdbcWritableBridge.readString(38, __dbResults);
    this.LVL17_CUST_NM = JdbcWritableBridge.readString(39, __dbResults);
    this.LVL18_CUST_NM = JdbcWritableBridge.readString(40, __dbResults);
    this.LVL19_CUST_NM = JdbcWritableBridge.readString(41, __dbResults);
    this.LVL20_CUST_NM = JdbcWritableBridge.readString(42, __dbResults);
    this.LST_LVL_CUST_NBR = JdbcWritableBridge.readString(43, __dbResults);
    this.LST_LVL_NBR = JdbcWritableBridge.readBigDecimal(44, __dbResults);
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
    JdbcWritableBridge.writeString(HIER_TM_PD, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(HIER_TYP, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(LVL1_CUST_NBR, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(LVL2_CUST_NBR, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(LVL3_CUST_NBR, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(LVL4_CUST_NBR, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(LVL5_CUST_NBR, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(LVL6_CUST_NBR, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(LVL7_CUST_NBR, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(LVL8_CUST_NBR, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(LVL9_CUST_NBR, 11 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(LVL10_CUST_NBR, 12 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(LVL11_CUST_NBR, 13 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(LVL12_CUST_NBR, 14 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(LVL13_CUST_NBR, 15 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(LVL14_CUST_NBR, 16 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(LVL15_CUST_NBR, 17 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(LVL16_CUST_NBR, 18 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(LVL17_CUST_NBR, 19 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(LVL18_CUST_NBR, 20 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(LVL19_CUST_NBR, 21 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(LVL20_CUST_NBR, 22 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(LVL1_CUST_NM, 23 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(LVL2_CUST_NM, 24 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(LVL3_CUST_NM, 25 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(LVL4_CUST_NM, 26 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(LVL5_CUST_NM, 27 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(LVL6_CUST_NM, 28 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(LVL7_CUST_NM, 29 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(LVL8_CUST_NM, 30 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(LVL9_CUST_NM, 31 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(LVL10_CUST_NM, 32 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(LVL11_CUST_NM, 33 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(LVL12_CUST_NM, 34 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(LVL13_CUST_NM, 35 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(LVL14_CUST_NM, 36 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(LVL15_CUST_NM, 37 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(LVL16_CUST_NM, 38 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(LVL17_CUST_NM, 39 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(LVL18_CUST_NM, 40 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(LVL19_CUST_NM, 41 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(LVL20_CUST_NM, 42 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(LST_LVL_CUST_NBR, 43 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(LST_LVL_NBR, 44 + __off, 3, __dbStmt);
    return 44;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(HIER_TM_PD, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(HIER_TYP, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(LVL1_CUST_NBR, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(LVL2_CUST_NBR, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(LVL3_CUST_NBR, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(LVL4_CUST_NBR, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(LVL5_CUST_NBR, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(LVL6_CUST_NBR, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(LVL7_CUST_NBR, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(LVL8_CUST_NBR, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(LVL9_CUST_NBR, 11 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(LVL10_CUST_NBR, 12 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(LVL11_CUST_NBR, 13 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(LVL12_CUST_NBR, 14 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(LVL13_CUST_NBR, 15 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(LVL14_CUST_NBR, 16 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(LVL15_CUST_NBR, 17 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(LVL16_CUST_NBR, 18 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(LVL17_CUST_NBR, 19 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(LVL18_CUST_NBR, 20 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(LVL19_CUST_NBR, 21 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(LVL20_CUST_NBR, 22 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(LVL1_CUST_NM, 23 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(LVL2_CUST_NM, 24 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(LVL3_CUST_NM, 25 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(LVL4_CUST_NM, 26 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(LVL5_CUST_NM, 27 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(LVL6_CUST_NM, 28 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(LVL7_CUST_NM, 29 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(LVL8_CUST_NM, 30 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(LVL9_CUST_NM, 31 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(LVL10_CUST_NM, 32 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(LVL11_CUST_NM, 33 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(LVL12_CUST_NM, 34 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(LVL13_CUST_NM, 35 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(LVL14_CUST_NM, 36 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(LVL15_CUST_NM, 37 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(LVL16_CUST_NM, 38 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(LVL17_CUST_NM, 39 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(LVL18_CUST_NM, 40 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(LVL19_CUST_NM, 41 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(LVL20_CUST_NM, 42 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(LST_LVL_CUST_NBR, 43 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(LST_LVL_NBR, 44 + __off, 3, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.HIER_TM_PD = null;
    } else {
    this.HIER_TM_PD = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.HIER_TYP = null;
    } else {
    this.HIER_TYP = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.LVL1_CUST_NBR = null;
    } else {
    this.LVL1_CUST_NBR = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.LVL2_CUST_NBR = null;
    } else {
    this.LVL2_CUST_NBR = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.LVL3_CUST_NBR = null;
    } else {
    this.LVL3_CUST_NBR = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.LVL4_CUST_NBR = null;
    } else {
    this.LVL4_CUST_NBR = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.LVL5_CUST_NBR = null;
    } else {
    this.LVL5_CUST_NBR = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.LVL6_CUST_NBR = null;
    } else {
    this.LVL6_CUST_NBR = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.LVL7_CUST_NBR = null;
    } else {
    this.LVL7_CUST_NBR = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.LVL8_CUST_NBR = null;
    } else {
    this.LVL8_CUST_NBR = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.LVL9_CUST_NBR = null;
    } else {
    this.LVL9_CUST_NBR = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.LVL10_CUST_NBR = null;
    } else {
    this.LVL10_CUST_NBR = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.LVL11_CUST_NBR = null;
    } else {
    this.LVL11_CUST_NBR = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.LVL12_CUST_NBR = null;
    } else {
    this.LVL12_CUST_NBR = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.LVL13_CUST_NBR = null;
    } else {
    this.LVL13_CUST_NBR = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.LVL14_CUST_NBR = null;
    } else {
    this.LVL14_CUST_NBR = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.LVL15_CUST_NBR = null;
    } else {
    this.LVL15_CUST_NBR = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.LVL16_CUST_NBR = null;
    } else {
    this.LVL16_CUST_NBR = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.LVL17_CUST_NBR = null;
    } else {
    this.LVL17_CUST_NBR = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.LVL18_CUST_NBR = null;
    } else {
    this.LVL18_CUST_NBR = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.LVL19_CUST_NBR = null;
    } else {
    this.LVL19_CUST_NBR = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.LVL20_CUST_NBR = null;
    } else {
    this.LVL20_CUST_NBR = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.LVL1_CUST_NM = null;
    } else {
    this.LVL1_CUST_NM = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.LVL2_CUST_NM = null;
    } else {
    this.LVL2_CUST_NM = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.LVL3_CUST_NM = null;
    } else {
    this.LVL3_CUST_NM = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.LVL4_CUST_NM = null;
    } else {
    this.LVL4_CUST_NM = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.LVL5_CUST_NM = null;
    } else {
    this.LVL5_CUST_NM = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.LVL6_CUST_NM = null;
    } else {
    this.LVL6_CUST_NM = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.LVL7_CUST_NM = null;
    } else {
    this.LVL7_CUST_NM = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.LVL8_CUST_NM = null;
    } else {
    this.LVL8_CUST_NM = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.LVL9_CUST_NM = null;
    } else {
    this.LVL9_CUST_NM = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.LVL10_CUST_NM = null;
    } else {
    this.LVL10_CUST_NM = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.LVL11_CUST_NM = null;
    } else {
    this.LVL11_CUST_NM = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.LVL12_CUST_NM = null;
    } else {
    this.LVL12_CUST_NM = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.LVL13_CUST_NM = null;
    } else {
    this.LVL13_CUST_NM = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.LVL14_CUST_NM = null;
    } else {
    this.LVL14_CUST_NM = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.LVL15_CUST_NM = null;
    } else {
    this.LVL15_CUST_NM = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.LVL16_CUST_NM = null;
    } else {
    this.LVL16_CUST_NM = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.LVL17_CUST_NM = null;
    } else {
    this.LVL17_CUST_NM = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.LVL18_CUST_NM = null;
    } else {
    this.LVL18_CUST_NM = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.LVL19_CUST_NM = null;
    } else {
    this.LVL19_CUST_NM = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.LVL20_CUST_NM = null;
    } else {
    this.LVL20_CUST_NM = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.LST_LVL_CUST_NBR = null;
    } else {
    this.LST_LVL_CUST_NBR = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.LST_LVL_NBR = null;
    } else {
    this.LST_LVL_NBR = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.HIER_TM_PD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, HIER_TM_PD);
    }
    if (null == this.HIER_TYP) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, HIER_TYP);
    }
    if (null == this.LVL1_CUST_NBR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LVL1_CUST_NBR);
    }
    if (null == this.LVL2_CUST_NBR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LVL2_CUST_NBR);
    }
    if (null == this.LVL3_CUST_NBR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LVL3_CUST_NBR);
    }
    if (null == this.LVL4_CUST_NBR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LVL4_CUST_NBR);
    }
    if (null == this.LVL5_CUST_NBR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LVL5_CUST_NBR);
    }
    if (null == this.LVL6_CUST_NBR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LVL6_CUST_NBR);
    }
    if (null == this.LVL7_CUST_NBR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LVL7_CUST_NBR);
    }
    if (null == this.LVL8_CUST_NBR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LVL8_CUST_NBR);
    }
    if (null == this.LVL9_CUST_NBR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LVL9_CUST_NBR);
    }
    if (null == this.LVL10_CUST_NBR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LVL10_CUST_NBR);
    }
    if (null == this.LVL11_CUST_NBR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LVL11_CUST_NBR);
    }
    if (null == this.LVL12_CUST_NBR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LVL12_CUST_NBR);
    }
    if (null == this.LVL13_CUST_NBR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LVL13_CUST_NBR);
    }
    if (null == this.LVL14_CUST_NBR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LVL14_CUST_NBR);
    }
    if (null == this.LVL15_CUST_NBR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LVL15_CUST_NBR);
    }
    if (null == this.LVL16_CUST_NBR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LVL16_CUST_NBR);
    }
    if (null == this.LVL17_CUST_NBR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LVL17_CUST_NBR);
    }
    if (null == this.LVL18_CUST_NBR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LVL18_CUST_NBR);
    }
    if (null == this.LVL19_CUST_NBR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LVL19_CUST_NBR);
    }
    if (null == this.LVL20_CUST_NBR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LVL20_CUST_NBR);
    }
    if (null == this.LVL1_CUST_NM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LVL1_CUST_NM);
    }
    if (null == this.LVL2_CUST_NM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LVL2_CUST_NM);
    }
    if (null == this.LVL3_CUST_NM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LVL3_CUST_NM);
    }
    if (null == this.LVL4_CUST_NM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LVL4_CUST_NM);
    }
    if (null == this.LVL5_CUST_NM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LVL5_CUST_NM);
    }
    if (null == this.LVL6_CUST_NM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LVL6_CUST_NM);
    }
    if (null == this.LVL7_CUST_NM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LVL7_CUST_NM);
    }
    if (null == this.LVL8_CUST_NM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LVL8_CUST_NM);
    }
    if (null == this.LVL9_CUST_NM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LVL9_CUST_NM);
    }
    if (null == this.LVL10_CUST_NM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LVL10_CUST_NM);
    }
    if (null == this.LVL11_CUST_NM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LVL11_CUST_NM);
    }
    if (null == this.LVL12_CUST_NM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LVL12_CUST_NM);
    }
    if (null == this.LVL13_CUST_NM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LVL13_CUST_NM);
    }
    if (null == this.LVL14_CUST_NM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LVL14_CUST_NM);
    }
    if (null == this.LVL15_CUST_NM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LVL15_CUST_NM);
    }
    if (null == this.LVL16_CUST_NM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LVL16_CUST_NM);
    }
    if (null == this.LVL17_CUST_NM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LVL17_CUST_NM);
    }
    if (null == this.LVL18_CUST_NM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LVL18_CUST_NM);
    }
    if (null == this.LVL19_CUST_NM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LVL19_CUST_NM);
    }
    if (null == this.LVL20_CUST_NM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LVL20_CUST_NM);
    }
    if (null == this.LST_LVL_CUST_NBR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LST_LVL_CUST_NBR);
    }
    if (null == this.LST_LVL_NBR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.LST_LVL_NBR, __dataOut);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.HIER_TM_PD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, HIER_TM_PD);
    }
    if (null == this.HIER_TYP) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, HIER_TYP);
    }
    if (null == this.LVL1_CUST_NBR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LVL1_CUST_NBR);
    }
    if (null == this.LVL2_CUST_NBR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LVL2_CUST_NBR);
    }
    if (null == this.LVL3_CUST_NBR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LVL3_CUST_NBR);
    }
    if (null == this.LVL4_CUST_NBR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LVL4_CUST_NBR);
    }
    if (null == this.LVL5_CUST_NBR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LVL5_CUST_NBR);
    }
    if (null == this.LVL6_CUST_NBR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LVL6_CUST_NBR);
    }
    if (null == this.LVL7_CUST_NBR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LVL7_CUST_NBR);
    }
    if (null == this.LVL8_CUST_NBR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LVL8_CUST_NBR);
    }
    if (null == this.LVL9_CUST_NBR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LVL9_CUST_NBR);
    }
    if (null == this.LVL10_CUST_NBR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LVL10_CUST_NBR);
    }
    if (null == this.LVL11_CUST_NBR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LVL11_CUST_NBR);
    }
    if (null == this.LVL12_CUST_NBR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LVL12_CUST_NBR);
    }
    if (null == this.LVL13_CUST_NBR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LVL13_CUST_NBR);
    }
    if (null == this.LVL14_CUST_NBR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LVL14_CUST_NBR);
    }
    if (null == this.LVL15_CUST_NBR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LVL15_CUST_NBR);
    }
    if (null == this.LVL16_CUST_NBR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LVL16_CUST_NBR);
    }
    if (null == this.LVL17_CUST_NBR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LVL17_CUST_NBR);
    }
    if (null == this.LVL18_CUST_NBR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LVL18_CUST_NBR);
    }
    if (null == this.LVL19_CUST_NBR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LVL19_CUST_NBR);
    }
    if (null == this.LVL20_CUST_NBR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LVL20_CUST_NBR);
    }
    if (null == this.LVL1_CUST_NM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LVL1_CUST_NM);
    }
    if (null == this.LVL2_CUST_NM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LVL2_CUST_NM);
    }
    if (null == this.LVL3_CUST_NM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LVL3_CUST_NM);
    }
    if (null == this.LVL4_CUST_NM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LVL4_CUST_NM);
    }
    if (null == this.LVL5_CUST_NM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LVL5_CUST_NM);
    }
    if (null == this.LVL6_CUST_NM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LVL6_CUST_NM);
    }
    if (null == this.LVL7_CUST_NM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LVL7_CUST_NM);
    }
    if (null == this.LVL8_CUST_NM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LVL8_CUST_NM);
    }
    if (null == this.LVL9_CUST_NM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LVL9_CUST_NM);
    }
    if (null == this.LVL10_CUST_NM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LVL10_CUST_NM);
    }
    if (null == this.LVL11_CUST_NM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LVL11_CUST_NM);
    }
    if (null == this.LVL12_CUST_NM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LVL12_CUST_NM);
    }
    if (null == this.LVL13_CUST_NM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LVL13_CUST_NM);
    }
    if (null == this.LVL14_CUST_NM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LVL14_CUST_NM);
    }
    if (null == this.LVL15_CUST_NM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LVL15_CUST_NM);
    }
    if (null == this.LVL16_CUST_NM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LVL16_CUST_NM);
    }
    if (null == this.LVL17_CUST_NM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LVL17_CUST_NM);
    }
    if (null == this.LVL18_CUST_NM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LVL18_CUST_NM);
    }
    if (null == this.LVL19_CUST_NM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LVL19_CUST_NM);
    }
    if (null == this.LVL20_CUST_NM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LVL20_CUST_NM);
    }
    if (null == this.LST_LVL_CUST_NBR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LST_LVL_CUST_NBR);
    }
    if (null == this.LST_LVL_NBR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.LST_LVL_NBR, __dataOut);
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
    __sb.append(FieldFormatter.escapeAndEnclose(HIER_TM_PD==null?"null":HIER_TM_PD, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(HIER_TYP==null?"null":HIER_TYP, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LVL1_CUST_NBR==null?"null":LVL1_CUST_NBR, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LVL2_CUST_NBR==null?"null":LVL2_CUST_NBR, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LVL3_CUST_NBR==null?"null":LVL3_CUST_NBR, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LVL4_CUST_NBR==null?"null":LVL4_CUST_NBR, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LVL5_CUST_NBR==null?"null":LVL5_CUST_NBR, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LVL6_CUST_NBR==null?"null":LVL6_CUST_NBR, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LVL7_CUST_NBR==null?"null":LVL7_CUST_NBR, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LVL8_CUST_NBR==null?"null":LVL8_CUST_NBR, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LVL9_CUST_NBR==null?"null":LVL9_CUST_NBR, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LVL10_CUST_NBR==null?"null":LVL10_CUST_NBR, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LVL11_CUST_NBR==null?"null":LVL11_CUST_NBR, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LVL12_CUST_NBR==null?"null":LVL12_CUST_NBR, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LVL13_CUST_NBR==null?"null":LVL13_CUST_NBR, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LVL14_CUST_NBR==null?"null":LVL14_CUST_NBR, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LVL15_CUST_NBR==null?"null":LVL15_CUST_NBR, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LVL16_CUST_NBR==null?"null":LVL16_CUST_NBR, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LVL17_CUST_NBR==null?"null":LVL17_CUST_NBR, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LVL18_CUST_NBR==null?"null":LVL18_CUST_NBR, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LVL19_CUST_NBR==null?"null":LVL19_CUST_NBR, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LVL20_CUST_NBR==null?"null":LVL20_CUST_NBR, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LVL1_CUST_NM==null?"null":LVL1_CUST_NM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LVL2_CUST_NM==null?"null":LVL2_CUST_NM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LVL3_CUST_NM==null?"null":LVL3_CUST_NM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LVL4_CUST_NM==null?"null":LVL4_CUST_NM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LVL5_CUST_NM==null?"null":LVL5_CUST_NM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LVL6_CUST_NM==null?"null":LVL6_CUST_NM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LVL7_CUST_NM==null?"null":LVL7_CUST_NM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LVL8_CUST_NM==null?"null":LVL8_CUST_NM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LVL9_CUST_NM==null?"null":LVL9_CUST_NM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LVL10_CUST_NM==null?"null":LVL10_CUST_NM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LVL11_CUST_NM==null?"null":LVL11_CUST_NM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LVL12_CUST_NM==null?"null":LVL12_CUST_NM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LVL13_CUST_NM==null?"null":LVL13_CUST_NM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LVL14_CUST_NM==null?"null":LVL14_CUST_NM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LVL15_CUST_NM==null?"null":LVL15_CUST_NM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LVL16_CUST_NM==null?"null":LVL16_CUST_NM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LVL17_CUST_NM==null?"null":LVL17_CUST_NM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LVL18_CUST_NM==null?"null":LVL18_CUST_NM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LVL19_CUST_NM==null?"null":LVL19_CUST_NM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LVL20_CUST_NM==null?"null":LVL20_CUST_NM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LST_LVL_CUST_NBR==null?"null":LST_LVL_CUST_NBR, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LST_LVL_NBR==null?"null":LST_LVL_NBR.toPlainString(), delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(HIER_TM_PD==null?"null":HIER_TM_PD, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(HIER_TYP==null?"null":HIER_TYP, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LVL1_CUST_NBR==null?"null":LVL1_CUST_NBR, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LVL2_CUST_NBR==null?"null":LVL2_CUST_NBR, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LVL3_CUST_NBR==null?"null":LVL3_CUST_NBR, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LVL4_CUST_NBR==null?"null":LVL4_CUST_NBR, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LVL5_CUST_NBR==null?"null":LVL5_CUST_NBR, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LVL6_CUST_NBR==null?"null":LVL6_CUST_NBR, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LVL7_CUST_NBR==null?"null":LVL7_CUST_NBR, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LVL8_CUST_NBR==null?"null":LVL8_CUST_NBR, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LVL9_CUST_NBR==null?"null":LVL9_CUST_NBR, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LVL10_CUST_NBR==null?"null":LVL10_CUST_NBR, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LVL11_CUST_NBR==null?"null":LVL11_CUST_NBR, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LVL12_CUST_NBR==null?"null":LVL12_CUST_NBR, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LVL13_CUST_NBR==null?"null":LVL13_CUST_NBR, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LVL14_CUST_NBR==null?"null":LVL14_CUST_NBR, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LVL15_CUST_NBR==null?"null":LVL15_CUST_NBR, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LVL16_CUST_NBR==null?"null":LVL16_CUST_NBR, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LVL17_CUST_NBR==null?"null":LVL17_CUST_NBR, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LVL18_CUST_NBR==null?"null":LVL18_CUST_NBR, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LVL19_CUST_NBR==null?"null":LVL19_CUST_NBR, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LVL20_CUST_NBR==null?"null":LVL20_CUST_NBR, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LVL1_CUST_NM==null?"null":LVL1_CUST_NM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LVL2_CUST_NM==null?"null":LVL2_CUST_NM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LVL3_CUST_NM==null?"null":LVL3_CUST_NM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LVL4_CUST_NM==null?"null":LVL4_CUST_NM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LVL5_CUST_NM==null?"null":LVL5_CUST_NM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LVL6_CUST_NM==null?"null":LVL6_CUST_NM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LVL7_CUST_NM==null?"null":LVL7_CUST_NM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LVL8_CUST_NM==null?"null":LVL8_CUST_NM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LVL9_CUST_NM==null?"null":LVL9_CUST_NM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LVL10_CUST_NM==null?"null":LVL10_CUST_NM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LVL11_CUST_NM==null?"null":LVL11_CUST_NM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LVL12_CUST_NM==null?"null":LVL12_CUST_NM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LVL13_CUST_NM==null?"null":LVL13_CUST_NM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LVL14_CUST_NM==null?"null":LVL14_CUST_NM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LVL15_CUST_NM==null?"null":LVL15_CUST_NM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LVL16_CUST_NM==null?"null":LVL16_CUST_NM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LVL17_CUST_NM==null?"null":LVL17_CUST_NM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LVL18_CUST_NM==null?"null":LVL18_CUST_NM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LVL19_CUST_NM==null?"null":LVL19_CUST_NM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LVL20_CUST_NM==null?"null":LVL20_CUST_NM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LST_LVL_CUST_NBR==null?"null":LST_LVL_CUST_NBR, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LST_LVL_NBR==null?"null":LST_LVL_NBR.toPlainString(), delimiters));
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
    if (__cur_str.equals("null")) { this.HIER_TM_PD = null; } else {
      this.HIER_TM_PD = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.HIER_TYP = null; } else {
      this.HIER_TYP = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.LVL1_CUST_NBR = null; } else {
      this.LVL1_CUST_NBR = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.LVL2_CUST_NBR = null; } else {
      this.LVL2_CUST_NBR = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.LVL3_CUST_NBR = null; } else {
      this.LVL3_CUST_NBR = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.LVL4_CUST_NBR = null; } else {
      this.LVL4_CUST_NBR = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.LVL5_CUST_NBR = null; } else {
      this.LVL5_CUST_NBR = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.LVL6_CUST_NBR = null; } else {
      this.LVL6_CUST_NBR = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.LVL7_CUST_NBR = null; } else {
      this.LVL7_CUST_NBR = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.LVL8_CUST_NBR = null; } else {
      this.LVL8_CUST_NBR = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.LVL9_CUST_NBR = null; } else {
      this.LVL9_CUST_NBR = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.LVL10_CUST_NBR = null; } else {
      this.LVL10_CUST_NBR = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.LVL11_CUST_NBR = null; } else {
      this.LVL11_CUST_NBR = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.LVL12_CUST_NBR = null; } else {
      this.LVL12_CUST_NBR = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.LVL13_CUST_NBR = null; } else {
      this.LVL13_CUST_NBR = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.LVL14_CUST_NBR = null; } else {
      this.LVL14_CUST_NBR = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.LVL15_CUST_NBR = null; } else {
      this.LVL15_CUST_NBR = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.LVL16_CUST_NBR = null; } else {
      this.LVL16_CUST_NBR = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.LVL17_CUST_NBR = null; } else {
      this.LVL17_CUST_NBR = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.LVL18_CUST_NBR = null; } else {
      this.LVL18_CUST_NBR = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.LVL19_CUST_NBR = null; } else {
      this.LVL19_CUST_NBR = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.LVL20_CUST_NBR = null; } else {
      this.LVL20_CUST_NBR = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.LVL1_CUST_NM = null; } else {
      this.LVL1_CUST_NM = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.LVL2_CUST_NM = null; } else {
      this.LVL2_CUST_NM = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.LVL3_CUST_NM = null; } else {
      this.LVL3_CUST_NM = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.LVL4_CUST_NM = null; } else {
      this.LVL4_CUST_NM = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.LVL5_CUST_NM = null; } else {
      this.LVL5_CUST_NM = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.LVL6_CUST_NM = null; } else {
      this.LVL6_CUST_NM = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.LVL7_CUST_NM = null; } else {
      this.LVL7_CUST_NM = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.LVL8_CUST_NM = null; } else {
      this.LVL8_CUST_NM = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.LVL9_CUST_NM = null; } else {
      this.LVL9_CUST_NM = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.LVL10_CUST_NM = null; } else {
      this.LVL10_CUST_NM = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.LVL11_CUST_NM = null; } else {
      this.LVL11_CUST_NM = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.LVL12_CUST_NM = null; } else {
      this.LVL12_CUST_NM = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.LVL13_CUST_NM = null; } else {
      this.LVL13_CUST_NM = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.LVL14_CUST_NM = null; } else {
      this.LVL14_CUST_NM = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.LVL15_CUST_NM = null; } else {
      this.LVL15_CUST_NM = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.LVL16_CUST_NM = null; } else {
      this.LVL16_CUST_NM = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.LVL17_CUST_NM = null; } else {
      this.LVL17_CUST_NM = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.LVL18_CUST_NM = null; } else {
      this.LVL18_CUST_NM = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.LVL19_CUST_NM = null; } else {
      this.LVL19_CUST_NM = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.LVL20_CUST_NM = null; } else {
      this.LVL20_CUST_NM = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.LST_LVL_CUST_NBR = null; } else {
      this.LST_LVL_CUST_NBR = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.LST_LVL_NBR = null; } else {
      this.LST_LVL_NBR = new java.math.BigDecimal(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.HIER_TM_PD = null; } else {
      this.HIER_TM_PD = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.HIER_TYP = null; } else {
      this.HIER_TYP = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.LVL1_CUST_NBR = null; } else {
      this.LVL1_CUST_NBR = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.LVL2_CUST_NBR = null; } else {
      this.LVL2_CUST_NBR = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.LVL3_CUST_NBR = null; } else {
      this.LVL3_CUST_NBR = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.LVL4_CUST_NBR = null; } else {
      this.LVL4_CUST_NBR = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.LVL5_CUST_NBR = null; } else {
      this.LVL5_CUST_NBR = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.LVL6_CUST_NBR = null; } else {
      this.LVL6_CUST_NBR = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.LVL7_CUST_NBR = null; } else {
      this.LVL7_CUST_NBR = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.LVL8_CUST_NBR = null; } else {
      this.LVL8_CUST_NBR = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.LVL9_CUST_NBR = null; } else {
      this.LVL9_CUST_NBR = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.LVL10_CUST_NBR = null; } else {
      this.LVL10_CUST_NBR = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.LVL11_CUST_NBR = null; } else {
      this.LVL11_CUST_NBR = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.LVL12_CUST_NBR = null; } else {
      this.LVL12_CUST_NBR = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.LVL13_CUST_NBR = null; } else {
      this.LVL13_CUST_NBR = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.LVL14_CUST_NBR = null; } else {
      this.LVL14_CUST_NBR = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.LVL15_CUST_NBR = null; } else {
      this.LVL15_CUST_NBR = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.LVL16_CUST_NBR = null; } else {
      this.LVL16_CUST_NBR = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.LVL17_CUST_NBR = null; } else {
      this.LVL17_CUST_NBR = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.LVL18_CUST_NBR = null; } else {
      this.LVL18_CUST_NBR = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.LVL19_CUST_NBR = null; } else {
      this.LVL19_CUST_NBR = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.LVL20_CUST_NBR = null; } else {
      this.LVL20_CUST_NBR = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.LVL1_CUST_NM = null; } else {
      this.LVL1_CUST_NM = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.LVL2_CUST_NM = null; } else {
      this.LVL2_CUST_NM = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.LVL3_CUST_NM = null; } else {
      this.LVL3_CUST_NM = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.LVL4_CUST_NM = null; } else {
      this.LVL4_CUST_NM = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.LVL5_CUST_NM = null; } else {
      this.LVL5_CUST_NM = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.LVL6_CUST_NM = null; } else {
      this.LVL6_CUST_NM = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.LVL7_CUST_NM = null; } else {
      this.LVL7_CUST_NM = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.LVL8_CUST_NM = null; } else {
      this.LVL8_CUST_NM = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.LVL9_CUST_NM = null; } else {
      this.LVL9_CUST_NM = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.LVL10_CUST_NM = null; } else {
      this.LVL10_CUST_NM = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.LVL11_CUST_NM = null; } else {
      this.LVL11_CUST_NM = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.LVL12_CUST_NM = null; } else {
      this.LVL12_CUST_NM = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.LVL13_CUST_NM = null; } else {
      this.LVL13_CUST_NM = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.LVL14_CUST_NM = null; } else {
      this.LVL14_CUST_NM = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.LVL15_CUST_NM = null; } else {
      this.LVL15_CUST_NM = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.LVL16_CUST_NM = null; } else {
      this.LVL16_CUST_NM = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.LVL17_CUST_NM = null; } else {
      this.LVL17_CUST_NM = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.LVL18_CUST_NM = null; } else {
      this.LVL18_CUST_NM = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.LVL19_CUST_NM = null; } else {
      this.LVL19_CUST_NM = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.LVL20_CUST_NM = null; } else {
      this.LVL20_CUST_NM = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.LST_LVL_CUST_NBR = null; } else {
      this.LST_LVL_CUST_NBR = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.LST_LVL_NBR = null; } else {
      this.LST_LVL_NBR = new java.math.BigDecimal(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    UVW_CUST_HIER_UNRVL o = (UVW_CUST_HIER_UNRVL) super.clone();
    return o;
  }

  public void clone0(UVW_CUST_HIER_UNRVL o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("HIER_TM_PD", this.HIER_TM_PD);
    __sqoop$field_map.put("HIER_TYP", this.HIER_TYP);
    __sqoop$field_map.put("LVL1_CUST_NBR", this.LVL1_CUST_NBR);
    __sqoop$field_map.put("LVL2_CUST_NBR", this.LVL2_CUST_NBR);
    __sqoop$field_map.put("LVL3_CUST_NBR", this.LVL3_CUST_NBR);
    __sqoop$field_map.put("LVL4_CUST_NBR", this.LVL4_CUST_NBR);
    __sqoop$field_map.put("LVL5_CUST_NBR", this.LVL5_CUST_NBR);
    __sqoop$field_map.put("LVL6_CUST_NBR", this.LVL6_CUST_NBR);
    __sqoop$field_map.put("LVL7_CUST_NBR", this.LVL7_CUST_NBR);
    __sqoop$field_map.put("LVL8_CUST_NBR", this.LVL8_CUST_NBR);
    __sqoop$field_map.put("LVL9_CUST_NBR", this.LVL9_CUST_NBR);
    __sqoop$field_map.put("LVL10_CUST_NBR", this.LVL10_CUST_NBR);
    __sqoop$field_map.put("LVL11_CUST_NBR", this.LVL11_CUST_NBR);
    __sqoop$field_map.put("LVL12_CUST_NBR", this.LVL12_CUST_NBR);
    __sqoop$field_map.put("LVL13_CUST_NBR", this.LVL13_CUST_NBR);
    __sqoop$field_map.put("LVL14_CUST_NBR", this.LVL14_CUST_NBR);
    __sqoop$field_map.put("LVL15_CUST_NBR", this.LVL15_CUST_NBR);
    __sqoop$field_map.put("LVL16_CUST_NBR", this.LVL16_CUST_NBR);
    __sqoop$field_map.put("LVL17_CUST_NBR", this.LVL17_CUST_NBR);
    __sqoop$field_map.put("LVL18_CUST_NBR", this.LVL18_CUST_NBR);
    __sqoop$field_map.put("LVL19_CUST_NBR", this.LVL19_CUST_NBR);
    __sqoop$field_map.put("LVL20_CUST_NBR", this.LVL20_CUST_NBR);
    __sqoop$field_map.put("LVL1_CUST_NM", this.LVL1_CUST_NM);
    __sqoop$field_map.put("LVL2_CUST_NM", this.LVL2_CUST_NM);
    __sqoop$field_map.put("LVL3_CUST_NM", this.LVL3_CUST_NM);
    __sqoop$field_map.put("LVL4_CUST_NM", this.LVL4_CUST_NM);
    __sqoop$field_map.put("LVL5_CUST_NM", this.LVL5_CUST_NM);
    __sqoop$field_map.put("LVL6_CUST_NM", this.LVL6_CUST_NM);
    __sqoop$field_map.put("LVL7_CUST_NM", this.LVL7_CUST_NM);
    __sqoop$field_map.put("LVL8_CUST_NM", this.LVL8_CUST_NM);
    __sqoop$field_map.put("LVL9_CUST_NM", this.LVL9_CUST_NM);
    __sqoop$field_map.put("LVL10_CUST_NM", this.LVL10_CUST_NM);
    __sqoop$field_map.put("LVL11_CUST_NM", this.LVL11_CUST_NM);
    __sqoop$field_map.put("LVL12_CUST_NM", this.LVL12_CUST_NM);
    __sqoop$field_map.put("LVL13_CUST_NM", this.LVL13_CUST_NM);
    __sqoop$field_map.put("LVL14_CUST_NM", this.LVL14_CUST_NM);
    __sqoop$field_map.put("LVL15_CUST_NM", this.LVL15_CUST_NM);
    __sqoop$field_map.put("LVL16_CUST_NM", this.LVL16_CUST_NM);
    __sqoop$field_map.put("LVL17_CUST_NM", this.LVL17_CUST_NM);
    __sqoop$field_map.put("LVL18_CUST_NM", this.LVL18_CUST_NM);
    __sqoop$field_map.put("LVL19_CUST_NM", this.LVL19_CUST_NM);
    __sqoop$field_map.put("LVL20_CUST_NM", this.LVL20_CUST_NM);
    __sqoop$field_map.put("LST_LVL_CUST_NBR", this.LST_LVL_CUST_NBR);
    __sqoop$field_map.put("LST_LVL_NBR", this.LST_LVL_NBR);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("HIER_TM_PD", this.HIER_TM_PD);
    __sqoop$field_map.put("HIER_TYP", this.HIER_TYP);
    __sqoop$field_map.put("LVL1_CUST_NBR", this.LVL1_CUST_NBR);
    __sqoop$field_map.put("LVL2_CUST_NBR", this.LVL2_CUST_NBR);
    __sqoop$field_map.put("LVL3_CUST_NBR", this.LVL3_CUST_NBR);
    __sqoop$field_map.put("LVL4_CUST_NBR", this.LVL4_CUST_NBR);
    __sqoop$field_map.put("LVL5_CUST_NBR", this.LVL5_CUST_NBR);
    __sqoop$field_map.put("LVL6_CUST_NBR", this.LVL6_CUST_NBR);
    __sqoop$field_map.put("LVL7_CUST_NBR", this.LVL7_CUST_NBR);
    __sqoop$field_map.put("LVL8_CUST_NBR", this.LVL8_CUST_NBR);
    __sqoop$field_map.put("LVL9_CUST_NBR", this.LVL9_CUST_NBR);
    __sqoop$field_map.put("LVL10_CUST_NBR", this.LVL10_CUST_NBR);
    __sqoop$field_map.put("LVL11_CUST_NBR", this.LVL11_CUST_NBR);
    __sqoop$field_map.put("LVL12_CUST_NBR", this.LVL12_CUST_NBR);
    __sqoop$field_map.put("LVL13_CUST_NBR", this.LVL13_CUST_NBR);
    __sqoop$field_map.put("LVL14_CUST_NBR", this.LVL14_CUST_NBR);
    __sqoop$field_map.put("LVL15_CUST_NBR", this.LVL15_CUST_NBR);
    __sqoop$field_map.put("LVL16_CUST_NBR", this.LVL16_CUST_NBR);
    __sqoop$field_map.put("LVL17_CUST_NBR", this.LVL17_CUST_NBR);
    __sqoop$field_map.put("LVL18_CUST_NBR", this.LVL18_CUST_NBR);
    __sqoop$field_map.put("LVL19_CUST_NBR", this.LVL19_CUST_NBR);
    __sqoop$field_map.put("LVL20_CUST_NBR", this.LVL20_CUST_NBR);
    __sqoop$field_map.put("LVL1_CUST_NM", this.LVL1_CUST_NM);
    __sqoop$field_map.put("LVL2_CUST_NM", this.LVL2_CUST_NM);
    __sqoop$field_map.put("LVL3_CUST_NM", this.LVL3_CUST_NM);
    __sqoop$field_map.put("LVL4_CUST_NM", this.LVL4_CUST_NM);
    __sqoop$field_map.put("LVL5_CUST_NM", this.LVL5_CUST_NM);
    __sqoop$field_map.put("LVL6_CUST_NM", this.LVL6_CUST_NM);
    __sqoop$field_map.put("LVL7_CUST_NM", this.LVL7_CUST_NM);
    __sqoop$field_map.put("LVL8_CUST_NM", this.LVL8_CUST_NM);
    __sqoop$field_map.put("LVL9_CUST_NM", this.LVL9_CUST_NM);
    __sqoop$field_map.put("LVL10_CUST_NM", this.LVL10_CUST_NM);
    __sqoop$field_map.put("LVL11_CUST_NM", this.LVL11_CUST_NM);
    __sqoop$field_map.put("LVL12_CUST_NM", this.LVL12_CUST_NM);
    __sqoop$field_map.put("LVL13_CUST_NM", this.LVL13_CUST_NM);
    __sqoop$field_map.put("LVL14_CUST_NM", this.LVL14_CUST_NM);
    __sqoop$field_map.put("LVL15_CUST_NM", this.LVL15_CUST_NM);
    __sqoop$field_map.put("LVL16_CUST_NM", this.LVL16_CUST_NM);
    __sqoop$field_map.put("LVL17_CUST_NM", this.LVL17_CUST_NM);
    __sqoop$field_map.put("LVL18_CUST_NM", this.LVL18_CUST_NM);
    __sqoop$field_map.put("LVL19_CUST_NM", this.LVL19_CUST_NM);
    __sqoop$field_map.put("LVL20_CUST_NM", this.LVL20_CUST_NM);
    __sqoop$field_map.put("LST_LVL_CUST_NBR", this.LST_LVL_CUST_NBR);
    __sqoop$field_map.put("LST_LVL_NBR", this.LST_LVL_NBR);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
