package ch4homework.problems;

public class Exercise05 {

	public static void main(String[] args) {

		for(int i=1; i<=10; i++) {
			for(int j=1; j<=10; j++) {
				int temp = (4*i) + (5*j);
				if(temp == 60) {
					System.out.println("(" + i + ", " + j + ")");
				}
			}
		}


	}

}
