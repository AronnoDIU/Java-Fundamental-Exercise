package ArrayList;

import java.util.ArrayList;

public class ArrayListEx1 {
    public static void main(String[] args) {
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        ArrayList<String> stringArrayList = new ArrayList<>();
        ArrayList<Boolean> booleanArrayList = new ArrayList<>();

        // ArrayList Adding method(Integer)
        integerArrayList.add(0);
        integerArrayList.add(2);
        integerArrayList.add(2, 5);
        integerArrayList.add(3, 8);
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
        System.out.println("ArrayList Getting method(Integer)");
        System.out.println(getElement);

        // Add two ArrayList Values
        int getElementAdd = integerArrayList.get(4) + integerArrayList.get(5);
        System.out.println("Adding two ArrayList Values");
        System.out.println(getElementAdd);
    }
}

/*Expected Output::

ArrayList Adding method(Integer)
[0, 2, 5, 8, 7, 9, 3, 4]
ArrayList Adding method(String)
[This , is , Aronno , here]
ArrayList Adding method(Boolean)
[true, false, true, false]
ArrayList Getting method(Integer)
8
Adding two ArrayList Values
16

* */