package CollectionsFramework.ListInterface.ArrayListClass;

import java.util.ArrayList;

/**
 * Java.util.ArrayList.add() Method in Java
 * boolean add(Object o) :
 * This method appends the specified element to the end of this list.
 */
public class AddElementArrayList {
    public static void main(String[] args) {
        // create an empty array list with an initial capacity
        ArrayList<Integer> integerArrayList = new ArrayList<>(5);

        // use add() method to add elements in the list
        integerArrayList.add(15);
        integerArrayList.add(20);
        integerArrayList.add(25);

        // prints all the elements available in list
        for (Integer number : integerArrayList) {
            System.out.println("Number = " + number);
        }
    }
}

/*Expected Output:

Number = 15
Number = 20
Number = 25

* */