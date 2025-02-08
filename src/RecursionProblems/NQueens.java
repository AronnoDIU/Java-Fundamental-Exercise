package RecursionProblems;

public class NQueens {
    private final int[][] board;
    private final int size;

    public NQueens(int size) {
        this.size = size;
        board = new int[size][size];
    }

    public boolean solve() {
        return solve(0);
    }

    private boolean solve(int row) {
        if (row == size) {
            return true;
        }

        for (int col = 0; col < size; col++) {
            if (isSafe(row, col)) {
                board[row][col] = 1;
                if (solve(row + 1)) {
                    return true;
                }
                board[row][col] = 0; // backtrack
            }
        }
        return false;
    }

    private boolean isSafe(int row, int col) {
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 1) {
                return false;
            }
        }

        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        for (int i = row, j = col; i >= 0 && j < size; i--, j++) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        return true;
    }

    public void printSolution() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int size = 8; // You can change the size for different N
        NQueens nQueens = new NQueens(size);
        if (nQueens.solve()) {
            nQueens.printSolution();
        } else {
            System.out.println("No solution exists.");
        }
    }
}
