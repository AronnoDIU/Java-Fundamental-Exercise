package ArraysProblems;

import java.util.Arrays;

public class SimpleArrays2 {
    public static void main(String[] args) {

        int[] arr;
        int[] arr2;

        arr = new int[10];
        System.out.println(arr.length);
        System.out.println(arr[0]);
        arr2 = new int[10];
        System.out.println(arr2.length);
        System.out.println(arr2[0]);

        double[] arr3 = new double[10];
        System.out.println(arr3[0]);

        boolean[] arr4 = new boolean[10];
        System.out.println(arr4[0]);

        System.out.println(arr4[9]);

        int[] arr5 = {3, 2, 1};

        int[][] matrix = {{1, 2, 3}, {4, 5, 6}};

        System.out.println(matrix[0][2]);

        int[][] matrix2 = new int[10][10];
        System.out.println(Arrays.toString(matrix2[0]));

        System.out.println(java.util.Arrays.toString(arr5));
        Arrays.sort(arr5);
        System.out.println(Arrays.toString(arr5));
    }
}

/*Expected Output::

10
0
10
0
0.0
false
false
3
[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
[3, 2, 1]
[1, 2, 3]

* */
