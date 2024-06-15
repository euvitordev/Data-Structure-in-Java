package DataStructure;

public class Queue {
    private Node first;
    private Node last;
    private int length;

    public class Node {
        int value;
        Node next;

        Node(int value){
            this.value = value;
        }
    }

    public Queue(int value) {
        Node newNode = new Node(value);
        first = newNode;
        last = newNode;
        length++;
    }

    // Métodos
    public void getFirst() {
        if (first != null) {
            System.out.println("Primeiro da fila: " + first.value);
        } else {
            System.out.println("Fila vazia!");
        }
    }

    public void getLast() {
        if (last != null) {
            System.out.println("Último da fila: " + last.value);
        } else {
            System.out.println("Fila vazia!");
        }
    }

    public void getLength() {
        System.out.println("Tamanho da fila: " + length);
    }

    public void print() {
        System.out.println("\nImprimindo a fila:");
        Node temporary = first;
        while (temporary != null) {
            System.out.println("• " + temporary.value);
            temporary = temporary.next;
        }
        System.out.println("Fim da fila...\n");
    }

    public void enqueue(int value){
        Node newNode = new Node(value);
        if (length == 0) {
            first = newNode;
            last = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }
        length++;
    }

    public Node dequeue() {
        if (length == 0) return null;
        Node temporary = first;
        if (length == 1) {
            first = null;
            last = null;
        } else {
            first = first.next;
            temporary.next = null;
        }
        length--;
        System.out.println("\nElemento removido: " + temporary.value + "\n");
        return temporary;
    }
}
