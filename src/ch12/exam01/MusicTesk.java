package ch12.exam01;

public class MusicTesk implements Runnable{

	@Override
	public void run() {
		while(true) {
			System.out.println("음악을 연주합니다.");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
