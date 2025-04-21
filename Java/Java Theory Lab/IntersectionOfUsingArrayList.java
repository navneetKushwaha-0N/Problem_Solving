import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class IntersectionOfUsingArrayList {
    public static Node getIntersection(Node head1, Node head2) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();

        Node temp = head1;
        while (temp != null) {
            list.add(temp.data);
            temp = temp.next;
        }
        temp = head2;
        while (temp != null) {
            if (list.contains(temp.data) && !result.contains(temp.data)) {
                result.add(temp.data);
            }
            temp = temp.next;
        }
        if (result.isEmpty()) return null;

        Node newHead = new Node(result.get(0));
        Node current = newHead;

        for (int i = 1; i < result.size(); i++) {
            current.next = new Node(result.get(i));
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
        head1.next = new Node(2);
        head1.next.next = new Node(3);
        head1.next.next.next = new Node(4);
        
        Node head2 = new Node(3);
        head2.next = new Node(4);
        head2.next.next = new Node(5);
        head2.next.next.next = new Node(6);

        Node intersection = getIntersection(head1, head2);
        System.out.print("Intersection: ");
        printList(intersection);
    }
}