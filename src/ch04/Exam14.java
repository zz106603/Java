package ch04;

import java.util.Scanner;

public class Exam14 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);


		while(true) {

			System.out.print("입력 : ");
			String data = input.nextLine();

			System.out.println("출력 : " + data);


			if(data.equals("점심시간")) {
				break;
			}
		}


	}

}
