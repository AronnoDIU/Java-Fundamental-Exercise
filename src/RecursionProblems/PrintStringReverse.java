package RecursionProblems;

public class PrintStringReverse {
    public static void printReverse(String string, int index) {
        if (index == 0) {
            System.out.print(string.charAt(index) + " ");
            return;
        }
        System.out.print(string.charAt(index) + " ");
        printReverse(string, index - 1);
    }

    public static void main(String[] args) {
        String string = "abed";
        printReverse(string, string.length() - 1);
    }
}

/*
Expected Output::

d c b a

* */