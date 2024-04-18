package javaflweektwo.linkedlist;

public class LinkedList {
    private Node head;

    public LinkedList() {
        this.head = null;
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void addAtIndex(int index, int data) {
        if (index < 0) {
            System.out.println("Invalid index.");
            return;
        }
        if (index == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        Node current = head;
        int count = 0;
        while (count < index - 1 && current != null) {
            current = current.next;
            count++;
        }
        if (current == null) {
            System.out.println("Index out of bounds.");
            return;
        }
        newNode.next = current.next;
        current.next = newNode;
    }

    public boolean search(int data) {
        Node current = head;
        while (current != null) {
            if (current.data == data) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void delete(int data) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        if (head.data == data) {
            head = head.next;
            return;
        }
        Node prev = null;
        Node current = head;
        while (current != null && current.data != data) {
            prev = current;
            current = current.next;
        }
        if (current == null) {
            System.out.println("Element not found.");
            return;
        }
         prev.next = current.next;
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst(10);
        list.addLast(20);
        list.addAtIndex(1, 15);
        list.display(); // Output: 10 15 20
        System.out.println("Search 15: " + list.search(15)); // Output should be true
        list.delete(15);
        list.display(); // Output: 10 20
        list.delete(100); // Output: Element not found.
        list.display(); // Output: 10 20
    }
}
