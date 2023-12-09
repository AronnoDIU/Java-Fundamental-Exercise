package CollectionsFramework.GreedyAlgorithm;

// Java program to find maximum number of thieves caught
import java.io.*;
import java.util.*;
public class PolicemenCatchThievesOptimized {

    // Returns maximum number of thieves that can be caught.
    static int policeThief(char arr[], int n, int k) {
        int pol = -1, thi = -1, res = 0;
        // store the first index of police in pol
        for (int i = 0; i < n; i++) {
            if (arr[i] == 'P') {
                pol = i;
                break;
            }
        }

    // store the first index of thief in thi
        for (int i = 0; i < n; i++) {
            if (arr[i] == 'T') {
                thi = i;
                break;
            }
        }

    // return 0 if no police OR no thief found
        if (thi == -1 || pol == -1)
            return 0;
        // loop to increase res if distance between police
        // and thief <= k
        while (pol < n && thi < n) {
            // thief can be caught
            if (Math.abs(pol - thi) <= k) {
                pol++;
                // to find the index of next police for next
                // iteration
                while (pol < n && arr[pol] != 'P')
                    pol++;
                // to find the index of next thief for next
                // iteration
                thi = thi + 1;
                while (thi < n && arr[thi] != 'T')
                    thi++;
            // increment res, as the thief has been
                // caugh
                res++;
            }
            // thief cannot be caught as dist > k
            else if (thi < pol) {
                // as index of thief is behind police, we
                // need to find the next thief and check if
                // it can be caught by the current police
                // (it will be checked in the next
                // iteration) Hence, find the index of next
                // thief
                thi++;
                while (thi < n && arr[thi] != 'T')
                    thi++;
            }
    public static void main(String[] args) {
        String s = "[]][][";
    }
}
