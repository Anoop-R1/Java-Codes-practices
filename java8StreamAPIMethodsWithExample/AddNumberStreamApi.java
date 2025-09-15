package java8StreamAPIMethodsWithExample;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AddNumberStreamApi {
	public static void main(String[] args) {
		ArrayList<Integer>listofmarks=new ArrayList<Integer>();
		listofmarks.add(55);
		listofmarks.add(43);
		listofmarks.add(30);
		listofmarks.add(35);
		listofmarks.add(20);
		System.out.println("List of marks"+listofmarks);
		// we can print each element of the list  listofmarks.stream().forEach(System.out::println);
		//List<Integer>collect=listofmarks.stream().map(i->i+4).collect(Collectors.toList());
		//count()Long collect=listofmarks.stream().count();
		//sorted()List<Integer>collect =listofmarks.stream().sorted().collect(Collectors.toList());
		//sorted(Comparator)List<Integer>collect = listofmarks.stream().sorted((i1,i2)->((i1<i2)?1:(i1>i2)?-1:0)).collect(Collectors.toList());
		//min(Comparator)Gives minimum element of the stream---Integer collect = listofmarks.stream().min(Integer::compare).get();
		//System.out.println(collect);
	}
}
