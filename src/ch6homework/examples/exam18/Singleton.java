package ch6homework.examples.exam18;

public class Singleton {

	private static Singleton singleton = new Singleton();
	
	private Singleton() {
		
	}
	
	static Singleton getInstance() {
		return singleton;
	}
}
