package ch11homework.problems.Exercise08;

import java.util.StringTokenizer;

public class SplitExample {

	public static void main(String[] args) {
		
		String str = "���̵�,�̸�,�н�����";
		
		StringTokenizer st = new StringTokenizer(str, ",");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		System.out.println();
		String[] s = str.split(",");
		for(int i=0; i<s.length; i++) {
			System.out.println(s[i]);
		}
				

	}

}
