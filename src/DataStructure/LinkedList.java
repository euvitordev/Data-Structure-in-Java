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

    // Implementa o construtor da nossa lista
    public LinkedList(String data) {
        size = 1;
        Node newNode = new Node(data);
        head = newNode;
        tail = newNode;
    }

    // Método de pega o primeiro elemento da lista
    public void getFirst() {
        if (this.head == null) {
            System.out.println("Lista vazia!");
        } else {
            System.out.println("Primeiro elemento da lista: " + head.data);
        }
    }

    // Método de pega o último elemento da lista
    public void getLast() {
        if (this.tail == null) {
            System.out.println("Lista vazia!");
        } else {
            System.out.println("Último elemento da lista: " + tail.data);
        }
    }

    // Método de obter o tamanho da lista
    public void getSize() {
        System.out.println("Tamanho da lista: " + this.size);
    }

    // Método para esvaziar a lista
    public void clear() {
        head = null;
        tail = null;
        size = 0;
        System.out.println("Limpando a lista...");
    }

    // Método para imprimir a lista
    public void printList() {
        System.out.println("\n------------------------");
        System.out.println("Imprimindo a lista:");
        Node current = this.head;
        while (current != null) {
            System.out.println("• " + current.data);
            current = current.next;
        }
        System.out.println("------------------------\n");
    }

    // Método de adicionar elementos ao início da lista
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (size == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    // Método de adicionar elementos ao final da lista
    public void addLast(String data) {
        Node newNode = new Node(data);
        if (size == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    // Método de remover elementos do início da lista
    public Node removeFirst() {
        if (size == 0) return null;
        Node temp = head;
        head = head.next;
        temp.next = null;
        size--;
        if (size == 0) {
            head = null;
            tail = null;
        }
        return temp;
    }


}
