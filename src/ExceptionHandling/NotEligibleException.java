package ExceptionHandling;

import java.util.Scanner;

/**
 * 
 * @author Aronno
 *
 */

// This program creates a custom exception type.
//class MyException extends Exception{
//	private int details;
//	
//	MyException(int a){
//		details=a;
//	}
//	
//    static void compute(int a){
//		
//		System.out.println("Called compute("+a+")");
//		try{
//			if(a>10)
//		
//			throw new MyException(a);
//		System.out.println("Normal exit");
//		}catch(MyException e) {
//			System.out.println("Caught "+e);
//		}
//	}
//
//	@Override
//	public String toString() {
//		return "MyException [details=" + details + "]";
//	}
//}
public class NotEligibleException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;  // Need to Study

	NotEligibleException(String msg) {
		super(msg);
	}
}

class VoterList {
	int age;

	VoterList(int age) {
		this.age = age;
	}

	void checkEligibility() {
		try {
			if (age < 18) {
				throw new NotEligibleException("Error: Not eligible for vote due to under age.");
			}
			System.out.println("Congrates! You are eligible for vote.");
		} catch (NotEligibleException nee) {
			System.out.println(nee.getMessage());
		}
	}

	public static void main(String[] args) {

		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Enter your age in years: ");
			int age = input.nextInt();
			VoterList person = new VoterList(age);
			person.checkEligibility();
		}

//		try {
//			compute(1);
//			compute(20);
//		}catch(MyException e) {
//			System.out.println("Caught "+e);
//		}

	}

}