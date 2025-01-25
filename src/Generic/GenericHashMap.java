package Generic;

import java.util.ArrayList;
import java.util.LinkedList;

public class GenericHashMap<K, V> {

    private class Entry {
        K key;
        V value;

        Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private final ArrayList<LinkedList<Entry>> buckets;
    private final int capacity;
    private int size;

    public GenericHashMap(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.buckets = new ArrayList<>(capacity);
        for (int i = 0; i < capacity; i++) {
            buckets.add(new LinkedList<>());
        }
    }

    private int getBucketIndex(K key) {
        return Math.abs(key.hashCode()) % capacity;
    }

    public void put(K key, V value) {
        int bucketIndex = getBucketIndex(key);
        LinkedList<Entry> bucket = buckets.get(bucketIndex);
        for (Entry entry : bucket) {
            if (entry.key.equals(key)) {
                entry.value = value;
                return;
            }
        }
        bucket.add(new Entry(key, value));
        size++;
    }

    public V get(K key) {
        int bucketIndex = getBucketIndex(key);
        LinkedList<Entry> bucket = buckets.get(bucketIndex);
        for (Entry entry : bucket) {
            if (entry.key.equals(key)) {
                return entry.value;
            }
        }
        return null;
    }

    public boolean containsKey(K key) {
        int bucketIndex = getBucketIndex(key);
        LinkedList<Entry> bucket = buckets.get(bucketIndex);
        for (Entry entry : bucket) {
            if (entry.key.equals(key)) {
                return true;
            }
        }
        return false;
    }

    public V remove(K key) {
        int bucketIndex = getBucketIndex(key);
        LinkedList<Entry> bucket = buckets.get(bucketIndex);
        for (Entry entry : bucket) {
            if (entry.key.equals(key)) {
                bucket.remove(entry);
                size--;
                return entry.value;
            }
        }
        return null;
    }

    public int size() {
        return size;
    }

    public static void main(String[] args) {
        GenericHashMap<String, Integer> map = new GenericHashMap<>(10);
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);

        System.out.println("Value for key 'one': " + map.get("one"));
        System.out.println("Value for key 'two': " + map.get("two"));
        System.out.println("Map contains key 'three': " + map.containsKey("three"));
        System.out.println("Map size: " + map.size());

        map.remove("two");
        System.out.println("Value for key 'two' after removal: " + map.get("two"));
        System.out.println("Map size after removal: " + map.size());
    }
}
