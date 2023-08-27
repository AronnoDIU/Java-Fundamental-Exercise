package RecursionProblems;

// Remove duplicates in a String
public class RemoveDuplicatesString {
    public static boolean[] mapAlphabet = new boolean[26];

    public static void removeDuplicates(String string, int index, String newString) {
        if (index == string.length()) {
            System.out.println(newString);
            return;
        }

        char currentCharacter = string.charAt(index);
        if (mapAlphabet[currentCharacter - 'a']) {
            removeDuplicates(string, index + 1, newString);
        } else {
            newString += currentCharacter;
            mapAlphabet[currentCharacter - 'a'] = true;
            removeDuplicates(string, index + 1, newString);
        }
    }

    public static void main(String[] args) {
        String string = "abbccda";
        removeDuplicates(string, 0, "");
    }
}

/*
Expected Output::

abcd

* */