package ch08.exam03;

public class Car implements Shipable, Flyable{

	@Override
	public void sailing() {
		System.out.println("sailing");
		
	}
	
	@Override
	public void anchor() {
		System.out.println("anchor");
		
	}
	
	@Override
	public void takeOff() {
		System.out.println("�̷�");
		
	}
	
	@Override
	public void fly() {
		System.out.println("����");
		
	}
	
	@Override
	public void land() {
		System.out.println("����");
		
	}
}
