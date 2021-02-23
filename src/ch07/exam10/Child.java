package ch07.exam10;

public class Child extends Parent{
	//Field
	public int field2;
	
	//Constructor

	//Method
	@Override
	public void method2() {
		System.out.println("child : method02 호출");
	}
	
	public void method3() {
		System.out.println("child : method03 호출");
	}
	
}
