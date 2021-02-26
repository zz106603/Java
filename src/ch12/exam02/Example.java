package ch12.exam02;

public class Example {

	public static void main(String[] args) {

		System.out.println("메인 스레드 시작");

		//네트워크 작업을 하는 스레드 생성과 실행
		Thread thread1 = new NetworkTesk();
		thread1.start();

		//음악 작업을 하는 스레드 생성과 실행
		Thread thread2 = new MusicTesk();
		thread2.start();

		//채팅 작업을 하는 스레드 생성과 실행
		//Thread를 상속해서 하위클래스를 가지고 객체를 만듬
		Thread thread3 = new Thread(){ 	//익명 자식 객체
			@Override
			public void run() {
				System.out.println("채팅을 합니다.");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}; //익명 객체
		thread3.start();


		while(true){
			System.out.println("메인 작업을 합니다.");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}




	}

}
