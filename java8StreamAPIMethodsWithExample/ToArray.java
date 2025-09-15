package java8StreamAPIMethodsWithExample;

import java.util.ArrayList;

//To convert stream of objects into an array type
public class ToArray {
	public static void main(String[] args) {
		ArrayList<Integer>listofmks=new ArrayList<Integer>();
		listofmks.add(10);
		listofmks.add(20);
		listofmks.add(30);
		listofmks.add(40);
		listofmks.add(60);
		System.out.println(listofmks);
		//constructor reference
		Integer[]collect=listofmks.stream().toArray(Integer[]::new);
		for(Integer i1:collect) {
		System.out.println(i1);
		}
	}
}
