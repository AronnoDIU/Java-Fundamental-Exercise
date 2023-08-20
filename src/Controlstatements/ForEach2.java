package ControlStatements;

// Use break with a for-each style  for loop.
public class ForEach2 {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        // Use for to display and sum the values.
        for (int x : nums) {
            System.out.println("Value is : " + x);
            sum += x;
            if (x == 5)
                break; // Stop the loop when 5
        }
        System.out.println("Summation is : " + sum);

    }

}

/*Expected Output::

Value is : 1
Value is : 2
Value is : 3
Value is : 4
Value is : 5
Summation is : 15

* */