package CollectionsFramework.GreedyAlgorithm;

public class WaterConnection {
    public static void main(String[] args) {
        int n = 9;
        int[] p = {7, 5, 4, 2, 9, 3, 6, 8, 1};
        int[] q = {4, 9, 6, 8, 7, 1, 3, 2, 5};
        int[] d = {98, 72, 10, 22, 17, 66, 75, 41, 82};
        int[] result = solve(n, p, q, d);
        for (int j : result) {
            System.out.print(j + " ");
        }
        // 4 5 5 2 2 0 0 0 0
    }
}
