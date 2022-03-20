package Interface.DefaultInterfaceMethods;

/**
 * 
 * @author Aronno
 *
 */

// Implementation of MyInterface
class MyInterfaceImplementation implements MyInterface {

	// Only getNumber() defined by MyInterface needs to be implemented.
	// getString() can be allowed to default.

	@Override
	public int getNumber() {
		return 100;
	}

}

// Now Use the default  method.
public class DefaultMethodDemo {

	public static void main(String[] args) {

		MyInterfaceImplementation myIFImp = new MyInterfaceImplementation();

		// Can call getNumber(), because it is explicitly
		// implemented by MyInterfaceImplementation:

		System.out.println(myIFImp.getNumber());

		// Can also call getString(), because of
		// default implementation:

		System.out.println(myIFImp.getString());

		// Call static default method.

		int defaultNumber = MyInterface.getDefaultNumber();
		System.out.println(defaultNumber);

	}

}