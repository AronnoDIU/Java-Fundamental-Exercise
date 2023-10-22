package ArraysProblems;

// Print Sub-Array ==> Continuation of Arrays -> like, 2,4,6 not like, 2,4,8
public class PrintSubArrays {
    static void printSubArrays(int[] Numbers) {
        for (int i = 0; i < Numbers.length; i++) {
            for (int j = i; j < Numbers.length; j++) {
                for (int k = i; k < j; k++) {    // Print Only
                    System.out.print(Numbers[k] + " "); // SubArray
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        int[] Numbers = {2, 4, 6, 8, 10};
        printSubArrays(Numbers);
    }
}

/*Expected Output:

2
2 4
2 4 6
2 4 6 8

4
4 6
4 6 8

6
6 8

8

* */