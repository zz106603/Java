package ch10.exam05;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Example {

	public static void main(String[] args) {
		try {
			method("C:/file.txt");
		}catch(FileNotFoundException e) {
			System.out.println("������ �����ϴ�.");
		}

	}

	public static void method(String filePath) throws FileNotFoundException{
		FileInputStream fis = new FileInputStream(filePath);
	}
}
