package Generic;

public record ComplexNumber(double real, double imaginary) {

    public double magnitude() {
        return Math.sqrt(real * real + imaginary * imaginary);
    }

    @Override
    public String toString() {
        return real + " + " + imaginary + "i";
    }
}
