package ch15homework.problems.Exercise09;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		
		Map<String,Integer> map = new HashMap<String,Integer>();
		
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		
		String name = null;	//최고 점수 아이디
		int maxScore = 0;	//최고 점수
		int totalScore = 0;	//점수 합계
		
		Set<Map.Entry<String,Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String,Integer>> it = entrySet.iterator();
		while(it.hasNext()) {
			Map.Entry<String, Integer> entry = it.next();
			
			totalScore += entry.getValue();
			if(maxScore < entry.getValue()) {
				maxScore = entry.getValue();
				name = entry.getKey();
			}
		}
		
		System.out.println("최고 점수 아이디 : " + name);
		System.out.println("최고 점수 : " + maxScore);
		System.out.println("점수 합계 : " + (totalScore/map.size()));

	}

}
