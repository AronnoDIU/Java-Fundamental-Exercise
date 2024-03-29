package BacktrackingProblems;

// Java program for a Knight Tour problem

/*Problem Statement:
Given an N*N board with the Knight placed on the first block of an empty board.
Moving, according to the rules of chess knight, must visit each square exactly once.
Print the order of each cell in which they are visited.*/

/*Following is the Backtracking algorithm for Knight’s tour problem:

If (all squares are visited){
    print the solution
} Else {
   a) Add one of the next moves to solution vector and recursively
   check if this move leads to a solution. (A Knight can make maximum
   eight moves. We choose one of the 8 moves in this step).

   B) If the move chosen in the above step doesn't lead to a solution,
   then remove this move from the solution vector and try other
   alternative moves.

   C) If none of the alternative work then return false (Returning false
   will remove the previously added item in recursion, and if false is
   returned by the initial call of recursion, then "no solution exists"
})*/

public class TheKnightsTourProblem {
    static int N = 8;

    /* A utility function to check if i,j are
       valid indexes for N*N chessboard */
    static boolean isSafe(int x, int y, int[][] sol) {
        return (x >= 0 && x < N && y >= 0 && y < N
                && sol[x][y] == -1);
    }

    /* A utility function to print solution
       matrix sol[N][N] */
    static void printSolution(int[][] sol) {
        for (int x = 0; x < N; x++) {
            for (int y = 0; y < N; y++)
                System.out.print(sol[x][y] + " ");
            System.out.println();
        }
    }

    /* This function solves the Knight Tour problem
       using Backtracking.  This function mainly
       uses solveKTUtil() to solve the problem. It
       returns false if no complete tour is possible,
       otherwise return true and prints the tour.
       Please note that there may be more than one
       solution, this function prints one of the
       feasible solutions.  */
    static void solveKT() {
        int[][] sol = new int[8][8];

        /* Initialization of solution matrix */
        for (int x = 0; x < N; x++)
            for (int y = 0; y < N; y++)
                sol[x][y] = -1;

        /* xMove[] and yMove[] define next move of Knight.
           xMove[] is for next value of x coordinate
           yMove[] is for next value of y coordinate */
        int[] xMove = {2, 1, -1, -2, -2, -1, 1, 2};
        int[] yMove = {1, 2, 2, 1, -1, -2, -2, -1};

        // Since the Knight is initially at the first block
        sol[0][0] = 0;

        /* Start from 0,0 and explore all tours using
           solveKTUtil() */
        if (!solveKTUtil(0, 0, 1, sol, xMove, yMove)) {
            System.out.println("Solution does not exist");
        } else
            printSolution(sol);

    }

    /* A recursive utility function to solve a Knight
       Tour problem */
    static boolean solveKTUtil(int x, int y, int moveI,
                               int[][] sol, int[] xMove,
                               int[] yMove) {
        int k, next_x, next_y;
        if (moveI == N * N)
            return true;

        /* Try all next moves from the current coordinate
            x, y */
        for (k = 0; k < 8; k++) {
            next_x = x + xMove[k];
            next_y = y + yMove[k];
            if (isSafe(next_x, next_y, sol)) {
                sol[next_x][next_y] = moveI;
                if (solveKTUtil(next_x, next_y, moveI + 1,
                        sol, xMove, yMove))
                    return true;
                else
                    sol[next_x][next_y]
                            = -1; // backtracking
            }
        }

        return false;
    }

    /* Driver Code */
    public static void main(String[] args) {
        // Function Call
        solveKT();
    }
}

/*
Expected Output::

0 59 38 33 30 17 8 63
37 34 31 60 9 62 29 16
58 1 36 39 32 27 18 7
35 48 41 26 61 10 15 28
42 57 2 49 40 23 6 19
47 50 45 54 25 20 11 14
56 43 52 3 22 13 24 5
51 46 55 44 53 4 21 12

* */