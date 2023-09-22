package CollectionsFramework.ListInterface.LinkedListClass;

import java.util.ArrayList;
import java.util.Comparator;

/*In Java, we have multiple methods to sort objects in ArrayList by Date.\
This can be done by using the Comparable<> interface or by the Collections.sort() method,
to accomplish this task you can use any one of them.

    Using Comparator interface
    Using Collections.sort() method

 Method 1: Using Comparator interface

 Approach:
    1. Create a new class and name that class as DateItem and create a variable of type String,
then create a constructor of class DateItem and pass that String type variable here.
    2. In the main method, create an ArrayList of type DateItem.
    3. Store the objects of DateItem in the ArrayList.
    4. Create another class called sortItems which implements Comparator and
pass our DateItem class to a comparator.
    5. Now in the Comparator class create a compare method that returns an integer and
takes two parameters of the ‘DateItem’ object as compare(Object obj1, Object obj2).
    6. Inside the compare method for return value use the compareTo() method which will
return the specified value by comparing the DateItem objects.
    7. Now in the main method use Collections.sort() method and pass the ArrayList
and ‘SortItem’ class object to it, it will sort the dates, and output will be generated.
 */
public class SortObjectsArrayListByDate {
    public static void main(String[] args) {
        // Declaring an object of type-DateItem class(user-defined)
        ArrayList<DateItem> dateItemArrayList = new ArrayList<>();

        dateItemArrayList.add(new DateItem("2020-03-25"));
        dateItemArrayList.add(new DateItem("2019-01-27"));
        dateItemArrayList.add(new DateItem("1998-01-27"));
        dateItemArrayList.add(new DateItem("1998-02-26"));

        // Sorting the ArrayList
        dateItemArrayList.sort(new sortItems());

        // Display message
        System.out.println("Sorted in Ascending Order");

        // Iterating the GenericLinkedLists using it for-each loop
        for (DateItem EnhancedDateItemArrayList : dateItemArrayList) {

            // Printing the sorted items from the List
            System.out.println(EnhancedDateItemArrayList.date);
        }
    }
}

// Helper class for DateItem
class DateItem {
    String date;

    DateItem(String date) {
        this.date = date;
    }
}

// Helper class implementing Comparator from the Comparable interface
class sortItems implements Comparator<DateItem> {
    @Override
    public int compare(DateItem firstDateItem, DateItem lastDateItem) {
        // this will sort the data in Ascending order
        return firstDateItem.date.compareTo(lastDateItem.date);
    }
}

/*Expected Output:

Sorted in Ascending Order
1998-01-27
1998-02-26
2019-01-27
2020-03-25

* */
