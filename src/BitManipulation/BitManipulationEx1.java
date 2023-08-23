package BitManipulation;

// Java program about Bit Manipulation to implement all the above functionalities.
public class BitManipulationEx1 {

    // Function to get the bit at the 'i' th position.
    static boolean getBit(int num, int i) {

        // Return true if the ith bit is
        // set. Otherwise, return false
        return ((num & (1 << i)) != 0);
    }

    // Function to set the ith bit of the given number 'num'
    static int setBit(int num, int i) {

        // Sets the ith bit and return
        // the updated value
        return num | (1 << i);
    }

    // Function to clear the ith bit of the given number 'num'
    static int clearBit(int num, int i) {

        // Create the mask for the 'i' th bit unset
        int mask = ~(1 << i);

        // Return the updated value
        return num & mask;
    }

    // Driver Code
    public static void main(String[] args) {
        // Given number N
        int N = 70;

        System.out.println("The bit at the 3rd position from LSB is: " +
                (getBit(N, 3) ? '1' : '0'));

        System.out.println("The value of the given number " +
                "after setting the bit at " +
                "LSB is: " + setBit(N, 0));

        System.out.println("The value of the given number " +
                "after clearing the bit at " +
                "LSB is: " + clearBit(N, 0));
    }
}

/*
Expected Output::

The bit at the 3rd position from LSB is: 0
The value of the given number after setting the bit at LSB is: 71
The value of the given number after clearing the bit at LSB is: 70

* */
