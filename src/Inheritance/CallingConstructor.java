package Inheritance;

/**
 * 
 * @author Aronno
 *
 */

//  Demonstrate when constructor are executed

// Create a super class
class ACons {
	ACons() {
		System.out.println("Inside ACons's constructor.");
	}
}

// Create a subclass by extending class ACons
class BCons extends ACons {
	BCons() {
		System.out.println("Inside BCons's constructor.");
	}
}

//  Create another subclass by  extending BCons
class CCons extends BCons {
	CCons() {
		System.out.println("Inside CCons's constructor.");
	}
}

public class CallingConstructor {

	public static void main(String[] args) {

		CCons cObj = new CCons();

	}

}