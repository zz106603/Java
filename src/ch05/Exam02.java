package ch05;

import java.util.Arrays;

public class Exam02 {

	public static void main(String[] args) {
		
		//���� �����ϸ鼭 �� ��� ����
		int[] scores1 = {90, 85, 95};
		System.out.println(scores1[0]);
		System.out.println(scores1[1]);
		System.out.println(scores1[2]);
		
		//���� ���� �� �� ��� ����
		int[] scores2 = null;
		scores2 = new int[] {90,85,95};

		add(scores1);
		add(new int[] {100,200,300});
	}
	
	public static void add(int[] arr) {
		System.out.println("�� : " + Arrays.toString(arr));
	}

}
