package ch08.exam02;

public class Television implements RemoteControl{
	private int volume;
	
	public void turnOn() {
		System.out.println("tv �մϴ�.");
	}
	public void turnOff() {
		System.out.println("tv ���ϴ�.");
		
	}
	public void setVolume(int volume) {
		if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}
		
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}
		
		
		System.out.println("������ " + this.volume +"���� ����");
	}
}
