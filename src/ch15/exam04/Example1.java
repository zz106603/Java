package ch15.exam04;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Example1 {

	public static void main(String[] args) {
		
		//Map 생성
		Map<String, String> map = new HashMap<>();
		
		//Entry 저장
		map.put("s1", "asd");
		map.put("s2", "qwe");
		map.put("s3", "zxc");
		System.out.println(map.size());
		
		//key의 값 가져오기
		String s1 = map.get("s1");
		System.out.println(s1);
		
		//반복 처리
		//map에는 iterable이 되어있지 않아 포문사용 불가능
		Set<Entry<String,String>> set = map.entrySet();
		for(Entry<String,String> e : set) {
			System.out.println("key : " + e.getKey() + " value : " + e.getValue());
		}
		
		System.out.println();
		Set<String> set2 = map.keySet();
		for(String key : set2) {
			String value = map.get(key);
			System.out.println("key : " + key + " value : " + value);
		}
		
		//삭제
		map.remove(s1);
		map.clear();
		
		
		

	}

}
