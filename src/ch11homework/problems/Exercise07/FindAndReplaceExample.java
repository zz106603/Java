package ch11homework.problems.Exercise07;

public class FindAndReplaceExample {

	public static void main(String[] args) {
		
		String str = "모든 프로그램은 자바 언어로 개발될 수 있다.";
		
		int index = str.indexOf("자바");
		
		if(index != -1) {
			System.out.println("자바 문자열을 Java문자열로 바꿉니다.");
			String result = str.replace("자바", "Java");
			System.out.println(result);
		}else {
			System.out.println("자바 문자열이 없습니다.");
		}

	}

}
