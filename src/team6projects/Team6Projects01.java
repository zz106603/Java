package team6projects;

import java.util.Scanner;

public class Team6Projects01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String[][] boardArray = new String[100][5];

		int selectNum;	//switch���� ���ǹ�, �Է°�
		int listNum = 1; //�Խñ��� ��ȣ
		String title;
		String content;
		String writer;

		boolean run = true;
		boolean check = false;		//��ġ�ϴ� ��ȣ�� �ִ��� �˻�
		boolean autoMenu = false;	//��� �ڵ� ��� �˻�


		while(run){
			if(autoMenu == true) {	//����� �ڵ����� ����ؾ� �� ��
				selectNum = 1;
			}else {
				System.out.println();
				System.out.println("--------------------------------------------------------------------------");
				System.out.println("1.��� | 2.����(Create) | 3.�б�(Read) | 4.����(Update) | 5.����(Delete) | 6.����");
				System.out.println("--------------------------------------------------------------------------");
				System.out.print("�޴� ���� : ");

				selectNum = Integer.parseInt(scan.nextLine());
			}

			switch (selectNum){
			case 1:
				System.out.println("1.���> ");
				System.out.println("---------------------------------------------------");
				System.out.println("��ȣ    ����    ����    �۾���    ��ȸ��");
				System.out.println("---------------------------------------------------");

				for(int i=0; i<boardArray.length; i++) {	//���
					if(boardArray[i][0] != null) {	//��ȣ�� �����ϸ� ���
						System.out.println(boardArray[i][0] + "\t" +
								boardArray[i][1] + "\t" +
								boardArray[i][2] + "\t" +
								boardArray[i][3] + "\t" +
								boardArray[i][4]);
					}
				}

				autoMenu = false;
				break;
				
			case 2:
				System.out.println("2.����> ");

				System.out.print("���� : ");
				title = scan.nextLine();
				System.out.print("���� : ");
				content = scan.nextLine();
				System.out.print("�۾��� : ");
				writer = scan.nextLine();

				String[] newBoard = {	//�迭�� �����ϰ� 
						String.valueOf(listNum),
						title,
						content,
						writer,
						String.valueOf(0)
				};

				for(int i =0;i<boardArray.length;i++) {		//����
					if(boardArray[i][0] == null) { //null ��ġ�� ã�Ƽ� ����
						boardArray[i] = newBoard;
						listNum++;
						break;
					}
				}
				
				/*
				 	4
				 	null ex)5 ����
				 	null  
				 	1
				 	-> ���� null ���� ������ �Ǿ��ֱ� ������ ó�� null�� �������� ������ ������ ���ָ� ��.
				 	   ���� null�� ������ ���� break�� �ݺ��� ����
				 		
				 	��� :	5
				 			4
				 			null
				 			1
				 */
				for(int i=0; i<boardArray.length; i++) {	//����
					if(boardArray[i][0] == null) {
						break;
					}
					for(int j=0; j<i+1; j++) { //������ġ ���� ������ġ ���� ���Ͽ� ��ü
						if(Integer.parseInt(boardArray[i][0]) > Integer.parseInt(boardArray[j][0])) {
							String[] temp = boardArray[i];
							boardArray[i] = boardArray[j];
							boardArray[j] = temp;
						
						}
					}
				}

				autoMenu = true;
				break;
				
			case 3:	
				System.out.println("3.�б�> ");
				System.out.print("�۹�ȣ�� �Է��ϼ��� : ");
				int readNum = Integer.parseInt(scan.nextLine());

				for (int i = 0; i < boardArray.length; i++) {
					if(boardArray[i][0] == null){	//��ȣ�� ã�������� �ݺ��� ����
						continue;
					}
					if (readNum == Integer.parseInt(boardArray[i][0])) {
						System.out.println("����: " + boardArray[i][1]);
						System.out.println("����: " + boardArray[i][2]);
						System.out.println("�۾���: " + boardArray[i][3]);
						boardArray[i][4] = String.valueOf(Integer.parseInt(boardArray[i][4])+1);
						System.out.println("��ȸ��: " + boardArray[i][4]);
						check = true;
						break;
					}
				}

				if(check == false) {
					System.out.println("���� �Խñ��� �����ϴ�.");
				}else {
					check = false;
				}

				autoMenu = false;
				break;
				
			case 4:
				System.out.println("4.����>");
				System.out.println("�۹�ȣ�� �Է��ϼ��� : ");
				int updatetNum = Integer.parseInt(scan.nextLine());

				String updateTitle;
				String updateContent;
				
				for (int i = 0; i < boardArray.length; i++) {
					if(boardArray[i][0] == null){	//��ȣ�� ã�������� �ݺ��� ����
						continue;
					}
					if (updatetNum == Integer.parseInt(boardArray[i][0])) {
						System.out.println("���� ����: " + boardArray[i][1]);
						System.out.print("������ ����: ");
						updateTitle = scan.nextLine();
						System.out.println("���� ����: " + boardArray[i][2]);
						System.out.print("������ ����: ");
						updateContent = scan.nextLine();
						
						//���� ������쿡 ���ο� �� ����
						if(updateTitle.length() != 0) {
							boardArray[i][1] = updateTitle;
						}
						if(updateContent.length() != 0) {
							boardArray[i][2] = updateContent;
						}
						System.out.println("�����Ǿ����ϴ�.");
						check = true;
						break;
					}
				}

				if(check == false) {
					System.out.println("������ �Խñ��� �����ϴ�.");
				}else {
					check = false;
				}

				autoMenu = true;
				break;
				
			case 5:
				System.out.println("5.����>");
				System.out.println("�۹�ȣ�� �Է��ϼ��� : ");
				int deleteNum = Integer.parseInt(scan.nextLine());

				for (int i = 0; i < boardArray.length; i++) {
					if(boardArray[i][0] == null) {	//��ȣ�� ã�������� �ݺ��� ����
						continue;
					}
					if (deleteNum == Integer.parseInt(boardArray[i][0])) {
						for(int j=0; j<boardArray[i].length; j++) {
							boardArray[i][j] = null;
						}
						System.out.println("�����Ǿ����ϴ�.");
						check = true;
						break;
					}
				}

				if(check == false) {
					System.out.println("������ �Խñ��� �����ϴ�.");
				}else {
					check = false;
				}
				
				autoMenu = true;
				break;
				
			case 6:
				System.out.println("���α׷��� ����");
				run = false;
				break;
				
			default:
				System.out.println("��Ȯ�� ��ȣ�� �Է����ּ���.");
				break;
			}

		}
	}

}
