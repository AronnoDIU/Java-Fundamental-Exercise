package CollectionsFramework.GreedyAlgorithm;

// Java program to find the minimum time to place
// all mice in all holes.
import java.util.* ;
public class AssignMiceHoles {
    // Returns minimum time required to place mice
    // in holes.
    public int assignHole(ArrayList<Integer> mice,
                         ArrayList<Integer> holes){
        if (mice.size() != holes.size())
           return -1;
 
        /* Sort the lists */
        Collections.sort(mice);
        Collections.sort(holes);
 
        int size = mice.size();
 
        /* finding max difference between ith mice and hole */
        int max = 0;
        for (int i=0; i<size; i++)
            if (max < Math.abs(mice.get(i)-holes.get(i)))
                max = Math.abs(mice.get(i)-holes.get(i));
 
        return Math.abs(max);
    }
    public static void main(String[] args) {
        String s = "[]][][";
    }
}
