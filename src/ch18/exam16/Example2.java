package ch18.exam16;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class Example2 {

	public static void main(String[] args) throws Exception{
		
		/*		String filePath = "D:/Team6Projects/Temp/src/ch18/exam16/data.txt";
				OutputStream os = new FileOutputStream(filePath);
				
				String data = "오늘은 수요일입니다.";
				byte[] bytes = data.getBytes("UTF-8");
				os.write(bytes, 0, bytes.length);
				os.flush();
				
				data = "오늘은 따뜻해요.";
				bytes = data.getBytes("UTF-8");
				os.write(bytes, 0, bytes.length);
				os.flush();*/
		
		String filePath = "D:/Team6Projects/Temp/src/ch18/exam16/data.txt";
		OutputStream os = new FileOutputStream(filePath);
		Writer writer = new OutputStreamWriter(os, "UTF-8");
		
		String data = "오늘은 수요일입니다.";
		writer.write(data);
		writer.flush();
		
		data = "오늘은 따뜻해요.";
		writer.write(data);
		writer.flush();
		
		writer.close();

	}

}
