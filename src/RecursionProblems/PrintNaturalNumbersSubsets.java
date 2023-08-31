package RecursionProblems;

// Print all the Subsets of a set of first N natural Numbers

/*
When, N = 3;                            3(1 2 3)
                                    /             \
                                    3                 .
                                /      \           /      \
                              3 2       3         . 2       . .
                           /     \     /   \      /   \     /    \
                        3 2 1   3 2  3 1  3 .  2 1  2 .   1 . .  . . .

So, the Total Subsets are,  3 2 1 , 3 2 , 3 1 , 3 , 2 1 , 2 , 1 , .

* */

import java.util.ArrayList;

public class PrintNaturalNumbersSubsets {

    public static void printSubsets(ArrayList<Integer> subSet) {
        for (Integer integer : subSet) {
            System.out.print(integer + " ");
        }
        System.out.println();
    }

    public static void findSubsets(int number, ArrayList<Integer> subSet) {

        if (number == 0) {
            printSubsets(subSet);
            return;
        }

        // If wanted to be added
        subSet.add(number);
        findSubsets(number - 1, subSet);

        // If not wanted to be added
        subSet.remove(subSet.size() - 1);
        findSubsets(number - 1, subSet);
    }

    public static void main(String[] args) {

        int number = 3;
        ArrayList<Integer> subSet = new ArrayList<>();

        findSubsets(number, subSet);

    }
}

/*
Expected Output::

3 2 1
3 2
3 1
3
2 1
2
1

* */