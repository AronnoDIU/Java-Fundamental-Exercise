// A simple  package
package Interface;

/**
 * 
 * @author Aronno
 *
 */

class Balance {
	String name;
	double blnce;

	Balance(String n, double b) {
		name = n;
		blnce = b;
	}

	void show() {
		if (blnce < 0)
			System.out.println("--> ");
		System.out.println(name + ": $" + blnce);
	}
}

public class AccountBalance {

	public static void main(String[] args) {

		Balance current[] = new Balance[3];

		current[0] = new Balance("K. J. Fielding", 123.23);
		current[1] = new Balance("Will  tell", 157.02);
		current[2] = new Balance("Tom Jackson", -12.33);

		for (int i = 0; i < 3; i++)
			current[i].show();

	}

}