package ch06.exam13;

public class Example {

	public static void main(String[] args) {
		
		
		//�����ڸ� �̿��ؼ� ��ü ���
		//private�� �⺻�����ڰ� �Ǹ� new�� ���� �Ұ�
		Singleton result1 = new Singleton();
		
		//Factory Method �̿��ؼ� ��ü ���
		Singleton result2 = Singleton.getInstance();
		Singleton result3 = Singleton.getInstance();
		
		if(result2 == result3) {
			System.out.println("����");
		}else {
			System.out.println("�ٸ���");
		}

	}

}
