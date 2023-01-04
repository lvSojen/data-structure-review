package datastructures.stack;


public class Main {

    public static void main(String[] args) {
        StackDemo stack = new StackDemo();
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        stack.push(9);
        System.out.println(stack);
        StackDemo.Node pop = stack.pop();
        System.out.println("Removed: "+pop.value);
        System.out.println("Top Node: " + stack.getTop().value);
        System.out.println("Size: "+ stack.getHeight());
        System.out.println(stack.isEmpty() ? "is Empty":"not Empty");
        System.out.println("New stack: ");
        System.out.println(stack);

    }
}
