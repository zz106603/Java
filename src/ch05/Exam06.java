package ch05;

import java.util.Arrays;

public class Exam06 {

	public static void main(String[] args) {
		
		String[] arr1 = new String[3];
		for(int i=0; i<arr1.length; i++)
		{
			System.out.println(arr1[i]);
		}
		
		arr1[0] = "90";
		arr1[1] = "80";
		arr1[2] = "95";
		
		for(int i=0; i<arr1.length; i++)
		{
			System.out.println(arr1[i]);
		}
		
		System.out.println(arr1[0] == "90");
		System.out.println(arr1[0].equals("90"));
		System.out.println(arr1[1].equals("85"));
	}
	

}
