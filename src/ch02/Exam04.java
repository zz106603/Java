package ch02;

public class Exam04 {

	public static void main(String[] args) {
		
		
		// 문자열 -> 숫자(정수, 실수)
		
		//문자열은 String 타입 변수에 저장
		
		String str1 = "10";
		System.out.println(str1);

		String str2 = str1 + 5;
		System.out.println(str2);
		
		int num1 = Integer.parseInt(str1) + 5;
		System.out.println(num1);
		
		double num2 = Double.parseDouble(str1) + 2.3;
		System.out.println(num2);
		
		int num3 = 3;
		String str3 = String.valueOf(num3);
		System.out.println(str3);
		
		
	}

}
