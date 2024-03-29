package BitManipulation;

public class OROperation {
    private static int helper(int x, int y) {
        return x | y;
    }
    public static void main(String[] args) {
        int x = 12;
        int y = 10;
        System.out.println("Bitwise OR of " + x + ", " + y + " is: " + helper(x, y)); // yields to 14
    }
}

/*
Expected Output::

Bitwise OR of 12, 10 is: 14

* */