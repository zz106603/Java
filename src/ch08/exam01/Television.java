package ch08.exam01;

public class Television implements RemoteControl{

	public void turnOn() {
		System.out.println("tv �մϴ�.");
	}
	public void turnOff() {
		System.out.println("tv ���ϴ�.");
		
	}
	public void setVolume(int volume) {
		System.out.println("������ " + volume +"���� ����");
	}
}
