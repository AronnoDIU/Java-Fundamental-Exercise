package BacktrackingProblems;

/* Java program to solve Rat in
 a Maze problem using backtracking */

/*Approach: Form a recursive function, which will follow a path and check
if the path reaches the destination or not. If the path does not reach
the destination, then backtrack and try other paths.

Algorithm:

    1. Create a solution matrix, initially filled with 0’s.
    2. Create a recursive function, which takes initial matrix,
output matrix and position of rat (i, j).
    3. If the position is out of the matrix or the position is not valid, then return.
    4. Mark the position output[i][j] as 1 and check if the current
position is destination or not. If destination is reached, print the output matrix and return.
    5. Recursively call for position (i+1, j) and (i, j+1).
    6. Unmark position (i, j), i.e output[i][j] = 0.*/

public class RatInAMaze {
    // Size of the Maze
    static int NSize;

    // A utility function to print solution matrix solution[NSize][NSize]
    void printSolution(int[][] solution) {
        for (int i = 0; i < NSize; i++) {
            for (int j = 0; j < NSize; j++)
                System.out.print(
                        " " + solution[i][j] + " ");
            System.out.println();
        }
    }

    /* A utility function to check
        if x, y is valid index for N*N maze */
    boolean isSafe(
            int[][] maze, int x, int y) {
        // if (x, y outside maze) return false
        return (x >= 0 && x < NSize && y >= 0
                && y < NSize && maze[x][y] == 1);
    }

    /* This function solves the Maze problem using
    Backtracking. It mainly uses solveMazeUtil()
    to solve the problem. It returns false if no
    path is possible, otherwise return true and
    prints the path in the form of 1s. Please note
    that there may be more than one solution, this
    function prints one of the feasible solutions.*/
    void solveMaze(int[][] maze) {
        int[][] solution = new int[NSize][NSize];

        if (!solveMazeUtil(maze, 0, 0, solution)) {
            System.out.print("Solution doesn't exist");
            return;
        }

        printSolution(solution);
    }

    //     A recursive utility function to solve a Maze problem.
    boolean solveMazeUtil(int[][] maze, int x, int y, int[][] solution) {
        // if (x, y is goal) return true
        if (x == NSize - 1 && y == NSize - 1
                && maze[x][y] == 1) {
            solution[x][y] = 1;
            return true;
        }

        // Check if maze[x][y] is valid
        if (isSafe(maze, x, y)) {
            // Check if the current block is already part of the solution path.
            if (solution[x][y] == 1)
                return false;

            // mark x, y as part of solution path
            solution[x][y] = 1;

            /* Move forward in x direction */
            if (solveMazeUtil(maze, x + 1, y, solution))
                return true;

            /* If moving in x direction doesn't give
            a solution, then Move down in y direction */
            if (solveMazeUtil(maze, x, y + 1, solution))
                return true;

            /* If none of the above movements works then
            BACKTRACK: unmark x, y as part of solution
            path */
            solution[x][y] = 0;
            return false;
        }

        return false;
    }

    public static void main(String[] args) {
        RatInAMaze ratMaze = new RatInAMaze();
        int[][] maze =
                       {{1, 0, 0, 0},
                        {1, 1, 0, 1},
                        {0, 1, 0, 0},
                        {1, 1, 1, 1}};

        NSize = maze.length;
        ratMaze.solveMaze(maze);
    }
}

/*
Expected Output::

 1  0  0  0
 1  1  0  0
 0  1  0  0
 0  1  1  1

* */
