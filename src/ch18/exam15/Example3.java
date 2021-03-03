package ch18.exam15;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Example3 {

	public static void main(String[] args) {
		
		File file = new File("C:Temp");
		String[] list = file.list();
		
		for(String name : list) {
			System.out.println(name);
		}
		
		System.out.println();
		File[] files = file.listFiles();
		for(File name : files) {
			long time = name.lastModified();
			Date date = new Date(time);
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
			System.out.print(sdf.format(date)+"\t");
			
			if(name.isDirectory()) {
				System.out.print("<dir>\t");
			}else {
				System.out.print(name.length() + "\t");
			}
			System.out.println(name.getName());
			
		}
	}

}
