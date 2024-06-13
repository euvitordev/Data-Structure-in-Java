package DataStructure;

public class LinkedList {
    // Atributos
    private Node head;
    private Node tail;
    private int size;

    // Nó do nosso método de LinkedList
    class Node {
        String data;
        Node next;

        // Construtor
        Node(String data) {
            this.data = data;
        }
    }
}
