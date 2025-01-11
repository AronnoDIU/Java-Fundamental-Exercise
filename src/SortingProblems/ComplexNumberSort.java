package SortingProblems;

import java.util.Arrays;

public class ComplexNumberSort implements Comparable<ComplexNumberSort> {

    private final double real;
    private final double imaginary;

    public ComplexNumberSort(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double magnitude() {
        return Math.sqrt(real * real + imaginary * imaginary);
    }

    @Override
    public int compareTo(ComplexNumberSort other) {
        return Double.compare(other.magnitude(), this.magnitude());
    }

    @Override
    public String toString() {
        return real + " + " + imaginary + "i";
    }

    public static void main(String[] args) {
        ComplexNumberSort[] numbers = {
                new ComplexNumberSort(4, 5),
                new ComplexNumberSort(2, 3),
                new ComplexNumberSort(1, 1),
                new ComplexNumberSort(3, 4)
        };

        Arrays.sort(numbers);

        System.out.println("Sorted complex numbers in descending order:");
        for (ComplexNumberSort number : numbers) {
            System.out.println(number);
        }
    }
}