package CollectionsFramework.GreedyAlgorithm;

// Java Program to count swaps required to balance string
public class MinSwapsAnotherApproach {
    static long swapCount(String s) {
        char[] chars = s.toCharArray();

        // stores total number of Left and Right 
        // brackets encountered
        int countLeft = 0, countRight = 0; 
                // swap stores the number of swaps required
        //imbalance maintains the number of imbalance pair
        int swap = 0 , imbalance = 0;

        for (char aChar : chars) {
            if (aChar == '[') {
                // increment count of Left bracket
                countLeft++;
                if (imbalance > 0) {
                    // swap count is last swap count + total
                    // number imbalanced brackets
                    swap += imbalance;
                    // the imbalance decremented by 1 as it solved
                    // only one imbalance of Left and Right
                    imbalance--;
                }
            } else if (aChar == ']') {
                // increment count of Right bracket
                countRight++;
                // imbalance is reset to current difference 
                // between Left and Right brackets
                imbalance = (countRight - countLeft);
            }
        }
        return swap;
    }
    
    public static void main(String[] args) {
        String s = "[]][][";
        System.out.println(swapCount(s) );
 
        s = "[[][]]";
        System.out.println(swapCount(s) );
    }
}
