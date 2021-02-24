package ch09.exam02;

public class Example {

	public static void main(String[] args) {
		A a = new A();
		
		A.B b = a.new B();
		b.field = 10;
		b.method();
		
		
		A.C c = new A.C();	//static
		c.field = 10;
		c.method();
		
		
		
		

	}

}
