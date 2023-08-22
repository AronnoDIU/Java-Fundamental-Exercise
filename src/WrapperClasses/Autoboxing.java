package WrapperClasses;

import java.util.ArrayList;

public class Autoboxing {
    public static void main(String[] args) {
        char chr = 'a';

        // Autoboxing- primitive to Character object
        // conversion
        Character a = chr;

        ArrayList<Integer> arrayList
                = new ArrayList<Integer>();

        // Autoboxing because ArrayList stores only objects
        arrayList.add(25);

        // printing the values from object
        System.out.println(arrayList.get(0));
    }
}


/*
Expected Output::

25

* */