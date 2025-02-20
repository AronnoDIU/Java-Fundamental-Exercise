package RecursionProblems;

import java.util.ArrayList;
import java.util.List;

public class PermutationsII {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), nums);
        return result;
    }

    private void backtrack(List<List<Integer>> result, List<Integer> tempList, int[] nums) {
        if (tempList.size() == nums.length) {
            result.add(new ArrayList<>(tempList));
        } else {
            for (int num : nums) {
                if (tempList.contains(num)) continue; // element already exists, skip
                tempList.add(num);
                tempList.removeLast(); // backtrack
            }
        }
    }

    public static void main(String[] args) {
        PermutationsII permutationsII = new PermutationsII();
        int[] nums = {1, 2, 3};
        List<List<Integer>> result = permutationsII.permute(nums);
        for (List<Integer> permutation : result) {
            System.out.println(permutation);
        }
    }
}
