package ch05;

import java.util.Arrays;

public class Exam10 {

	public static void main(String[] args) {
	
		int[] oldArray = {85,90,95};
		int[] newArray = new int[5];
		
		System.arraycopy(oldArray, 0, newArray, 2, oldArray.length);
		
		for(int i=0; i<newArray.length; i++) {
			System.out.println(newArray[i]);
		}
		
	}
	
	

}
