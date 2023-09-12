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
    combinationSummation(ArrayList<Integer> integerArrayList, int summation) {

        ArrayList<ArrayList<Integer>> Answer = new ArrayList<>();
        ArrayList<Integer> temporaryList = new ArrayList<>();

        // first do hashing since hashset does not always sort
        // removing the duplicates using HashSet and Sorting the arrayList

        Set<Integer> integerHashSet = new HashSet<>(integerArrayList);
        integerArrayList.clear();
        integerArrayList.addAll(integerHashSet);
        Collections.sort(integerArrayList);

        findNumbers(Answer, integerArrayList, summation, 0, temporaryList);
        return Answer;
    }

    static void findNumbers(ArrayList<ArrayList<Integer>> answerList,
                            ArrayList<Integer> integerArrayList, int summation,
                            int index, ArrayList<Integer> temporaryList) {

        if (summation == 0) {

            // Adding deep copy of list to answerList
            answerList.add(new ArrayList<>(temporaryList));
            return;
        }

        for (int i = index; i < integerArrayList.size(); i++) {

            // checking that summation does not become negative
            if ((summation - integerArrayList.get(i)) >= 0) {

                // adding element which can contribute to summation
                temporaryList.add(integerArrayList.get(i));

                findNumbers(answerList, integerArrayList,
                        summation - integerArrayList.get(i), i, temporaryList);

                // removing element from list (backtracking)
                temporaryList.remove(integerArrayList.get(i));
            }
        }
    }

    public static void main(String[] args) {

        ArrayList<Integer> integerArrayList = new ArrayList<>();

        integerArrayList.add(2);
        integerArrayList.add(4);
        integerArrayList.add(6);
        integerArrayList.add(8);

        int summation = 8;

        ArrayList<ArrayList<Integer>> answerList
                = combinationSummation(integerArrayList, summation);

        // If result is empty
        if (answerList.isEmpty()) {
            System.out.println("Empty");
            return;
        }

        // print all combinations stored in answerList
        for (ArrayList<Integer> EnhancedAnswerList : answerList) {

            System.out.print("(");
            for (Integer integer : EnhancedAnswerList) {
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
