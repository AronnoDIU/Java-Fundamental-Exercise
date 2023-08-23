package IntroducingClasses;

public class StringProcessor {
	
	// Done: mention StringBuilder
	
		public static final String INPUT_DATA = "Login;Name;Email" + System.lineSeparator() +
				"peterson;Chris Peterson;peterson@outlook.com" + System.lineSeparator() +
				"james;Derek James;james@gmail.com" + System.lineSeparator() +
				"jackson;Walter Jackson;jackson@gmail.com" + System.lineSeparator() +
				"gregory;Mike Gregory;gregory@yahoo.com";

	public static void main(String[] args) {
		
		System.out.println("===== Convert 1 demo =====");
		System.out.println(convert1(INPUT_DATA));
		
		System.out.println("===== Convert 2 demo =====");
		System.out.println(convert2(INPUT_DATA));
		
	}
	
	public static String convert1(String input) {
		StringBuilder result = new StringBuilder();
		String[] lines = input.split(System.lineSeparator());
		for (int i = 1; i < lines.length; i++) {
			String[] wordsInLine = lines[i].split(";");
			result.append(wordsInLine[0]).append(" ==> ").append(wordsInLine[2]).append(System.lineSeparator());
		}
		return result.toString();
	
	}
	
	
	public static String convert2(String input) {
		StringBuilder result = new StringBuilder();
		String[] lines = input.split(System.lineSeparator());
		for (int i = 1; i < lines.length; i++) {
			String[] wordsInLine = lines[i].split(";");
			result.append(wordsInLine[1]).append(" (email: ").append(wordsInLine[2]).append(")").append(System.lineSeparator());
		}
		return result.toString();

	}

}

/*
Expected Output::

===== Convert 1 demo =====
peterson ==> peterson@outlook.com
james ==> james@gmail.com
jackson ==> jackson@gmail.com
gregory ==> gregory@yahoo.com

===== Convert 2 demo =====
Chris Peterson (email: peterson@outlook.com)
Derek James (email: james@gmail.com)
Walter Jackson (email: jackson@gmail.com)
Mike Gregory (email: gregory@yahoo.com)

* */