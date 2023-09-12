package BacktrackingProblems;

/*The eight queens problem is the problem of placing eight queens on an 8×8 chessboard
such that none of them attack one another (no two are in the same row, column, or diagonal).
More generally, the n queens problem places n queens on an n×n chessboard.
There are different solutions for the problem. */

import java.util.Arrays;

/*Explanation:

    1. This pseudocode uses a backtracking algorithm to find a solution to the 8 Queen problem,
    which consists of placing 8 queens on a chessboard in such a way
    that no two queens threaten each other.
    2. The algorithm starts by placing a queen on the first column, then it proceeds to the next
    column and places a queen in the first safe row of that column.
    3. If the algorithm reaches the 8th column and all queens are placed in a safe position,
    it prints the board and returns true. If the algorithm is unable to place a queen in a safe
    position in a certain column, it backtracks to the previous column and tries a different row.
    4. The “isSafe” function checks if it is safe to place a queen on a certain row and column by
    checking if there are any queens in the same row, diagonal or anti-diagonal.
    5. It’s worth to notice that this is just a high-level pseudocode, and it might need to be
    adapted depending on the specific implementation and language you are using.*/
public class Queen8Problem {
    static final int N = 8;

    // function to check if it is safe to place a queen at a particular position
    static boolean isSafe(int[][] board, int Rows, int Column) {

        // check if there is a queen in the same Rows to the left
        for (int x = 0; x < Column; x++)
            if (board[Rows][x] == 1)
                return false;

        // check if there is a queen in the upper left diagonal
        for (int x = Rows, y = Column; x >= 0 && y >= 0; x--, y--)
            if (board[x][y] == 1)
                return false;

        // check if there is a queen in the lower left diagonal
        for (int x = Rows, y = Column; x < N && y >= 0; x++, y--)
            if (board[x][y] == 1)
                return false;

        // if there is no queen in any of the above positions, then it is safe to place a queen
        return true;
    }

    // function to solve the N-queens problem using backtracking
    static boolean solveNQueens(int[][] board, int Column) {

        // if all queens are placed, print the board
        if (Column == N) {
            for (int[] Rows : board)
                System.out.println(Arrays.toString(Rows));
            System.out.println();
            return true;
        }

        // try placing a queen in each row of the current
        // column
        for (int i = 0; i < N; i++) {
            if (isSafe(board, i, Column)) {
                board[i][Column] = 1; // place the queen
                if (solveNQueens(board, Column + 1))
                    return true;

                // backtrack if placing the queen doesn't
                // lead to a solution
                board[i][Column] = 0;
            }
        }

        // if no solution is found, return false
        return false;
    }

    // initialize the board with zeros and call the
    // solveNQueens function to solve the problem
    public static void main(String[] args) {
        int[][] board = new int[N][N];
        if (!solveNQueens(board, 0))
            System.out.println("No solution found");
    }
}
