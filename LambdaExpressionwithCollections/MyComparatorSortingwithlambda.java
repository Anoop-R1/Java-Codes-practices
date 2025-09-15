package LambdaExpressionwithCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MyComparatorSortingwithlambda {
	public static void main(String[] args) {
	ArrayList<Integer>al=new ArrayList<Integer>();
	al.add(20);
	al.add(2);
	al.add(3);
	al.add(80);
	al.add(0);
	al.add(60);
	al.add(30);
	System.out.println("with out sorting "+al);
	Comparator<Integer>com=(ob1,ob2)->(ob1<ob2)?-1:(ob1>ob2)?1:0;
	Collections.sort(al,com);
	System.out.println("with sorting"+al);
	}
}
