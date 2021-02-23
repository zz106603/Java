package ch07.exam02;

public class Parent {
	//Field
	public String lastName;
	public String firstName;
	
	//Constructor
	public Parent(String lastName, String firstName) {
		this.lastName = lastName;
		this.firstName = firstName;
		System.out.println("parent 생성자");
	}
	//Method
	public void method1() {
		System.out.println("method1() 실행");
	}
}
