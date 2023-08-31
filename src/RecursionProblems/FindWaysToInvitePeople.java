package RecursionProblems;

// Find The Number of Ways in which you can invite 'N' number of people
// to your party, single or in pairs!

/* When n = 4;
       | 1 2 3 4 (Single)                                                      |1-4 2 3
4 ways | 1 2-3 4 (2-3 Pair)                                           2 ways   |1-4 2-3
       | 1 2 3-4
       | 1 2-4 3                      | 1-2 3 4 (Single)
                               4 ways | 1-2 3-4 (1-2 Pair) & (3-4 Pair)
                                      | 1-3 2-4
                                      | 1-3-2 4

* */
public class FindWaysToInvitePeople {
    public static int inviteGuests(int guestNumber) {

        if (guestNumber <= 1) {
            return 1;
        }

        // Single person invitations
        int waysOfInvitations1 = inviteGuests(guestNumber - 1);

        // Invite with Pairs
        int waysOfInvitations2 = (guestNumber - 1) * inviteGuests(guestNumber - 2);

        return waysOfInvitations1 + waysOfInvitations2;
    }

    public static void main(String[] args) {
        int guestNumber = 4;
        System.out.println("The Total Number of Ways to invite People is " + inviteGuests(guestNumber));
    }
}

/*
Expected Output::

The Total Number of Ways to invite People is 10

* */