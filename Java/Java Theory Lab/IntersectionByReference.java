import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class IntersectionByReference {
    public static Node getIntersection(Node head1, Node head2) {
        HashSet<Node> set = new HashSet<>();

        Node temp = head1;
        while (temp != null) {
            set.add(temp);
            temp = temp.next;
        }
        temp = head2;
        while (temp != null) {
            if (set.contains(temp)) {
                return temp; 
            }
            temp = temp.next;
        }

        return null; 
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
        Node shared = new Node(8);
        shared.next = new Node(10);

        Node head1 = new Node(3);
        head1.next = new Node(6);
        head1.next.next = new Node(9);
        head1.next.next.next = shared;

        Node head2 = new Node(5);
        head2.next = shared;

        Node intersection = getIntersection(head1, head2);

        if (intersection != null) {
            System.out.println("Intersection at node with data: " + intersection.data);
        } else {
            System.out.println("No intersection found.");
        }
    }
}