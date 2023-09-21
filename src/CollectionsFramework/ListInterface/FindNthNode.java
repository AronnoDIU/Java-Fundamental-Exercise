package CollectionsFramework.ListInterface;

// Find the N th Node from Last in LinkedList
// Delete the N th Node from LinkedList
public class FindNthNode {
    ListNode head;

    // Remove Nth Node from the Last Node
    ListNode removeNthFromEnd(ListNode head, int n) {
        if (head.next == null) {
            return null;
        }

        // find Size
        int size = 0;
        ListNode currentNode = head;
        while (currentNode != null) {
            currentNode = currentNode.next;
            size++;
        }

        if (n == size) {
            return head.next;
        }

        int indexToSearch = size - n;
        ListNode previousNode = head;
        int index = 1;
        while (index < indexToSearch) {
            previousNode = previousNode.next;
            index++;
        }
        previousNode.next = previousNode.next.next;

        return head;
    }

    // Search Nth Node from the Last Node
    void searchNthFromEnd(int n) {
        if (head.next == null) {
            return;
        }

        // find Size
        int size = 0;
        ListNode currentNode = head;

        while (currentNode != null) {
            currentNode = currentNode.next;
            size++;
        }

        if (size < n) {
            return;
        }
        currentNode = head;

        for (int i = 1; i < size - n + 1; i++)
            currentNode = currentNode.next;

        System.out.println("The Nth Node from the Last Node is " + currentNode.val);
    }

    // Add - last String data
    public void addLast(int val) {
        ListNode addLastNode = new ListNode(val);

        if (head == null) {
            head = addLastNode;
            return;
        }
        ListNode currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = addLastNode;  // Assign as a last Node
    }

    // Print Node
    public void printList() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }

        ListNode currentNode = head;

        while (currentNode != null) {
            System.out.print(currentNode.val + " -> ");
            currentNode = currentNode.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        FindNthNode findNthNode = new FindNthNode();
        int n = 2; // Find & Remove the Nth Node

        findNthNode.addLast(1);
        findNthNode.addLast(2);
        findNthNode.addLast(3);
        findNthNode.addLast(4);
        findNthNode.addLast(5);

        findNthNode.printList();

        // Find the Nth Node & Print
        findNthNode.searchNthFromEnd(n);

        // Find the Nth Node & Removed
        findNthNode.head =
                findNthNode.removeNthFromEnd(findNthNode.head, n);

        findNthNode.printList();
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

/*Expected Output:

1 -> 2 -> 3 -> 4 -> 5 -> null
The Nth Node from the Last Node is 4
1 -> 2 -> 3 -> 5 -> null

* */