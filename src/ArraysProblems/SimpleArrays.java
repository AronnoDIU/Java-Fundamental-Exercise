package ArraysProblems;

//Demonstrate a one dimensional Array
public class SimpleArrays {
    public static void main(String[] args) {

        int[] month_days;
        month_days = new int[12];
        month_days[0] = 31;
        month_days[1] = 28;
        month_days[2] = 31;
        month_days[3] = 30;
        month_days[4] = 31;
        month_days[5] = 30;
        month_days[6] = 31;
        month_days[7] = 31;
        month_days[8] = 30;
        month_days[9] = 31;
        month_days[10] = 30;
        month_days[11] = 31;
        System.out.println("April has " + month_days[3] + " days.");

        // An improved version of the previous declaration of Array
        int[] month_days_ExtendedVersionOfPreviousArray = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        System.out.println("July has " + month_days_ExtendedVersionOfPreviousArray[6] + " days.");

    }
}

/*Expected Output::

April has 30 days.
July has 31 days.

* */
