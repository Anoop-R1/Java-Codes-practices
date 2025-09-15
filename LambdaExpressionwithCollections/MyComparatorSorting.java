package LambdaExpressionwithCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MyComparatorSorting implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		
		return(o1<o2)?-1 :(o1>o2)?1:0;
	}
	public class Test{
		public static void main(String[] args) {
			ArrayList<Integer>itrL=new ArrayList<Integer>();
			itrL.add(10);
			itrL.add(20);
			itrL.add(30);
			itrL.add(0);
			itrL.add(5);
			itrL.add(100);
			itrL.add(25);
			System.out.println("with out sorting "+itrL);
			Collections.sort(itrL,new MyComparatorSorting());
			System.out.println("with sorting"+itrL);
		}
	}

}
