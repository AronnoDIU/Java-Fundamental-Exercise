package WrapperClasses;

public class CustomWrapperMaximum {
    public static void main(String[] args) {
        Maximum maximum = new Maximum();
        maximum.insert(12);
        maximum.insert(3);
        maximum.insert(23);

        System.out.println("Maximum element: " + maximum.top());
        System.out.println("Number of elements inserted: " + maximum.elementNumber());

    }
}

class Maximum {
    private int maxValue = 0;
    private int size = 0;

    public void insert(int x) {
        this.size++;
        if (x <= this.maxValue)
            return;
        this.maxValue = x;
    }

    public int top() {
        return this.maxValue;
    }

    public int elementNumber() {
        return this.size;
    }
}

/*
Expected Output::

Maximum element: 23
Number of elements inserted: 3

* */