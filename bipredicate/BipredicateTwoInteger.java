package bipredicate;

import java.util.function.BiPredicate;

public class BipredicateTwoInteger {
	public static void main(String[] args) {
		BiPredicate<Integer, Integer> bi1=(a,b)->a%b==0;
		BiPredicate<Integer, Integer> bi2=(a,b)->a*b>50;
		System.out.println("The a is divisible by b and a*b is less than 50: "+bi1.and(bi2).test(10, 2));
		System.out.println("The a is divisible by b and a*b is less than 50: "+bi1.negate().test(10, 2));
		System.out.println("The a is divisible by b and a*b is less than 50: "+bi1.or(bi2).test(10, 2));
	}
}