package RecursionProblems;

// Check if an Array is Sorted(Strictly Increasing) like 12345. not Like 12344
public class CheckArraySortedEx1 {
    public static boolean isSorted(int[] array, int index) {
        if (index == array.length - 1) {
            return true;
        }
        if (array[index] < array[index + 1]) {
            // Array is sorted till now
            return isSorted(array, index + 1);
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 3, 5};
        System.out.println(isSorted(array, 0));
    }
}

/*
Expected Output::

true

* */
