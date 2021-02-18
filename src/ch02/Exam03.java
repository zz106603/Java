package ch02;

public class Exam03 {

	public static void main(String[] args) {
		
		//int 타입 이하의 피연산자의 연산은 결과가 int
		byte var1 = 10;
		byte var2 = 20;
		int result = var1 + var2;
		System.out.println(result);
		
		//int 타입 이상의 피연산자의 연산은 결과가 큰 타입
		int var3 = 10;
		long var4 = 20;
		long result2 = var3 + var4;
		System.out.println(result2);
		
		int var5 = 10;
		double var6 = 1.5;
		double result3 = var5 + var6;
		System.out.println(result3);

	}

}
