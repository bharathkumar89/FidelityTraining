package day7;


public class LinkedListspecificposition {
    Node head;

    public static void main(String[] args) {
        LinkedListspecificposition list = new LinkedListspecificposition();
        list.add(16);
        list.add(13);
        list.add(7);

        System.out.println("Original List:");
        list.printList();
        list.insertAtPosition(1, 2);
        System.out.println("Updated List:");
        list.printList();
    }
    public void insertAtPosition(int data, int position) {
        Node newNode = new Node(data);
        if (position == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node current = head;
        for (int i = 0; i < position - 1 && current != null; i++) {
            current = current.next;
        }
        if (current != null) {
            newNode.next = current.next;
            current.next = newNode;
        } else {
            System.out.println("Position out of bounds");
        }
    }
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}