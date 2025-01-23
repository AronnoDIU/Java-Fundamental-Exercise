package Generic;

public class GenericDoublyLinkedList<T> {

    private class Node {
        T data;
        Node prev, next;

        Node(T data) {
            this.data = data;
            this.prev = this.next = null;
        }
    }

    private Node head, tail;
    private int size;

    public GenericDoublyLinkedList() {
        head = tail = null;
        size = 0;
    }

    public void addFirst(T data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(T data) {
        Node newNode = new Node(data);
        if (tail == null) {
            head = tail = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public T removeFirst() {
        if (head == null) {
            throw new IllegalStateException("List is empty");
        }
        T data = head.data;
        head = head.next;
        if (head == null) {
            tail = null;
        } else {
            head.prev = null;
        }
        size--;
        return data;
    }

    public T removeLast() {
        if (tail == null) {
            throw new IllegalStateException("List is empty");
        }
        T data = tail.data;
        tail = tail.prev;
        if (tail == null) {
            head = null;
        } else {
            tail.next = null;
        }
        size--;
        return data;
    }

    public boolean contains(T data) {
        Node current = head;
        while (current != null) {
            if (current.data.equals(data)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public int size() {
        return size;
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        GenericDoublyLinkedList<String> list = new GenericDoublyLinkedList<>();
        list.addFirst("World");
        list.addFirst("Hello");
        list.addLast("!");

        System.out.println("Current list:");
        list.printList();

        System.out.println("List contains 'World': " + list.contains("World"));
        System.out.println("List contains 'Java': " + list.contains("Java"));

        System.out.println("Removed first element: " + list.removeFirst());
        System.out.println("Removed last element: " + list.removeLast());

        System.out.println("Current list:");
        list.printList();

        System.out.println("Size of the list: " + list.size());
    }
}
