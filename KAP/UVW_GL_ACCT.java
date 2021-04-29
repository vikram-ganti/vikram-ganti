// ORM class for table 'UVW_GL_ACCT'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Wed Mar 17 05:27:31 UTC 2021
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

public class UVW_GL_ACCT extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("COA", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        COA = (String)value;
      }
    });
    setters.put("GL_ACCT_NBR", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        GL_ACCT_NBR = (String)value;
      }
    });
    setters.put("GL_ACCT_DESC", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        GL_ACCT_DESC = (String)value;
      }
    });
    setters.put("CRE_DT", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        CRE_DT = (String)value;
      }
    });
    setters.put("BAL_SHT_ACCT_FLG", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        BAL_SHT_ACCT_FLG = (String)value;
      }
    });
    setters.put("PNL_ACCT_FLG", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        PNL_ACCT_FLG = (String)value;
      }
    });
    setters.put("GL_ACCT_GRP", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        GL_ACCT_GRP = (String)value;
      }
    });
    setters.put("GL_ACCT_GRP_DESC", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        GL_ACCT_GRP_DESC = (String)value;
      }
    });
    setters.put("DEL_FLG", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        DEL_FLG = (String)value;
      }
    });
    setters.put("CRE_BLOK_FLG", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        CRE_BLOK_FLG = (String)value;
      }
    });
    setters.put("POSTNG_BLOK_FLG", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        POSTNG_BLOK_FLG = (String)value;
      }
    });
    setters.put("PLNNG_BLOK_FLG", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        PLNNG_BLOK_FLG = (String)value;
      }
    });
  }
  public UVW_GL_ACCT() {
    init0();
  }
  private String COA;
  public String get_COA() {
    return COA;
  }
  public void set_COA(String COA) {
    this.COA = COA;
  }
  public UVW_GL_ACCT with_COA(String COA) {
    this.COA = COA;
    return this;
  }
  private String GL_ACCT_NBR;
  public String get_GL_ACCT_NBR() {
    return GL_ACCT_NBR;
  }
  public void set_GL_ACCT_NBR(String GL_ACCT_NBR) {
    this.GL_ACCT_NBR = GL_ACCT_NBR;
  }
  public UVW_GL_ACCT with_GL_ACCT_NBR(String GL_ACCT_NBR) {
    this.GL_ACCT_NBR = GL_ACCT_NBR;
    return this;
  }
  private String GL_ACCT_DESC;
  public String get_GL_ACCT_DESC() {
    return GL_ACCT_DESC;
  }
  public void set_GL_ACCT_DESC(String GL_ACCT_DESC) {
    this.GL_ACCT_DESC = GL_ACCT_DESC;
  }
  public UVW_GL_ACCT with_GL_ACCT_DESC(String GL_ACCT_DESC) {
    this.GL_ACCT_DESC = GL_ACCT_DESC;
    return this;
  }
  private String CRE_DT;
  public String get_CRE_DT() {
    return CRE_DT;
  }
  public void set_CRE_DT(String CRE_DT) {
    this.CRE_DT = CRE_DT;
  }
  public UVW_GL_ACCT with_CRE_DT(String CRE_DT) {
    this.CRE_DT = CRE_DT;
    return this;
  }
  private String BAL_SHT_ACCT_FLG;
  public String get_BAL_SHT_ACCT_FLG() {
    return BAL_SHT_ACCT_FLG;
  }
  public void set_BAL_SHT_ACCT_FLG(String BAL_SHT_ACCT_FLG) {
    this.BAL_SHT_ACCT_FLG = BAL_SHT_ACCT_FLG;
  }
  public UVW_GL_ACCT with_BAL_SHT_ACCT_FLG(String BAL_SHT_ACCT_FLG) {
    this.BAL_SHT_ACCT_FLG = BAL_SHT_ACCT_FLG;
    return this;
  }
  private String PNL_ACCT_FLG;
  public String get_PNL_ACCT_FLG() {
    return PNL_ACCT_FLG;
  }
  public void set_PNL_ACCT_FLG(String PNL_ACCT_FLG) {
    this.PNL_ACCT_FLG = PNL_ACCT_FLG;
  }
  public UVW_GL_ACCT with_PNL_ACCT_FLG(String PNL_ACCT_FLG) {
    this.PNL_ACCT_FLG = PNL_ACCT_FLG;
    return this;
  }
  private String GL_ACCT_GRP;
  public String get_GL_ACCT_GRP() {
    return GL_ACCT_GRP;
  }
  public void set_GL_ACCT_GRP(String GL_ACCT_GRP) {
    this.GL_ACCT_GRP = GL_ACCT_GRP;
  }
  public UVW_GL_ACCT with_GL_ACCT_GRP(String GL_ACCT_GRP) {
    this.GL_ACCT_GRP = GL_ACCT_GRP;
    return this;
  }
  private String GL_ACCT_GRP_DESC;
  public String get_GL_ACCT_GRP_DESC() {
    return GL_ACCT_GRP_DESC;
  }
  public void set_GL_ACCT_GRP_DESC(String GL_ACCT_GRP_DESC) {
    this.GL_ACCT_GRP_DESC = GL_ACCT_GRP_DESC;
  }
  public UVW_GL_ACCT with_GL_ACCT_GRP_DESC(String GL_ACCT_GRP_DESC) {
    this.GL_ACCT_GRP_DESC = GL_ACCT_GRP_DESC;
    return this;
  }
  private String DEL_FLG;
  public String get_DEL_FLG() {
    return DEL_FLG;
  }
  public void set_DEL_FLG(String DEL_FLG) {
    this.DEL_FLG = DEL_FLG;
  }
  public UVW_GL_ACCT with_DEL_FLG(String DEL_FLG) {
    this.DEL_FLG = DEL_FLG;
    return this;
  }
  private String CRE_BLOK_FLG;
  public String get_CRE_BLOK_FLG() {
    return CRE_BLOK_FLG;
  }
  public void set_CRE_BLOK_FLG(String CRE_BLOK_FLG) {
    this.CRE_BLOK_FLG = CRE_BLOK_FLG;
  }
  public UVW_GL_ACCT with_CRE_BLOK_FLG(String CRE_BLOK_FLG) {
    this.CRE_BLOK_FLG = CRE_BLOK_FLG;
    return this;
  }
  private String POSTNG_BLOK_FLG;
  public String get_POSTNG_BLOK_FLG() {
    return POSTNG_BLOK_FLG;
  }
  public void set_POSTNG_BLOK_FLG(String POSTNG_BLOK_FLG) {
    this.POSTNG_BLOK_FLG = POSTNG_BLOK_FLG;
  }
  public UVW_GL_ACCT with_POSTNG_BLOK_FLG(String POSTNG_BLOK_FLG) {
    this.POSTNG_BLOK_FLG = POSTNG_BLOK_FLG;
    return this;
  }
  private String PLNNG_BLOK_FLG;
  public String get_PLNNG_BLOK_FLG() {
    return PLNNG_BLOK_FLG;
  }
  public void set_PLNNG_BLOK_FLG(String PLNNG_BLOK_FLG) {
    this.PLNNG_BLOK_FLG = PLNNG_BLOK_FLG;
  }
  public UVW_GL_ACCT with_PLNNG_BLOK_FLG(String PLNNG_BLOK_FLG) {
    this.PLNNG_BLOK_FLG = PLNNG_BLOK_FLG;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof UVW_GL_ACCT)) {
      return false;
    }
    UVW_GL_ACCT that = (UVW_GL_ACCT) o;
    boolean equal = true;
    equal = equal && (this.COA == null ? that.COA == null : this.COA.equals(that.COA));
    equal = equal && (this.GL_ACCT_NBR == null ? that.GL_ACCT_NBR == null : this.GL_ACCT_NBR.equals(that.GL_ACCT_NBR));
    equal = equal && (this.GL_ACCT_DESC == null ? that.GL_ACCT_DESC == null : this.GL_ACCT_DESC.equals(that.GL_ACCT_DESC));
    equal = equal && (this.CRE_DT == null ? that.CRE_DT == null : this.CRE_DT.equals(that.CRE_DT));
    equal = equal && (this.BAL_SHT_ACCT_FLG == null ? that.BAL_SHT_ACCT_FLG == null : this.BAL_SHT_ACCT_FLG.equals(that.BAL_SHT_ACCT_FLG));
    equal = equal && (this.PNL_ACCT_FLG == null ? that.PNL_ACCT_FLG == null : this.PNL_ACCT_FLG.equals(that.PNL_ACCT_FLG));
    equal = equal && (this.GL_ACCT_GRP == null ? that.GL_ACCT_GRP == null : this.GL_ACCT_GRP.equals(that.GL_ACCT_GRP));
    equal = equal && (this.GL_ACCT_GRP_DESC == null ? that.GL_ACCT_GRP_DESC == null : this.GL_ACCT_GRP_DESC.equals(that.GL_ACCT_GRP_DESC));
    equal = equal && (this.DEL_FLG == null ? that.DEL_FLG == null : this.DEL_FLG.equals(that.DEL_FLG));
    equal = equal && (this.CRE_BLOK_FLG == null ? that.CRE_BLOK_FLG == null : this.CRE_BLOK_FLG.equals(that.CRE_BLOK_FLG));
    equal = equal && (this.POSTNG_BLOK_FLG == null ? that.POSTNG_BLOK_FLG == null : this.POSTNG_BLOK_FLG.equals(that.POSTNG_BLOK_FLG));
    equal = equal && (this.PLNNG_BLOK_FLG == null ? that.PLNNG_BLOK_FLG == null : this.PLNNG_BLOK_FLG.equals(that.PLNNG_BLOK_FLG));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof UVW_GL_ACCT)) {
      return false;
    }
    UVW_GL_ACCT that = (UVW_GL_ACCT) o;
    boolean equal = true;
    equal = equal && (this.COA == null ? that.COA == null : this.COA.equals(that.COA));
    equal = equal && (this.GL_ACCT_NBR == null ? that.GL_ACCT_NBR == null : this.GL_ACCT_NBR.equals(that.GL_ACCT_NBR));
    equal = equal && (this.GL_ACCT_DESC == null ? that.GL_ACCT_DESC == null : this.GL_ACCT_DESC.equals(that.GL_ACCT_DESC));
    equal = equal && (this.CRE_DT == null ? that.CRE_DT == null : this.CRE_DT.equals(that.CRE_DT));
    equal = equal && (this.BAL_SHT_ACCT_FLG == null ? that.BAL_SHT_ACCT_FLG == null : this.BAL_SHT_ACCT_FLG.equals(that.BAL_SHT_ACCT_FLG));
    equal = equal && (this.PNL_ACCT_FLG == null ? that.PNL_ACCT_FLG == null : this.PNL_ACCT_FLG.equals(that.PNL_ACCT_FLG));
    equal = equal && (this.GL_ACCT_GRP == null ? that.GL_ACCT_GRP == null : this.GL_ACCT_GRP.equals(that.GL_ACCT_GRP));
    equal = equal && (this.GL_ACCT_GRP_DESC == null ? that.GL_ACCT_GRP_DESC == null : this.GL_ACCT_GRP_DESC.equals(that.GL_ACCT_GRP_DESC));
    equal = equal && (this.DEL_FLG == null ? that.DEL_FLG == null : this.DEL_FLG.equals(that.DEL_FLG));
    equal = equal && (this.CRE_BLOK_FLG == null ? that.CRE_BLOK_FLG == null : this.CRE_BLOK_FLG.equals(that.CRE_BLOK_FLG));
    equal = equal && (this.POSTNG_BLOK_FLG == null ? that.POSTNG_BLOK_FLG == null : this.POSTNG_BLOK_FLG.equals(that.POSTNG_BLOK_FLG));
    equal = equal && (this.PLNNG_BLOK_FLG == null ? that.PLNNG_BLOK_FLG == null : this.PLNNG_BLOK_FLG.equals(that.PLNNG_BLOK_FLG));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.COA = JdbcWritableBridge.readString(1, __dbResults);
    this.GL_ACCT_NBR = JdbcWritableBridge.readString(2, __dbResults);
    this.GL_ACCT_DESC = JdbcWritableBridge.readString(3, __dbResults);
    this.CRE_DT = JdbcWritableBridge.readString(4, __dbResults);
    this.BAL_SHT_ACCT_FLG = JdbcWritableBridge.readString(5, __dbResults);
    this.PNL_ACCT_FLG = JdbcWritableBridge.readString(6, __dbResults);
    this.GL_ACCT_GRP = JdbcWritableBridge.readString(7, __dbResults);
    this.GL_ACCT_GRP_DESC = JdbcWritableBridge.readString(8, __dbResults);
    this.DEL_FLG = JdbcWritableBridge.readString(9, __dbResults);
    this.CRE_BLOK_FLG = JdbcWritableBridge.readString(10, __dbResults);
    this.POSTNG_BLOK_FLG = JdbcWritableBridge.readString(11, __dbResults);
    this.PLNNG_BLOK_FLG = JdbcWritableBridge.readString(12, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.COA = JdbcWritableBridge.readString(1, __dbResults);
    this.GL_ACCT_NBR = JdbcWritableBridge.readString(2, __dbResults);
    this.GL_ACCT_DESC = JdbcWritableBridge.readString(3, __dbResults);
    this.CRE_DT = JdbcWritableBridge.readString(4, __dbResults);
    this.BAL_SHT_ACCT_FLG = JdbcWritableBridge.readString(5, __dbResults);
    this.PNL_ACCT_FLG = JdbcWritableBridge.readString(6, __dbResults);
    this.GL_ACCT_GRP = JdbcWritableBridge.readString(7, __dbResults);
    this.GL_ACCT_GRP_DESC = JdbcWritableBridge.readString(8, __dbResults);
    this.DEL_FLG = JdbcWritableBridge.readString(9, __dbResults);
    this.CRE_BLOK_FLG = JdbcWritableBridge.readString(10, __dbResults);
    this.POSTNG_BLOK_FLG = JdbcWritableBridge.readString(11, __dbResults);
    this.PLNNG_BLOK_FLG = JdbcWritableBridge.readString(12, __dbResults);
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
    JdbcWritableBridge.writeString(COA, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(GL_ACCT_NBR, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(GL_ACCT_DESC, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CRE_DT, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(BAL_SHT_ACCT_FLG, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(PNL_ACCT_FLG, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(GL_ACCT_GRP, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(GL_ACCT_GRP_DESC, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(DEL_FLG, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CRE_BLOK_FLG, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(POSTNG_BLOK_FLG, 11 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(PLNNG_BLOK_FLG, 12 + __off, 12, __dbStmt);
    return 12;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(COA, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(GL_ACCT_NBR, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(GL_ACCT_DESC, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CRE_DT, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(BAL_SHT_ACCT_FLG, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(PNL_ACCT_FLG, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(GL_ACCT_GRP, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(GL_ACCT_GRP_DESC, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(DEL_FLG, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CRE_BLOK_FLG, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(POSTNG_BLOK_FLG, 11 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(PLNNG_BLOK_FLG, 12 + __off, 12, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.COA = null;
    } else {
    this.COA = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.GL_ACCT_NBR = null;
    } else {
    this.GL_ACCT_NBR = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.GL_ACCT_DESC = null;
    } else {
    this.GL_ACCT_DESC = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CRE_DT = null;
    } else {
    this.CRE_DT = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.BAL_SHT_ACCT_FLG = null;
    } else {
    this.BAL_SHT_ACCT_FLG = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.PNL_ACCT_FLG = null;
    } else {
    this.PNL_ACCT_FLG = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.GL_ACCT_GRP = null;
    } else {
    this.GL_ACCT_GRP = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.GL_ACCT_GRP_DESC = null;
    } else {
    this.GL_ACCT_GRP_DESC = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DEL_FLG = null;
    } else {
    this.DEL_FLG = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CRE_BLOK_FLG = null;
    } else {
    this.CRE_BLOK_FLG = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.POSTNG_BLOK_FLG = null;
    } else {
    this.POSTNG_BLOK_FLG = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.PLNNG_BLOK_FLG = null;
    } else {
    this.PLNNG_BLOK_FLG = Text.readString(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.COA) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, COA);
    }
    if (null == this.GL_ACCT_NBR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, GL_ACCT_NBR);
    }
    if (null == this.GL_ACCT_DESC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, GL_ACCT_DESC);
    }
    if (null == this.CRE_DT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CRE_DT);
    }
    if (null == this.BAL_SHT_ACCT_FLG) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, BAL_SHT_ACCT_FLG);
    }
    if (null == this.PNL_ACCT_FLG) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, PNL_ACCT_FLG);
    }
    if (null == this.GL_ACCT_GRP) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, GL_ACCT_GRP);
    }
    if (null == this.GL_ACCT_GRP_DESC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, GL_ACCT_GRP_DESC);
    }
    if (null == this.DEL_FLG) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DEL_FLG);
    }
    if (null == this.CRE_BLOK_FLG) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CRE_BLOK_FLG);
    }
    if (null == this.POSTNG_BLOK_FLG) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, POSTNG_BLOK_FLG);
    }
    if (null == this.PLNNG_BLOK_FLG) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, PLNNG_BLOK_FLG);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.COA) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, COA);
    }
    if (null == this.GL_ACCT_NBR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, GL_ACCT_NBR);
    }
    if (null == this.GL_ACCT_DESC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, GL_ACCT_DESC);
    }
    if (null == this.CRE_DT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CRE_DT);
    }
    if (null == this.BAL_SHT_ACCT_FLG) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, BAL_SHT_ACCT_FLG);
    }
    if (null == this.PNL_ACCT_FLG) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, PNL_ACCT_FLG);
    }
    if (null == this.GL_ACCT_GRP) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, GL_ACCT_GRP);
    }
    if (null == this.GL_ACCT_GRP_DESC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, GL_ACCT_GRP_DESC);
    }
    if (null == this.DEL_FLG) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DEL_FLG);
    }
    if (null == this.CRE_BLOK_FLG) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CRE_BLOK_FLG);
    }
    if (null == this.POSTNG_BLOK_FLG) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, POSTNG_BLOK_FLG);
    }
    if (null == this.PLNNG_BLOK_FLG) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, PLNNG_BLOK_FLG);
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
    __sb.append(FieldFormatter.escapeAndEnclose(COA==null?"null":COA, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(GL_ACCT_NBR==null?"null":GL_ACCT_NBR, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(GL_ACCT_DESC==null?"null":GL_ACCT_DESC, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CRE_DT==null?"null":CRE_DT, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(BAL_SHT_ACCT_FLG==null?"null":BAL_SHT_ACCT_FLG, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PNL_ACCT_FLG==null?"null":PNL_ACCT_FLG, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(GL_ACCT_GRP==null?"null":GL_ACCT_GRP, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(GL_ACCT_GRP_DESC==null?"null":GL_ACCT_GRP_DESC, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DEL_FLG==null?"null":DEL_FLG, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CRE_BLOK_FLG==null?"null":CRE_BLOK_FLG, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(POSTNG_BLOK_FLG==null?"null":POSTNG_BLOK_FLG, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PLNNG_BLOK_FLG==null?"null":PLNNG_BLOK_FLG, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(COA==null?"null":COA, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(GL_ACCT_NBR==null?"null":GL_ACCT_NBR, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(GL_ACCT_DESC==null?"null":GL_ACCT_DESC, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CRE_DT==null?"null":CRE_DT, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(BAL_SHT_ACCT_FLG==null?"null":BAL_SHT_ACCT_FLG, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PNL_ACCT_FLG==null?"null":PNL_ACCT_FLG, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(GL_ACCT_GRP==null?"null":GL_ACCT_GRP, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(GL_ACCT_GRP_DESC==null?"null":GL_ACCT_GRP_DESC, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DEL_FLG==null?"null":DEL_FLG, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CRE_BLOK_FLG==null?"null":CRE_BLOK_FLG, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(POSTNG_BLOK_FLG==null?"null":POSTNG_BLOK_FLG, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PLNNG_BLOK_FLG==null?"null":PLNNG_BLOK_FLG, delimiters));
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
    if (__cur_str.equals("null")) { this.COA = null; } else {
      this.COA = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.GL_ACCT_NBR = null; } else {
      this.GL_ACCT_NBR = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.GL_ACCT_DESC = null; } else {
      this.GL_ACCT_DESC = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CRE_DT = null; } else {
      this.CRE_DT = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.BAL_SHT_ACCT_FLG = null; } else {
      this.BAL_SHT_ACCT_FLG = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.PNL_ACCT_FLG = null; } else {
      this.PNL_ACCT_FLG = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.GL_ACCT_GRP = null; } else {
      this.GL_ACCT_GRP = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.GL_ACCT_GRP_DESC = null; } else {
      this.GL_ACCT_GRP_DESC = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.DEL_FLG = null; } else {
      this.DEL_FLG = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CRE_BLOK_FLG = null; } else {
      this.CRE_BLOK_FLG = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.POSTNG_BLOK_FLG = null; } else {
      this.POSTNG_BLOK_FLG = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.PLNNG_BLOK_FLG = null; } else {
      this.PLNNG_BLOK_FLG = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.COA = null; } else {
      this.COA = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.GL_ACCT_NBR = null; } else {
      this.GL_ACCT_NBR = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.GL_ACCT_DESC = null; } else {
      this.GL_ACCT_DESC = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CRE_DT = null; } else {
      this.CRE_DT = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.BAL_SHT_ACCT_FLG = null; } else {
      this.BAL_SHT_ACCT_FLG = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.PNL_ACCT_FLG = null; } else {
      this.PNL_ACCT_FLG = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.GL_ACCT_GRP = null; } else {
      this.GL_ACCT_GRP = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.GL_ACCT_GRP_DESC = null; } else {
      this.GL_ACCT_GRP_DESC = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.DEL_FLG = null; } else {
      this.DEL_FLG = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CRE_BLOK_FLG = null; } else {
      this.CRE_BLOK_FLG = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.POSTNG_BLOK_FLG = null; } else {
      this.POSTNG_BLOK_FLG = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.PLNNG_BLOK_FLG = null; } else {
      this.PLNNG_BLOK_FLG = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    UVW_GL_ACCT o = (UVW_GL_ACCT) super.clone();
    return o;
  }

  public void clone0(UVW_GL_ACCT o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("COA", this.COA);
    __sqoop$field_map.put("GL_ACCT_NBR", this.GL_ACCT_NBR);
    __sqoop$field_map.put("GL_ACCT_DESC", this.GL_ACCT_DESC);
    __sqoop$field_map.put("CRE_DT", this.CRE_DT);
    __sqoop$field_map.put("BAL_SHT_ACCT_FLG", this.BAL_SHT_ACCT_FLG);
    __sqoop$field_map.put("PNL_ACCT_FLG", this.PNL_ACCT_FLG);
    __sqoop$field_map.put("GL_ACCT_GRP", this.GL_ACCT_GRP);
    __sqoop$field_map.put("GL_ACCT_GRP_DESC", this.GL_ACCT_GRP_DESC);
    __sqoop$field_map.put("DEL_FLG", this.DEL_FLG);
    __sqoop$field_map.put("CRE_BLOK_FLG", this.CRE_BLOK_FLG);
    __sqoop$field_map.put("POSTNG_BLOK_FLG", this.POSTNG_BLOK_FLG);
    __sqoop$field_map.put("PLNNG_BLOK_FLG", this.PLNNG_BLOK_FLG);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("COA", this.COA);
    __sqoop$field_map.put("GL_ACCT_NBR", this.GL_ACCT_NBR);
    __sqoop$field_map.put("GL_ACCT_DESC", this.GL_ACCT_DESC);
    __sqoop$field_map.put("CRE_DT", this.CRE_DT);
    __sqoop$field_map.put("BAL_SHT_ACCT_FLG", this.BAL_SHT_ACCT_FLG);
    __sqoop$field_map.put("PNL_ACCT_FLG", this.PNL_ACCT_FLG);
    __sqoop$field_map.put("GL_ACCT_GRP", this.GL_ACCT_GRP);
    __sqoop$field_map.put("GL_ACCT_GRP_DESC", this.GL_ACCT_GRP_DESC);
    __sqoop$field_map.put("DEL_FLG", this.DEL_FLG);
    __sqoop$field_map.put("CRE_BLOK_FLG", this.CRE_BLOK_FLG);
    __sqoop$field_map.put("POSTNG_BLOK_FLG", this.POSTNG_BLOK_FLG);
    __sqoop$field_map.put("PLNNG_BLOK_FLG", this.PLNNG_BLOK_FLG);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
