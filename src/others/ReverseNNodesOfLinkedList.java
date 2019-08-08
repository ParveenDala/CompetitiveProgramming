package others;

/******
 * Parveen D
 * Reverse n Nodes of LinkedList.
 */
public class ReverseNNodesOfLinkedList {
    Node head;

    public ReverseNNodesOfLinkedList() {
        for (int i = 10; i >= 1; i--) {
            Node node = new Node(i);
            node.next = head;
            head = node;
        }
    }

    public void traverse() {
        System.out.println("Traverse: ");
        Node node = head;
        while (node != null) {
            System.out.print(node.data + "  ");
            node = node.next;
        }
        System.out.println();
    }


    public void reverseList() {
        Node previous = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        head = previous;
    }

    public void reverseNNodesOfList(int n) {
        if (n < 2)
            return;
        Node previous = null;
        Node current = head;
        Node next = null;
        int count = 0;
        while (current != null && count < n) {
            if (count == n - 1) {
                head.next = current.next;
            }
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;

            count++;
        }
        head = previous;
    }

    public static void main(String[] args) {
        ReverseNNodesOfLinkedList list = new ReverseNNodesOfLinkedList();
        list.traverse();
        list.reverseNNodesOfList(5);
        list.traverse();
        list.reverseList();
        list.traverse();
    }
}

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }
}
