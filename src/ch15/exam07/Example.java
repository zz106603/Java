package ch15.exam07;

import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Example{

	public static void main(String[] args) {
		
		TreeSet<Person> set = new TreeSet<>();
		
		set.add(new Person("ȫ�浿", 27));
		set.add(new Person("���ڹ�", 30));
		set.add(new Person("���ڹ�", 28));
		
		for(Person p : set) {
			System.out.println(p.name + "," + p.age);
		}

		////////////////////////////////////////////////
		
		TreeMap<Person, Integer> map = new TreeMap<>();
		map.put(new Person("ȫ�浿", 27), 95);
		map.put(new Person("���ڹ�", 30), 80);
		map.put(new Person("���ڹ�", 28), 90);
		
		Set<Person> keys = map.keySet();
		for(Person p : keys) {
			System.out.println(p.name + "," + p.age + ":" + map.get(p));
		}
	}
	

}
