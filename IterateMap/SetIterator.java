package IterateMap;

import java.util.HashSet;
import java.util.Set;

public class SetIterator {
public static void main(String[] args) {
	Set<String>set=new HashSet<String>();
	set.add("aaaa");
	set.add("bbb");
	set.add("vvv");
	set.add("cccc");
	System.out.println(set);
	for (String string : set) {
		System.out.println(string);
	}
}
}
