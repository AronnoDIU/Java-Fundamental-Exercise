package String;

public class ComplexString {

    private final double real;
    private double imaginary = 0;

    public ComplexString(String complex) {
        double imaginary1;
        String[] parts = complex.split("\\s+");
        this.real = Double.parseDouble(parts[0]);
        imaginary1 = Double.parseDouble(parts[2].replace("i", ""));
        if (parts[1].equals("-")) {
            imaginary1 = -this.imaginary;
        }
        this.imaginary = imaginary1;
    }

    public ComplexString(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public ComplexString add(ComplexString other) {
        return new ComplexString(this.real + other.real, this.imaginary + other.imaginary);
    }

    public ComplexString subtract(ComplexString other) {
        return new ComplexString(this.real - other.real, this.imaginary - other.imaginary);
    }

    public ComplexString multiply(ComplexString other) {
        double realPart = this.real * other.real - this.imaginary * other.imaginary;
        double imaginaryPart = this.real * other.imaginary + this.imaginary * other.real;
        return new ComplexString(realPart, imaginaryPart);
    }

    public ComplexString divide(ComplexString other) {
        double denominator = other.real * other.real + other.imaginary * other.imaginary;
        double realPart = (this.real * other.real + this.imaginary * other.imaginary) / denominator;
        double imaginaryPart = (this.imaginary * other.real - this.real * other.imaginary) / denominator;
        return new ComplexString(realPart, imaginaryPart);
    }

    @Override
    public String toString() {
        return real + " + " + imaginary + "i";
    }

    public static void main(String[] args) {
        ComplexString num1 = new ComplexString("4 + 5i");
        ComplexString num2 = new ComplexString("2 + 3i");

        ComplexString sum = num1.add(num2);
        ComplexString difference = num1.subtract(num2);
        ComplexString product = num1.multiply(num2);
        ComplexString quotient = num1.divide(num2);

        System.out.println("Number 1: " + num1);
        System.out.println("Number 2: " + num2);
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
    }
}