
//package Java_linklist;

public class LinkedList {

    Node head;

    public class Node {
        int data;
        Node next;

        // constructor
        Node(int d) {
            this.data = d;
            this.next = null;
        }
    }

    public Node insertAtBegin(int d) {
        Node temp = new Node(d);
        if (head == null) {
            head = temp;
            return head;
        }
        temp.next = head;
        head = temp;
        return head;
    }

    public void display() {
        Node ptr = head;
        while (ptr != null) {
            System.out.print(ptr.data + "-->");
            ptr = ptr.next;
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtBegin(10);
        list.insertAtBegin(11);
        list.insertAtBegin(12);
        list.insertAtBegin(13);
        list.insertAtBegin(14);
        list.insertAtBegin(15);
        list.insertAtBegin(111);
        list.insertAtBegin(1000);

        list.display();

    }

}
