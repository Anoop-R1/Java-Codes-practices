package java8;
@FunctionalInterface
interface A{
	public void m1();
}
public class Functionalinterface implements A{

	@Override
	public void m1() {
	System.out.println("hiii");
	}
	
public class Test{
	public static void main(String[] args) {
		A a=new Functionalinterface();
		a.m1();
	}
	
}
}
