package ch18.exam15;

import java.io.File;

public class Example2 {

	public static void main(String[] args) {
	
		
		File file = new File("C:Temp/data.txt");
		if(file.isDirectory()) {
			System.out.println("폴더");
		}else {
			System.out.println("파일");
		}
		
		file = new File("C:/Temp/data.txt");
		if(file.isFile()) {
			System.out.println(file.length());
		}else {
			System.out.println("없다");
		}
	}

}
