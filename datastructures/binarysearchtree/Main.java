package datastructures.binarysearchtree;

public class Main {

    public static void main(String[] args) {
        BinarySearchTree myBTS = new BinarySearchTree();
        myBTS.insert(55);
        myBTS.insert(99);
        myBTS.insert(44);
        myBTS.insert(2);
        myBTS.insert(50);
        myBTS.insert(100);
        myBTS.insert(87);


//        System.out.println(myBTS.root.left.right.value);
//        myBTS.print();
//        System.out.println(myBTS.contains(88)? "Found":"Not Found");
//        System.out.println(myBTS.contains(100)? "Found":"Not Found");
        System.out.println(myBTS.BFS());
    }


}
