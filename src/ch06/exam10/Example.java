package ch06.exam10;

public class Example {

	public static void main(String[] args) {
		Changer changer = new Changer();
		
		//call by value(값을 복사해서 호출)
		int value = 1;
		changer.change(value);
		System.out.println(value);
		
		String value2 = "A";
		changer.change(value2);
		System.out.println(value2);
		
		int[] arr = {0, 0, 0};
		changer.change(arr);
		System.out.println(arr[0]);
		
		String[] arr2 = {"C", "D", "E"};
		changer.change(arr2);
		System.out.println(arr2[0]);
		
		Member member = new Member();
		changer.change(member);
		System.out.println(member.age);
		
		
	}

}
