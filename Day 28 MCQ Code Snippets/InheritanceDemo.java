import java.io.*;
import java.util.*;

class A {
	A() {
		System.out.println("Inside A constructor");
	}
	void paint() {
		System.out.println("Inside A Paint Method");
	}
}


class B extends A {
	B() {
		System.out.println("Inside B constructor");
	}
	B(int a) {
		System.out.println("Inside B constructor : " + a);
	}
	void paint() {
		// super.paint(); // for parent reference = super
		System.out.println("Inside B paint method");
	}
}

class InheritanceDemo {
	public static void main(String[] args) {
		B b =  new B(40); // Parent constructor is executed, then this constructor
		b.paint();

	}
}