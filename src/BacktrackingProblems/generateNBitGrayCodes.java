package BacktrackingProblems;

/*Given a number n, the task is to generate n-bit-Gray codes
(generate bit patterns from 0 to 2^n-1 such that successive patterns differ by one bit)

Examples:

Input : 2
Output: 0 1 3 2
Explanation :
00 - 0
01 - 1
11 - 3
10 - 2

Input : 3
Output: 0 1 3 2 6 7 5 4
 */

import java.util.Vector;

public class generateNBitGrayCodes {
    static int num;

    /* we have 2 choices for each of the number bits either we can include i.e.,
    invert the bit, or we can exclude the bit i.e., we can leave the number as it is. */
    static void grayCodeUtil(Vector<Integer> res, int number) {
        // base case when we run our bits to process,
        // we simply include it in a gray code sequence.
        if (number == 0) {
            res.add(num);
            return;
        }

        // ignore the bit.
        grayCodeUtil(res, number - 1);

        // invert the bit.
        num = num ^ (1 << (number - 1));
        grayCodeUtil(res, number - 1);
    }

    // returns the vector containing the gray code sequence of number bits.
    static Vector<Integer> grayCodes(int number) {
        Vector<Integer> res = new Vector<>();

        // num is passed by reference to keep
        // track of current code.
        num = 0;
        grayCodeUtil(res, number);

        return res;
    }

    public static void main(String[] args) {
        int number = 3;
        Vector<Integer> code = grayCodes(number);
        for (Integer integer : code) System.out.print(integer + "\n");
    }
}

/*Expected Output::

0
1
3
2
6
7
5
4

* */