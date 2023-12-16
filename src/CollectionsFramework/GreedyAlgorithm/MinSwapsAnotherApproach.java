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
         
        for(int i =0; i< chars.length; i++) {
            if(chars[i] == '[') {
                // increment count of Left bracket
                countLeft++; 
                if(imbalance > 0) {
                    // swaps count is last swap count + total 
                    // number imbalanced brackets
                    swap += imbalance; 
                    // imbalance decremented by 1 as it solved
                    // only one imbalance of Left and Right
                    imbalance--;
    
    public static void main(String[] args) {
        String s = "[]][][";
    }
}
