package ch10.exam07;

public class Example {

	public static void main(String[] args) {


		try {
			method();
		}catch(Exception e) {
			//���� �޽��� �� ����ó�� �� �� ���
			String message = e.getMessage();
			System.out.println(message);
			//����� �� �� ����� �� �ִ� ���� ����
			System.out.println(e.toString());
			e.printStackTrace();
		}

	}

	public static void method() throws NoAccountException{
		throw new NoAccountException("�Ա� ���°� �����ϴ�.");
	}

}
