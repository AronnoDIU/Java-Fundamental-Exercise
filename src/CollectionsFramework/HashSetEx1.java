package CollectionsFramework;

import java.util.HashSet;

/*A set is an unordered collection of objects in which duplicate values cannot be stored.
This collection is used when we wish to avoid the duplication of the objects and wish to
store only the unique objects. This set interface is implemented by various classes like
HashSet, TreeSet, LinkedHashSet, etc. Since all the subclasses implement the set, we can
instantiate a set object with any of these classes.

    For example:

    Set<T> hs = new HashSet<> ();
    Set<T> lhs = new LinkedHashSet<> ();
    Set<T> ts = new TreeSet<> ();
    Where T is the type of the object.

The following are the classes that implement the Set interface:
# HashSet

The HashSet class is an inherent implementation of the hash table data structure.
The objects that we insert into the HashSet do not guarantee to be inserted in
the same order. The objects are inserted based on their hashcode. This class
also allows the insertion of NULL elements. Let’s understand*/
public class HashSetEx1 {
    public static void main(String[] args) {
        // Creating HashSet and adding elements
        HashSet<String> stringHashSet = new HashSet<>();

        stringHashSet.add("This");
        stringHashSet.add("is");
        stringHashSet.add("Aronno");
        stringHashSet.add("Here");
        stringHashSet.add("from Dhaka");

        // Traversing elements
        for (String EnhancedHashSet : stringHashSet) {
            System.out.println(EnhancedHashSet);
        }
    }
}

/*Expected Output:

Here
Aronno
This
is
from Dhaka

* */