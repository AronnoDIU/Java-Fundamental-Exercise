package RecursionProblems;

// Count Paths in a Maze to move from (0,0) to (n,m)

// Count all possible paths for (n,m) matrix
// Conditions:: Downward and Right moves only

public class CountMazePaths {

    public static int
    countPaths(int rowsIndex, int columnsIndex, int rowsMatrix, int columnsMatrix) {

        if (rowsIndex == rowsMatrix || columnsIndex == columnsMatrix) {
            return 0;
        }

        if (rowsIndex == rowsMatrix - 1 && columnsIndex == columnsMatrix - 1) {
            return 1;
        }

        // Move Downwards
        int downwardMove =
                countPaths(rowsIndex + 1, columnsIndex, rowsMatrix, columnsMatrix);

        // Move Rights
        int rightMove =
                countPaths(rowsIndex, columnsIndex + 1, rowsMatrix, columnsMatrix);

        return downwardMove + rightMove;
    }

    public static void main(String[] args) {
        int rowsMatrix = 3, columnsMatrix = 3;

        int totalPaths = countPaths(0, 0, rowsMatrix, columnsMatrix);

        System.out.println("Total Paths of this Matrix is " + totalPaths);

    }
}

/*
Expected Output::

Total Paths of this Matrix is 6

* */