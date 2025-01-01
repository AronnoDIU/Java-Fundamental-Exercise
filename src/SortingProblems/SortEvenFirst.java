package SortingProblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortEvenFirst implements Comparator {
    public int compare(Object obj1, Object obj2) {
        // Make sure the objects are integers
        Integer a = (Integer)obj1;
        Integer b = (Integer)obj2;

        // Check each number to see if it is even
        // A number is even if the remainder when dividing by 2 is 0
        boolean aIsEven = (a % 2) == 0;
        boolean bIsEven = (b % 2) == 0;

        if (aIsEven == bIsEven) {

            // If both numbers are even or both are odd then use normal sorting rules
            return a.compareTo(b);

        } else {

            // If an is even then it goes first, otherwise b goes first
            if (aIsEven) {
                return -1;
            } else {
                return 1;
            }
        }
    }
}
