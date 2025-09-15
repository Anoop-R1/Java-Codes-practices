package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DivisibleBy5Numbers {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10,20,11,15,16,30);
		List<Integer> num = numbers.stream().filter(n -> n%5==0).collect(Collectors.toList());
		System.out.println(num);		
	}
}
 