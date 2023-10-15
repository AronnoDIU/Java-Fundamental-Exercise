package CollectionsFramework.SetInterface;

import java.util.HashSet;

// HashSet is the most important Data Structure
// Because of it's Time Complexity
public class HashSetEx2 {
    public static void main(String[] args) {
        HashSet<Integer> integerHashSet = new HashSet<>();

        // Insert
        integerHashSet.add(1);
        integerHashSet.add(2);
        integerHashSet.add(3);
        integerHashSet.add(1);

        //Size
        System.out.println("size of integerHashSet is : " + integerHashSet.size());

        //Search
        if (integerHashSet.contains(1)) {
            System.out.println("present");
        }

        if (!integerHashSet.contains(6)) {
            System.out.println("absent");
        }

        //Delete
        integerHashSet.remove(1);
        if (!integerHashSet.contains(1)) {
            System.out.println("absent");
        }

        //Print all elements
        System.out.println(integerHashSet);


        //Iteration - HashSet does not have an order
        integerHashSet.add(0);
        for (Integer integer : integerHashSet) {
            System.out.print(integer + ", ");
        }
        System.out.println();

        //isEmpty
        if (!integerHashSet.isEmpty()) {
            System.out.println("integerHashSet is not empty");
        }
    }
}
