package ch08.exam02;

public class Audio implements RemoteControl{
	private int volume;

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
		if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}
		
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}
		System.out.println("audio ������" + this.volume + "�� ����");
		
	}
}
