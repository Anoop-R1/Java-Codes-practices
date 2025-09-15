package java8StreamAPIMethodsWithExample;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Evennumber {
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(12);
		a.add(19);
		a.add(18);
		a.add(15);
		System.out.println(a);

		List<Integer> a1 = a.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println(a1);
	}
}