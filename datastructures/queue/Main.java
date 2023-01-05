package datastructures.queue;

public class Main {

    public static void main(String[] args) {
        QueueDemo queue = new QueueDemo();
//        queue.enqueue(6);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
//        queue.printQueue();
//        System.out.println("Removed: ");
//        System.out.println(queue.dequeue().value);
//        System.out.println("New queue: ");
//        queue.printQueue();
        System.out.println("Removed: "+queue.dequeue().value);
        System.out.println("Removed: "+queue.dequeue().value);
        System.out.println("Removed: "+queue.dequeue().value);
        System.out.println("Removed: "+queue.dequeue());
    }
}
