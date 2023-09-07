package BacktrackingProblems;

// Find all distinct subsets of a given set using BitMasking Approach

/*Given an array of integer arr[], The task is to find all its subsets.
The subset cannot contain duplicate elements, so any repeated subset
should be considered only once in the output.

Examples:

    Input:  S = {1, 2, 2}
    Output:  {}, {1}, {2}, {1, 2}, {2, 2}, {1, 2, 2}
    Explanation: The total subsets of given set are – {}, {1}, {2}, {2}, {1, 2}, {1, 2}, {2, 2}, {1, 2, 2}
    Here {2} and {1, 2} are repeated twice, so they are considered only once in the output

    Input:  S = {1, 2}
    Output:  {}, {1}, {2}, {1, 2}
    Explanation: The total subsets of a given set are – {}, {1}, {2}, {1, 2}*/

/*BRUTE METHOD:

    Intuition:

        We do this problem by using the backtracking approach.
        We declare an arraylist to store all the subsets generated.
        We sort the array in order to skip repeated subsets as it should be unique.
        Then we pick a particular element or not pick from the array, and we generate the subsets.
        Atlas we add it to the final list and return it.*/

import java.util.ArrayList;
import java.util.Arrays;

/*Java program to find all subsets of given set.
Any repeated subset is considered only once in the output*/
public class FindDistinctSubsetsBitMasking {
    public static void
    findSubsets(int ind, int[] nums, ArrayList<Integer> ds,
                ArrayList<ArrayList<Integer>> ansList) {
        ansList.add(new ArrayList<>(ds));
        for (int i = ind; i < nums.length; i++) {
            if (i != ind && nums[i] == nums[i - 1])
                continue;

            ds.add(nums[i]);
            findSubsets(i + 1, nums, ds, ansList);
            ds.remove(ds.size() - 1);
        }
    }

    public static ArrayList<ArrayList<Integer>>
    AllSubsets(int[] array) {
        Arrays.sort(array);
        ArrayList<ArrayList<Integer>> answerList = new ArrayList<>();
        findSubsets(0, array, new ArrayList<>(), answerList);

        return answerList;
    }

    public static void main(String[] args) {
        int[] set = {10, 12, 12};
        System.out.println(AllSubsets(set));
    }
}

/*Expected Output::

[[], [10], [10, 12], [10, 12, 12], [12], [12, 12]]

* */