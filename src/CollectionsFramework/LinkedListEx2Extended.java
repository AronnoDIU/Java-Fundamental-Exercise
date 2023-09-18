package CollectionsFramework;

import java.util.LinkedList;

public class LinkedListEx2Extended {
    public static void main(String[] args) {
        LinkedList<String> stringLinkedList = new LinkedList<>();

        stringLinkedList.add("is");
        stringLinkedList.add("a");
        stringLinkedList.addLast("list");
        stringLinkedList.addFirst("this");
        stringLinkedList.add(3, "linked");
        System.out.println(stringLinkedList);

        System.out.println(stringLinkedList.get(0));
        System.out.println(stringLinkedList.size());
        stringLinkedList.remove(3);
        stringLinkedList.removeFirst();
        stringLinkedList.removeLast();

        System.out.println(stringLinkedList);
    }
}

/*Expected Output:

[this, is, a, linked, list]
this
5
[is, a]

* */