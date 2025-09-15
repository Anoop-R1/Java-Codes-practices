package IterateMap;

import java.util.HashMap;
import java.util.Map;

public class MapIterator {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "qqq");
		map.put(2, "qwww");
		map.put(3, "www");
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			Integer key = entry.getKey();
			String val = entry.getValue();
			System.out.println(key+val);
		}
	}
}
