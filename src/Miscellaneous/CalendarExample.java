package Miscellaneous;

//import java.util.GregorianCalendar;

import java.util.*;

public class CalendarExample {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        calendar.set(2023, Calendar.SEPTEMBER, 8, 8, 27, 55);
        calendar.set(Calendar.YEAR, 2023);
        calendar.set(Calendar.MONTH, 0);
        calendar.set(Calendar.DATE, 8);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);      // Line 10 to 16, for user defines time.

        Date date = calendar.getTime();
        System.out.println(date);

        /*This example demonstrates a basic implementation of the .get function.
        The code acquires the present-year, Month, and day of the Month from a Calendar
        instance, adjusting the Month representation to account for the 0-based index.*/

        // Get the Year, Month, and day of the getMonth
        int getYear = calendar.get(Calendar.YEAR);
        // Month values are 0-based (0 = January, 11 = December)
        int getMonth = calendar.get(Calendar.MONTH);
        int getDayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);

        // Display the retrieved values
        System.out.println("Current Year: " + getYear);
        // Adding 1 to adjust for 0-based months
        System.out.println("Current Month: " + (getMonth + 1));
        System.out.println("Day of the Month: " + getDayOfMonth);


        /*This example employs the Calendar class to set a fixed date (July 16, 2022) within
        a Calendar instance.It retrieves the year, month, and day of the month from the
        configured instance and displays them in a formatted output on the console.*/

        calendar.set(2022, Calendar.JULY, 16);

        // Get the year, month, and day of the month
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);

        // Display the retrieved values
        System.out.println("Fixed Date: " + year + "-" + (month + 1) + "-" + dayOfMonth);


        /*In the following example, .getActualMaximum() is used to retrieve the maximum value
        of both the Calendar.MONTH and Calendar.YEAR fields.This example will return the
        maximum day in the month of February of the year 2012*/

        // Set the year field to 2012
        calendar.set(Calendar.YEAR, 2012);

        // Set the month field to February
        calendar.set(Calendar.MONTH, Calendar.FEBRUARY);

        // Retrieve the actual maximum day in February of the year 2012
        int maxDay = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

        // Print the result
        System.out.println("Maximum day of the month: " + maxDay);


        /*The following example demonstrates the basic use of the method.*/

        System.out.println(" All available calendar types: ");
        Set<String> set = Calendar.getAvailableCalendarTypes();
        for (Object s : set) {
            System.out.println(s);
        }

        /*In the following example, .getDisplayNames() returns a map containing all the days
        of the week in short form for the US locale.The days are paired with integer values
        representing the index of the day in the week (Sunday is 1, Monday is 2, etc.).*/

        Map<String, Integer> map =
                calendar.getDisplayNames(Calendar.DAY_OF_WEEK, Calendar.SHORT, Locale.US);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        /*In the example below, a Calendar object is created and the current
        date is retrieved using the .getTime() method.*/

        // Get the current date object
        Date currentDate = calendar.getTime();

        // Print the current date
        System.out.println("Current date: " + currentDate);

        /*This example code creates a Calendar object, records the current time,
        sets a new time, and then prints the difference.*/

        // Get the current time in milliseconds
        long currentTime = calendar.getTimeInMillis();

        // Sets the time back to 12:00 AM today
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);

        // Get the time in milliseconds of 12:00 AM today
        long earlierToday = calendar.getTimeInMillis();

        // Prints current number of milliseconds that have passed today
        System.out.println("Time passed today so far in milliseconds: " + (currentTime - earlierToday));


        /*This example creates a calendar, displays it, clones it and displays its clone.*/

        // Cloning the original
        Calendar copy_calendar = (Calendar) calendar.clone();

        // Print copy calendar
        System.out.println(copy_calendar.getTime());


        // This example illustrates a basic implementation of the .compareTo() method:

        int calenderValue = calendar.compareTo(copy_calendar);

        // Displaying the result of comparison
        System.out.println("First" + " comparison result is: " + calenderValue);

        // Comparing the time
        calenderValue = copy_calendar.compareTo(calendar);

        // Displaying the result of comparison
        System.out.println("Second" + " comparison result is: " + calenderValue);


        // The example below demonstrates the use of the .complete() method.

        // Print the current date
        System.out.println("The current date is : " + calendar.getTime());

        // Clear the calendar
        calendar.clear();

        // Set a new getYear and call complete()
        calendar.set(Calendar.YEAR, 2021);
