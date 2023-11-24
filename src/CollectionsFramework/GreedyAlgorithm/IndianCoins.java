package CollectionsFramework.GreedyAlgorithm;

//import java.util.ArrayList;
import java.util.Arrays;

/*  Indian Coins Problem:
    We are given an infinite supply of denominations {1, 2, 5, 10, 20, 50, 100, 500, 2000}.
    Find the minimum number of coins/notes needed to make the change for a value V.

    OR,

    Given a value V, if we want to make change for V Rs, and we have infinite supply of each of the
    denominations in Indian currency, i.e., we have infinite supply of {1, 2, 5, 10, 20, 50, 100, 500, 1000} Rs
    valued coins/notes, what is the minimum number of coins and/or notes needed to make the change?

    Examples:
        Input: V = 70
        Output: 2
        We need a 50 Rs note and a 20 Rs note.

        Input: V = 121
        Output: 3
        We need a 100 Rs note, a 20 Rs note and a 1 Rs coin.

    Greedy Algorithm: Also known as Canonical Coin Systems (https://en.wikipedia.org/wiki/Canonical_coin_system)
        1. Initialize a result as empty.
        2. Find the largest denomination that is smaller than V.
        3. Add found denomination to the result. Subtract value of found denomination from V.
        4. If V becomes 0, then print the result.
        5. Else repeat steps 2 and 3 for new value of V.

    Example:
        V = 93
        Largest denominations smaller than 93 are 50.
        Add 50 to result.
        V = 93 – 50 = 43
        Largest denomination smaller than 43 is 20.
        Add 20 to result.
        V = 43 – 20 = 23
*/
public class IndianCoins {
    public static void main(String[] args) {

//        Integer[] coins = {1, 2, 5, 10, 20, 50, 100, 500, 2000}; // Wrapper class for Descending order
//
//        Arrays.sort(coins, (a, b) -> b - a); // Sort in descending order
//
//        int amount = 590;
//        int count = 0;
//
//        for (Integer coin : coins) {
//            while (amount >= coin) {
//                amount -= coin;
//                System.out.print(coin + ", ");
//                count++;
//            }
//        }

        // OR,

        int[] coins = {1, 2, 5, 10, 20, 50, 100, 500, 2000};

        Arrays.sort(coins); // Sort in ascending order

        int amount = 590;
        int count = 0;

        for (int i = coins.length - 1; i >= 0; i--) {
            while (amount >= coins[i]) {
                amount -= coins[i];
                System.out.print(coins[i] + ", ");
                count++;
            }
        }
        System.out.println(" These are the Minimum number of coins: " + count);

        // OR,

//        Integer[] coins = {1, 2, 5, 10, 20, 50, 100, 500, 2000}; // Wrapper class for Descending order
//
//        Arrays.sort(coins, (a, b) -> b - a); // Sort in descending order
//        // OR, Arrays.sort(coins, Comparator.reverseOrder()); // Sort in descending order
//        // OR, Arrays.sort(coins, Collections.reverseOrder()); // Sort in descending order
//
//        int amount = 590;
//        int countOfCoins = 0;
//
//        ArrayList<Integer> result = new ArrayList<>();
//
//        for (Integer coin : coins) {
//            if (coin <= amount) {
//                while (amount >= coin) {
//                    amount -= coin;
//                    result.add(coin);
//                    countOfCoins++;
//                }
//            }
//        }
//        System.out.println(" These are the Minimum number of coins: " + countOfCoins);
//
//        for (Integer integer : result) {
//            System.out.print(integer + ", ");
//        }
//        System.out.println();
    }
}

/*
    Expected Output:
        500, 50, 20, 20, These are the Minimum number of coins: 4
*/