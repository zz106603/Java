package ch06.exam13;

public class Example {

	public static void main(String[] args) {
		
		
		//생성자를 이용해서 객체 얻기
		//private로 기본생성자가 되면 new로 선언 불가
		Singleton result1 = new Singleton();
		
		//Factory Method 이용해서 객체 얻기
		Singleton result2 = Singleton.getInstance();
		Singleton result3 = Singleton.getInstance();
		
		if(result2 == result3) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}

	}

}
