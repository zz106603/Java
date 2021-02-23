package ch08.exam04;

public class Example {

	public static void main(String[] args) {
		
		Car car = new Car();
		
		car.t1 = new KumhoTire();
		car.t2 = new KumhoTire();
		car.t3 = new HankookTire();
		car.t4 = new HankookTire();
		
		car.run();

	}

}
