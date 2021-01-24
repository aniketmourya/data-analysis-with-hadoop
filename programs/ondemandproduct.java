// ORM class for table 'ondemandproduct'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Tue Feb 23 22:26:41 PST 2016
// For connector: org.apache.sqoop.manager.MySQLManager
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
import java.util.TreeMap;

public class ondemandproduct extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  protected ResultSet __cur_result_set;
  private String id;
  public String get_id() {
    return id;
  }
  public void set_id(String id) {
    this.id = id;
  }
  public ondemandproduct with_id(String id) {
    this.id = id;
    return this;
  }
  private String name;
  public String get_name() {
    return name;
  }
  public void set_name(String name) {
    this.name = name;
  }
  public ondemandproduct with_name(String name) {
    this.name = name;
    return this;
  }
  private String types_crawal;
  public String get_types_crawal() {
    return types_crawal;
  }
  public void set_types_crawal(String types_crawal) {
    this.types_crawal = types_crawal;
  }
  public ondemandproduct with_types_crawal(String types_crawal) {
    this.types_crawal = types_crawal;
    return this;
  }
  private String web_url;
  public String get_web_url() {
    return web_url;
  }
  public void set_web_url(String web_url) {
    this.web_url = web_url;
  }
  public ondemandproduct with_web_url(String web_url) {
    this.web_url = web_url;
    return this;
  }
  private String product_name;
  public String get_product_name() {
    return product_name;
  }
  public void set_product_name(String product_name) {
    this.product_name = product_name;
  }
  public ondemandproduct with_product_name(String product_name) {
    this.product_name = product_name;
    return this;
  }
  private String reg_prise;
  public String get_reg_prise() {
    return reg_prise;
  }
  public void set_reg_prise(String reg_prise) {
    this.reg_prise = reg_prise;
  }
  public ondemandproduct with_reg_prise(String reg_prise) {
    this.reg_prise = reg_prise;
    return this;
  }
  private String seal_prise;
  public String get_seal_prise() {
    return seal_prise;
  }
  public void set_seal_prise(String seal_prise) {
    this.seal_prise = seal_prise;
  }
  public ondemandproduct with_seal_prise(String seal_prise) {
    this.seal_prise = seal_prise;
    return this;
  }
  private String percentage;
  public String get_percentage() {
    return percentage;
  }
  public void set_percentage(String percentage) {
    this.percentage = percentage;
  }
  public ondemandproduct with_percentage(String percentage) {
    this.percentage = percentage;
    return this;
  }
  private String stock_info;
  public String get_stock_info() {
    return stock_info;
  }
  public void set_stock_info(String stock_info) {
    this.stock_info = stock_info;
  }
  public ondemandproduct with_stock_info(String stock_info) {
    this.stock_info = stock_info;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof ondemandproduct)) {
      return false;
    }
    ondemandproduct that = (ondemandproduct) o;
    boolean equal = true;
    equal = equal && (this.id == null ? that.id == null : this.id.equals(that.id));
    equal = equal && (this.name == null ? that.name == null : this.name.equals(that.name));
    equal = equal && (this.types_crawal == null ? that.types_crawal == null : this.types_crawal.equals(that.types_crawal));
    equal = equal && (this.web_url == null ? that.web_url == null : this.web_url.equals(that.web_url));
    equal = equal && (this.product_name == null ? that.product_name == null : this.product_name.equals(that.product_name));
    equal = equal && (this.reg_prise == null ? that.reg_prise == null : this.reg_prise.equals(that.reg_prise));
    equal = equal && (this.seal_prise == null ? that.seal_prise == null : this.seal_prise.equals(that.seal_prise));
    equal = equal && (this.percentage == null ? that.percentage == null : this.percentage.equals(that.percentage));
    equal = equal && (this.stock_info == null ? that.stock_info == null : this.stock_info.equals(that.stock_info));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof ondemandproduct)) {
      return false;
    }
    ondemandproduct that = (ondemandproduct) o;
    boolean equal = true;
    equal = equal && (this.id == null ? that.id == null : this.id.equals(that.id));
    equal = equal && (this.name == null ? that.name == null : this.name.equals(that.name));
    equal = equal && (this.types_crawal == null ? that.types_crawal == null : this.types_crawal.equals(that.types_crawal));
    equal = equal && (this.web_url == null ? that.web_url == null : this.web_url.equals(that.web_url));
    equal = equal && (this.product_name == null ? that.product_name == null : this.product_name.equals(that.product_name));
    equal = equal && (this.reg_prise == null ? that.reg_prise == null : this.reg_prise.equals(that.reg_prise));
    equal = equal && (this.seal_prise == null ? that.seal_prise == null : this.seal_prise.equals(that.seal_prise));
    equal = equal && (this.percentage == null ? that.percentage == null : this.percentage.equals(that.percentage));
    equal = equal && (this.stock_info == null ? that.stock_info == null : this.stock_info.equals(that.stock_info));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.id = JdbcWritableBridge.readString(1, __dbResults);
    this.name = JdbcWritableBridge.readString(2, __dbResults);
    this.types_crawal = JdbcWritableBridge.readString(3, __dbResults);
    this.web_url = JdbcWritableBridge.readString(4, __dbResults);
    this.product_name = JdbcWritableBridge.readString(5, __dbResults);
    this.reg_prise = JdbcWritableBridge.readString(6, __dbResults);
    this.seal_prise = JdbcWritableBridge.readString(7, __dbResults);
    this.percentage = JdbcWritableBridge.readString(8, __dbResults);
    this.stock_info = JdbcWritableBridge.readString(9, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.id = JdbcWritableBridge.readString(1, __dbResults);
    this.name = JdbcWritableBridge.readString(2, __dbResults);
    this.types_crawal = JdbcWritableBridge.readString(3, __dbResults);
    this.web_url = JdbcWritableBridge.readString(4, __dbResults);
    this.product_name = JdbcWritableBridge.readString(5, __dbResults);
    this.reg_prise = JdbcWritableBridge.readString(6, __dbResults);
    this.seal_prise = JdbcWritableBridge.readString(7, __dbResults);
    this.percentage = JdbcWritableBridge.readString(8, __dbResults);
    this.stock_info = JdbcWritableBridge.readString(9, __dbResults);
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
    JdbcWritableBridge.writeString(id, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(name, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(types_crawal, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(web_url, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(product_name, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(reg_prise, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(seal_prise, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(percentage, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(stock_info, 9 + __off, 12, __dbStmt);
    return 9;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(id, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(name, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(types_crawal, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(web_url, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(product_name, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(reg_prise, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(seal_prise, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(percentage, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(stock_info, 9 + __off, 12, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.id = null;
    } else {
    this.id = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.name = null;
    } else {
    this.name = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.types_crawal = null;
    } else {
    this.types_crawal = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.web_url = null;
    } else {
    this.web_url = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.product_name = null;
    } else {
    this.product_name = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.reg_prise = null;
    } else {
    this.reg_prise = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.seal_prise = null;
    } else {
    this.seal_prise = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.percentage = null;
    } else {
    this.percentage = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.stock_info = null;
    } else {
    this.stock_info = Text.readString(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, id);
    }
    if (null == this.name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, name);
    }
    if (null == this.types_crawal) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, types_crawal);
    }
    if (null == this.web_url) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, web_url);
    }
    if (null == this.product_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, product_name);
    }
    if (null == this.reg_prise) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, reg_prise);
    }
    if (null == this.seal_prise) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, seal_prise);
    }
    if (null == this.percentage) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, percentage);
    }
    if (null == this.stock_info) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, stock_info);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, id);
    }
    if (null == this.name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, name);
    }
    if (null == this.types_crawal) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, types_crawal);
    }
    if (null == this.web_url) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, web_url);
    }
    if (null == this.product_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, product_name);
    }
    if (null == this.reg_prise) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, reg_prise);
    }
    if (null == this.seal_prise) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, seal_prise);
    }
    if (null == this.percentage) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, percentage);
    }
    if (null == this.stock_info) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, stock_info);
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
    __sb.append(FieldFormatter.escapeAndEnclose(id==null?"null":id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(name==null?"null":name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(types_crawal==null?"null":types_crawal, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(web_url==null?"null":web_url, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(product_name==null?"null":product_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(reg_prise==null?"null":reg_prise, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(seal_prise==null?"null":seal_prise, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(percentage==null?"null":percentage, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(stock_info==null?"null":stock_info, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(id==null?"null":id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(name==null?"null":name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(types_crawal==null?"null":types_crawal, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(web_url==null?"null":web_url, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(product_name==null?"null":product_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(reg_prise==null?"null":reg_prise, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(seal_prise==null?"null":seal_prise, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(percentage==null?"null":percentage, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(stock_info==null?"null":stock_info, delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 9, (char) 10, (char) 0, (char) 0, false);
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
    if (__cur_str.equals("null")) { this.id = null; } else {
      this.id = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.name = null; } else {
      this.name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.types_crawal = null; } else {
      this.types_crawal = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.web_url = null; } else {
      this.web_url = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.product_name = null; } else {
      this.product_name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.reg_prise = null; } else {
      this.reg_prise = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.seal_prise = null; } else {
      this.seal_prise = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.percentage = null; } else {
      this.percentage = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.stock_info = null; } else {
      this.stock_info = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.id = null; } else {
      this.id = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.name = null; } else {
      this.name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.types_crawal = null; } else {
      this.types_crawal = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.web_url = null; } else {
      this.web_url = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.product_name = null; } else {
      this.product_name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.reg_prise = null; } else {
      this.reg_prise = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.seal_prise = null; } else {
      this.seal_prise = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.percentage = null; } else {
      this.percentage = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.stock_info = null; } else {
      this.stock_info = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    ondemandproduct o = (ondemandproduct) super.clone();
    return o;
  }

  public void clone0(ondemandproduct o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("id", this.id);
    __sqoop$field_map.put("name", this.name);
    __sqoop$field_map.put("types_crawal", this.types_crawal);
    __sqoop$field_map.put("web_url", this.web_url);
    __sqoop$field_map.put("product_name", this.product_name);
    __sqoop$field_map.put("reg_prise", this.reg_prise);
    __sqoop$field_map.put("seal_prise", this.seal_prise);
    __sqoop$field_map.put("percentage", this.percentage);
    __sqoop$field_map.put("stock_info", this.stock_info);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("id", this.id);
    __sqoop$field_map.put("name", this.name);
    __sqoop$field_map.put("types_crawal", this.types_crawal);
    __sqoop$field_map.put("web_url", this.web_url);
    __sqoop$field_map.put("product_name", this.product_name);
    __sqoop$field_map.put("reg_prise", this.reg_prise);
    __sqoop$field_map.put("seal_prise", this.seal_prise);
    __sqoop$field_map.put("percentage", this.percentage);
    __sqoop$field_map.put("stock_info", this.stock_info);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("id".equals(__fieldName)) {
      this.id = (String) __fieldVal;
    }
    else    if ("name".equals(__fieldName)) {
      this.name = (String) __fieldVal;
    }
    else    if ("types_crawal".equals(__fieldName)) {
      this.types_crawal = (String) __fieldVal;
    }
    else    if ("web_url".equals(__fieldName)) {
      this.web_url = (String) __fieldVal;
    }
    else    if ("product_name".equals(__fieldName)) {
      this.product_name = (String) __fieldVal;
    }
    else    if ("reg_prise".equals(__fieldName)) {
      this.reg_prise = (String) __fieldVal;
    }
    else    if ("seal_prise".equals(__fieldName)) {
      this.seal_prise = (String) __fieldVal;
    }
    else    if ("percentage".equals(__fieldName)) {
      this.percentage = (String) __fieldVal;
    }
    else    if ("stock_info".equals(__fieldName)) {
      this.stock_info = (String) __fieldVal;
    }
    else {
      throw new RuntimeException("No such field: " + __fieldName);
    }
  }
  public boolean setField0(String __fieldName, Object __fieldVal) {
    if ("id".equals(__fieldName)) {
      this.id = (String) __fieldVal;
      return true;
    }
    else    if ("name".equals(__fieldName)) {
      this.name = (String) __fieldVal;
      return true;
    }
    else    if ("types_crawal".equals(__fieldName)) {
      this.types_crawal = (String) __fieldVal;
      return true;
    }
    else    if ("web_url".equals(__fieldName)) {
      this.web_url = (String) __fieldVal;
      return true;
    }
    else    if ("product_name".equals(__fieldName)) {
      this.product_name = (String) __fieldVal;
      return true;
    }
    else    if ("reg_prise".equals(__fieldName)) {
      this.reg_prise = (String) __fieldVal;
      return true;
    }
    else    if ("seal_prise".equals(__fieldName)) {
      this.seal_prise = (String) __fieldVal;
      return true;
    }
    else    if ("percentage".equals(__fieldName)) {
      this.percentage = (String) __fieldVal;
      return true;
    }
    else    if ("stock_info".equals(__fieldName)) {
      this.stock_info = (String) __fieldVal;
      return true;
    }
    else {
      return false;    }
  }
}
