package ch05;

import java.util.Arrays;

public class Exam12 {

	public static void main(String[] args) {
	
		
		Season nowSeason = Season.WINTER;
		
		if(nowSeason == Season.SUMMER) {
			System.out.println("맞다");
		}else {
			System.out.println("아니다");
		}
		
		System.out.println(nowSeason);
		
		
		LoginResult loginResult = LoginResult.SUCCESS;
		if(loginResult == LoginResult.SUCCESS) {
			System.out.println("성공");
		}else if(loginResult == LoginResult.FAILURE_ID) {
			System.out.println("아이디 재입력");
		}else {
			System.out.println("비밀번호 재입력");
		}
		
	}
	
	

}
