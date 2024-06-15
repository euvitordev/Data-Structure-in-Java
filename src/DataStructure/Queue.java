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
}
