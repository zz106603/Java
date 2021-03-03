package ch15.exam06;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Example2 {

	public static void main(String[] args) {
		
		TreeMap<String,String> map = new TreeMap<String,String>();
		
		map.put("s1", "�ڱ��");
		map.put("s3", "����ȯ");
		map.put("s4", "���λ�");
		map.put("s5", "�����̳�");
		map.put("s2", "�����");
		
		Set<String> keys = map.keySet();
		for(String key : keys) {
			System.out.println("key : " + key + " value : " + map.get(key));
		}
		
		System.out.println();
		keys = map.descendingKeySet();
		for(String key : keys) {
			System.out.println("key : " + key + " value : " + map.get(key));
		}
		
		System.out.println();
		Map<String,String> smap = map.subMap("s3", true, "s5", true);
		keys = smap.keySet();
		for(String key : keys) {
			System.out.println("key : " + key + " value : " + map.get(key));
		}
	}

}

