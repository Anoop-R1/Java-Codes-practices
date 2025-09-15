package java8StreamAPIMethodsWithExample;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//print odd numbers of a list using Stream API
public class StreamMethodsOddNumber {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(0);
		list.add(5);
		list.add(20);
		list.add(30);
		System.out.println("List of numbers are" + list);
		List<Integer> l = list.stream().filter(i -> i % 2 != 0).collect(Collectors.toList());
		System.out.println("List of Even Numbers are:" + l);
	}
}
