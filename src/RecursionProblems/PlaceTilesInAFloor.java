package RecursionProblems;

// Place Tiles of size 1*m in a floor of size n*m
public class PlaceTilesInAFloor {

    public static int tilesPlacements(int n, int m) {

        if (n == m) {
            return 2;
        }

        if (n < m) {
            return 1;
        }


        // Vertical Placements
        int verticalPlacements = tilesPlacements(n - m, m);

        // Horizontal Placements
        int horizontalPlacements = tilesPlacements(n - 1, m);

        return verticalPlacements + horizontalPlacements;
    }

    public static void main(String[] args) {
        int n = 4, m = 2;

        System.out.println("Total ways of Tiles Placements " + tilesPlacements(n, m));
    }
}

/*
Expected Output::

Total ways of Tiles Placements 5

* */
