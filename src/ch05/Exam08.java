package ch05;

import java.util.Arrays;

public class Exam08 {

	public static void main(String[] args) {
		
		int[][] scores = {
				{10, 20},
				{15, 25, 35},
				{45, 55, 65, 75}
			};
		
		System.out.println(scores.length);
		System.out.println(scores[0].length);
		
		int sum = 0;
		int count = 0;
		for(int i=0; i<scores.length; i++) {
			for(int j=0; j<scores[i].length; j++) {
				sum += scores[i][j];
				count++;
			}
		}
		
		double avg = (double)sum / count;
		System.out.println(avg);
		
		String[] arr = new String[]{"자바"};
		System.out.println(arr[0] == "자바");
	}
	
	
	

}
