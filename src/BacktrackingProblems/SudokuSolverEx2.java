package BacktrackingProblems;

/*Follow the steps below to solve the problem:

    Create a function that checks if the given matrix is valid sudoku or not.
    Keep Hashmap for the row, column and boxes. If any number has a frequency
    greater than 1 in the hashMap return, false else return true;
    Create a recursive function that takes a grid and the current row and column index.
    Check some base cases.
        If the index is at the end of the matrix, i.e., i=N-1 and j=N then check
        if the grid is safe or not, if safely print the grid and return true else return false.
        The other base case is when the value of column is N, i.e., j = N,
        then move to the next row, i.e., i++ and j = 0.
    If the current index is not assigned, then fill the element from 1 to 9 and
    recur for all 9 cases with the index of the next element, i.e., i, j+1.
    If the recursive call returns true, then break the loop and return true.
    If the current index is assigned, then call the recursive function with
    the index of the next element, i.e., i, j+1

Below is the implementation of the above approach:*/
public class SudokuSolverEx2 {
    // N is the size of the 2D matrix N*N
    static int N = 9;

    /* Takes a partially filled-in grid and attempts to assign values
    to all unassigned locations in such a way to meet the requirements
    for Sudoku solution (non-duplication across rows, columns, and boxes) */
    static boolean solveSudoku(int[][] grid, int rows, int columns) {

        /*if we have reached the 8th rows and 9th column (0 indexed matrix),
           we are returning true to avoid further backtracking */
        if (rows == N - 1 && columns == N)
            return true;

        // Check if column value becomes 9, we move to the next rows,
        // and column starts from 0
        if (columns == N) {
            rows++;
            columns = 0;
        }

        // Check if the current position of the grid already
        // contains value >0, we iterate for next column
        if (grid[rows][columns] != 0)
            return solveSudoku(grid, rows, columns + 1);

        for (int num = 1; num < 10; num++) {

            // Check if it is safe to place the num (1-9) in the
            // given rows, columns ->we move to the next column
            if (isSafe(grid, rows, columns, num)) {

                /*  assigning the num in the current (rows,columns) position of the grid, and
                assuming our assigned num in the position is correct */
                grid[rows][columns] = num;

                // Checking for next possibility with next column
                if (solveSudoku(grid, rows, columns + 1))
                    return true;
            }
            /* removing the assigned num, since our assumption was wrong,
            and we go for the next assumption with diff num value   */
            grid[rows][columns] = 0;
        }
        return false;
    }

    // A utility function to print grid.
    static void printGrid(int[][] grid) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                System.out.print(grid[i][j] + " ");
            System.out.println();
        }
    }

    // Check whether it will be legal to assign number to the given rows, columns
    static boolean isSafe(int[][] grid, int rows, int columns, int number) {

        // Check if we find the same number in the similar rows, we return false
        for (int x = 0; x <= 8; x++)
            if (grid[rows][x] == number)
                return false;

        // Check if we find the same number in the similar column, we return false
        for (int x = 0; x <= 8; x++)
            if (grid[x][columns] == number)
                return false;

        // Check if we find the same number in the particular 3*
        // matrix 3, we return false
        int startRow = rows - rows % 3, startCol
                = columns - columns % 3;
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (grid[i + startRow][j + startCol] == number)
                    return false;

        return true;
    }

    // Driver Code
    public static void main(String[] args) {
        int[][] grid = {{3, 0, 6, 5, 0, 8, 4, 0, 0},
                {5, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 8, 7, 0, 0, 0, 0, 3, 1},
                {0, 0, 3, 0, 1, 0, 0, 8, 0},
                {9, 0, 0, 8, 6, 3, 0, 0, 5},
                {0, 5, 0, 0, 9, 0, 6, 0, 0},
                {1, 3, 0, 0, 0, 0, 2, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 7, 4},
                {0, 0, 5, 2, 0, 6, 3, 0, 0}};

        if (solveSudoku(grid, 0, 0))
            printGrid(grid);
        else
            System.out.println("No Solution exists");
    }
}

/*Expected Output::

3 1 6 5 7 8 4 9 2
5 2 9 1 3 4 7 6 8
4 8 7 6 2 9 5 3 1
2 6 3 4 1 5 9 8 7
9 7 4 8 6 3 1 2 5
8 5 1 7 9 2 6 4 3
1 3 8 9 4 7 2 5 6
6 9 2 3 5 1 8 7 4
7 4 5 2 8 6 3 1 9

* */
