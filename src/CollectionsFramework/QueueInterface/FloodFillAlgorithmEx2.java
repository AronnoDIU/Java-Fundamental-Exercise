package CollectionsFramework.QueueInterface;

import java.util.Arrays;

/**
 * Approach 2: (Using DFS)
 * <p>
 * We can use Depth–first search (DFS) to solve this problem. The idea is to start
 * from the source node in the matrix, replace its color with the replacement color
 * and recursively explore all its valid eight adjacent pixels, and replace their
 * color. Note that we don’t need a visited array here as we are replacing the color
 * of every processed node, and it won’t be considered again next time as it will
 * have a different color.
 */
public class FloodFillAlgorithmEx2 {
    // Below arrays detail all eight possible movements
    private static final int[] row = {-1, -1, -1, 0, 0, 1, 1, 1};
    private static final int[] col = {-1, 0, 1, -1, 1, -1, 0, 1};

    // Check if it is possible to go to pixel (x, y) from the
    // current pixel. The function returns false if the pixel
    // has a different color, or it's not a valid pixel
    public static boolean isSafe(char[][] matrix, int x, int y, char target) {
        return x >= 0 && x < matrix.length && y >= 0 && y < matrix[0].length
                && matrix[x][y] == target;
    }

    public static void floodFill(char[][] mat, int x, int y, char replacement) {
        // base case
        if (mat == null || mat.length == 0) {
            return;
        }

        // get the target color
        char target = mat[x][y];

        // target color is the same as replacement
        if (target == replacement) {
            return;
        }

        // replace the current pixel color with that of replacement
        mat[x][y] = replacement;

        // process all eight adjacent pixels of the current pixel and
        // recur for each valid pixel
        for (int k = 0; k < row.length; k++) {
            // if the adjacent pixel at position (x + row[k], y + col[k]) is
            // a valid pixel and has the same color as that of the current pixel
            if (isSafe(mat, x + row[k], y + col[k], target)) {
                floodFill(mat, x + row[k], y + col[k], replacement);
            }
        }
    }

    public static void main(String[] args) {
        // matrix showing a portion of the screen having different colors
        char[][] matrix = {
                "YYYGGGGGGG".toCharArray(),
                "YYYYYYGXXX".toCharArray(),
                "GGGGGGGXXX".toCharArray(),
                "WWWWWGGGGX".toCharArray(),
                "WRRRRRGXXX".toCharArray(),
                "WWWRRGGXXX".toCharArray(),
                "WBWRRRRRRX".toCharArray(),
                "WBBBBRRXXX".toCharArray(),
                "WBBXBBBBXX".toCharArray(),
                "WBBXXXXXXX".toCharArray()
        };

        // start node
        int x = 3, y = 9;    // having a target color `X`

        // replacement color
        char replacement = 'C';

        // replace the target color with a replacement color using DFS
        floodFill(matrix, x, y, replacement);

        // print the colors after replacement
        for (char[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}

/*Expected Output:

[Y, Y, Y, G, G, G, G, G, G, G]
[Y, Y, Y, Y, Y, Y, G, C, C, C]
[G, G, G, G, G, G, G, C, C, C]
[W, W, W, W, W, G, G, G, G, C]
[W, R, R, R, R, R, G, C, C, C]
[W, W, W, R, R, G, G, C, C, C]
[W, B, W, R, R, R, R, R, R, C]
[W, B, B, B, B, R, R, C, C, C]
[W, B, B, C, B, B, B, B, C, C]
[W, B, B, C, C, C, C, C, C, C]

* */