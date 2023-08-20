package SDLC_Pro_Practice;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchFullNameFromGivenText {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String input;

        String regex = "(\\b[A-Z]{1}[a-z]+)( )([A-Z]{1}[a-z]+\\b)";
        Pattern pattern = Pattern.compile(regex);

        while (!(input = scanner.nextLine()).equals("end")) {
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                System.out.println(input);
            }
        }
    }
}
