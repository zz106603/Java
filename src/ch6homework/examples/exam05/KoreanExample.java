package ch6homework.examples.exam05;

public class KoreanExample {

	public static void main(String[] args) {
		Korean k1 = new Korean("박자바", "123-456");
		System.out.println(k1.name);
		System.out.println(k1.ssn);
		
		Korean k2 = new Korean("정자바", "789-123");
		System.out.println(k2.name);
		System.out.println(k2.ssn);
		
		

	}

}
