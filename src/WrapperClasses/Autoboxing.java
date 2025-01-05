package WrapperClasses;

import java.util.ArrayList;

public class Autoboxing {
    public static void main(String[] args) {

        // Autoboxing- primitive to Character object
        // conversion
        Character a = 'a';

        ArrayList<Integer> arrayList
                = new ArrayList<Integer>();

        // Autoboxing because ArrayList stores only objects
        arrayList.add(25);

        // printing the values from object
        System.out.println(arrayList.getFirst());
    }
}


/*
Expected Output::

25

* */