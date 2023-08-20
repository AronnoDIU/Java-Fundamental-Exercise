package Encapsulation.PackageB;

import Encapsulation.PackageA.ClassA;
/**
 * 
 * @author Aronno
 *
 */

public class ClassB extends ClassA {
	
	 void doSomethingClassB() {
		doSomething2();				// protected modifier demo
		doSomethingClassBPrivate(); // private modifier demo
	}
	
	private void doSomethingClassBPrivate() {
		
	}

}