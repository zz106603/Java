package ch06.exam13;

public class Singleton {
	
	private static Singleton singleton = new Singleton();
	//static을 빼면 인스턴수 변수가 되기 때문에 객체가 선언되어야 함.
	//따라서 getInstance에서 에러 발생
	
	
	Singleton() {
		
	}
	
	/* 외부에서 객체생성 못하게 막음
	private Singleton() {
		
	}
	 */

	static Singleton getInstance() {	//객체없이 실행될 수 있어야 해서 static
		return singleton; //항상 똑같은 번지가 리턴
	}
}
