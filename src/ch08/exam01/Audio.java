package ch08.exam01;

public class Audio implements RemoteControl{

	@Override
	public void turnOn() {
		System.out.println("audio ÄÑ±â");
		
	}
	
	@Override
	public void turnOff() {
		System.out.println("audio ²ô±â");
		
	}
	
	@Override
	public void setVolume(int volume) {
		System.out.println("audio º¼·ýÀ»" + volume + "·Î Á¶Àý");
		
	}
}
