package ch04;

import java.util.Scanner;

public class Exam15 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);


		while(true) {

			System.out.print("�Է� : ");
			String data = input.nextLine();

			System.out.println("��� : " + data);


			if(data.equals("���ɽð�")) {
				break;
			}
		}


	}

}
