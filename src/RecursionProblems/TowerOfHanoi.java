package RecursionProblems;

// Tower of Hanoi
/*                               _______
        |           |           _|__|__|_
        |           |         _|____|____|_
        |           |         |     |     |
 --------------------------------------------
     Source      Helper        Destination

    Tower of Hanoi is a mathematical puzzle where we have three rods (A, B, and C) and N disks.
Initially, all the disks are stacked in decreasing value of diameter i.e.,
the smallest disk is placed on the top, and they are on rod A. The objective of the puzzle is to
move the entire stack to another rod (here considered C), obeying the following simple rules:

    1. Only one disk can be moved at a time.
    2. Each move consists of taking the upper disk from one of the stacks and placing it on
 top of another stack i.e. a disk can only be moved if it is the uppermost disk on a stack.
    3. No disk may be placed on top of a smaller disk.

* */
public class TowerOfHanoi {
    public static void towerOfHanoi(int N,
                                    String source, String helper, String destination) {

        if (N == 0) {
            return;
        }

        if (N == 1) {
            System.out.println("Transfer Disk " + N + " from " + source + " to " + destination);
            return;
        }

        towerOfHanoi(N - 1, source, destination, helper);

        System.out.println("Transfer Disk " + N + " from " + source + " to " + destination);
        towerOfHanoi(N - 1, helper, source, destination);
    }

    public static void main(String[] args) {
        int N = 3;
        towerOfHanoi(N, "source", "helper", "destination");
    }
}

/*
Expected Output::

Transfer Disk 1 from source to destination
Transfer Disk 2 from source to helper
Transfer Disk 1 from destination to helper
Transfer Disk 3 from source to destination
Transfer Disk 1 from helper to source
Transfer Disk 2 from helper to destination
Transfer Disk 1 from source to destination

* */


