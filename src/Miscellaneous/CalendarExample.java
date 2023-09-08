package Miscellaneous;

import java.util.Calendar;
import java.util.Date;

public class CalendarExample {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
// calendar.set(2023, Calendar.SEPTEMBER, 8, 8, 27, 55);
// calendar.set(Calendar.YEAR, 2023);
// calendar.set(Calendar.MONTH, 0);
// calendar.set(Calendar.DATE, 8);
// calendar.set(Calendar.HOUR_OF_DAY, 0);
// calendar.set(Calendar.MINUTE, 0);
// calendar.set(Calendar.SECOND, 0);
        Date date = calendar.getTime();
        System.out.println(date);

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
        if(myCalendar.before(myCalendar)) {
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

Fri Sep 08 08:31:33 BDT 2023
calendar1 is not after calendar2
myCalendar is before otherCalendar
myCalendar is not before itself

* */
