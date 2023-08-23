package JavaNumberPrograms;

public class ReverseNumberEx2 {
    public static void main(String[] args) {
        int normalNumber = 123456, reverseNumber = 0;
//we have not mentioned the initialization part of the for loop
        for (; normalNumber != 0; normalNumber = normalNumber / 10) {
            int remainder = normalNumber % 10;
            reverseNumber = reverseNumber * 10 + remainder;
        }
        System.out.println("The reverseNumber of the given normalNumber is: " + reverseNumber);

//        OR

        for (; normalNumber != 0; ) {
            int remainder = normalNumber % 10;
            reverseNumber = reverseNumber * 10 + remainder;
            normalNumber = normalNumber / 10;
        }

        System.out.println("\nThe reverseNumber of the given normalNumber is: " + reverseNumber);
    }
}

/*
Expected Output::

The reverseNumber of the given normalNumber is: 654321

The reverseNumber of the given normalNumber is: 654321

* */