//        calendar.complete();

        // Print the current date
        System.out.println("New date is : " + calendar.getTime());


         /*In this example, the CalendarClearExample class demonstrates the use
        of .clear() and .clear(field) methods. The first part clears all fields
        of the Calendar instance, while the second part clears the YEAR field,
        effectively setting it to its default value (which is 1970).*/

        System.out.println("Before clearing: " + calendar.getTime());

        // Clear all fields using clear()
        calendar.clear();

        System.out.println("After clearing all fields: " + calendar.getTime());

        // Set the calendar to a specific date and time
        calendar.set(Calendar.YEAR, 2023);
        calendar.set(Calendar.MONTH, Calendar.JULY);
        calendar.set(Calendar.DAY_OF_MONTH, 19);
        calendar.set(Calendar.HOUR_OF_DAY, 15);
        calendar.set(Calendar.MINUTE, 30);

        System.out.println("Before clearing specific field: " + calendar.getTime());

        // Clear the YEAR field using clear(int field)
        calendar.clear(Calendar.YEAR);

        System.out.println("After clearing YEAR field: " + calendar.getTime());


        /* In this example, calendar1 is set to August 1, 2023, and calendar2 is set to
        September 1, 2023. Then, the .after() method is used to compare these two instances.*/

        boolean isAfter = isAfter();

        if (isAfter) {
            System.out.println("calendar1 is after calendar2");
        } else {
            System.out.println("calendar1 is not after calendar2");
        }


        /*In the example below, two Calendar instances are created. The first represents the
        current date and time, the second represents the current date and time plus two hours.
        The .before() method is used to check if the myCalendar object is before the otherCalendar
        object. The method is also used to check if the myCalendar object is before itself.*/


        // Create a Calendar instance representing the current date and time
        Calendar myCalendar = Calendar.getInstance();

        // Create another Calendar instance representing the current date and time plus two hours
        Calendar otherCalendar = Calendar.getInstance();
        otherCalendar.add(Calendar.HOUR_OF_DAY, 2);

        // Check if calendar is before otherCalendar
        if (myCalendar.before(otherCalendar)) {
            System.out.println("myCalendar is before otherCalendar");
        } else {
            System.out.println("myCalendar is not before otherCalendar");
        }

        // Check if the calendar is before itself
        if (myCalendar.before(myCalendar)) {
            System.out.println("myCalendar is before itself");
        } else {
            System.out.println("myCalendar is not before itself");
        }
    }

    private static boolean isAfter() {
        Calendar calendar1 = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();

        // Set different dates for each instance
        calendar1.set(2023, Calendar.AUGUST, 1); // August 1, 2023
        calendar2.set(2023, Calendar.SEPTEMBER, 1); // September 1, 2023

        // Check if calendar1 is after calendar2
        return calendar1.after(calendar2);
    }
}

/*Expected Output::

Sun Jan 08 00:00:00 BDT 2023
Current Year: 2023
Current Month: 1
Day of the Month: 8
Fixed Date: 2022-7-16
Maximum day of the month: 29
 All available calendar types:
japanese
buddhist
gregory
Thu : 5
Tue : 3
Wed : 4
Sat : 7
Fri : 6
Sun : 1
Mon : 2
Current date: Thu Feb 16 00:00:00 BDT 2012
Time passed today so far in milliseconds: 473
Thu Feb 16 00:00:00 BDT 2012
First comparison result is: 0
Second comparison result is: 0
The current date is : Thu Feb 16 00:00:00 BDT 2012
New date is : Fri Jan 01 00:00:00 BDT 2021
Before clearing: Fri Jan 01 00:00:00 BDT 2021
After clearing all fields: Thu Jan 01 00:00:00 BDT 1970
Before clearing specific field: Wed Jul 19 15:30:00 BDT 2023
After clearing YEAR field: Sun Jul 19 15:30:00 BDT 1970
calendar1 is not after calendar2
myCalendar is before otherCalendar
myCalendar is not before itself

* */
