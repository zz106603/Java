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
		
		String name = null;	//�ְ� ���� ���̵�
		int maxScore = 0;	//�ְ� ����
		int totalScore = 0;	//���� �հ�
		
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
		
		System.out.println("�ְ� ���� ���̵� : " + name);
		System.out.println("�ְ� ���� : " + maxScore);
		System.out.println("���� �հ� : " + (totalScore/map.size()));

	}

}
