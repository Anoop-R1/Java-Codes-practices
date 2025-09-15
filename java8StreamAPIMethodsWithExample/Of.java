package java8StreamAPIMethodsWithExample;

import java.util.ArrayList;
import java.util.stream.Stream;
//create a stream of an array type
public class Of {
	public static void main(String[] args) {
		ArrayList<Integer>listofmks=new ArrayList<Integer>();
		listofmks.add(10);
		listofmks.add(20);
		listofmks.add(30);
		listofmks.add(40);
		listofmks.add(60);
		System.out.println(listofmks);
		//constructor reference
		Integer[] i =listofmks.stream().toArray(Integer[]::new);
		Stream.of(i).forEach(System.out::println);
	}
}
