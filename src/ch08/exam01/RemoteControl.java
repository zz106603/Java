package ch08.exam01;

public interface RemoteControl {
	//���
	String COMPANY = "�Ｚ";
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 1;
	//�޼ҵ�(��ü ��� ����)
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
}
