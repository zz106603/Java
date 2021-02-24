package ch10.exam02;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while(true) {
			try {
				int value = Integer.parseInt(scanner.nextLine());
				System.out.println(value);
			}catch(NumberFormatException e) {
				System.out.println("���ڸ� ����");
				System.out.println("���α׷��� �����մϴ�.");
				return;
			}finally {
				System.out.println("�ٽ� �Է��ϼ���");
			}
		}
	}

}
