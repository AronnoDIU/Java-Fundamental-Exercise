package CollectionsFramework.SetInterface;

import java.util.LinkedHashSet;

/*#LinkedHashSet:
    A LinkedHashSet is very similar to a HashSet. The difference is that this uses a doubly
    linked GenericLinkedLists to store the data and retains the ordering of the elements. */
public class LinkedHashSetEx1 {
    public static void main(String[] args) {
        // Creating LinkedHashSet and adding elements
        LinkedHashSet<String> stringLinkedHashSet = new LinkedHashSet<>();

        stringLinkedHashSet.add("This");
        stringLinkedHashSet.add("is");
        stringLinkedHashSet.add("Yeasir");
        stringLinkedHashSet.add("Arafat");
        stringLinkedHashSet.add("Aronno here");

        // Traversing elements
        for (String EnhancedLinkedHashSet : stringLinkedHashSet) {
            System.out.println(EnhancedLinkedHashSet);
        }
    }
}

/*Expected Output:

This
is
Yeasir
Arafat
Aronno here

* */