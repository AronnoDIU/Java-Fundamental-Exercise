package BacktrackingProblems;

// Printing all Subsets Using Bit Manipulation

/*Below are the step-by-step approach:

    Iterate numbers from 0 to (2^n)-1
    Generate binary representation of that number and include the elements of array as per below cases:
    If the i’th bit is 1, then include i’th element of the array into current subset
    If the i’th bit is 0, do nothing and continue.
    Each bit representation of the number will give a unique subset.*/
public class PrintArraySubsetsUsingBit {
    // Function to find the subsets of
    // the given array
    public static void findSubsets(int[] arrays) {
        // Get the length of the input array
        int number = arrays.length;

        // Loop through all possible subsets using bit manipulation
        for (int i = 0; i < (1 << number); i++) {

            // Loop through all elements of the input array
            for (int j = 0; j < number; j++) {

                // Check if the jth bit is set in the current subset
                if ((i & (1 << j)) != 0) {

                    // If the jth bit is set,add the jth element to the subset
                    System.out.print(arrays[j] + " ");
                }
            }

            System.out.println();
        }
    }

    // Driver Code
    public static void main(String[] args) {
        int[] arrays = new int[]{1, 2, 3};
        findSubsets(arrays);
    }
}

/*Expected Output::

1
2
1 2
3
1 3
2 3
1 2 3

* */