package Generics;

class Generics<A> {
	A obj;

	Generics(A obj) {
		this.obj = obj;
	}

	public A getTheObject() {
		return this.obj;
	}
}

public class GenericsClass {
	public static void main(String[] args) {
		Generics<Integer> obj = new Generics<Integer>(102);
		System.out.println(obj.getTheObject());
		Generics<Float> obj1 = new Generics<Float>(102.33F);
		System.out.println(obj1.getTheObject());
		Generics<String> obj3 = new Generics<String>("SpringJava");
		System.out.println(obj3.getTheObject() );
		Generics<Character> obj4 = new Generics<Character>('S');
		System.out.println(obj4.getTheObject() );
	}

}
