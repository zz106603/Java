package ch08.exam01;

public class Audio implements RemoteControl{

	@Override
	public void turnOn() {
		System.out.println("audio �ѱ�");
		
	}
	
	@Override
	public void turnOff() {
		System.out.println("audio ����");
		
	}
	
	@Override
	public void setVolume(int volume) {
		System.out.println("audio ������" + volume + "�� ����");
		
	}
}
