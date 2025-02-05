package String;

public class ComplexStringExample {
    public static void main(String[] args) {
        // Regular expression matching
        String text = "The quick brown fox jumps over the lazy dog.";
        String regex = "\\b\\w{4}\\b"; // Matches words with exactly 4 letters
        System.out.println("Words with exactly 4 letters:");
        java.util.regex.Pattern pattern = java.util.regex.Pattern.compile(regex);
        java.util.regex.Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }

        // String formatting
        String name = "Alice";
        int age = 30;
        double salary = 12345.6789;
        String formattedString = String.format("Name: %s, Age: %d, Salary: $%,.2f", name, age, salary);
        System.out.println("\nFormatted String:");
        System.out.println(formattedString);

        // StringBuilder for efficient string manipulation
        String sb = "Hello" +
                ", " +
                "World" +
                "!";
        System.out.println("\nStringBuilder Result:");
        System.out.println(sb);

        // Reversing a string using StringBuilder
        String original = "abcdef";
        String reversed = new StringBuilder(original).reverse().toString();
        System.out.println("\nReversed String:");
        System.out.println(reversed);

        // Inserting and deleting characters using StringBuilder
        StringBuilder sb2 = new StringBuilder("Java Programming");
        sb2.insert(5, "Language ");
        sb2.delete(5, 14);
        System.out.println("\nStringBuilder Insert/Delete Result:");
        System.out.println(sb2.toString());

        // Converting a string to a char array and back
        String str = "Hello, World!";
        char[] charArray = str.toCharArray();
        String newStr = new String(charArray);
        System.out.println("\nChar Array to String:");
        System.out.println(newStr);
    }
}
