package CollectionsFramework;

import java.util.TreeSet;

/*#Sorted Set Interface:
    This interface is very similar to the set interface. The only difference is that this interface
    has extra methods that maintain the ordering of the elements. The sorted set interface extends
    the set interface and is used to handle the data which needs to be sorted. The class which
    implements this interface is TreeSet. Since this class implements the SortedSet, we can
    instantiate a SortedSet object with this class.

For example:

SortedSet<T> ts = new TreeSet<> ();
Where T is the type of the object.

The class which implements the sorted set interface is TreeSet.

#TreeSet:
    The TreeSet class uses a Tree for storage. The ordering of the elements is maintained by a set
    using their natural ordering whether an explicit comparator is provided. This must be consistent
    with equals if it is to correctly implement the Set interface. It can also be ordered by a
    Comparator provided at a set creation time, depending on which constructor is used.*/
public class TreeSetEx1 {
    public static void main(String[] args) {
        // Creating TreeSet and adding elements
        TreeSet<String> stringTreeSet = new TreeSet<>();

        stringTreeSet.add("This");
        stringTreeSet.add("is");
        stringTreeSet.add("Yeasir");
        stringTreeSet.add("Arafat");
        stringTreeSet.add("Aronno");

        // Traversing elements
        for (String EnhancedTreeSet : stringTreeSet) {
            System.out.println(EnhancedTreeSet);
        }
    }
}

/*Expected Output:

Arafat
Aronno
This
Yeasir
is

* */