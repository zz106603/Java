package ch15.exam09;

import java.util.LinkedList;
import java.util.Queue;

public class Example2 {

	public static void main(String[] args) {
		
		Queue<String> qu = new LinkedList<>();
		
		qu.offer("ȫ�浿");
		qu.offer("ȫ�漭");
		qu.offer("ȫ�泲");
		
		while(!qu.isEmpty()) {
			System.out.println(qu.poll());
		}

	}

}
