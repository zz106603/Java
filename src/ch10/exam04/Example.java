package ch10.exam04;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] arr = new String[3];
				
				
		while(true) {
			try {
				System.out.print("���� ��ġ : ");
				int index = Integer.parseInt(scanner.nextLine());
				
				System.out.print("������ �� : ");
				arr[index] = scanner.nextLine();
				
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("���ڸ� ����");
			}catch(Exception e){
				System.out.println("0~" + (arr.length-1) + "���� �����մϴ�.");
			}finally {
				System.out.println("�ٽ� �Է��ϼ���");
			}
		}
	}

}
