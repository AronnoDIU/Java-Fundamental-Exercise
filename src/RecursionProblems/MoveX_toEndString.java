package RecursionProblems;

// Move all 'x' to the end of the String
public class MoveX_toEndString {
    public static void
    moveAll_X(String string, int index, int count, String newString) {

        if (index == string.length()) {
            newString = newString + "x".repeat(Math.max(0, count));
            System.out.println(newString);
            return;

            // OR

            /*for (int i = 0; i < count; i++) {
                newString += 'x';
            }
            System.out.println(newString);
            return;*/
        }

        char currentCharacter = string.charAt(index);
        if (currentCharacter == 'x') {
            count++;
            moveAll_X(string, index + 1, count, newString);
        } else {
            newString += currentCharacter;
            moveAll_X(string, index + 1, count, newString);
        }
    }

    public static void main(String[] args) {
        String string = "axbcxxd";
        moveAll_X(string, 0, 0, "");
    }
}

/*
Expected Output::

abcdxxx

* */
