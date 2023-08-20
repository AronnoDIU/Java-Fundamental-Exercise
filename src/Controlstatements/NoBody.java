package ControlStatements;

// The target of a loop can be empty.
public class NoBody {

    public static void main(String[] args) {

        int i, j;

        i = 100;
        j = 200;

        // Find midpoint between i and j
        while (++i < --j) ; // Nobody in this loop
//		while (++i < --j) //without ";" this program print different thing
        System.out.println("Midpoint is " + i);

    }

}

/*Expected Output::

Midpoint is 150

* */