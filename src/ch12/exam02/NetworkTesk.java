package ch12.exam02;

public class NetworkTesk extends Thread{

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
