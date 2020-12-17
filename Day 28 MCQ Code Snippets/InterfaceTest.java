import java.io.*;
import java.util.*;


interface InterfaceDemo {
	// this paint() method as public is not mandatory
	void paint();
	// public void paint();
}

class InterfaceTest implements InterfaceDemo {

	// Implemneting paint() is must
	// That paint() method should be public
	public void paint() {
		System.out.println("Inside InterfaceTest paint method");
	}

	public static void main(String[] args) {
		InterfaceTest obj = new InterfaceTest();
		obj.paint();

	}
}