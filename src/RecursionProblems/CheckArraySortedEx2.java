package RecursionProblems;

// Check if an Array is Sorted(Strictly Increasing) like 12345. not Like 12344
public class CheckArraySortedEx2 {
    public static boolean isSorted(int[] array, int index) {
        if (index == array.length - 1) {
            return true;
        }
        if (array[index] >= array[index + 1]) {  // Reversed the condition here from Ex1
            // Array is unSorted
            return false;
        }
        return isSorted(array, index + 1);
    }

    public static void main(String[] args) {
        int[] array = {1, 3, 5};
        System.out.println("Is Array Sorted? " + isSorted(array, 0));
    }
}

/*
Expected Output::

Is Array Sorted? true

* */