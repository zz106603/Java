package ch4homework.problems;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {

		boolean run = true;

		int balance = 0;

		Scanner scanner = new Scanner(System.in);

		while(run) {
			System.out.println("--------------------");
			System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
			System.out.println("--------------------");

			System.out.print("����> ");
			int num = scanner.nextInt();

			switch(num) {
				case 1 : 
					System.out.print("���ݾ�> ");
					int input = scanner.nextInt();
					balance += input;
					break;
				case 2 : 
					System.out.print("��ݾ�> ");
					int output = scanner.nextInt();
					balance -= output;
					break;
				case 3 : 
					System.out.println("�ܰ�> " + balance);
					break;
				case 4 : 
					run = false;
					break;
				}
		}

		System.out.println("���α׷� ����");

	}

}
