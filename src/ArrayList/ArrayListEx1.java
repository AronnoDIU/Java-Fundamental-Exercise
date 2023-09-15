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

        System.out.println(integerArrayList);
        System.out.println(stringArrayList);
        System.out.println(booleanArrayList);
    }
}

/*Expected Output::

[0, 2, 5, 8, 7, 9, 3, 4]
[This , is , Aronno , here]
[true, false, true, false]

* */