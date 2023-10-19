package CollectionsFramework.SetInterface;

import java.util.HashSet;

// Intersection of two Arrays
// Array1[] = {1, 2, 3} && Array2[] = {1, 4, 5, 3} ==> Intersection[] = 2 {1, 3}.
public class IntersectionOf2Arrays {
    public static int intersectionElements(int[] Array1, int[] Array2) {
        HashSet<Integer> integerHashSet = new HashSet<>();
        int count = 0;

        // Add Array1 elements to HashSet
        for (int Array1Index : Array1) {
            integerHashSet.add(Array1Index);
        }

        // // Add Array2 elements to HashSet
        for (int Array2Index : Array2) {
            if (integerHashSet.contains(Array2Index)) {
                count++;
                integerHashSet.remove(Array2Index);
            }
        }
        return count;   // Intersection
    }

    public static void main(String[] args) {
        int[] Array1 = {7, 3, 9};
        int[] Array2 = {6, 3, 9, 2, 9, 4};

        System.out.println("Total Number of Intersections: "
                + intersectionElements(Array1, Array2));    // 2
    }
}

/*Expected Output:

Total Number of Intersections: 2

* */