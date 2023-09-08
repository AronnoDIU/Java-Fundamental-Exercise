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
    }
}

/*Expected Output::

Fri Sep 08 07:30:02 BDT 2023
* */
