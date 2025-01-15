package Generic;

import java.util.Arrays;

public class ComplexNumberSorter {

    public static void main(String[] args) {
        ComplexNumber[] numbers = {
                new ComplexNumber(4, 5),
                new ComplexNumber(2, 3),
                new ComplexNumber(1, 1),
                new ComplexNumber(3, 4)
        };

        Arrays.sort(numbers, (a, b) -> Double.compare(b.magnitude(), a.magnitude()));

        System.out.println("Sorted complex numbers in descending order:");
        for (ComplexNumber number : numbers) {
            System.out.println(number);
        }
    }
}
