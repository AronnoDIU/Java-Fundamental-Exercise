package RecursionProblems;

public class FindFirstLastOccurrence {
    public static int firstIndex = -1;
    public static int lastIndex = -1;

    public static void findOccurrence(String string, int index, char element) {
        if (index == string.length()) {  // Base Case
            System.out.println("The First Index Number is " + firstIndex);
            System.out.println("The Last Index Number is " + lastIndex);

            return;
        }

        char currentCharacter = string.charAt(index);
        if (currentCharacter == element) {
            if (firstIndex == -1) {
                firstIndex = index;
            } else {
                lastIndex = index;
            }
        }

        findOccurrence(string, index + 1, element);
    }

    public static void main(String[] args) {
        String string = "abaacdaefaah";
        findOccurrence(string, 0, 'a');
    }
}

/*
Expected Output::

The First Index Number is 0
The Last Index Number is 10

* */
