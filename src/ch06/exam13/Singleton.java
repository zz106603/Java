package ch06.exam13;

public class Singleton {
	
	private static Singleton singleton = new Singleton();
	//static�� ���� �ν��ϼ� ������ �Ǳ� ������ ��ü�� ����Ǿ�� ��.
	//���� getInstance���� ���� �߻�
	
	Singleton() {
		
	}
	
	/*
	private Singleton() {
		
	}
	 */

	static Singleton getInstance() {	//��ü���� ����� �� �־�� �ؼ� static
		return singleton; //�׻� �Ȱ��� ������ ����
	}
}
