package ch15.exam06;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Example2 {

	public static void main(String[] args) {
		
		TreeMap<String,String> map = new TreeMap<String,String>();
		
		map.put("s1", "¹Ú±æ¼ø");
		map.put("s3", "Á¤À±È¯");
		map.put("s4", "Á¶¹Î»ó");
		map.put("s5", "µğÀÚÀÌ³Ê");
		map.put("s2", "±è¸íÈÖ");
		
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

