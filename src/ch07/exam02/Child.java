package ch07.exam02;

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
	
}
