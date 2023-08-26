package RecursionProblems;

public class RecursionFactorial {
    public static int calculateFactorial(int number) {
        if (number == 1 || number == 0) {
            return 1;
        }
        int factorialNumber_1 = calculateFactorial(number - 1);

        return number * factorialNumber_1;
    }

    public static void main(String[] args) {
        int number = 5;
        int answer = calculateFactorial(number);
        System.out.println(answer);
    }
}

/*
Expected Output::

120

* */