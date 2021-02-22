package ch6homework.examples.exam12;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.keyTurnOn();
		myCar.run();
		int speed = myCar.getSpeed();
		System.out.println(speed + "km/h");

	}

}
