package BacktrackingProblems;

import java.util.ArrayList;
import java.util.List;

// N-Queens Problem
/*N * N Chessboard
        N numbers of Queens
    Print all solutions where Queens are safe.

       (Upper Left)             (Upper Right)
        (r-1,c-1)                 (r-1,c+1)
                   \_______________/
Row = r;            |_\__|____|_/_|
Column = c;         |____|_Q1_|___|
                    |__/_|____|_\_|
                    /             \
               (r+1,c-1)        (r+1,c+1)
             (Lower Left)       (Lower Right)

* */
public class N_Queens {
    public boolean isSafe(int rows, int columns, char[][] board) {
        // Check Horizontal Directions
        for (int j = 0; j < board.length; j++) {
            if (board[rows][j] == 'Q') {
                return false;
            }
        }

        // Check Vertical Directions
        for (int i = 0; i < board[0].length; i++) {
            if (board[i][columns] == 'Q') {
                return false;
            }
        }

        // Check Upper Left Directions   // cUP = Columns of Upper Left Directions
        if ( int cUL = columns; int r = rows; cUL >= 0 && r >= 0; cUL--, r--){
            if (board[r][cUL] == 'Q') {
                return false;
            }
        }

        // Check Upper Right Directions
        r = rows;
        for (int cUR = columns; cUR < board.length && r >= 0; r--, cUR++) {
            if (board[r][cUR] == 'Q') {   // cUR = Columns of Upper Right Directions
                return false;
            }
        }

        // Check Lower Left Directions
        r = rows;
        for (int cLL = columns; cLL >= 0 && r < board.length; r++, cLL--) {
            if (board[r][cLL] == 'Q') {   // cLL = Columns of Lower Left Directions
                return false;
            }
        }

        // Check Lower Right Directions
        r = rows;
        for (int cLR = columns; cLR < board.length && r < board.length; cLR++, r++) {
            if (board[r][cLR] == 'Q') {   // cLR = Columns of Lower Right Directions
                return false;
            }
        }
    }

    public void saveBoard(char[][] board, List<List<String>> allBoards) {
        String rows = "";
        List<String> newBoard = new ArrayList<>();

        for (int i = 0; i < board.length; i++) {
            rows = "";

            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 'Q')
                    rows += 'Q';
                else
                    rows += '.';
            }
            newBoard.add(rows);
        }
        allBoards.add(newBoard);
    }

    public void helper(char[][] board, List<List<String>> allBoards, int columns) {
        if (columns == board.length) {
            saveBoard(board, allBoards);
            return;
        }

        for (int rows = 0; rows < board.length; rows++) {
            if (isSafe(rows, columns, board)) {
                board[rows][columns] = 'Q';
                helper(board, allBoards, columns + 1);
                board[rows][columns] = '.';
            }
        }
    }

    public List<List<String>> solveN_Queens(int n) {
        List<List<String>> allBoards = new ArrayList<>();
        char[][] board = new char[n][n];

        helper(board, allBoards, 0);

        return allBoards;
    }

    public static void main(String[] args) {

    }
}

/*
Expected Output::

Not Completed yet

* */
