package ch05;

import java.util.Arrays;

public class Exam12 {

	public static void main(String[] args) {
	
		
		Season nowSeason = Season.WINTER;
		
		if(nowSeason == Season.SUMMER) {
			System.out.println("�´�");
		}else {
			System.out.println("�ƴϴ�");
		}
		
		System.out.println(nowSeason);
		
		
		LoginResult loginResult = LoginResult.SUCCESS;
		if(loginResult == LoginResult.SUCCESS) {
			System.out.println("����");
		}else if(loginResult == LoginResult.FAILURE_ID) {
			System.out.println("���̵� ���Է�");
		}else {
			System.out.println("��й�ȣ ���Է�");
		}
		
	}
	
	

}
