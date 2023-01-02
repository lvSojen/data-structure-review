package datastructures;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        LinkedListDemo linkedList = new LinkedListDemo(4);
        linkedList.append(7);
        linkedList.append(8);
        linkedList.append(9);
        linkedList.insert(1,6);
        System.out.println("Removing: "+linkedList.remove(4).value);
        linkedList.printList();
        System.out.println("4 6 7 8");
        linkedList.reverse();
        linkedList.printList();
    }

}
