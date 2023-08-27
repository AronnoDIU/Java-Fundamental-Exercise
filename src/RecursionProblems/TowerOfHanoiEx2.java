package RecursionProblems;

public class TowerOfHanoiEx2 {
    static void towerOfHanoi(int n, String source, String helper, String destination) {
        if (n == 0) {
            return;
        }
        towerOfHanoi(n - 1, source, destination, helper);

        System.out.println("Move disk " + n + " from rod "
                + source + " to rod " + helper);

        towerOfHanoi(n - 1, destination, helper, source);
    }

    // Driver code
    public static void main(String[] args) {
        int N = 3;

        // S, H and D are names of rods
        towerOfHanoi(N,"source","helper","destination");

//        towerOfHanoi(N, 'S', 'H', 'D'); //for char type
    }
}

/*
Expected Output::

Move disk 1 from rod source to rod helper
Move disk 2 from rod source to rod destination
Move disk 1 from rod helper to rod destination
Move disk 3 from rod source to rod helper
Move disk 1 from rod destination to rod source
Move disk 2 from rod destination to rod helper
Move disk 1 from rod source to rod helper

* */
