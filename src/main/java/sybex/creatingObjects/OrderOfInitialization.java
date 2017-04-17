package sybex.creatingObjects;

/**
 * Created by Alvaro Alcocer on 14/12/2016.
 */
public class OrderOfInitialization {

	static {
		System.out.println("static initializer blocks");
	}

	A a1 = new A("instance variable");

	static A a0 = new A("class variable");

	{
		System.out.println("initializer block");
	}

	public OrderOfInitialization() {
		System.out.println("Hola Constructor");
	}

	public static void main(String[] args) {
		OrderOfInitialization orderOfInitialization = new OrderOfInitialization();
	}
}

class A {

	private String a;

	public A (String a) {
		System.out.println(a);
	}
}
