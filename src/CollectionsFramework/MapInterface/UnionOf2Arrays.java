package CollectionsFramework.MapInterface;

import java.util.HashSet;

// Combination of two Arrays
// Array1[] = {1, 2, 3} && Array2[] = {1, 4, 5} ==> Union[] = 5 {1, 2, 3, 4, 5}
public class UnionOf2Arrays {
    public static int unionElements(int[] Array1, int[] Array2) {
        HashSet<Integer> integerHashSet = new HashSet<>();

        for (int Array1Index : Array1) {
            integerHashSet.add(Array1Index);
        }

        for (int Array2Index : Array2) {
            integerHashSet.add(Array2Index);
        }

        return integerHashSet.size();
    }

    public static void main(String[] args) {
        int[] Array1 = {7, 3, 9};
        int[] Array2 = {6, 3, 9, 2, 9, 4};

        System.out.println("Total Number of Union: "
                + unionElements(Array1, Array2));
    }
}

/*Expected Output:

Total Number of Union: 6

* */