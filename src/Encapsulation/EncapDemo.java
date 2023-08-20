package Encapsulation;

import Encapsulation.PackageA.ClassA;

public class EncapDemo {

	public static void main(String[] args) {

		ClassA classA = new ClassA();
		classA.doSomething(); // public modifier demo

//		classA.doSomething2(); // protected modifier demo

	}

}