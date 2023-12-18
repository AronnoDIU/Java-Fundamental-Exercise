package CollectionsFramework.GreedyAlgorithm;

import java.util.*;

public class EgyptianFractionOptimized {
    static Vector<Integer>
    getEgyptianFractionUtil(int numerator, int denominator,
                            Vector<Integer> listOfDenoms) {
        if (numerator == 0)
            return listOfDenoms;

        int newDenom = (int) Math.ceil((double) denominator
                / numerator);

        // append in output list
        listOfDenoms.add(newDenom);

        listOfDenoms = getEgyptianFractionUtil(
                numerator * newDenom - denominator,
                newDenom * denominator, listOfDenoms);

        return listOfDenoms;
    }

    static String getEgyptianFraction() {

        StringBuilder str = new StringBuilder();
        Vector<Integer> output = getEgyptianFractionUtil(
                6, 14, new Vector<>());

        for (int denom : output)
            str.append("1/").append(denom).append(" + ");

        return str.substring(0, str.length() - 3);
    }

    public static void main(String[] args) {
        System.out.println(getEgyptianFraction());
    }
}
