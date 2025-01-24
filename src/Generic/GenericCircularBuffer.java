package Generic;

public class GenericCircularBuffer<T> {

    private final T[] buffer;
    private int head;
    private int tail;
    private int size;
    private final int capacity;

    @SuppressWarnings("unchecked")
    public GenericCircularBuffer(int capacity) {
        this.capacity = capacity;
        buffer = (T[]) new Object[capacity];
        head = 0;
        tail = 0;
        size = 0;
    }

    public void add(T data) {
        if (size == capacity) {
            throw new IllegalStateException("Buffer is full");
        }
        buffer[tail] = data;
        tail = (tail + 1) % capacity;
        size++;
    }

    public T remove() {
        if (size == 0) {
            throw new IllegalStateException("Buffer is empty");
        }
        T data = buffer[head];
        head = (head + 1) % capacity;
        size--;
        return data;
    }

    public T peek() {
        if (size == 0) {
            throw new IllegalStateException("Buffer is empty");
        }
        return buffer[head];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public int size() {
        return size;
    }

    public static void main(String[] args) {
        GenericCircularBuffer<Integer> buffer = new GenericCircularBuffer<>(5);
        buffer.add(1);
        buffer.add(2);
        buffer.add(3);
        buffer.add(4);
        buffer.add(5);

        System.out.println("Buffer is full: " + buffer.isFull());
        System.out.println("Removed element: " + buffer.remove());
        System.out.println("Buffer size after removal: " + buffer.size());

        buffer.add(6);
        System.out.println("Added element 6");
        System.out.println("Buffer is full: " + buffer.isFull());
        System.out.println("Peek element: " + buffer.peek());
    }
}