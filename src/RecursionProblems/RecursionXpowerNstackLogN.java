package RecursionProblems;

// This JAVA program Print X^n ( Stack height = log n).
public class RecursionXpowerNstackLogN {
    public static int calculatePower(int x, int n) {
        if (x == 0) {   // Base case 1
            return 0;
        }
        if (n == 0) {   // Base case 2
            return 1;
        }

        // if n is odd
        if (n % 2 == 0) {
            return calculatePower(x, n / 2) * calculatePower(x, n / 2);
        }

        // if n is even
        else {
            return calculatePower(x, n / 2) * calculatePower(x, n / 2) * x;
        }
    }

    public static void main(String[] args) {
        int x = 2, n = 5;
        int answer = calculatePower(x, n);
        System.out.println(answer);
    }
}

/*
Expected Output::

32

* */