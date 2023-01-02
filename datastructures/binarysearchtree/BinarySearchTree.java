package datastructures.binarysearchtree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {
    public Node root;

    public static class Node {
        public int value;
        public Node left;
        public Node right;

        private Node(int value) {
            this.value = value;
        }
    }
    // empty tree for the constructor
    public BinarySearchTree() {

    }
    public boolean insert(int value) {
        Node newNode = new Node(value);
        if(root == null) {
            root = newNode;
            return true;
        }
        Node temp = root;
        while(true) {
            if(newNode.value == temp.value) return false;
            if(newNode.value > temp.value) {
                if (temp.right == null) {
                    temp.right = newNode;
                    return true;
                }
                temp = temp.right;
            } else {
                if(temp.left == null) {
                    temp.left = newNode;
                    return true;
                }
                temp = temp.left;
            }
        }
    }
    public boolean contains(int value) {
        Node temp = root;
        while(temp != null) {
            if(value == temp.value) return true;
            if(value > temp.value) {
                temp = temp.right;
            } else {
                temp = temp.left;
            }
        }
        return false;
    }
    public void print() {
        print(root);
    }

    private void print(Node node) {
        if (node == null) {
            return;
        }
        System.out.println(node.value);
        print(node.left);
        print(node.right);
    }

    public ArrayList<Integer> BFS() {
        Node currentNode = root;
        Queue<Node> queue = new LinkedList<>();
        ArrayList<Integer> results = new ArrayList<>();
        queue.add(currentNode);
        while(queue.size() >0) {
            currentNode = queue.remove();
            results.add(currentNode.value);
            if(currentNode.left !=null) {
                queue.add(currentNode.left);
            }
            if(currentNode.right !=null) {
                queue.add(currentNode.right);
            }
        }
        return results;
    }


}
