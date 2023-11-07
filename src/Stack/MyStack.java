package Stack;

public class MyStack {
    private Node topElement;
    private int size;

    public MyStack() {
        topElement = null;
        size = 0;
    }

    public void push(Object value) {
        Node newNode = new Node(value);
        newNode.nextElement = topElement;
        topElement = newNode;
        size++;
    }

    public Object pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        Object poppedValue = topElement.data;
        topElement = topElement.nextElement;
        size--;
        return poppedValue;
    }

    public void remove(int index) {
        if (isEmpty() || index < 0 || index >= size) {
            throw new IllegalArgumentException("Invalid index");
        }
        if (index == 0) {
            topElement = topElement.nextElement;
        } else {
            Node previous = getNode(index - 1);
            previous.nextElement = previous.nextElement.nextElement;
        }
        size--;
    }

    public void clear() {
        topElement = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public Object peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return topElement.data;
    }

    private boolean isEmpty() {
        return size == 0;
    }

    private Node getNode(int index) {
        Node current = topElement;
        for (int i = 0; i < index; i++) {
            current = current.nextElement;
        }
        return current;
    }

    private class Node {
        Object data;
        Node nextElement;

        Node(Object data) {
            this.data = data;
            this.nextElement = null;
        }
    }
}
