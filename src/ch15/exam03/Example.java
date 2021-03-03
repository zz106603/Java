package ch15.exam03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Example {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>();
		
		set.add("ȫ�浿");
		set.add("���ڹ�");
		set.add("ȫ�浿");
		set.add("�ܿ���");
		
		System.out.println(set.size());
		
		for(String item : set) {
			System.out.println(item);
		}
		
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
