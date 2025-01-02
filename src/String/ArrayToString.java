package String;

import java.util.Arrays;

/*
 * A Java program to convert an array to string.
 */

public class ArrayToString {

    public static void main(String[] args) {

        String[] stringArray = { "My", "name", "is", "Gaurav", "!" };

        // 1. Using the Arrays.toString() method
        String string1 = convertArrayToStringUsingToString(stringArray);
        System.out.println("An array converted to string using Arrays.toString(): " + string1);

        // 2. Using the StringBuilder.append() method
        String string2 = convertArrayToStringUsingAppend(stringArray);
        System.out.println("An array converted to string using StringBuilder.append(): " + string2);

        // 3. Using the String.join() method
        String string3 = convertArrayToStringUsingJoin(stringArray);
        System.out.println("An array converted to string using String.join(): " + string3);

        // 4. Using the Collectors.joining() method
        String string4 = convertArrayToStringUsingJoining(stringArray);
        System.out.println("An array converted to string using Collectors.joining(): " + string4);

    }

    // 1. Using the Arrays.toString() method
    public static String convertArrayToStringUsingToString(String[] stringArray) {
        return Arrays.toString(stringArray);
    }

    // 2. Using the StringBuilder.append() method
    public static String convertArrayToStringUsingAppend(String[] stringArray) {
        StringBuilder stringBuilder = new StringBuilder();

        for (String s : stringArray) {
            stringBuilder.append(s);
        }
        return stringBuilder.toString();
    }

    // 3. Using the String.join() method
    public static String convertArrayToStringUsingJoin(String[] stringArray) {
        return String.join(" ", stringArray);
    }

    // 4. Using the Collectors.joining() method
    public static String convertArrayToStringUsingJoining(String[] stringArray) {
        return String.join("", stringArray);
    }

}