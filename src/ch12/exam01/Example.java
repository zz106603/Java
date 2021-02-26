package ch12.exam01;

public class Example {

	public static void main(String[] args) {
		
		System.out.println("���� ������ ����");
		
		//��Ʈ��ũ �۾��� �ϴ� ������ ������ ����
		Thread thread1 = new Thread(new NetworkTesk());
		thread1.start();
		
		//���� �۾��� �ϴ� ������ ������ ����
		Thread thread2 = new Thread(new MusicTesk());
		thread2.start();
		
		//ä�� �۾��� �ϴ� ������ ������ ����
		Thread thread3 = new Thread(new Runnable() { //�͸� ���� Ŭ����
			@Override
			public void run() {
				System.out.println("ä���� �մϴ�.");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}); //�͸� ��ü
		thread3.start();
			
				
		while(true){
			System.out.println("���� �۾��� �մϴ�.");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
		

	}

}
