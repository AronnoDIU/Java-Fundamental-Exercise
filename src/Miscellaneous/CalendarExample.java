package Miscellaneous;

import java.util.Calendar;
import java.util.Date;

public class CalendarExample {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
//        calendar.set(2023, Calendar.SEPTEMBER, 8, 8, 27, 55);
//        calendar.set(Calendar.YEAR, 2023);
//        calendar.set(Calendar.MONTH, 0);
//        calendar.set(Calendar.DATE, 8);
//        calendar.set(Calendar.HOUR_OF_DAY, 0);
//        calendar.set(Calendar.MINUTE, 0);
//        calendar.set(Calendar.SECOND, 0);
        Date date = calendar.getTime();
        System.out.println(date);

        /* In this example, calendar1 is set to August 1, 2023, and calendar2 is set to
        September 1, 2023. Then, the .after() method is used to compare these two instances.*/


        // Create two instances of Calendar
        boolean isAfter = isAfter();

        if (isAfter) {
            System.out.println("calendar1 is after calendar2");
        } else {
            System.out.println("calendar1 is not after calendar2");
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

Fri Sep 08 07:30:02 BDT 2023
* */
