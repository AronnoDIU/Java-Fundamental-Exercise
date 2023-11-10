package Generic;

// Generic Reusability Feature
public class GenericReusabilityFeature {
    // As we are comparing the Non-primitive data types, we need to use Comparable class
    public static <T extends Comparable<T>> void sortGenerics(T[] a) {

        //Bubble Sort logic
        for (int i = 0; i < a.length - 1; i++) {

            for (int j = 0; j < a.length - i - 1; j++) {

                if (a[j].compareTo(a[j + 1]) > 0) {

                    swap(j, j + 1, a);
                }
            }
        }

        // Printing the elements after sorted
        for (T i : a) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }

    public static <T> void swap(int i, int j, T[] a) {
        T t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public static void main(String[] args) {
        Integer[] a = {100, 22, 58, 41, 6, 50};

        Character[] c = {'v', 'g', 'a', 'c', 'x', 'd', 't'};

        String[] s = {"Virat", "Rohit", "Abhinay", "Chandu", "Sam", "Bharat", "Kalam"};

        System.out.print("Sorted Integer array : ");
        sortGenerics(a);

        System.out.print("Sorted Character array : ");
        sortGenerics(c);

        System.out.print("Sorted String array : ");
        sortGenerics(s);
    }
}

/*Expected Output:

Sorted Integer array : 6, 22, 41, 50, 58, 100,
Sorted Character array : a, c, d, g, t, v, x,
Sorted String array : Abhinay, Bharat, Chandu, Kalam, Rohit, Sam, Virat,

* */