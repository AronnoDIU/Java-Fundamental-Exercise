package BacktrackingProblems;

/*The puzzle game Magnets involves placing a set of domino-shaped magnets
(or electrics or other polarized objects) in a subset of slots on a board
to satisfy a set of constraints. For example, the puzzle on the left
has the solution shown on the right:

Each slot contains either a blank entry (indicated by ‘x’s), or a “magnet”
with a positive and negative end. The numbers along the left and top sides
show the numbers of ‘+’ squares in particular rows or columns. Those along
the right and bottom show the number of ‘-’ signs in particular rows or columns.
Rows and columns without a number at one or both ends are unconstrained as
to the number of ‘+’ or ‘-’ signs, depending on which number is not present.
In addition to fulfilling these numerical constraints, a puzzle solution must
also satisfy the constraint that no two orthogonally touching squares may have
the same sign (diagonally joined squares are not constrained). You are given
top[], bottom[], left[], right[] arrays indicates the count of + or – along
the top(+), bottom(-), left(+) and right(-) edges respectively. Values of -1
indicate any number of + and – signs. Also given matrix rules[][] contain any
one T, B, L or R characters. For a vertical slot in the board, T indicates
its top end and B indicates the bottom end. For a horizontal slot in the board,
L indicates a left end and R indicates the right end. */
public class MagnetPuzzle {
    public static boolean
    canPutPatternHorizontally(char[][] rules, int i, int j, char[] pat) {
        if (j - 1 >= 0 && rules[i][j - 1] == pat[0]) {
            return false;
        } else if (i - 1 >= 0 && rules[i - 1][j] == pat[0]) {
            return false;
        } else if (i - 1 >= 0 && rules[i - 1][j + 1] == pat[1]) {
            return false;
        } else return j + 2 >= rules[0].length || rules[i][j + 2] != pat[1];
    }

    public static boolean checkConstraints(char[][] rules) {

        int[] top = {1, -1, -1, 2, 1, -1};
        int[] bottom = {2, -1, -1, 2, -1, 3};
        int[] left = {2, 3, -1, -1, -1};
        int[] right = {-1, -1, -1, 1, -1};

        int[] pCountH = new int[rules.length];
        for (int i = 0; i < rules.length; i++) {
            pCountH[i] = 0;
        }

        int[] nCountH = new int[rules.length];
        for (int i = 0; i < rules.length; i++) {
            nCountH[i] = 0;
        }

        for (int row = 0; row < rules.length; row++) {
            for (int col = 0; col < rules[0].length; col++) {
                char ch = rules[row][col];
                if (ch == '+') {
                    pCountH[row] += 1;
                } else if (ch == '-') {
                    nCountH[row] += 1;
                }
            }
        }


        int[] pCountV = new int[rules[0].length];
        for (int i = 0; i < rules[0].length; i++) {
            pCountV[i] = 0;
        }

        int[] nCountV = new int[rules[0].length];
        for (int i = 0; i < rules[0].length; i++) {
            nCountV[i] = 0;
        }


        for (int col = 0; col < rules[0].length; col++) {
            for (char[] rule : rules) {
                char ch = rule[col];
                if (ch == '+') {
                    pCountV[col] += 1;
                } else if (ch == '-') {
                    nCountV[col] += 1;
                }
            }
        }

        for (int row = 0; row < rules.length; row++) {
            if (left[row] != -1) {
                if (pCountH[row] != left[row]) {
                    return false;
                }
            }

            if (right[row] != -1) {
                if (nCountH[row] != right[row]) {
                    return false;
                }
            }

        }


        for (int col = 0; col < rules[0].length; col++) {
            if (top[col] != -1) {
                if (pCountV[col] != top[col]) {
                    return false;
                }
            }

            if (bottom[col] != -1) {
                if (nCountV[col] != bottom[col]) {
                    return false;
                }
            }
            // if (top[col] != -1 and pCountH[col] != top[col]) or (bottom[col] != -1 and nCountH[col] != bottom[col]) :
            // return False
        }


        return true;
    }


