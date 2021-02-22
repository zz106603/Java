package ch6homework.problems.Exercise15;

public class MemberService {


	boolean login(String id, String password) {

		boolean result;
		if(id.equals("hong") && password.equals("12345")) {
			result = true;
		}else {
			result = false;
		}

		return result;
	}

	void logout(String id) {
		if(id.equals("hong")) {
			System.out.println("로그아웃 되었습니다.");
		}
	}
}
