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

    // Adding Last Node
    // Add - last Integer data
    public void addLast(int val) {
        PalindromeNode addLastNode = new PalindromeNode(val);

        if (head == null) {
            head = addLastNode;
            return;
        }
        PalindromeNode currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = addLastNode;  // Assign as a last Node
    }

    // Print GenericNode
    public void printList() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }

        PalindromeNode currentNode = head;

        while (currentNode != null) {
            System.out.print(currentNode.val + " -> ");
            currentNode = currentNode.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        IsLinkedListPalindromic isPalindromic =
                new IsLinkedListPalindromic();

        isPalindromic.addLast(1);
        isPalindromic.addLast(2);
        isPalindromic.addLast(2);
        isPalindromic.addLast(1);
        isPalindromic.printList();

        System.out.println("Is this list Palindromic? "
                + isPalindromic.isPalindrome(isPalindromic.head));
    }
}

class PalindromeNode {
    int val;
    PalindromeNode next;

    PalindromeNode(int val) {
        this.val = val;
    }
}

/*Expected Output:

1 -> 2 -> 2 -> 1 -> null
Is this list Palindromic? true

* */