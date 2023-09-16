package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx1 {
    public static void main(String[] args) {
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        ArrayList<String> stringArrayList = new ArrayList<>();
        ArrayList<Boolean> booleanArrayList = new ArrayList<>();

        // ArrayList Adding method(Integer)
        integerArrayList.add(0);
        integerArrayList.add(2);
        integerArrayList.add(5);
        integerArrayList.add(8);
        integerArrayList.add(7);
        integerArrayList.add(9);
        integerArrayList.add(3);
        integerArrayList.add(4);

        // String
        stringArrayList.add("This ");
        stringArrayList.add("is ");
        stringArrayList.add("Aronno ");
        stringArrayList.add("here");

        // Boolean
        booleanArrayList.add(true);
        booleanArrayList.add(false);
        booleanArrayList.add(true);
        booleanArrayList.add(false);

        System.out.println("ArrayList Adding method(Integer)");
        System.out.println(integerArrayList);
        System.out.println("ArrayList Adding method(String)");
        System.out.println(stringArrayList);
        System.out.println("ArrayList Adding method(Boolean)");
        System.out.println(booleanArrayList);

        // ArrayList Getting method(Integer)

        int getElement = integerArrayList.get(3);
        System.out.println("ArrayList Getting method (Integer of index 3)");
        System.out.println(getElement);

        // Add two ArrayList Values
        int getElementAdd = integerArrayList.get(4) + integerArrayList.get(5);
        System.out.println("Adding two ArrayList Values (index 4 + index 5)");
        System.out.println(getElementAdd);

        // Add Element in between (Modify) method
        integerArrayList.add(2, 2);
        integerArrayList.add(3, 3);

        System.out.println("ArrayList Modify");
        System.out.println(integerArrayList);

        // Set Element
        integerArrayList.set(5, 5);
        integerArrayList.set(6, 6);

        System.out.println("ArrayList Set Elements");
        System.out.println(integerArrayList);

        // Delete/ Remove Elements
        integerArrayList.remove(5);

        System.out.println("ArrayList Remove Elements");
        System.out.println(integerArrayList);

        // Check ArrayList Size
        int sizeArrayList = integerArrayList.size();

        System.out.println("Check ArrayList Size method");
        System.out.println(sizeArrayList);

        // Using Loops on ArrayList
        System.out.println("Using Loops for getting ArrayList");
        for (Integer EnhancedArrayList : integerArrayList) {
            System.out.print(EnhancedArrayList + " ");
        }
        System.out.println();

        // Sorting method in ArrayList
        Collections.sort(integerArrayList);

        System.out.println("Sorting method in ArrayList");
        System.out.println(integerArrayList);
    }
}

/*Expected Output::

ArrayList Adding method(Integer)
[0, 2, 5, 8, 7, 9, 3, 4]
ArrayList Adding method(String)
[This , is , Aronno , here]
ArrayList Adding method(Boolean)
[true, false, true, false]
ArrayList Getting method (Integer of index 3)
8
Adding two ArrayList Values (index 4 + index 5)
16
ArrayList Modify
[0, 2, 2, 3, 5, 8, 7, 9, 3, 4]
ArrayList Set Elements
[0, 2, 2, 3, 5, 5, 6, 9, 3, 4]
ArrayList Remove Elements
[0, 2, 2, 3, 5, 6, 9, 3, 4]
Check ArrayList Size method
9
Using Loops for getting ArrayList
0 2 2 3 5 6 9 3 4
Sorting method in ArrayList
[0, 2, 2, 3, 3, 4, 5, 6, 9]

* */