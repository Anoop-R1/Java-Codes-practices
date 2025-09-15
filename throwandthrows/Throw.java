package throwandthrows;

public class Throw {
	static void demo() throws IllegalAccessException {
		System.out.println("inside the demo() method");
		throw new IllegalAccessException("Test");
	}

	public static void main(String args[]) {
		try {
			demo();
		} catch (IllegalAccessException e) {
			System.out.println("caught in main.");
		}
	}
}