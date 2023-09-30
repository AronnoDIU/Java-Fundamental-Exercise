package CollectionsFramework.ListInterface.ArrayListClass;

import java.util.ArrayList;

/**
 * Assuming you have gone through arraylist in java and know about arraylist.
 * This post contains different examples for reversing an
 * arraylist which are given below:
 * 1. By writing our own function(Using additional space): reverseArrayList()
 * method in RevArrayList class contains logic for reversing an arraylist with
 * integer objects. This method takes an arraylist as a parameter, traverses
 * in reverse order and adds all the elements to the newly created arraylist.
 * Finally, the reversed arraylist is returned.
 */
public class ReverseArrayList {
    public static void main(String[] args) {
        RevArrayList obj = new RevArrayList();

        // Declaring arraylist without any initial size
        ArrayList<Integer> integerArrayList = new ArrayList<>();

        // Appending elements at the end of the list
        integerArrayList.add(new Integer(1));
        integerArrayList.add(new Integer(2));
        integerArrayList.add(new Integer(3));
        integerArrayList.add(new Integer(4));
        System.out.print("Elements before reversing:");
        obj.printElements(integerArrayList);
        integerArrayList = obj.reverseArrayList(integerArrayList);
        System.out.print("\nElements after reversing:");
        obj.printElements(integerArrayList);
    }
}

class RevArrayList {

    // Takes an arraylist as a parameter and returns a reversed arraylist
    public ArrayList<Integer> reverseArrayList(ArrayList<Integer> integerArrayList) {
        // Arraylist for storing reversed elements
        ArrayList<Integer> revArrayList = new ArrayList<>();
        for (int i = integerArrayList.size() - 1; i >= 0; i--) {

            // Append the elements in reverse order
            revArrayList.add(integerArrayList.get(i));
        }

        // Return the reversed arraylist
        return revArrayList;
    }

    // Iterate through all the elements and print
    public void printElements(ArrayList<Integer> integerArrayList) {
        for (Integer EnhancedList : integerArrayList) {
            System.out.print(EnhancedList + " ");
        }
    }
}

/*Expected Output:

Elements before reversing:1 2 3 4
Elements after reversing:4 3 2 1

* */