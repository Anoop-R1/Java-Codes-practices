package Generics;

import java.util.HashMap;
import java.util.Map;

public class GenericsKeyAndValue {
	public static void main(String[] args) {
		Map<Integer, String>hashmap=new HashMap<Integer, String>();
		hashmap.put(101, "Aaaa");
		hashmap.put(102, "Bbbb");
		hashmap.put(103, "Cccc");
		System.out.println("HashmapElements: ");
		for (Map.Entry entry : hashmap.entrySet()) {
		System.out.print("Key:"+entry.getKey()+" "); ;
			System.out.println("Value:"+entry.getValue());
			
		}
	}
}
