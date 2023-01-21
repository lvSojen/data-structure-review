package datastructures.doublylinkedlist;

public class Main {

    public static void main(String[] args) {
        DoublyLinkedList myDLL = new DoublyLinkedList(2);
        myDLL.append(5);
        myDLL.append(6);
        myDLL.append(7);
        myDLL.set(0,3);
        myDLL.printList();
        System.out.println("=======");
        myDLL.remove(3);
        myDLL.remove(1);
        myDLL.printList();

    }


}
