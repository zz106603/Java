package ch18.exam16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Example {

	public static void main(String[] args) throws IOException {
		
		//规过1
		InputStream is = System.in;
		byte[] data = new byte[100];
		
		int readNum = is.read(data);
		String str = new String(data, 0, readNum - 2);
		System.out.println(str);
		
		readNum = is.read(data);
		str = new String(data, 0, readNum - 2);
		System.out.println(str);
		
		//规过2
		InputStream is2 = System.in;
		InputStreamReader isr = new InputStreamReader(is2);
		BufferedReader br = new BufferedReader(isr);
		String str2 = br.readLine();
		System.out.println(str2);
	}

}
