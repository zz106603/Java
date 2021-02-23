package ch08.exam02;

public class Example {

	public static void method(RemoteControl rc) {
		//인터페이스의 설명대로만 사용하는 코드
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(20);
	}
	
	public static void main(String[] args) {
		
		RemoteControl rc1 = new Television();
		RemoteControl rc2 = new Audio();
		
		rc1.turnOn();
		rc1.turnOff();
		rc1.setVolume(20);
		
		rc2.turnOn();
		rc2.turnOff();
		rc2.setVolume(50);
		
		method(new Television());
		method(new Audio());
		
		

	}

}

