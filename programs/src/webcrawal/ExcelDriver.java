package webcrawal;


import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
//import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.NullWritable;
//import org.apache.hadoop.io.Writable;
//import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.Mapper;
//import org.apache.hadoop.mapreduce.Mapper.Context;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.mapreduce.lib.output.MultipleOutputs;
import org.apache.hadoop.mapreduce.lib.output.TextOutputFormat;
//import org.apache.hadoop.util.GenericOptionsParser;

public class ExcelDriver{
	//.................................
	static String OutputName1 = "HighBuzzProduct";
    static String OutputName2 = "NormalProduct";
    static String OutputName3 = "OnDemandCrawlProducts";
    	static String OutputName4 = "AvailableProduct";
    	static String OutputName5 = "OtherProduct";
    	static String m1 = "";
	//......................................r
    	public static class WordCountMapper1 extends Mapper <Object, Text, Text, Text>{
    		MultipleOutputs<Text, Text> mos;
    		@SuppressWarnings({ "unchecked", "rawtypes" })
			public void setup(Context context) 
    		{
    			System.out.println("WordCountMapper1 - setup ");
                mos = new MultipleOutputs(context);
            }

		   

		    public void map(Object key, Text value, Context context) throws IOException, InterruptedException
		    {
		        context.write(null, value);
		    	System.out.println("Enter mapper map");
				System.out.println(">> enter");
				String str = value.toString();
				String[] items = str.split("\t");
				
				String typeOfCrawling = items[2]; // typeOfCrawling
				System.out.println(typeOfCrawling + typeOfCrawling);
				String title = items[4]; // titled
				System.out.println(title + title);

				double salePrice = Double.parseDouble(items[5]); // salePrice
				System.out.println(salePrice);
				double regPrice = Double.parseDouble(items[6]); // regPrice
				System.out.println(regPrice);
				double rebatePercent = Double.parseDouble(items[7]); // rebatePercent
				System.out.println(rebatePercent);
				String stockInfo = items[8]; // stockInfo
				System.out.println(stockInfo);

				/**
				 * If TypeOfCrawling is -->'BS'
				 * 
				 * -salePrice < 100.00 & RebatePercent>50 --> store
				 * "HighBuzzProducts" -RegPrice<150.00 & RebatePercent in 25-50
				 * --> store "NormalProducts" -lengthOf(title)>100 ---> 'rare
				 * products'
				 */

				// condition1
			if ("BS".equalsIgnoreCase(typeOfCrawling)) {
					System.out.println("BS");
					if (salePrice < 120.00 && rebatePercent > 30) {
						mos.write(OutputName1,null,str);
						System.out.println("high buzz");
					}

					if (regPrice > 150.00
							&& (rebatePercent >= 25 || rebatePercent >= 50)) {
						mos.write(OutputName2, null,str);
						System.out.println("normal");
					}

					if (title.length() < 100) {
						mos.write(OutputName3, null,str);

					}
				}
				/**
				 * If TypeOfCrawling is -->'ODC' - salePrice < 150.00 -->
				 * store "OnDemandCrawlProducts" - StockInfo --> "InStock"
				 * -->store "AvailableProducts"
				 * 
				 * else
				 * 
				 * store in "OtherProducts"
				 */
			else if ("ODC".equalsIgnoreCase(typeOfCrawling)) {
					if (salePrice >= 150.00) {
						mos.write(OutputName4, null,str);
					}

					if ("outstock".equalsIgnoreCase(stockInfo)) {
						mos.write(OutputName5, null,str);
					}
				} else {
					//mos.write(OutputName1, null,str);
				}
		    }
		    
		    public void cleanup(Context context) throws IOException,
				InterruptedException {
		    	mos.close();
		    	}
		    
 
    	}
    	
	
    //.......................................
	
	public static void main(String[] args) throws IOException,
			InterruptedException, ClassNotFoundException {
		Configuration conf = new Configuration();
	//	GenericOptionsParser parser = new GenericOptionsParser(conf, args);
	//	args = parser.getRemainingArgs();
		
		Job job = new Job(conf, "Pdfwordcount");
		job.setJarByClass(ExcelDriver.class);
		job.setNumReduceTasks(0);
		job.setOutputKeyClass(Text.class);
		job.setOutputValueClass(Text.class);
		job.setInputFormatClass(ExcelInputFormat.class);
		job.setOutputFormatClass(TextOutputFormat.class);
		FileInputFormat.setInputPaths(job, new Path(args[0]));
		FileOutputFormat.setOutputPath(job, new Path(args[1]));
		job.setMapperClass(WordCountMapper1.class);
		
       //.......................................................
		
		MultipleOutputs.addNamedOutput(job, OutputName1, TextOutputFormat.class,NullWritable.class ,Text.class);
        MultipleOutputs.addNamedOutput(job, OutputName2, TextOutputFormat.class,NullWritable.class,Text.class);
        MultipleOutputs.addNamedOutput(job, OutputName3,  TextOutputFormat.class,NullWritable.class, Text.class);
        MultipleOutputs.addNamedOutput(job, OutputName4,  TextOutputFormat.class,NullWritable.class, Text.class);
        MultipleOutputs.addNamedOutput(job, OutputName5,  TextOutputFormat.class,NullWritable.class, Text.class);
		
		
		System.out.println(job.waitForCompletion(true));
	}
}
