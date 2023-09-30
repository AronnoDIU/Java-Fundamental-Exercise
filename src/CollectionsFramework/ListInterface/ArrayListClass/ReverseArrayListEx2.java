package CollectionsFramework.ListInterface.ArrayListClass;

import java.util.ArrayList;

/**
 * 1. By writing our own function(without using additional space):
 * In the previous example, an arraylist is used additionally for
 * storing all the reversed elements which take more space.
 * To avoid that, the same arraylist can be used for reversing.
 * Logic:
 * 1. Run the loop for n/2 times when ‘n’ is the number of elements in the arraylist.
 * 2. In the first pass, Swap the first and nth element
 * 3. In the second pass, Swap the second and (n-1)th element, and so on till you reach the mid of the arraylist.
 * 4. Return the arraylist after the loop termination.
 */
public class ReverseArrayListEx2 {
    public static void main(String[] args) {
        RevArrayList2 obj = new RevArrayList2();

        // Declaring arraylist without any initial size
        ArrayList<Integer> arrayli = new ArrayList<Integer>();

        // Appending elements at the end of the list
        arrayli.add(new Integer(12));
        arrayli.add(new Integer(13));
        arrayli.add(new Integer(123));
        arrayli.add(new Integer(54));
        arrayli.add(new Integer(1));
        System.out.print("Elements before reversing: ");
        obj.printElements(arrayli);
        arrayli = obj.reverseArrayList(arrayli);
        System.out.print("\nElements after reversing: ");
        obj.printElements(arrayli);
    }
}

class RevArrayList2 {

    // Takes an arraylist as a parameter and returns a reversed arraylist
    public ArrayList<Integer> reverseArrayList(ArrayList<Integer> integerArrayList) {
        for (int i = 0; i < integerArrayList.size() / 2; i++) {
            Integer temp = integerArrayList.get(i);
            integerArrayList.set(i,
                    integerArrayList.get(integerArrayList.size() - i - 1));
            integerArrayList.set(integerArrayList.size() - i - 1, temp);
        }

        // Return the reversed arraylist
        return integerArrayList;
    }

    // Iterate through all the elements and print
    public void printElements(ArrayList<Integer> integerArrayList) {
        for (Integer EnhancedList : integerArrayList) {
            System.out.print(EnhancedList + " ");
        }
    }
}

/*Expected Output:

Elements before reversing: 12 13 123 54 1
Elements after reversing: 1 54 123 13 12

* */