package CollectionsFramework.GreedyAlgorithm;

import java.util.Arrays;

/* Fractional Knapsack Problem using Greedy Algorithm in Java:
 Given the weights and values of N items, put these items in a knapsack
 of capacity W to get the maximum total value in the knapsack.

 [Note: Unlike 0/1 knapsack, you are allowed to break the item. Like Sugar, Bread, etc.]
In Fractional Knapsack, we can break items by maximizing the total value of knapsack.
 */
public class FractionalKnapsack {
    public static void main(String[] args) {
        int[] weight = {10, 20, 30}; // it can be fractions also {2, 3, 5, 7, 1, 4, 1}
        int[] value = {60, 100, 120};
        int capacityW = 50;

        // Calculate the ratio of value/weight
        double[][] ratio = new double[weight.length][2];

        // Oth column is index; the 1st column is a ratio of value/weight
        for (int i = 0; i < weight.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = (double) value[i] / weight[i];
        }
        // Sort the ratio array in descending order
        Arrays.sort(ratio, (a, b) -> Double.compare(b[1], a[1]));

        double maxValue = 0;
        for (int i = 0; i < weight.length; i++) {
            int index = (int) ratio[i][0];

            // If adding the item will not exceed the capacity, add it completely
            if (capacityW >= weight[index]) {
                maxValue += value[index];
                capacityW -= weight[index];
            } else { // Else add the item fractionally and break
                maxValue += capacityW * ratio[i][1];
                break;
            }
        }
        System.out.println("Maximum profit: " + maxValue);
    }
}

/*
Expected Output:

Maximum profit: 240.0

 */