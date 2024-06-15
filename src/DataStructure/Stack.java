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

    public Stack(int value) {
        Node newNode = new Node(value);
        top = newNode;
        height = 1;
    }

    // Métodos
    public void getTop() {
        if (top == null) {
            System.out.println("Pilha vazia!");
        } else {
            System.out.println("Topo: " + top.value);
        }
    }

    public void getHeight() {
        System.out.println("Altura: " + height);
    }

    public void print() {
        Node temporary = top;
        while (temporary != null) {
            System.out.println(temporary.value);
            temporary = temporary.next;
        }
    }
}
