package ch08.exam01;

public class Example {

	public static void main(String[] args) {
		
		RemoteControl rc1 = new Television();
		RemoteControl rc2 = new Audio();
		
		rc1.turnOn();
		rc1.turnOff();
		rc1.setVolume(20);
		
		rc2.turnOn();
		rc2.turnOff();
		rc2.setVolume(50);
		
		

	}

}

