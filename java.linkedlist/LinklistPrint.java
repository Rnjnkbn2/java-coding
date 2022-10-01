// import java.util.LinkedList;
// import java.util.*;


//package Java_linklist;
public class LinklistPrint {
    // declaration of head pointer
    public Node head;

    public static class Node {
        int data;
        Node next;

        Node(int d) {
            this.data = d;
            this.next=null;
            // this.next = null;
        }
    }

    public static LinklistPrint addData(LinklistPrint listhead, int data) {
        Node temp = new Node(data);
        if (listhead.head == null) {
            listhead.head = temp;
            return listhead;
        }
        temp.next = listhead.head;
        listhead.head = temp;
        return listhead;
    }

    public static void display(LinklistPrint listhead) {
        Node ptr = listhead.head;
        while (ptr != null) {
            System.out.print( ptr.data+" ->");
            ptr = ptr.next;
        }
    }

    public static void main(String[] args) {
        LinklistPrint listhead = new LinklistPrint();
        listhead = addData(listhead, 1);
        listhead = addData(listhead, 2);
        listhead = addData(listhead, 3);
        listhead = addData(listhead, 4);
        listhead = addData(listhead, 5);
        listhead = addData(listhead, 6);
        display(listhead);
    }

}
