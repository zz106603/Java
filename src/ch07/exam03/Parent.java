package ch07.exam03;

public class Parent {
	//Field
	public String lastName;
	public String firstName;
	
	//Constructor
	public Parent(String lastName, String firstName) {
		this.lastName = lastName;
		this.firstName = firstName;
		System.out.println("parent ������");
	}
	//Method
	public void sound() {
		System.out.println("�����ض�~~");
	}
}
