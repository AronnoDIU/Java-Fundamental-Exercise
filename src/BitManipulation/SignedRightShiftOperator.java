package BitManipulation;

public class SignedRightShiftOperator {
    public static void main(String[] args) {
        int number1 = 8;
        int number2 = -8;

        // 2 bit signed right shift
        System.out.println(number1 >> 2);    // prints 2
        System.out.println(number2 >> 2);    // prints -2
    }
}

/*
Expected Output::

2
-2

* */
