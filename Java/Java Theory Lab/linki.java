// Node class
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// Custom LinkedList class
class LinkedList {
    Node head;

    // Add element to the end
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

    // Print the list
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
}

// Main class
public class linki {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();  // Use your custom class
        
        list.add(10);
        list.add(20);
        list.add(30);

        list.printList();  // Output: 10 -> 20 -> 30 -> NULL
    }
}
