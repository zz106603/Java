package ch05;

import java.util.Arrays;

public class Exam07 {

	public static void main(String[] args) {
		
		String[] arr =new String[3];
	      for(int i=0; i<arr.length;i++) {
	         System.out.println(arr[i]);
	      }
	      
	      arr[0] = "자바";
	      arr[1] = "홍길동";
	      arr[2] = "홍개발";
	      
	      //배열 항목의 값을 읽고 출력
	      for(int i=0; i<arr.length;i++) {
	         System.out.println(arr[i]);
	      }
	      
	      System.out.println(arr[0]=="자바");
	      System.out.println(arr[0].equals("자바"));
	      
		
	}
	

}
