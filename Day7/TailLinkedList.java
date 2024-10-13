package day7;

import java.util.Scanner;

class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class LinkedList {
    Node head;
    public void insertAtTail(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}
public class TailLinkedList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of linked list n: ");
        int n = scanner.nextInt();
        LinkedList linkedList = new LinkedList();
        System.out.println("Enter " + n + " linked list data values:");
        for (int i = 0; i < n; i++) {
            int data = scanner.nextInt();
            linkedList.insertAtTail(data);
        }
        System.out.println("Final linked list:");
        linkedList.display();

        scanner.close();
    }
}
