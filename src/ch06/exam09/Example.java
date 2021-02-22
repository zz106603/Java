package ch06.exam09;

public class Example {

	public static void main(String[] args) {

		Calculator cal = new Calculator();
		
		double result1 = cal.area(10);
		double result2 = cal.area(10, 30);
		double result3 = cal.areaCircle(10);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);

	}

}
