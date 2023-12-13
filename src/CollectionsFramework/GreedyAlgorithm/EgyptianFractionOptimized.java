package CollectionsFramework.GreedyAlgorithm;
import java.util.*;

public class EgyptianFractionOptimized {
    static Vector<Integer>
    getEgyptianFractionUtil(int numerator, int denominator,
                            Vector<Integer> listOfDenoms) {
        if (numerator == 0)
            return listOfDenoms;

        int newDenom = (int)Math.ceil((double)denominator
                                      / numerator);

        // append in output list
        listOfDenoms.add(newDenom);

        listOfDenoms = getEgyptianFractionUtil(
            numerator * newDenom - denominator,
            newDenom * denominator, listOfDenoms);
 
        return listOfDenoms;
    }
    
    public static void main(String[] args) {
        String s = "[]][][";
    }
}
