package BacktrackingProblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/*Given an array of positive integers arr[] and an integer x,
The task is to find all unique combinations in arr[] where the sum is equal to x.
The same repeated number may be chosen from arr[] an unlimited number of times.
Elements in a combination (a1, a2, …, ak) must be printed in non-descending order.
(ie, a1 <= a2 <= … <= ak). If there is no combination possible print “Empty”.

Examples:

    Input: arr[] = 2, 4, 6, 8, x = 8
    Output:
    [2, 2, 2, 2]
    [2, 2, 4]
    [2, 6]
    [4, 4]
    [8]*/
public class SummationCombination {
    static ArrayList<ArrayList<Integer>>
    combinationSum(ArrayList<Integer> arr, int sum) {
        ArrayList<ArrayList<Integer> > ans
                = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();

        // first do hashing since hashset does not always
        // sort
        //  removing the duplicates using HashSet and
        // Sorting the arrayList

        Set<Integer> set = new HashSet<>(arr);
        arr.clear();
        arr.addAll(set);
        Collections.sort(arr);

        findNumbers(ans, arr, sum, 0, temp);
        return ans;
    }

    static void
    findNumbers(ArrayList<ArrayList<Integer> > ans,
                ArrayList<Integer> arr, int sum, int index,
                ArrayList<Integer> temp)
    {

        if (sum == 0) {

            // Adding deep copy of list to ans

            ans.add(new ArrayList<>(temp));
            return;
        }

        for (int i = index; i < arr.size(); i++) {

            // checking that sum does not become negative

            if ((sum - arr.get(i)) >= 0) {

                // adding element which can contribute to
                // sum

                temp.add(arr.get(i));

                findNumbers(ans, arr, sum - arr.get(i), i,
                        temp);

                // removing element from list (backtracking)
                temp.remove(arr.get(i));
            }
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(2);
        arr.add(4);
        arr.add(6);
        arr.add(8);

        int sum = 8;

        ArrayList<ArrayList<Integer> > ans
                = combinationSum(arr, sum);

        // If result is empty, then
        if (ans.isEmpty()) {
            System.out.println("Empty");
            return;
        }

        // print all combinations stored in ans

        for (ArrayList<Integer> an : ans) {

            System.out.print("(");
            for (Integer integer : an) {
                System.out.print(integer + " ");
            }
            System.out.print(") ");
        }
    }
}

/*
Expected Output::

(2 2 2 2 ) (2 2 4 ) (2 6 ) (4 4 ) (8 )

* */
