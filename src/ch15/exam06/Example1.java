package ch15.exam06;

import java.util.NavigableSet;
import java.util.TreeSet;

public class Example1 {

	public static void main(String[] args) {
		
		TreeSet<String> set = new TreeSet<String>();
		
		set.add("ȫ�浿");
		set.add("���ڹ�");
		set.add("�浹��");
		set.add("����ȯ");
		
		for(String item : set) {
			System.out.println(item);
		}
		System.out.println();
		NavigableSet<String> nset = set.descendingSet();
		for(String item : nset) {
			System.out.println(item);
		}
		System.out.println();
		NavigableSet<String> sset = set.subSet("��", false, "�浹��", false);
		for(String item : sset) {
			System.out.println(item);
		}
	}

}

