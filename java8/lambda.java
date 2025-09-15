package java8;

interface Square {
	void square(int x);
}
	public class lambda {

	  public static void main(String[] args) {
	   Square sq=(x)->System.out.println("square no is "+x*x);
	   sq.square(20);
	  }
	}