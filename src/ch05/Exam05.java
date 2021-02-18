package ch05;

import java.util.Arrays;

public class Exam05 {

	public static void main(String[] args) {
		
		int[] arr1 = new int[3];
		for(int i=0; i<arr1.length; i++)
		{
			System.out.println(arr1[i]);
		}
		
		arr1[0] = 90;
		arr1[1] = 80;
		arr1[2] = 95;
		
		for(int i=0; i<arr1.length; i++)
		{
			System.out.println(arr1[i]);
		}
	}
	

}
