// ORM class for table 'UVW_FISC_CAL_DY'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Wed Mar 17 05:32:29 UTC 2021
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

public class UVW_FISC_CAL_DY extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("FISC_DT", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        FISC_DT = (String)value;
      }
    });
    setters.put("FISC_YR", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        FISC_YR = (java.math.BigDecimal)value;
      }
    });
    setters.put("FISC_QTR", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        FISC_QTR = (java.math.BigDecimal)value;
      }
    });
    setters.put("FISC_PD", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        FISC_PD = (java.math.BigDecimal)value;
      }
    });
    setters.put("FISC_WK", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        FISC_WK = (java.math.BigDecimal)value;
      }
    });
    setters.put("FISC_DY", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        FISC_DY = (Integer)value;
      }
    });
    setters.put("FISC_WK_OF_PD", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        FISC_WK_OF_PD = (Integer)value;
      }
    });
    setters.put("FISC_DY_OF_PD", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        FISC_DY_OF_PD = (Integer)value;
      }
    });
    setters.put("FISC_DY_OF_WK", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        FISC_DY_OF_WK = (Integer)value;
      }
    });
    setters.put("FISC_WK_STRT_DT", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        FISC_WK_STRT_DT = (String)value;
      }
    });
    setters.put("FISC_WK_END_DT", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        FISC_WK_END_DT = (String)value;
      }
    });
    setters.put("FISC_YR_QTR", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        FISC_YR_QTR = (String)value;
      }
    });
    setters.put("FISC_YR_PD", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        FISC_YR_PD = (String)value;
      }
    });
    setters.put("FISC_YR_WK", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        FISC_YR_WK = (String)value;
      }
    });
    setters.put("FISC_YR_DY", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        FISC_YR_DY = (String)value;
      }
    });
  }
  public UVW_FISC_CAL_DY() {
    init0();
  }
  private String FISC_DT;
  public String get_FISC_DT() {
    return FISC_DT;
  }
  public void set_FISC_DT(String FISC_DT) {
    this.FISC_DT = FISC_DT;
  }
  public UVW_FISC_CAL_DY with_FISC_DT(String FISC_DT) {
    this.FISC_DT = FISC_DT;
    return this;
  }
  private java.math.BigDecimal FISC_YR;
  public java.math.BigDecimal get_FISC_YR() {
    return FISC_YR;
  }
  public void set_FISC_YR(java.math.BigDecimal FISC_YR) {
    this.FISC_YR = FISC_YR;
  }
  public UVW_FISC_CAL_DY with_FISC_YR(java.math.BigDecimal FISC_YR) {
    this.FISC_YR = FISC_YR;
    return this;
  }
  private java.math.BigDecimal FISC_QTR;
  public java.math.BigDecimal get_FISC_QTR() {
    return FISC_QTR;
  }
  public void set_FISC_QTR(java.math.BigDecimal FISC_QTR) {
    this.FISC_QTR = FISC_QTR;
  }
  public UVW_FISC_CAL_DY with_FISC_QTR(java.math.BigDecimal FISC_QTR) {
    this.FISC_QTR = FISC_QTR;
    return this;
  }
  private java.math.BigDecimal FISC_PD;
  public java.math.BigDecimal get_FISC_PD() {
    return FISC_PD;
  }
  public void set_FISC_PD(java.math.BigDecimal FISC_PD) {
    this.FISC_PD = FISC_PD;
  }
  public UVW_FISC_CAL_DY with_FISC_PD(java.math.BigDecimal FISC_PD) {
    this.FISC_PD = FISC_PD;
    return this;
  }
  private java.math.BigDecimal FISC_WK;
  public java.math.BigDecimal get_FISC_WK() {
    return FISC_WK;
  }
  public void set_FISC_WK(java.math.BigDecimal FISC_WK) {
    this.FISC_WK = FISC_WK;
  }
  public UVW_FISC_CAL_DY with_FISC_WK(java.math.BigDecimal FISC_WK) {
    this.FISC_WK = FISC_WK;
    return this;
  }
  private Integer FISC_DY;
  public Integer get_FISC_DY() {
    return FISC_DY;
  }
  public void set_FISC_DY(Integer FISC_DY) {
    this.FISC_DY = FISC_DY;
  }
  public UVW_FISC_CAL_DY with_FISC_DY(Integer FISC_DY) {
    this.FISC_DY = FISC_DY;
    return this;
  }
  private Integer FISC_WK_OF_PD;
  public Integer get_FISC_WK_OF_PD() {
    return FISC_WK_OF_PD;
  }
  public void set_FISC_WK_OF_PD(Integer FISC_WK_OF_PD) {
    this.FISC_WK_OF_PD = FISC_WK_OF_PD;
  }
  public UVW_FISC_CAL_DY with_FISC_WK_OF_PD(Integer FISC_WK_OF_PD) {
    this.FISC_WK_OF_PD = FISC_WK_OF_PD;
    return this;
  }
  private Integer FISC_DY_OF_PD;
  public Integer get_FISC_DY_OF_PD() {
    return FISC_DY_OF_PD;
  }
  public void set_FISC_DY_OF_PD(Integer FISC_DY_OF_PD) {
    this.FISC_DY_OF_PD = FISC_DY_OF_PD;
  }
  public UVW_FISC_CAL_DY with_FISC_DY_OF_PD(Integer FISC_DY_OF_PD) {
    this.FISC_DY_OF_PD = FISC_DY_OF_PD;
    return this;
  }
  private Integer FISC_DY_OF_WK;
  public Integer get_FISC_DY_OF_WK() {
    return FISC_DY_OF_WK;
  }
  public void set_FISC_DY_OF_WK(Integer FISC_DY_OF_WK) {
    this.FISC_DY_OF_WK = FISC_DY_OF_WK;
  }
  public UVW_FISC_CAL_DY with_FISC_DY_OF_WK(Integer FISC_DY_OF_WK) {
    this.FISC_DY_OF_WK = FISC_DY_OF_WK;
    return this;
  }
  private String FISC_WK_STRT_DT;
  public String get_FISC_WK_STRT_DT() {
    return FISC_WK_STRT_DT;
  }
  public void set_FISC_WK_STRT_DT(String FISC_WK_STRT_DT) {
    this.FISC_WK_STRT_DT = FISC_WK_STRT_DT;
  }
  public UVW_FISC_CAL_DY with_FISC_WK_STRT_DT(String FISC_WK_STRT_DT) {
    this.FISC_WK_STRT_DT = FISC_WK_STRT_DT;
    return this;
  }
  private String FISC_WK_END_DT;
  public String get_FISC_WK_END_DT() {
    return FISC_WK_END_DT;
  }
  public void set_FISC_WK_END_DT(String FISC_WK_END_DT) {
    this.FISC_WK_END_DT = FISC_WK_END_DT;
  }
  public UVW_FISC_CAL_DY with_FISC_WK_END_DT(String FISC_WK_END_DT) {
    this.FISC_WK_END_DT = FISC_WK_END_DT;
    return this;
  }
  private String FISC_YR_QTR;
  public String get_FISC_YR_QTR() {
    return FISC_YR_QTR;
  }
  public void set_FISC_YR_QTR(String FISC_YR_QTR) {
    this.FISC_YR_QTR = FISC_YR_QTR;
  }
  public UVW_FISC_CAL_DY with_FISC_YR_QTR(String FISC_YR_QTR) {
    this.FISC_YR_QTR = FISC_YR_QTR;
    return this;
  }
  private String FISC_YR_PD;
  public String get_FISC_YR_PD() {
    return FISC_YR_PD;
  }
  public void set_FISC_YR_PD(String FISC_YR_PD) {
    this.FISC_YR_PD = FISC_YR_PD;
  }
  public UVW_FISC_CAL_DY with_FISC_YR_PD(String FISC_YR_PD) {
    this.FISC_YR_PD = FISC_YR_PD;
    return this;
  }
  private String FISC_YR_WK;
  public String get_FISC_YR_WK() {
    return FISC_YR_WK;
  }
  public void set_FISC_YR_WK(String FISC_YR_WK) {
    this.FISC_YR_WK = FISC_YR_WK;
  }
  public UVW_FISC_CAL_DY with_FISC_YR_WK(String FISC_YR_WK) {
    this.FISC_YR_WK = FISC_YR_WK;
    return this;
  }
  private String FISC_YR_DY;
  public String get_FISC_YR_DY() {
    return FISC_YR_DY;
  }
  public void set_FISC_YR_DY(String FISC_YR_DY) {
    this.FISC_YR_DY = FISC_YR_DY;
  }
  public UVW_FISC_CAL_DY with_FISC_YR_DY(String FISC_YR_DY) {
    this.FISC_YR_DY = FISC_YR_DY;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof UVW_FISC_CAL_DY)) {
      return false;
    }
    UVW_FISC_CAL_DY that = (UVW_FISC_CAL_DY) o;
    boolean equal = true;
    equal = equal && (this.FISC_DT == null ? that.FISC_DT == null : this.FISC_DT.equals(that.FISC_DT));
    equal = equal && (this.FISC_YR == null ? that.FISC_YR == null : this.FISC_YR.equals(that.FISC_YR));
    equal = equal && (this.FISC_QTR == null ? that.FISC_QTR == null : this.FISC_QTR.equals(that.FISC_QTR));
    equal = equal && (this.FISC_PD == null ? that.FISC_PD == null : this.FISC_PD.equals(that.FISC_PD));
    equal = equal && (this.FISC_WK == null ? that.FISC_WK == null : this.FISC_WK.equals(that.FISC_WK));
    equal = equal && (this.FISC_DY == null ? that.FISC_DY == null : this.FISC_DY.equals(that.FISC_DY));
    equal = equal && (this.FISC_WK_OF_PD == null ? that.FISC_WK_OF_PD == null : this.FISC_WK_OF_PD.equals(that.FISC_WK_OF_PD));
    equal = equal && (this.FISC_DY_OF_PD == null ? that.FISC_DY_OF_PD == null : this.FISC_DY_OF_PD.equals(that.FISC_DY_OF_PD));
    equal = equal && (this.FISC_DY_OF_WK == null ? that.FISC_DY_OF_WK == null : this.FISC_DY_OF_WK.equals(that.FISC_DY_OF_WK));
    equal = equal && (this.FISC_WK_STRT_DT == null ? that.FISC_WK_STRT_DT == null : this.FISC_WK_STRT_DT.equals(that.FISC_WK_STRT_DT));
    equal = equal && (this.FISC_WK_END_DT == null ? that.FISC_WK_END_DT == null : this.FISC_WK_END_DT.equals(that.FISC_WK_END_DT));
    equal = equal && (this.FISC_YR_QTR == null ? that.FISC_YR_QTR == null : this.FISC_YR_QTR.equals(that.FISC_YR_QTR));
    equal = equal && (this.FISC_YR_PD == null ? that.FISC_YR_PD == null : this.FISC_YR_PD.equals(that.FISC_YR_PD));
    equal = equal && (this.FISC_YR_WK == null ? that.FISC_YR_WK == null : this.FISC_YR_WK.equals(that.FISC_YR_WK));
    equal = equal && (this.FISC_YR_DY == null ? that.FISC_YR_DY == null : this.FISC_YR_DY.equals(that.FISC_YR_DY));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof UVW_FISC_CAL_DY)) {
      return false;
    }
    UVW_FISC_CAL_DY that = (UVW_FISC_CAL_DY) o;
    boolean equal = true;
    equal = equal && (this.FISC_DT == null ? that.FISC_DT == null : this.FISC_DT.equals(that.FISC_DT));
    equal = equal && (this.FISC_YR == null ? that.FISC_YR == null : this.FISC_YR.equals(that.FISC_YR));
    equal = equal && (this.FISC_QTR == null ? that.FISC_QTR == null : this.FISC_QTR.equals(that.FISC_QTR));
    equal = equal && (this.FISC_PD == null ? that.FISC_PD == null : this.FISC_PD.equals(that.FISC_PD));
    equal = equal && (this.FISC_WK == null ? that.FISC_WK == null : this.FISC_WK.equals(that.FISC_WK));
    equal = equal && (this.FISC_DY == null ? that.FISC_DY == null : this.FISC_DY.equals(that.FISC_DY));
    equal = equal && (this.FISC_WK_OF_PD == null ? that.FISC_WK_OF_PD == null : this.FISC_WK_OF_PD.equals(that.FISC_WK_OF_PD));
    equal = equal && (this.FISC_DY_OF_PD == null ? that.FISC_DY_OF_PD == null : this.FISC_DY_OF_PD.equals(that.FISC_DY_OF_PD));
    equal = equal && (this.FISC_DY_OF_WK == null ? that.FISC_DY_OF_WK == null : this.FISC_DY_OF_WK.equals(that.FISC_DY_OF_WK));
    equal = equal && (this.FISC_WK_STRT_DT == null ? that.FISC_WK_STRT_DT == null : this.FISC_WK_STRT_DT.equals(that.FISC_WK_STRT_DT));
    equal = equal && (this.FISC_WK_END_DT == null ? that.FISC_WK_END_DT == null : this.FISC_WK_END_DT.equals(that.FISC_WK_END_DT));
    equal = equal && (this.FISC_YR_QTR == null ? that.FISC_YR_QTR == null : this.FISC_YR_QTR.equals(that.FISC_YR_QTR));
    equal = equal && (this.FISC_YR_PD == null ? that.FISC_YR_PD == null : this.FISC_YR_PD.equals(that.FISC_YR_PD));
    equal = equal && (this.FISC_YR_WK == null ? that.FISC_YR_WK == null : this.FISC_YR_WK.equals(that.FISC_YR_WK));
    equal = equal && (this.FISC_YR_DY == null ? that.FISC_YR_DY == null : this.FISC_YR_DY.equals(that.FISC_YR_DY));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.FISC_DT = JdbcWritableBridge.readString(1, __dbResults);
    this.FISC_YR = JdbcWritableBridge.readBigDecimal(2, __dbResults);
    this.FISC_QTR = JdbcWritableBridge.readBigDecimal(3, __dbResults);
    this.FISC_PD = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.FISC_WK = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.FISC_DY = JdbcWritableBridge.readInteger(6, __dbResults);
    this.FISC_WK_OF_PD = JdbcWritableBridge.readInteger(7, __dbResults);
    this.FISC_DY_OF_PD = JdbcWritableBridge.readInteger(8, __dbResults);
    this.FISC_DY_OF_WK = JdbcWritableBridge.readInteger(9, __dbResults);
    this.FISC_WK_STRT_DT = JdbcWritableBridge.readString(10, __dbResults);
    this.FISC_WK_END_DT = JdbcWritableBridge.readString(11, __dbResults);
    this.FISC_YR_QTR = JdbcWritableBridge.readString(12, __dbResults);
    this.FISC_YR_PD = JdbcWritableBridge.readString(13, __dbResults);
    this.FISC_YR_WK = JdbcWritableBridge.readString(14, __dbResults);
    this.FISC_YR_DY = JdbcWritableBridge.readString(15, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.FISC_DT = JdbcWritableBridge.readString(1, __dbResults);
    this.FISC_YR = JdbcWritableBridge.readBigDecimal(2, __dbResults);
    this.FISC_QTR = JdbcWritableBridge.readBigDecimal(3, __dbResults);
    this.FISC_PD = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.FISC_WK = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.FISC_DY = JdbcWritableBridge.readInteger(6, __dbResults);
    this.FISC_WK_OF_PD = JdbcWritableBridge.readInteger(7, __dbResults);
    this.FISC_DY_OF_PD = JdbcWritableBridge.readInteger(8, __dbResults);
    this.FISC_DY_OF_WK = JdbcWritableBridge.readInteger(9, __dbResults);
    this.FISC_WK_STRT_DT = JdbcWritableBridge.readString(10, __dbResults);
    this.FISC_WK_END_DT = JdbcWritableBridge.readString(11, __dbResults);
    this.FISC_YR_QTR = JdbcWritableBridge.readString(12, __dbResults);
    this.FISC_YR_PD = JdbcWritableBridge.readString(13, __dbResults);
    this.FISC_YR_WK = JdbcWritableBridge.readString(14, __dbResults);
    this.FISC_YR_DY = JdbcWritableBridge.readString(15, __dbResults);
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
    JdbcWritableBridge.writeString(FISC_DT, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(FISC_YR, 2 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(FISC_QTR, 3 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(FISC_PD, 4 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(FISC_WK, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(FISC_DY, 6 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(FISC_WK_OF_PD, 7 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(FISC_DY_OF_PD, 8 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(FISC_DY_OF_WK, 9 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(FISC_WK_STRT_DT, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(FISC_WK_END_DT, 11 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(FISC_YR_QTR, 12 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(FISC_YR_PD, 13 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(FISC_YR_WK, 14 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(FISC_YR_DY, 15 + __off, 12, __dbStmt);
    return 15;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(FISC_DT, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(FISC_YR, 2 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(FISC_QTR, 3 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(FISC_PD, 4 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(FISC_WK, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(FISC_DY, 6 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(FISC_WK_OF_PD, 7 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(FISC_DY_OF_PD, 8 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(FISC_DY_OF_WK, 9 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(FISC_WK_STRT_DT, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(FISC_WK_END_DT, 11 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(FISC_YR_QTR, 12 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(FISC_YR_PD, 13 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(FISC_YR_WK, 14 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(FISC_YR_DY, 15 + __off, 12, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.FISC_DT = null;
    } else {
    this.FISC_DT = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.FISC_YR = null;
    } else {
    this.FISC_YR = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.FISC_QTR = null;
    } else {
    this.FISC_QTR = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.FISC_PD = null;
    } else {
    this.FISC_PD = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.FISC_WK = null;
    } else {
    this.FISC_WK = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.FISC_DY = null;
    } else {
    this.FISC_DY = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.FISC_WK_OF_PD = null;
    } else {
    this.FISC_WK_OF_PD = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.FISC_DY_OF_PD = null;
    } else {
    this.FISC_DY_OF_PD = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.FISC_DY_OF_WK = null;
    } else {
    this.FISC_DY_OF_WK = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.FISC_WK_STRT_DT = null;
    } else {
    this.FISC_WK_STRT_DT = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.FISC_WK_END_DT = null;
    } else {
    this.FISC_WK_END_DT = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.FISC_YR_QTR = null;
    } else {
    this.FISC_YR_QTR = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.FISC_YR_PD = null;
    } else {
    this.FISC_YR_PD = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.FISC_YR_WK = null;
    } else {
    this.FISC_YR_WK = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.FISC_YR_DY = null;
    } else {
    this.FISC_YR_DY = Text.readString(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.FISC_DT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FISC_DT);
    }
    if (null == this.FISC_YR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.FISC_YR, __dataOut);
    }
    if (null == this.FISC_QTR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.FISC_QTR, __dataOut);
    }
    if (null == this.FISC_PD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.FISC_PD, __dataOut);
    }
    if (null == this.FISC_WK) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.FISC_WK, __dataOut);
    }
    if (null == this.FISC_DY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FISC_DY);
    }
    if (null == this.FISC_WK_OF_PD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FISC_WK_OF_PD);
    }
    if (null == this.FISC_DY_OF_PD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FISC_DY_OF_PD);
    }
    if (null == this.FISC_DY_OF_WK) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FISC_DY_OF_WK);
    }
    if (null == this.FISC_WK_STRT_DT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FISC_WK_STRT_DT);
    }
    if (null == this.FISC_WK_END_DT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FISC_WK_END_DT);
    }
    if (null == this.FISC_YR_QTR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FISC_YR_QTR);
    }
    if (null == this.FISC_YR_PD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FISC_YR_PD);
    }
    if (null == this.FISC_YR_WK) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FISC_YR_WK);
    }
    if (null == this.FISC_YR_DY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FISC_YR_DY);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.FISC_DT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FISC_DT);
    }
    if (null == this.FISC_YR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.FISC_YR, __dataOut);
    }
    if (null == this.FISC_QTR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.FISC_QTR, __dataOut);
    }
    if (null == this.FISC_PD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.FISC_PD, __dataOut);
    }
    if (null == this.FISC_WK) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.FISC_WK, __dataOut);
    }
    if (null == this.FISC_DY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FISC_DY);
    }
    if (null == this.FISC_WK_OF_PD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FISC_WK_OF_PD);
    }
    if (null == this.FISC_DY_OF_PD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FISC_DY_OF_PD);
    }
    if (null == this.FISC_DY_OF_WK) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FISC_DY_OF_WK);
    }
    if (null == this.FISC_WK_STRT_DT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FISC_WK_STRT_DT);
    }
    if (null == this.FISC_WK_END_DT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FISC_WK_END_DT);
    }
    if (null == this.FISC_YR_QTR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FISC_YR_QTR);
    }
    if (null == this.FISC_YR_PD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FISC_YR_PD);
    }
    if (null == this.FISC_YR_WK) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FISC_YR_WK);
    }
    if (null == this.FISC_YR_DY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FISC_YR_DY);
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
    __sb.append(FieldFormatter.escapeAndEnclose(FISC_DT==null?"null":FISC_DT, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FISC_YR==null?"null":FISC_YR.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FISC_QTR==null?"null":FISC_QTR.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FISC_PD==null?"null":FISC_PD.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FISC_WK==null?"null":FISC_WK.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FISC_DY==null?"null":"" + FISC_DY, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FISC_WK_OF_PD==null?"null":"" + FISC_WK_OF_PD, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FISC_DY_OF_PD==null?"null":"" + FISC_DY_OF_PD, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FISC_DY_OF_WK==null?"null":"" + FISC_DY_OF_WK, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FISC_WK_STRT_DT==null?"null":FISC_WK_STRT_DT, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FISC_WK_END_DT==null?"null":FISC_WK_END_DT, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FISC_YR_QTR==null?"null":FISC_YR_QTR, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FISC_YR_PD==null?"null":FISC_YR_PD, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FISC_YR_WK==null?"null":FISC_YR_WK, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FISC_YR_DY==null?"null":FISC_YR_DY, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(FISC_DT==null?"null":FISC_DT, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FISC_YR==null?"null":FISC_YR.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FISC_QTR==null?"null":FISC_QTR.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FISC_PD==null?"null":FISC_PD.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FISC_WK==null?"null":FISC_WK.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FISC_DY==null?"null":"" + FISC_DY, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FISC_WK_OF_PD==null?"null":"" + FISC_WK_OF_PD, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FISC_DY_OF_PD==null?"null":"" + FISC_DY_OF_PD, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FISC_DY_OF_WK==null?"null":"" + FISC_DY_OF_WK, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FISC_WK_STRT_DT==null?"null":FISC_WK_STRT_DT, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FISC_WK_END_DT==null?"null":FISC_WK_END_DT, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FISC_YR_QTR==null?"null":FISC_YR_QTR, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FISC_YR_PD==null?"null":FISC_YR_PD, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FISC_YR_WK==null?"null":FISC_YR_WK, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FISC_YR_DY==null?"null":FISC_YR_DY, delimiters));
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
    if (__cur_str.equals("null")) { this.FISC_DT = null; } else {
      this.FISC_DT = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FISC_YR = null; } else {
      this.FISC_YR = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FISC_QTR = null; } else {
      this.FISC_QTR = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FISC_PD = null; } else {
      this.FISC_PD = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FISC_WK = null; } else {
      this.FISC_WK = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FISC_DY = null; } else {
      this.FISC_DY = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FISC_WK_OF_PD = null; } else {
      this.FISC_WK_OF_PD = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FISC_DY_OF_PD = null; } else {
      this.FISC_DY_OF_PD = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FISC_DY_OF_WK = null; } else {
      this.FISC_DY_OF_WK = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.FISC_WK_STRT_DT = null; } else {
      this.FISC_WK_STRT_DT = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.FISC_WK_END_DT = null; } else {
      this.FISC_WK_END_DT = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.FISC_YR_QTR = null; } else {
      this.FISC_YR_QTR = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.FISC_YR_PD = null; } else {
      this.FISC_YR_PD = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.FISC_YR_WK = null; } else {
      this.FISC_YR_WK = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.FISC_YR_DY = null; } else {
      this.FISC_YR_DY = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.FISC_DT = null; } else {
      this.FISC_DT = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FISC_YR = null; } else {
      this.FISC_YR = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FISC_QTR = null; } else {
      this.FISC_QTR = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FISC_PD = null; } else {
      this.FISC_PD = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FISC_WK = null; } else {
      this.FISC_WK = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FISC_DY = null; } else {
      this.FISC_DY = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FISC_WK_OF_PD = null; } else {
      this.FISC_WK_OF_PD = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FISC_DY_OF_PD = null; } else {
      this.FISC_DY_OF_PD = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FISC_DY_OF_WK = null; } else {
      this.FISC_DY_OF_WK = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.FISC_WK_STRT_DT = null; } else {
      this.FISC_WK_STRT_DT = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.FISC_WK_END_DT = null; } else {
      this.FISC_WK_END_DT = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.FISC_YR_QTR = null; } else {
      this.FISC_YR_QTR = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.FISC_YR_PD = null; } else {
      this.FISC_YR_PD = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.FISC_YR_WK = null; } else {
      this.FISC_YR_WK = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.FISC_YR_DY = null; } else {
      this.FISC_YR_DY = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    UVW_FISC_CAL_DY o = (UVW_FISC_CAL_DY) super.clone();
    return o;
  }

  public void clone0(UVW_FISC_CAL_DY o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("FISC_DT", this.FISC_DT);
    __sqoop$field_map.put("FISC_YR", this.FISC_YR);
    __sqoop$field_map.put("FISC_QTR", this.FISC_QTR);
    __sqoop$field_map.put("FISC_PD", this.FISC_PD);
    __sqoop$field_map.put("FISC_WK", this.FISC_WK);
    __sqoop$field_map.put("FISC_DY", this.FISC_DY);
    __sqoop$field_map.put("FISC_WK_OF_PD", this.FISC_WK_OF_PD);
    __sqoop$field_map.put("FISC_DY_OF_PD", this.FISC_DY_OF_PD);
    __sqoop$field_map.put("FISC_DY_OF_WK", this.FISC_DY_OF_WK);
    __sqoop$field_map.put("FISC_WK_STRT_DT", this.FISC_WK_STRT_DT);
    __sqoop$field_map.put("FISC_WK_END_DT", this.FISC_WK_END_DT);
    __sqoop$field_map.put("FISC_YR_QTR", this.FISC_YR_QTR);
    __sqoop$field_map.put("FISC_YR_PD", this.FISC_YR_PD);
    __sqoop$field_map.put("FISC_YR_WK", this.FISC_YR_WK);
    __sqoop$field_map.put("FISC_YR_DY", this.FISC_YR_DY);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("FISC_DT", this.FISC_DT);
    __sqoop$field_map.put("FISC_YR", this.FISC_YR);
    __sqoop$field_map.put("FISC_QTR", this.FISC_QTR);
    __sqoop$field_map.put("FISC_PD", this.FISC_PD);
    __sqoop$field_map.put("FISC_WK", this.FISC_WK);
    __sqoop$field_map.put("FISC_DY", this.FISC_DY);
    __sqoop$field_map.put("FISC_WK_OF_PD", this.FISC_WK_OF_PD);
    __sqoop$field_map.put("FISC_DY_OF_PD", this.FISC_DY_OF_PD);
    __sqoop$field_map.put("FISC_DY_OF_WK", this.FISC_DY_OF_WK);
    __sqoop$field_map.put("FISC_WK_STRT_DT", this.FISC_WK_STRT_DT);
    __sqoop$field_map.put("FISC_WK_END_DT", this.FISC_WK_END_DT);
    __sqoop$field_map.put("FISC_YR_QTR", this.FISC_YR_QTR);
    __sqoop$field_map.put("FISC_YR_PD", this.FISC_YR_PD);
    __sqoop$field_map.put("FISC_YR_WK", this.FISC_YR_WK);
    __sqoop$field_map.put("FISC_YR_DY", this.FISC_YR_DY);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
