package ch04;

public class Exam05 {

	public static void main(String[] args) {
		//�ֻ����� ���� ������ �� ���
		
		/*
		  0 <= Math.random() < 1 
		*/
		
		double temp = Math.random();
		
		System.out.println(temp);
		System.out.println(temp * 6);
		System.out.println((int)(temp * 6));
		System.out.println((int)(temp * 6) + 1);
		
		
		int num = (int)(Math.random()*10 + 1);
		System.out.println(num);		
		if(num%2 == 0) {
			System.out.println("¦��");
		}else {
			System.out.println("Ȧ��");
		}

	}

}
