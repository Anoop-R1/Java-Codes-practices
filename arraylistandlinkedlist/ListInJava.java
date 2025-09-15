package arraylistandlinkedlist;

import java.util.ArrayList;
import java.util.List;

public class ListInJava {
	public static void main(String[] args) {
		List<String> al = new ArrayList<String>();
		al.add("Apple");
		al.add("Mango");
		al.add("Orange");
		al.add("Grapes");
		System.out.println("List1 contains: " + al);
		List<String>al2 = new ArrayList<String>();
		al2.add("10"); 
		al2.add("11"); 
		al2.add("12"); 
		System.out.println("List2 contains : "+al2);
		al.addAll(2,al2);
		System.out.println("After added List2 at 2nd index in the list: " +al); 
	}
}
