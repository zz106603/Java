package ch07.exam03;

public class Child extends Parent{
	//Field
	public int field2;
	
	//Constructor
	public Child(String firstName) {
		super("��", firstName);
		System.out.println("child ������");
	}
	
	//Method
	public void method2() {
		System.out.println("method2() ����");
	}
	
	//�������̵� (������)
	@Override
	public void sound() {
		System.out.println("�Ⱦ��~~");
	}
	
}
