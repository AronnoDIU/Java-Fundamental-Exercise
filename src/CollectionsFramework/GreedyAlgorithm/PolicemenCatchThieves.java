package CollectionsFramework.GreedyAlgorithm;

// Java program to find maximum number of
// thieves caught
import java.io.*;
import java.util.*;

public class PolicemenCatchThieves {
    // Returns maximum number of thieves
    // that can be caught.
    static int policeThief(char arr[], int n, int k) {
        int res = 0;
        ArrayList<Integer> thi = new ArrayList<Integer>();
        ArrayList<Integer> pol = new ArrayList<Integer>();

        // store indices in the ArrayList
        for (int i = 0; i < n; i++) {
            if (arr[i] == 'P')
                pol.add(i);
            else if (arr[i] == 'T')
                thi.add(i);
        }
    
    public static void main(String[] args) {
        String s = "[]][][";
    }
}
