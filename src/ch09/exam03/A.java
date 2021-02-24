package ch09.exam03;

//로컬 클래스 접근 제한
public class A {
	public void method(int x) {
		int y = 2;
		
		//x = 10;
		//y = 20;
		//불가능
		
		class B{
			public void method() {
				int result = x + y;
				System.out.println(result);
			}
		}
	}
}
