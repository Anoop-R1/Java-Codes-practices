package arraylistandlinkedlist;

import java.util.LinkedList;

public class Linkedlist {
	public static void main(String args[]) {
//creating a LinkedList object
		LinkedList<String> l = new LinkedList<>();
//adding elements
		l.add("Pen");
		l.add("Pencil");
		l.add("Book");
		l.add("Notebook");
//printing a LinkedList
		System.out.println("LinkedList elements: " + l);
//add element at the first position
		l.addFirst("Bag");
//printing a LinkedList
		System.out.println("LinkedList elements: " + l);
//remove element from the last position
		l.removeLast();
//printing a LinkedList
		System.out.println("LinkedList elements:  " + l);
	}
}
