package ch07.exam03;

public class Child extends Parent{
	//Field
	public int field2;
	
	//Constructor
	public Child(String firstName) {
		super("김", firstName);
		System.out.println("child 생성자");
	}
	
	//Method
	public void method2() {
		System.out.println("method2() 실행");
	}
	
	//오버라이딩 (재정의)
	@Override
	public void sound() {
		System.out.println("싫어요~~");
	}
	
}
