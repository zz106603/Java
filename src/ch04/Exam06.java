package ch04;

public class Exam06 {

	public static void main(String[] args) {
	
		
		
		for(int i=0; i<5; i++) {
			System.out.println("Hello");
		}
		
		
		//-------------------------------------
		
		for(int i=1; i<5; i++) {
			for(int j=5-i-1; j>0; j--) {
				System.out.print(" ");
			}
			for(int k=1; k<=i*2-1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=3; i>0; i--) {
			for(int k=5-i-1; k>0; k--) {
				System.out.print(" ");
			}
			for(int j=i*2-1; j>0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
