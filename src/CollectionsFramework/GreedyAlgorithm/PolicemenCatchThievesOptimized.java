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
            } else {
                // as the index of police is behind the
                // thief, it cannot catch the thief. Hence,
                // we need the index of next police and
                // check if it can catch the current thief
                // (it will be checked in the next
                // iteration)
                pol++;
                while (pol < n && arr[pol] != 'P')
                    pol++;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        String s = "[]][][";
        char arr1[] = { 'P', 'T', 'T', 'P', 'T' };
        int n = arr1.length;
        int k = 2;
        System.out.println("Maximum thieves caught: "
                           + policeThief(arr1, n, k));

        char arr2[] = { 'T', 'T', 'P', 'P', 'T', 'P' };
        n = arr2.length;
        k = 2;
        System.out.println("Maximum thieves caught: "
                           + policeThief(arr2, n, k));

        char arr3[] = { 'P', 'T', 'P', 'T', 'T', 'P' };
        n = arr3.length;
        k = 3;
        System.out.println("Maximum thieves caught: "
                           + policeThief(arr3, n, k));
    }
}
