package CollectionsFramework.MapInterface;

import java.util.Hashtable;

/*Hashtable(int initialCapacity): This creates a hash table that has an initial size specified by
initialCapacity, and the default load factor is 0.75.*/
public class HashtableInitialCapacity {
    public static void main(String[] args) {
        Hashtable<Integer, String> integerStringHashtable1 = new Hashtable<>(4);

        // Initialization of another Hashtable
        Hashtable<Integer, String> integerStringHashtable2 = new Hashtable<>(2);

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
Mappings of integerStringHashtable2 : {4=four, 6=six, 5=five}

* */