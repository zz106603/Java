package ch04;

public class Exam04 {

	public static void main(String[] args) {

		char grad = 'A';

		switch(grad) {
			case 'A' :
				System.out.println("Ŀ�Ǹ� �����մϴ�.");
				//break;
			case 'B' : 
				System.out.println("���� �ϳ��� �ݴϴ�.");
				break;
			case 'C' :
				System.out.println("�λ縸 �մϴ�.");
				break;
			default :
				System.out.println("�Ű澲�� �ʽ��ϴ�.");
			}
		
		//-----------------------------------------------
		
		if(grad == 'A') {
			System.out.println("Ŀ�Ǹ� �����մϴ�.");
			System.out.println("���� �ϳ��� �ݴϴ�.");
		}else if(grad == 'B') {
			System.out.println("���� �ϳ��� �ݴϴ�.");
		}else if(grad == 'C') {
			System.out.println("�λ縸 �մϴ�.");
		}else {
			System.out.println("�Ű澲�� �ʽ��ϴ�.");
		}
	}

}
