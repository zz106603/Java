package ch06.exam11;

public class Example {

	public static void main(String[] args) {
		//�ν��Ͻ� ���(�ʵ�, �޼ҵ�)�� �ݵ��
		//��ü ���� ������ ���ؼ� ����
		
		User user = new User("����ȯ");
		user.login();
		user.logout();
		
		//���� ���(�ʵ�, �޼ҵ�)�� ��ü�� ���̵� ��� ����
		
		System.out.println(User.nation);
		User.info();

	}

}
