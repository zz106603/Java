package ch07.exam03;

public class Example {

	public static void main(String[] args) {
		
		Child ch = new Child("��ȯ");
		System.out.println(ch.firstName);
		System.out.println(ch.lastName);
		
		ch.sound();
		ch.method2();

	}

}
