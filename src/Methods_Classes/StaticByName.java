package Methods_Classes;

/**
 * 
 * @author Aronno
 *
 */
class StaticDemo {
	static int a = 42;
	static int b = 99;

	static void callme() {
		System.out.println("A = " + a);
	}
}

public class StaticByName {

	public static void main(String[] args) {

		StaticDemo.callme();
		System.out.println("B = " + StaticDemo.b);

		// Demonstrate final keyword

		final int FILE_NEW = 1;
		final int FILE_OPEN = 2;
		final int FILE_SAVE = 3;
		final int FILE_SAVEAS = 4;
		final int FILE_QUIT = 5;

		System.out.println("\nThe final keyword demonstration.\n");

		System.out.println(FILE_NEW);
		System.out.println(FILE_OPEN);
		System.out.println(FILE_SAVE);
		System.out.println(FILE_SAVEAS);
		System.out.println(FILE_QUIT);

	}

}