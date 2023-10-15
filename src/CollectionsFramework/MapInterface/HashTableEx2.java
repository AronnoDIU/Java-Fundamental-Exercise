package CollectionsFramework.MapInterface;

import java.util.Hashtable;

public class HashTableEx2 {
    public static void main(String[] args) {
        Hashtable<Integer, String> integerStringHashtable1 = new Hashtable<>();

        // Initialization of another Hashtable
        Hashtable<Integer, String> integerStringHashtable2 = new Hashtable<>();

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