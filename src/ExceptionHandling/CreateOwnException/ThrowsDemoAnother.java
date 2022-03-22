package ExceptionHandling.CreateOwnException;

import java.io.FileNotFoundException;

/**
 * 
 * @author Yeasir Arafat Aronno
 *
 */
public class ThrowsDemoAnother {

	public static void main(String[] args) {

		ThrowsDemoAnother demo = new ThrowsDemoAnother();
//		demo.someMethod();

	}

	public void someMethod() throws FileNotFoundException {

	}

}

class ThrowsDemoOverride extends ThrowsDemoAnother {

	@Override
	public void someMethod() {

	}
}