package ch06.exam02;

public class Example {

	public static void main(String[] args) {
		
		Car myCar = new Car();
		System.out.println(myCar.company);
		System.out.println(myCar.model);
		System.out.println(myCar.price);
		System.out.println(myCar.old);
		System.out.println(myCar.speed);
		
		myCar.company = "현대";
		myCar.model = "그랜저";
		myCar.price = 30000000;
		myCar.old = true;
		myCar.speed = 150;
				
				
		System.out.println(myCar.company);
		System.out.println(myCar.model);
		System.out.println(myCar.price);
		System.out.println(myCar.old);
		System.out.println(myCar.speed);
		
		Car yourCar = new Car();
	}

}
