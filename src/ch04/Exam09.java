package ch04;

public class Exam09 {

	public static void main(String[] args) {
		
		boolean stop = false;
		int count = 0;
		while(!stop) {
			System.out.println("Hello");
			count++;
			
			if(count > 10) {
				break;
			}
		}
		
		count = 0;
		//----------------------------
		while(count < 10) {
			System.out.println("Hi");
			count++;

		}

	}

}
