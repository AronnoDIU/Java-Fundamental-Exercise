package CollectionsFramework.GreedyAlgorithm;

// Java program to count swaps 
// required to balance string
import java.util.*;
public class MinSwapsOptimizedApproach {
    // Function to calculate swaps required
public static long swapCount(String s) {
     
    // Keep track of '['
    Vector<Integer> pos = new Vector<Integer>(); 
    for(int i = 0; i < s.length(); ++i)
        if (s.charAt(i) == '[')
            pos.add(i);

    // To count number of encountered '['
    int count = 0; 
     
    // To track position of next '[' in pos
    int p = 0;  
     
    // To store result
    long sum = 0;

    char[] S = s.toCharArray(); 
     
    for(int i = 0; i < s.length(); ++i)
    {
         
        // Increment count and move p 
        // to next position
    
    public static void main(String[] args) {
        String s = "[]][][";
    }
}
