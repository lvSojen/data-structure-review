package datastructures.stack;


public class StackDemo {
    public Node top;
    public int height;

    public static class Node {
        public int value;
        public Node next;

        private Node(int value) {
            this.value = value;
        }
    }

    public StackDemo() {
    }

    public void push(int value) {
        Node newNode = new Node(value);
        if(top == null) {
            top = newNode;
            height ++;
            return;
        }
        newNode.next = top;
        top = newNode;
        height ++;
    }

    public Node pop() {
        if(top == null) return null;
        Node temp = top;
        if(temp.next != null) {
            top = temp.next;
        } else {
            top = null;
        }
        height --;
        temp.next = null;
        return temp;
    }

    public boolean isEmpty() {
        return height == 0;
    }

    public Node getTop() {
        return top;
    }

    public int getHeight() {
        return height;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node temp = top;
        sb.append("[");
        while(temp != null) {
            sb.append(temp.value);
            sb.append(", ");
            temp = temp.next;
        }
        sb.delete(sb.length()-2,sb.length());
        sb.append("]");
//        return sb.substring(0,sb.length()-2);
        return sb.toString();
    }

}
