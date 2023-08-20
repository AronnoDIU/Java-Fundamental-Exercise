package ControlStatements;

// The for-each loop is essentially read-only.
public class NoChange {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int x : nums) {
            System.out.print(x + " ");
            x *= 10; // No effect on nums;
        }
        System.out.println("\n");

        for (int x : nums)
            System.out.print(x + " ");
        System.out.println();

    }

}

/*Expected Output::

1 2 3 4 5 6 7 8 9 10

1 2 3 4 5 6 7 8 9 10

* */