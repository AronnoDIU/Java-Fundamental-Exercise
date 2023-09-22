package CollectionsFramework.ListInterface;

public class IsLinkedListPalindromic {
    PalindromeNode head;

    boolean isPalindrome(PalindromeNode head) {
        if (head == null || head.next == null) {
            return true;
        }
        PalindromeNode middle = findMiddle(head);
        PalindromeNode secondHalfStart = reversedRecursive(middle.next);

        PalindromeNode firstHalfStart = head;
        while (secondHalfStart != null) {
            if (firstHalfStart.val != secondHalfStart.val) {
                return false;
            }
            firstHalfStart = firstHalfStart.next;
            secondHalfStart = secondHalfStart.next;
        }
        return true;
    }

    // Reversed LinkedList
    PalindromeNode reversedRecursive(PalindromeNode head) {
        if (head == null || head.next == null) {    //Corner Point
            return head;
        }

        PalindromeNode previousNode = null;
        PalindromeNode currentNode = head;

        while (currentNode != null) {
            PalindromeNode next = currentNode.next;
            currentNode.next = previousNode;

            previousNode = currentNode;
            currentNode = next;
        }

        return previousNode;
    }

    // Find Middle Node
    PalindromeNode findMiddle(PalindromeNode head) {
        PalindromeNode hare = head;
        PalindromeNode turtle = head;

        while (hare.next != null && hare.next.next != null) {
            hare = hare.next.next;
            turtle = turtle.next;
        }
        return turtle;
    }

    public static void main(String[] args) {
        System.out.println();
    }
}

class PalindromeNode {
    int val;
    PalindromeNode next;

    PalindromeNode(int val) {
        this.val = val;
    }
}
