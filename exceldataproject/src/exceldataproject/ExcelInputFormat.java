package exceldataproject;
import java.io.IOException;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.InputSplit;
import org.apache.hadoop.mapreduce.RecordReader;
import org.apache.hadoop.mapreduce.TaskAttemptContext;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;

public class ExcelInputFormat extends FileInputFormat<LongWritable, Text> {

  @Override
  public RecordReader<LongWritable, Text> createRecordReader(InputSplit paramInputSplit,
      TaskAttemptContext paramTaskAttemptContext) throws IOException, InterruptedException {
	  System.out.println(">>Excel input format class:");
    return new ExcelRecordReader();
  }

}
