package ch18.exam01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Example {

	public static void main(String[] args) {

		String filePath = "D:/Team6Projects/MyProject/Java/src/ch18/exam01/photo1.jpg";
		try {
			InputStream is = new FileInputStream(filePath);
			
			//规过 1
			/*while(true) {
				int data = is.read();
				if(data == -1) {
					break;
				}
				System.out.println(data);
			}*/
			
			//规过 2
			int data = -1;
			while((data = is.read()) != -1) {
				System.out.println(data);
			}
			
			is.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}

