package BitManipulation;

public class LeftShift {
    private static int helper(int number, int i) {
        return number << i;// multiplies `number` with 2^i times.
    }

    public static void main(String[] args) {
        int number = 100;
        System.out.println(number + " shifted 1 position left, yields to " + helper(number, 1));
        System.out.println(number + " shifted 2 positions left, yields to " + helper(number, 2));
        System.out.println(number + " shifted 3 positions left, yields to " + helper(number, 3));
        System.out.println(number + " shifted 4 positions left, yields to " + helper(number, 4));
    }
}

/*
Expected Output::

100 shifted 1 position left, yields to 200
100 shifted 2 positions left, yields to 400
100 shifted 3 positions left, yields to 800
100 shifted 4 positions left, yields to 1600

* */