import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class MergeLinkedListArrayList {
    public static Node mergeLists(Node head1, Node head2) {
        ArrayList<Integer> list = new ArrayList<>();

        Node temp = head1;
        while (temp != null) {
            list.add(temp.data);
            temp = temp.next;
        }
        temp = head2;
        while (temp != null) {
            list.add(temp.data);
            temp = temp.next;
        }
        if (list.isEmpty()) return null;

        Node newHead = new Node(list.get(0));
        Node current = newHead;

        for (int i = 1; i < list.size(); i++) {
            current.next = new Node(list.get(i));
            current = current.next;
        }

        return newHead;
    }
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + (temp.next != null ? " -> " : ""));
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head1 = new Node(1);
        head1.next = new Node(3);                     //first list
        head1.next.next = new Node(5);
 
        Node head2 = new Node(2);
        head2.next = new Node(4);                    //second list
        head2.next.next = new Node(6);

        Node merged = mergeLists(head1, head2);

        System.out.print("Merged List: ");
        printList(merged);
    }
}