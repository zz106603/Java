package ch09.exam02;

public class A {
	public class B{ //인스턴스 멤버클래스
		public int field;
		public B(){}
		public void method() {}
		
	}
	
	public static class C{
		public int field;
		public C(){}
		public void method() {}
		
	}
	
	public void method() { //메소드 안에서 객체 선언 및 호출이 되어야 함
		class D{
			public int field;
			public D() {}
			public void method() {}
		}
		
		D d = new D();
		d.field = 1;
		d.method();
		
	}
}
