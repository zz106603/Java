package ch11homework.problems.Exercise07;

public class FindAndReplaceExample {

	public static void main(String[] args) {
		
		String str = "��� ���α׷��� �ڹ� ���� ���ߵ� �� �ִ�.";
		
		int index = str.indexOf("�ڹ�");
		
		if(index != -1) {
			System.out.println("�ڹ� ���ڿ��� Java���ڿ��� �ٲߴϴ�.");
			String result = str.replace("�ڹ�", "Java");
			System.out.println(result);
		}else {
			System.out.println("�ڹ� ���ڿ��� �����ϴ�.");
		}

	}

}
