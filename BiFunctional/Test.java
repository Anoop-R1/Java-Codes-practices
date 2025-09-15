package BiFunctional;

import java.util.function.BiFunction;

public class Test {
public static void main(String[] args) {
	/*
	 * BiFunction<Integer, Integer, Integer>bi=(a,b)->a+b;
	 * System.out.println("Sum is "+bi.apply(2, 5));
	 */
	BiFunction<Integer, Integer, Integer>bi=(a,b)->a+b;
	bi=bi.andThen(a->a*3);
	System.out.println(bi.apply(5, 5));
}
}
