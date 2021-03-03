package ch18.exam16;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class Example2 {

	public static void main(String[] args) throws Exception{
		
		/*		String filePath = "D:/Team6Projects/Temp/src/ch18/exam16/data.txt";
				OutputStream os = new FileOutputStream(filePath);
				
				String data = "������ �������Դϴ�.";
				byte[] bytes = data.getBytes("UTF-8");
				os.write(bytes, 0, bytes.length);
				os.flush();
				
				data = "������ �����ؿ�.";
				bytes = data.getBytes("UTF-8");
				os.write(bytes, 0, bytes.length);
				os.flush();*/
		
		String filePath = "D:/Team6Projects/Temp/src/ch18/exam16/data.txt";
		OutputStream os = new FileOutputStream(filePath);
		Writer writer = new OutputStreamWriter(os, "UTF-8");
		
		String data = "������ �������Դϴ�.";
		writer.write(data);
		writer.flush();
		
		data = "������ �����ؿ�.";
		writer.write(data);
		writer.flush();
		
		writer.close();

	}

}
