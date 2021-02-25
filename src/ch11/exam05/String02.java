package ch11.exam05;

import java.util.StringTokenizer;

public class String02 {

	public static void main(String[] args) {

		String ssn = "123456-1234567";
		
		char sex = ssn.charAt(7);
		if(sex == '1' || sex == '3') {
			System.out.println("����");
		}else {
			System.out.println("����");
		}

		//�и��ϱ� : ���1
		String first = ssn.substring(0, 6);
		System.out.println(first);
		String second = ssn.substring(7);
		System.out.println(second);
		
		//�и��ϱ� : ���2
		String[] parts = ssn.split("-");
		System.out.println(parts[0]);
		System.out.println(parts[1]);
		
		//�и��ϱ� : ���3
		StringTokenizer st = new StringTokenizer(ssn, "-");
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}
		
		
		
		//���� ����(���1)
		String content = "�̰��� �ڹ� å�Դϴ�.";
		boolean result = content.contains("�ڹ�");
		System.out.println(result);
		
		//���� ����(���2)
		int index = content.indexOf("�ڹ�");
		if(index != 1) {
			System.out.println("�ڹ� ���� å");
		}else {
			System.out.println("�ڹ� ���� å�� �ƴ�");
		}
		
		//���ڿ��� ����
		int length = content.length();
		System.out.println(length);
		
		//��ġ�ϱ�
		String modifiedContent = content.replace("�ڹ�", "Java");
		System.out.println(modifiedContent);
		
				
	}

}
