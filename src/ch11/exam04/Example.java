package ch11.exam04;

public class Example {

	public static void main(String[] args) {
		
		Class var1 = A.class;	//�޼ҵ� ������ ����
		System.out.println(var1);
		
		A a = new A();
		Class var2 = a.getClass();
		System.out.println(var2);

	}

}
