package Enumerations;

public class EnumDemo {

    public static void main(String[] args) {

        Priority priority = Priority.HIGH;

        switch (priority) {
            case HIGH -> System.out.println("High priority");
            case MEDIUM -> System.out.println("Medium priority");
            case LOW -> System.out.println("Low priority");
        }

        System.out.println("============ Enum valueOf()");

        Priority priority2 = Priority.valueOf("HIGH");
        System.out.println(priority2);

//	priority2 = Priority.valueOf("high"); // java.lang.IllegalArgumentException: No enum constant com.itbulls.learnit.javacore.enumerations.Priority.high

        System.out.println("============ Enum comparison");

        System.out.println("Priority.HIGH == Priority.MEDIUM: " + (priority == Priority.MEDIUM)); // false

        System.out.println("Priority.HIGH == Priority.HIGH: " + (priority == Priority.HIGH)); // true

        System.out.println("============ Enum ordinal()");

        System.out.println("Priority.HIGH.ordinal(): " + Priority.HIGH.ordinal());
        System.out.println("Priority.LOW.ordinal(): " + Priority.LOW.ordinal());
        System.out.println("Priority.MEDIUM.ordinal(): " + Priority.MEDIUM.ordinal());

        System.out.println("============ Enum iteration");

        Priority[] values = Priority.values();
        for (Priority priority3 : values) {
            System.out.println(priority3);
        }

        System.out.println("============ Enum fields and methods");

        System.out.println("Month.JANUARY.getDaysAmount(): " + Month.JANUARY.getDaysAmount());

    }

}

/*
Expected Output::

High priority
============ Enum valueOf()
HIGH
============ Enum comparison
Priority.HIGH == Priority.MEDIUM: false
Priority.HIGH == Priority.HIGH: true
============ Enum ordinal()
Priority.HIGH.ordinal(): 0
Priority.LOW.ordinal(): 2
Priority.MEDIUM.ordinal(): 1
============ Enum iteration
HIGH
MEDIUM
LOW
============ Enum fields and methods
Month.JANUARY.getDaysAmount(): 31

* */