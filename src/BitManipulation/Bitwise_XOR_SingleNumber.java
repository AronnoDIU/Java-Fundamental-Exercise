package BitManipulation;

public class Bitwise_XOR_SingleNumber {
    private static int singleNumber(int[] numberArray) {
        int xOR = 0;
        for (int number : numberArray) {
            xOR ^= number;
        }
        return xOR;
    }

    public static void main(String[] args) {
        int[] numberArray = {4, 1, 2, 9, 1, 4, 2};
        System.out.println("Element appearing one time is " + singleNumber(numberArray));
    }
}

/*
Expected Output::

Element appearing one time is 9

* */
