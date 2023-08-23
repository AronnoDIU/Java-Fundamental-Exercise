package NumberProblems;

public class ReverseNumberEx1 {
    public static void main(String[] args) {
        int normalNumber = 987654, reverseNumber = 0;
        while (normalNumber != 0) {
            int remainder = normalNumber % 10;
            reverseNumber = reverseNumber * 10 + remainder;
            normalNumber = normalNumber / 10;
        }
        System.out.println("The reverseNumber of the given normalNumber is: " + reverseNumber);
    }
}

/*
Expected Output::

The reverseNumber of the given normalNumber is: 456789

* */
