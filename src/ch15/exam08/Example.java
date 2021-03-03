package ch15.exam08;

import java.util.Comparator;
import java.util.Map.Entry;

import ch15.exam07.Person;

import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Example {

	public static void main(String[] args) {
		
		TreeSet<Product> set = new TreeSet<>(new Comparator<Product>() {
			@Override
			public int compare(Product o1, Product o2) {
				if(o1.price > o2.price) {
					return 1;
				}else if(o1 == o2) {
					return 0;
				}else {
					return -1;
				}
				
			}
		});
		set.add(new Product("TV", 10000));
		set.add(new Product("모니터", 5000));
		set.add(new Product("오디오", 12000));
		
		for(Product p : set) {
			System.out.println(p.name + " , " + p.price);
		}

		
		TreeMap<Product, String> map = new TreeMap<>(new Comparator<Product>() {
			@Override
			public int compare(Product o1, Product o2) {
				if(o1.price > o2.price) {
					return 1;
				}else if(o1 == o2) {
					return 0;
				}else {
					return -1;
				}
				
			}
		});
		
		map.put(new Product("TV", 10000), "SAMSUNG");
		map.put(new Product("모니터", 5000), "LG");
		map.put(new Product("오디오", 12000), "GOLDSTAR");
		
		Set<Product> keys = map.keySet();
		for(Product p : keys) {
			System.out.println(p.name + "," + p.price + ":" + map.get(p));
		}
		
	}

}
