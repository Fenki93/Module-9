import ArrayList.MyArrayList;
import Queue.MyQueue;
import LinkedList.MyLinkedList;
import Stack.MyStack;

public class Main {
    public static void main(String[] args) {
        //ArrayList test
        System.out.println("-------------ArrayList test----------");

        MyArrayList list = new MyArrayList();

        list.add("AAA");
        list.add("BBB");
        list.add("CCC");
        list.add("DDD");
        list.add("EEE");

        System.out.println("Size: " + list.size());

        for (int i = 0; i < list.size(); i++) {
            System.out.println("Element at index " + i + ": " + list.get(i));
        }

        list.remove(2);
        System.out.println("Size after removal: " + list.size());

        list.clear();
        System.out.println("Size after clear: " + list.size());


        //Linkedlist tests
        System.out.println("-------------Linkedlist tests----------");
        MyLinkedList linkedList = new MyLinkedList();

        linkedList.add("Ford");
        linkedList.add("Audi");
        linkedList.add("Renault");
        linkedList.add("Citroen");

        System.out.println("Size: " + linkedList.size());

        for (int i = 0; i < list.size(); i++) {
            System.out.println("Element at index " + i + ": " + linkedList.get(i));
        }

        linkedList.remove(1);
        System.out.println("Size after removal: " + linkedList.size());

        linkedList.clear();
        System.out.println("Size after clear: " + linkedList.size());


        //Queue tests
        System.out.println("-------------Queue Tests----------");
        MyQueue queue = new MyQueue();
        queue.add("One");
        queue.add("Two");
        queue.add("Three");
        queue.add("Four");

        System.out.println("Size: " + queue.size());
        System.out.println("Peek: " + queue.peek());
        System.out.println("Poll: " + queue.poll());

        queue.clear();
        System.out.println("Size after clear: " + queue.size());

        //Stack tests
        System.out.println("-------------Stack tests----------");
        MyStack stack = new MyStack();

        stack.push("1111");
        stack.push("2222");
        stack.push("33333");
        stack.push("4444");
        stack.push("555");

        System.out.println("Size: " + stack.size());
        System.out.println("Peek: " + stack.peek());
        System.out.println("Pop: " + stack.pop());

        stack.remove(0);
        System.out.println("Size after remove: " + stack.size());

        stack.clear();
        System.out.println("Size after clear: " + stack.size());
    }
}