package ch6homework.examples.exam18;

public class SingletonExample {

	public static void main(String[] args) {
		
		/*
		 	Singleton o1 = new Singleton();
		 	Singleton o2 = new Singleton(); 
		 	����
		 */
		Singleton o1 = Singleton.getInstance();
		Singleton o2 = Singleton.getInstance();
		
		if(o1 == o2) {
			System.out.println("����");
		}else {
			System.out.println("�ٸ���");
			
		}

	}

}
