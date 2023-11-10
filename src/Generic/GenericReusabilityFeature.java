package Generic;

import java.io.Serializable;

// Generic Reusability Feature
public class GenericReusabilityFeature {
    // As we are comparing the Non-primitive data types, we need to use Comparable class
    public static <T extends Comparable<T>> void sortGenerics(T[] a) {

        //Bubble Sort logic
        for (int i = 0; i < a.length - 1; i++) {

            for (int j = 0; j < a.length - i - 1; j++) {

                if (a[j].compareTo(a[j + 1]) > 0) {

                    swapFunction(j, j + 1, a);
                }
            }
        }

        // Printing the elements after sorted
        for (T i : a) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }

    public static <T> void swapFunction(int i, int j, T[] a) {
        T t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    @SafeVarargs
    public static <T extends Comparable<T>> T max(T... a) {
        T max = a[0]; // assume a[0] is initially the largest

        for (int i = 1; i < a.length; i++) {
            if (a[i].compareTo(max) > 0) {
                max = a[i]; // a[i] is the largest so far
            }

            if (a[i].compareTo(max) == 0) {
                max = a[i];
            }

            if (a[i].compareTo(max) < 0) {
                max = a[i];
            }
        }
        return max; // returns the largest object
    }

    @SafeVarargs
    public static <T extends Comparable<T> & Serializable> void maxPrint(T... a) {

        T max = max(a); // pass arguments of type T

        System.out.println("Max of " + a[0] + " and " +
                a[1] + " and " + a[2] + " is " + max); // print max
    }

    public static <T> void genericDisplay(T element) {
        System.out.println(element.getClass().getName() + " = " + element);
    }

    public static void main(String[] args) {
        Integer[] integers = {100, 22, 58, 41, 6, 50};
        String[] strings = {"Virat", "Rohit", "Abhinay", "Chandu", "Sam", "Bharat", "Kalam"};
        Character[] characters = {'v', 'g', 'a', 'c', 'x', 'd', 't'};
        Float[] floats = {1.1f, 2.2f, 3.3f, 4.4f, 5.5f, 6.6f, 7.7f};
        Double[] doubles = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7};
        Boolean[] booleans = {true, false, true, false, true, false, true};

        maxPrint(integers);
        maxPrint(strings);
        maxPrint(characters);
        maxPrint(floats);
        maxPrint(doubles);
        maxPrint(booleans);

        System.out.print("Unsorted Integer array : ");
        for (Integer integer : integers) {
            System.out.print(integer + ", ");
        }
        System.out.println();

        System.out.print("Unsorted Character array : ");
        for (Character character : characters) {
            System.out.print(character + ", ");
        }
        System.out.println();

        System.out.print("Unsorted String array : ");
        for (String string : strings) {
            System.out.print(string + ", ");
        }
        System.out.println();

        System.out.print("Sorted Integer array : ");
        sortGenerics(integers);

        System.out.print("Sorted Character array : ");
        sortGenerics(characters);

        System.out.print("Sorted String array : ");
        sortGenerics(strings);

        System.out.println("Max of " + integers[0] + " and " +
                integers[1] + " and " + integers[2] + " is " + max(integers));

        System.out.println("Max of " + strings[0] + " and " +
                strings[1] + " and " + strings[2] + " is " + max(strings));

        System.out.println("Max of " + characters[0] + " and " +
                characters[1] + " and " + characters[2] + " is " + max(characters));
    }
}

/*Expected Output:

Sorted Integer array : 6, 22, 41, 50, 58, 100,
Sorted Character array : a, c, d, g, t, v, x,
Sorted String array : Abhinay, Bharat, Chandu, Kalam, Rohit, Sam, Virat,

* */