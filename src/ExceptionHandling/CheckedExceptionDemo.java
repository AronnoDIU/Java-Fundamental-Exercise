package ExceptionHandling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * 
 * @author Yeasir Arafat Aronno
 *
 */
public class CheckedExceptionDemo {
	
	public static void main(String[] args) throws IOException {
		Files.readAllLines(Paths.get("path to non existing file.txt"));
	}

}
