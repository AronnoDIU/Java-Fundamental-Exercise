package BacktrackingProblems;

/*Given a set of n integers, divide the set in two subsets of n/2 sizes each such that
the absolute difference of the sum of two subsets is as minimum as possible.
If n is even, then sizes of two subsets must be strictly n/2 and if n is odd,
then size of one subset must be (n-1)/2 and size of other subset must be (n+1)/2.

For example, let given set be {3, 4, 5, -3, 100, 1, 89, 54, 23, 20}, the size of
set is 10. Output for this set should be {4, 100, 1, 23, 20} and {3, 5, -3, 89, 54}.
Both output subsets are of size 5 and sum of elements in both subsets is same (148 and 148).
Let us consider another example where n is odd.

Let given set be {23, 45, -34, 12, 0, 98, -99, 4, 189, -1, 4}.
The output subsets should be {45, -34, 12, 98, -1} and{23, 0, -99, 4, 189, 4}.
The sums of elements in two subsets are 120 and 121 respectively.

The following solution tries every possible subset of half size.
If one subset of half size is formed, the remaining elements
form the other subset. We initialize current set as empty
and one by one build it. There are two possibilities
for every element, either it is part of current set,
or it is part of the remaining elements (other subset).
We consider both possibilities for every element.
When the size of current set becomes n/2, we check whether these
solutions are better than the best solution available so far.
If it is, then we update the best solution.*/
public class TugOfWar {
    public int minimumDifference;

    // function that tries every possible solution
    // by calling itself recursively
    void TOWUtil(int[] array, int number, boolean[] currentElements,
                 int numberOfSelectedElements, boolean[] solution,
                 int summation, int currentSummation, int currentPosition) {
        // checks whether it is going out of bound
        if (currentPosition == number)
            return;

        // checks that the numbers of elements left are not less than
        // the number of elements required to form the solution.
        if ((number / 2 - numberOfSelectedElements) > (number - currentPosition))
            return;

        // consider the cases when current element
        // is not included in the solution
        TOWUtil(array, number, currentElements, numberOfSelectedElements,
                solution, summation, currentSummation, currentPosition+1);

        // add the current element to the solution
        numberOfSelectedElements++;
        currentSummation = currentSummation + array[currentPosition];
        currentElements[currentPosition] = true;

        // checks if a solution is formed
        if (numberOfSelectedElements == number / 2) {
            // checks if the solution formed is better than the best solution so far
            if (Math.abs(summation / 2 - currentSummation) < minimumDifference) {
                minimumDifference = Math.abs(summation / 2 - currentSummation);
                if (number >= 0)
                    System.arraycopy(currentElements, 0, solution, 0, number);
            }
        }
        else {
            // consider the cases where current element is included in the solution
            TOWUtil(array, number, currentElements, numberOfSelectedElements,
                    solution, summation, currentSummation, currentPosition + 1);
        }

        // removes current element before returning to the caller of this function
        currentElements[currentPosition] = false;
    }

    // main function that generate an array
    void tugOfWar(int[] array) {
        int arrayLength = array.length;

        // the boolean array that contains the
        // inclusion and exclusion of an element
        // in current set. The number excluded
        // automatically form the other set
        boolean[] curr_elements = new boolean[arrayLength];

        // The inclusion/exclusion array for
        // final solution
        boolean[] solution = new boolean[arrayLength];

        minimumDifference = Integer.MAX_VALUE;

        int sum = 0;
        for (int i = 0; i < arrayLength; i++)
        {
            sum += array[i];
            curr_elements[i] = solution[i] = false;
        }

        // Find the solution using recursive
        // function TOWUtil()
        TOWUtil(array, arrayLength, curr_elements, 0,
                solution, sum, 0, 0);

        // Print the solution
        System.out.print("The first subset is: ");
        for (int i = 0; i < arrayLength; i++)
        {
            if (solution[i])
                System.out.print(array[i] + " ");
        }
        System.out.print("\nThe second subset is: ");
        for (int i = 0; i < arrayLength; i++)
        {
            if (!solution[i])
                System.out.print(array[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] array = {23, 45, -34, 12, 0, 98,
                -99, 4, 189, -1, 4};
        TugOfWar a = new TugOfWar();
        a.tugOfWar(array);
    }
}
