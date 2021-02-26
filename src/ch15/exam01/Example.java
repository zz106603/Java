package ch15.exam01;

import java.util.ArrayList;
import java.util.List;

public class Example {

	public static void main(String[] args) {
		
		List list = new ArrayList();
		
		list.add("ȫ�浿");
		list.add(3);
		list.add(new Board());
		System.out.println(list.size());
		
		String name = (String)list.get(0);
		int value = (Integer)list.get(1); //auto unboxing
		Board board = (Board)list.get(2);
				
		list.remove(0);
		list.remove(0);
		System.out.println(list.size());

	}

}
