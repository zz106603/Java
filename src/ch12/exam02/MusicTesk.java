package ch12.exam02;

public class MusicTesk extends Thread{

	@Override
	public void run() {
		while(true) {
			System.out.println("������ �����մϴ�.");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
