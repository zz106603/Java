package ch12.exam01;

public class NetworkTesk implements Runnable{

	@Override
	public void run() {
		while(true) {
			System.out.println("네트워크 통신을 합니다.");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
