package Queue;

public class MyQueue {
    private Node firstElement;
    private Node lastElement;
    private int size;

    public MyQueue() {
        firstElement = null;
        lastElement = null;
        size = 0;
    }

    public void add(Object value) {
        Node newNode = new Node(value);
        if (isEmpty()) {
            firstElement = newNode;
            lastElement = newNode;
        } else {
            lastElement.next = newNode;
            lastElement = newNode;
        }
        size++;
    }

    public void clear() {
        firstElement = null;
        lastElement = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public Object peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return firstElement.data;
    }

    public Object poll() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        Object removedValue = firstElement.data;
        firstElement = firstElement.next;
        size--;
        if (isEmpty()) {
            lastElement = null;
        }
        return removedValue;
    }

    private boolean isEmpty() {
        return size == 0;
    }

    private class Node {
        Object data;
        Node next;

        Node(Object data) {
            this.data = data;
            this.next = null;
        }
    }
}
