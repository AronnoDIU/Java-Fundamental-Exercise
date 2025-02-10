package RecursionProblems;

public class KnightsTour {
    private static final int[] xMoves = {2, 1, -1, -2, -2, -1, 1, 2};
    private static final int[] yMoves = {1, 2, 2, 1, -1, -2, -2, -1};
    private final int[][] board;
    private final int size;

    public KnightsTour(int size) {
        this.size = size;
        board = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                board[i][j] = -1;
            }
        }
        board[0][0] = 0; // starting position
    }

    public boolean solve() {
        return solve(0, 0, 1);
    }

    private boolean solve(int x, int y, int moveCount) {
        if (moveCount == size * size) {
            return true;
        }

        for (int i = 0; i < xMoves.length; i++) {
            int nextX = x + xMoves[i];
            int nextY = y + yMoves[i];
            if (isSafe(nextX, nextY)) {
                board[nextX][nextY] = moveCount;
                if (solve(nextX, nextY, moveCount + 1)) {
                    return true;
                }
                board[nextX][nextY] = -1; // backtrack
            }
        }
        return false;
    }

    private boolean isSafe(int x, int y) {
        return x >= 0 && y >= 0 && x < size && y < size && board[x][y] == -1;
    }

    public void printSolution() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(board[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int size = 8; // You can change the size for different N
        KnightsTour knightsTour = new KnightsTour(size);
        if (knightsTour.solve()) {
            knightsTour.printSolution();
        } else {
            System.out.println("No solution exists.");
        }
    }
}
