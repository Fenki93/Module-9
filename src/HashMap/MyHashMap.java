package HashMap;

public class MyHashMap {
    private static final int INITIAL_CAPACITY = 16;
    private Node[] table;
    private int size;

    public MyHashMap() {
        table = new Node[INITIAL_CAPACITY];
    }

    public void put(Object key, Object value) {
        int index = getIndex(key);
        Node newNode = new Node(key, value);

        if (table[index] == null) {
            table[index] = newNode;
        } else {
            Node current = table[index];
            Node previous = null;

            while (current != null) {
                if (current.key.equals(key)) {
                    current.value = value;
                    return;
                }
                previous = current;
                current = current.next;
            }

            previous.next = newNode;
        }
        size++;
    }

    public void remove(Object key) {
        int index = getIndex(key);
        Node current = table[index];
        Node previous = null;

        while (current != null) {
            if (current.key.equals(key)) {
                if (previous == null) {
                    table[index] = current.next;
                } else {
                    previous.next = current.next;
                }
                size--;
                return;
            }
            previous = current;
            current = current.next;
        }
    }

    public void clear() {
        table = new Node[INITIAL_CAPACITY];
        size = 0;
    }

    public int size() {
        return size;
    }

    public Object get(Object key) {
        int index = getIndex(key);
        Node current = table[index];

        while (current != null) {
            if (current.key.equals(key)) {
                return current.value;
            }
            current = current.next;
        }

        return null;
    }

    private int getIndex(Object key) {
        if (key == null) {
            return 0;
        }
        return key.hashCode() % table.length;
    }

    private class Node {
        Object key;
        Object value;
        Node next;

        Node(Object key, Object value) {
            this.key = key;
            this.value = value;
        }
    }
}
