package BacktrackingProblems;

/*Approach: Below is the idea to solve the problem:

    The idea is to use a-mask pattern a bit to generate all the combinations
    as discussed in post. To avoid printing duplicate subsets,
    construct a string out of a given subset such that subsets having similar
    elements will result in the same string. Maintain a list of such unique
    strings and finally decode all such strings to print its individual elements.

Illustration :

    S = {1, 2, 2}

    The binary digits from 0 to 7 are

    0 –> 000    –> number formed with no set-bits                           –> { }
    1 –> 001    –> number formed with setbit at position 0                –> { 1 }
    2 –> 010    –> number formed with setbit at position 1                –> { 2 }
    3 –> 011    –> number formed with setbit at position 0  and 1     –> { 1 , 2 }
    4 –> 100    –> number formed with setbit at position 2               –>  { 2 }
    5 –> 101    –> number formed with setbit at position 0 and 2       –> { 1 , 2}
    6 –> 110    –> number formed with setbit at position 1 and 2       –> { 2 , 2}
    7 –> 111    –> number formed with setbit at position 0 , 1 and 2–> {1 , 2 , 2}

    After removing duplicates,
    the final result will be { }, { 1 }, { 2 }, { 1 , 2 }, { 2 , 2 }, { 1 , 2 , 2}

Note: This method will only work on sorted arrays.

Follow the below steps to Implement the idea:

    Initialize a variable pow_set_size as raise 2 to the size of an array
    and a vector of vector and to store all subsets.
    Iterate over all bitmasks from 0 to pow_set_size – 1.
        For every bitmask include the elements of array of indices where bits are set into a subset vector.
        If this subset does not already exist, then push the subset in the ans vector.
    Return ans.*/

import java.util.ArrayList;

/* Java program to find all subsets of given set.
Any repeated subset is considered only once in the output*/
public class FindDistinctSubsetsBitMaskingEx2 {
    // Function to find all subsets of given set. Any
    // repeated subset is considered only once in the output
    static void printPowerSet(int[] set) {

        ArrayList<String> subset = new ArrayList<>();

        /*set_size of power set of a set
        with set_size n is (2**n -1)*/
        long pow_set_size = (long) Math.pow(2, 3);
        int counter, j;

        /*Run from counter 000..0 to
        111..1*/
        for (counter = 0; counter < pow_set_size;
             counter++) {
            StringBuilder temp = new StringBuilder();
            for (j = 0; j < 3; j++) {
                /* Check if jth bit in the
                counter is set If set then
                print jth element from a set */
                if ((counter & (1 << j)) > 0)
                    temp.append((set[j])).append('$');
            }

            if (!subset.contains(temp.toString())
                    && !temp.isEmpty()) {
                subset.add(temp.toString());
            }
        }

        for (String s : subset) {
            s = s.replace('$', ' ');
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        int[] set = {10, 12, 12};
        printPowerSet(set);
    }
}

/*Expected Output::

10
12
10 12
12 12
10 12 12

* */
