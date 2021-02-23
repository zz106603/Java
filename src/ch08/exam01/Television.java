package ch08.exam01;

public class Television implements RemoteControl{

	public void turnOn() {
		System.out.println("tv ÄÕ´Ï´Ù.");
	}
	public void turnOff() {
		System.out.println("tv ²ü´Ï´Ù.");
		
	}
	public void setVolume(int volume) {
		System.out.println("º¼·ýÀ» " + volume +"À¸·Î ¼³Á¤");
	}
}
