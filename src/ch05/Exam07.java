package ch05;

import java.util.Arrays;

public class Exam07 {

	public static void main(String[] args) {
		
		String[] arr =new String[3];
	      for(int i=0; i<arr.length;i++) {
	         System.out.println(arr[i]);
	      }
	      
	      arr[0] = "�ڹ�";
	      arr[1] = "ȫ�浿";
	      arr[2] = "ȫ����";
	      
	      //�迭 �׸��� ���� �а� ���
	      for(int i=0; i<arr.length;i++) {
	         System.out.println(arr[i]);
	      }
	      
	      System.out.println(arr[0]=="�ڹ�");
	      System.out.println(arr[0].equals("�ڹ�"));
	      
		
	}
	

}
