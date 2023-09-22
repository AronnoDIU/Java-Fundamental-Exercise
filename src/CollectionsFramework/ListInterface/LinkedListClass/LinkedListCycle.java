package CollectionsFramework.ListInterface.LinkedListClass;

public class LinkedListCycle {
    ListNoteCycle head;

    boolean hasCycle(ListNoteCycle head) {
        if (head == null) {
            return false;
        }

        ListNoteCycle rabbit = head; // fast
        ListNoteCycle turtle = head; // slow

        while (rabbit != null && rabbit.next != null) {
            turtle = turtle.next;
            rabbit = head.next.next;

            if (rabbit == turtle) {
                return true; // They meet, which means there's a cycle
            }
        }
        return false;
    }

    // Adding Last Node
    // Add - last Integer data
    public void addLast(int val) {
        ListNoteCycle addLastNode = new ListNoteCycle(val);

        if (head == null) {
            head = addLastNode;
            return;
        }
        ListNoteCycle currentNode = head;
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

        ListNoteCycle currentNode = head;

        while (currentNode != null) {
            System.out.print(currentNode.val + " -> ");
            currentNode = currentNode.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedListCycle listCycle = new LinkedListCycle();

        listCycle.addLast(1);
        listCycle.addLast(2);
        listCycle.addLast(3);
        listCycle.addLast(4);
        listCycle.printList();

        System.out.println("Is this list has Cycle ? "
                + listCycle.hasCycle(listCycle.head));
    }
}

class ListNoteCycle {
    int val;
    ListNoteCycle next;

    public ListNoteCycle(int val) {
        this.val = val;
        this.next = null;
    }
}

/*Expected Output:

1 -> 2 -> 3 -> 4 -> null
Is this list has Cycle ? true

* */