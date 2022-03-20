package Interface.NestedInterface;

/**
 * 
 * @author Aronno
 *
 */

// A nested interface example.

// This class contain a member interface.
class NestedInterfc {
	// This is a nested interface
	public interface NestedIF {
		boolean isNotNegative(int x);
	}
}

// This class implements the nested interface.
class Implementation implements NestedInterfc.NestedIF {

	@Override
	public boolean isNotNegative(int x) {
		return x < 0 ? false : true;
	}

}

public class NestedInterfaceDemo {

	public static void main(String[] args) {

		// Use a nested interface reference
		NestedInterfc.NestedIF nif = new Implementation();

		if (nif.isNotNegative(10))
			System.out.println("10 is not negative");
		if (nif.isNotNegative(-12))
			System.out.println("This won't be displayed");

	}

}