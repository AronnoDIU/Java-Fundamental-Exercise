package CollectionsFramework;

import java.util.Hashtable;

/*Hashtable(int size, float fillRatio): This version creates a hash table that has an initial size
specified by size and fill ratio specified by fillRatio. Fill ratio: Basically, it determines how
full a hash table can be before it is resized upward and its Value lies between 0.0 to 1.0.*/
public class HashtableSizeFillRatio {
    public static void main(String[] args) {
        Hashtable<Integer, String> integerStringHashtable1
                = new Hashtable<>(4, 0.75f);

        // Initialization of another Hashtable
        Hashtable<Integer, String> integerStringHashtable2
                = new Hashtable<>(3, 0.5f);

        // Inserting the Elements using put() method
        integerStringHashtable1.put(1, "one");
        integerStringHashtable1.put(2, "two");
        integerStringHashtable1.put(3, "three");

        integerStringHashtable2.put(4, "four");
        integerStringHashtable2.put(5, "five");
        integerStringHashtable2.put(6, "six");

        // Print mappings to the console
        System.out.println("Mappings of integerStringHashtable1 : " + integerStringHashtable1);
        System.out.println("Mappings of integerStringHashtable2 : " + integerStringHashtable2);
    }
}

/*Expected Output:

Mappings of integerStringHashtable1 : {3=three, 2=two, 1=one}
Mappings of integerStringHashtable2 : {6=six, 5=five, 4=four}

* */