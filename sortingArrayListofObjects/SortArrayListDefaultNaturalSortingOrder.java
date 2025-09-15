package sortingArrayListofObjects;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class SortArrayListDefaultNaturalSortingOrder {
	public static void main(String[] args) {
		//ArrayList<String>al=Stream.of("spring","boot").collect(Collectors.toCollection(ArrayList::new));
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(40);
		a1.add(50);
		a1.add(20);
		//Collections.sort(a1);
		//a1.sort(Comparator.naturalOrder());
		//a1.sort(Comparator.reverseOrder());
		
		ArrayList<Integer> reverseSortedList = a1.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toCollection(ArrayList::new));
		System.out.println(reverseSortedList);
	}
}