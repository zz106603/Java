package ch6homework.examples.exam19;

public class PersonExample {

	public static void main(String[] args) {
		Person p1 = new Person("123456-2134567", "계백");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		p1.name = "을지문덕";

	}

}
