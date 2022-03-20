package Encapsulation.PackageA;

import Encapsulation.PackageB.ClassB;

/**
 * 
 * @author Aronno
 *
 */
public class DemoPackageA {

	public static void main(String[] args) {

		ClassA classA = new ClassA();
		classA.doSomething2(); // protected modifier demo

		ClassB classB = new ClassB();
//		classB.doSomethingClassB(); // package private demo

	}

}