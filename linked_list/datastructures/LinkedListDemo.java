package datastructures;

public class LinkedListDemo {

    private Node head;
    private Node tail;
    private int length;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }
    public LinkedListDemo(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void printList() {
        Node temp = head;
        while(temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if(length == 0) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
        length++;
    }

    public Node removeLast() {
        if(length == 0) return null;
        Node temp = head;
        Node pre = head;
        while(temp.next != null) {
            pre = temp;
            temp = temp.next;
        }
        tail = pre;
        tail.next = null;
        length --;
        if(length == 0) {
            head = null;
            tail = null;
        }
        return temp;
    }
    public Node removeFirst() {
        if (length == 0) return null;
        Node temp = head;
        head = temp.next;
        // you release the temp = head
        temp.next = null;
        length --;
        if (length == 0) {
            // if the length is at 1
            // head = temp.next would already be null
            //head = null;
            tail = null;
        }
        return temp;
    }
    public void prepend(int value) {
        Node newNode = new Node(value);
        if(length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        length ++;

    }

    public boolean set(int index, int value) {
        // we can call the get method here to avoid
        // duplication
        //if(index <0 || index >=length) return;
        //Node temp = head;
        //for (int i = 0; i < index; i++) {
        //    temp = temp.next;
        //}
        Node temp = get(index);
        if(temp == null) return false;
        temp.value = value;
        return true;
    }
    public Node get(int index) {
        if (index < 0 || index >= length) return null;
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public boolean insert(int index, int value) {
        // method 1
//        if(index <0 || index >length) return false;
//        if(index == 0) {
//            prepend(value);
//            return true;
//        } else if(index == length) {
//            append(value);
//            return true;
//        }
//        Node temp = head;
//        Node pre = head;
//        Node newNode = new Node(value);
//        while(index > 0) {
//            pre = temp;
//            temp = temp.next;
//            index--;
//        }
//        pre.next = newNode;
//        newNode.next = temp;
//        length ++;
//        return true;

        // method 2
        if(index < 0 || index > length) return false;
        if(index == 0) {
            prepend(value);
            return true;
        } else if(index == length) {
            append(value);
            return true;
        }
        Node newNode = new Node(value);
        Node temp = get(index-1);
        newNode.next = temp.next;
        temp.next = newNode;
        length ++;
        return true;
    }

    public Node remove(int index) {
        if(index < 0 || index >= length) return null;

        if(index == 0) {
            return removeFirst();
        } else if(index+1 == length) {
            return removeLast();
        }
        Node prev = get(index-1);
        // the reason why we don't do
        //     temp = get(index) is because
        //     get(index) is O(n), it's iterating the whole linked list
        //     where prev.next is O(1)
        Node temp = prev.next;
        prev.next = temp.next;
        length --;
        temp.next = null;
        return temp;
//        Node temp = get(index-1);
//        Node drop = temp.next;
//        temp.next = temp.next.next;
//        drop.next = null;
//        length --;
//        return drop;
    }

    public void reverse() {
        if(length == 0) return;
        Node temp = head;
        head = tail;
        tail = temp;
        Node before = null;
        Node after = temp.next;
        for (int i = 0; i < length; i++) {
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }
    }
    public void getHead() {
        if (head == null) {
            System.out.println("Head: null");
            return;
        }
        System.out.println("Head: " + head.value);
    }
    public void getTail() {
        if (tail == null) {
            System.out.println("Tail: null");
            return;
        }
        System.out.println("Tail: " + tail.value);
    }
    public void getLength() {
        System.out.println("Length: " + length);
    }
}
