package ch04;

import java.util.Scanner;

public class Exam16 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);


		while(true) {
			System.out.print("숫자1 : ");
			int num1 = Integer.parseInt(input.nextLine());
			
			System.out.print("숫자2 : ");
			int num2 = Integer.parseInt(input.nextLine());
			
			if(num1 == 0 && num2 == 0) {
				break;
			}
			
			int result = num1 + num2;
			System.out.println("결과 : "+result);
			
			
		}


	}

}