    public static boolean
    canPutPatternVertically(char[][] rules, int i, int j, char[] pat) {
        if (j - 1 >= 0 && rules[i][j - 1] == pat[0]) {
            return false;
        } else if (i - 1 >= 0 && rules[i - 1][j] == pat[0]) {
            return false;
        } else return j + 1 >= rules[0].length || rules[i][j + 1] != pat[0];
    }

    public static void solveMagnets(char[][] rules, int i, int j) {

        // check the constraint before printing
        if (i == rules.length && j == 0) {
            if (checkConstraints(rules)) {

                // Printing rules array.
                System.out.print("[");
                for (char[] rule : rules) {
                    System.out.print("[");
                    for (int indexJ = 0; indexJ < rules[0].length; indexJ++) {
                        System.out.print("'" + rule[indexJ] + "', ");
                    }
                    System.out.print("]");
                }
                System.out.print("]");
            }

        } else if (j >= rules[0].length) {
            solveMagnets(rules, i + 1, 0);
        }
        // normal cases
        else {

            if (rules[i][j] == 'L') {

                // option 1 +-
                if (canPutPatternHorizontally(rules, i, j, "+-".toCharArray())) {
                    rules[i][j] = '+';
                    rules[i][j + 1] = '-';

                    solveMagnets(rules, i, j + 2);

                    rules[i][j] = 'L';
                    rules[i][j + 1] = 'R';
                }

                // option 2 -+
                if (canPutPatternHorizontally(rules, i, j, "-+".toCharArray())) {
                    rules[i][j] = '-';
                    rules[i][j + 1] = '+';

                    solveMagnets(rules, i, j + 2);

                    rules[i][j] = 'L';
                    rules[i][j + 1] = 'R';
                }

                // option 3 xx
                rules[i][j] = 'x';
                rules[i][j + 1] = 'x';

                solveMagnets(rules, i, j + 2);

                rules[i][j] = 'L';
                rules[i][j + 1] = 'R';

            }
            // vertical check
            else if (rules[i][j] == 'T') {
                // option 1 +-
                if (canPutPatternVertically(rules, i, j, "+-".toCharArray())) {
                    rules[i][j] = '+';
                    rules[i + 1][j] = '-';

                    solveMagnets(rules, i, j + 1);

                    rules[i][j] = 'T';
                    rules[i + 1][j] = 'B';
                }

                // option 2 -+
                if (canPutPatternVertically(rules, i, j, "-+".toCharArray())) {
                    rules[i][j] = '-';
                    rules[i + 1][j] = '+';

                    solveMagnets(rules, i, j + 1);

                    rules[i][j] = 'T';
                    rules[i + 1][j] = 'B';
                }


                // option 3 xx

                rules[i][j] = 'x';
                rules[i + 1][j] = 'x';

                solveMagnets(rules, i, j + 1);

                rules[i][j] = 'T';
                rules[i + 1][j] = 'B';

            } else {
                solveMagnets(rules, i, j + 1);
            }
        }
    }

    public static void main(String[] args) {
        char[][] rules = {
                {'L', 'R', 'L', 'R', 'T', 'T'},
                {'L', 'R', 'L', 'R', 'B', 'B'},
                {'T', 'T', 'T', 'T', 'L', 'R'},
                {'B', 'B', 'B', 'B', 'T', 'T'},
                {'L', 'R', 'L', 'R', 'B', 'B'}
        };
        solveMagnets(rules, 0, 0);
    }
}

/*Expected Output::

[['+', '-', '+', '-', 'x', '-', ]
['-', '+', '-', '+', 'x', '+', ]
['x', 'x', '+', '-', '+', '-', ]
['x', 'x', '-', '+', 'x', '+', ]
['-', '+', 'x', 'x', 'x', '-', ]]

* */
