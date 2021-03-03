package ch15.exam09;

import java.util.Stack;

public class Example {

	public static void main(String[] args) {
		
		Stack<String> st = new Stack<>();
		st.push("ȫ�浿");
		st.push("ȫ�漭");
		st.push("ȫ�泲");

		while(!st.isEmpty()){
			System.out.println(st.pop());
		}
	}

}
