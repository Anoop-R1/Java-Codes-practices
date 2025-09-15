package Generics;

public class GenericMethod {
	public static <T> void printData(T data) {
		System.out.println("Data: "+ data);
	}
	public static void main(String[] args) {
		System.out.println("Calling a generic method with Integer");
		printData(1001);
		System.out.println("Calling a generic method with String");
		printData("springjava");
		System.out.println("Calling a generic method with Float");
		printData(1002.44F);
	}
}
