package DataStructure;

public class Stack {
    // Atributos
    private Node top;
    private int height;

    class Node {
        int value;
        Node next;

        Node (int value) {
            this.value = value;
        }
    }

}
