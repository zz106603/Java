package ch18.exam15;

import java.io.File;

public class Example2 {

	public static void main(String[] args) {
	
		
		File file = new File("C:Temp/data.txt");
		if(file.isDirectory()) {
			System.out.println("����");
		}else {
			System.out.println("����");
		}
		
		file = new File("C:/Temp/data.txt");
		if(file.isFile()) {
			System.out.println(file.length());
		}else {
			System.out.println("����");
		}
	}

}
