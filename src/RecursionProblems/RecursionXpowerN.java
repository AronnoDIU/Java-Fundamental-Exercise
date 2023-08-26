package RecursionProblems;

public class RecursionXpowerN {
    public static int calculatePower(int x, int n) {
        if (x == 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }

        int powerN_1 = calculatePower(x, n - 1);
        return x * powerN_1;
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
