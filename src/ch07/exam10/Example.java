package ch07.exam10;

public class Example {

	public static void main(String[] args) {
		
		Parent parent = new Child();
		
		parent.field1 = 5;
		parent.method1();
		parent.method2();
		//parent.method3();
		
		Child child = (Child) parent;
		
		child.field1 = 5;
		child.method1();
		child.method2();
		child.method3();
		
	}

}
