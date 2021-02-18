package ch04;

public class Exam05 {

	public static void main(String[] args) {
		//주사위를 던져 나오는 수 얻기
		
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
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}

	}

}
