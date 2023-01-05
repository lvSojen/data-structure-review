package datastructures.queue;

public class QueueDemo {
    private Node first;
    private Node last;
    private int length;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public void enqueue(int value) {
        Node newNode = new Node(value);
        if(length == 0) {
            first = newNode;

        } else {
            last.next = newNode;
        }
        last = newNode;
        length ++;
    }

    public Node dequeue() {
        if(length == 0) return null;
        Node temp = first;
        first = first.next;
        if(length == 1) {
            last = null;
        }
        temp.next = null;
        length --;

        return temp;
    }

    public void printQueue() {
        if(length == 0) return;
        Node temp = first;
        while(temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
}
