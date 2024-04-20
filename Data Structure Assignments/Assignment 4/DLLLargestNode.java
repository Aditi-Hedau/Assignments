class DLLLargestNode{

    Node head;

    static class Node {
        int data;
        Node prev;
        Node next;

        Node(int d) {
            data = d;
            prev = null;
            next = null;
        }
    }

    void insert(int new_data) {    //insertion at beginning
        Node new_node = new Node(new_data);
        new_node.next = head;
        new_node.prev = null;
        if (head != null)
            head.prev = new_node;
        head = new_node;
    }

    int largestNode() {
        if (head == null) {
            System.out.println("Empty list");
            return Integer.MIN_VALUE; // Return the minimum possible value for an integer
        }

        int max = head.data;
        Node current = head.next;

        while (current != null) {
            if (current.data > max) {
                max = current.data;
            }
            current = current.next;
        }

        return max;
    }

    void display(Node n) {
        Node p = null;
        System.out.print("Forward direction: ");
        while (n != null) {
            System.out.print(n.data + "---->");
            p = n;
            n = n.next;
        }

        System.out.println();

        System.out.print("Backward direction: ");
        while (p != null) {
            System.out.print(p.data + "---->");
            p = p.prev;
        }
    }

    public static void main(String args[]) {
        DLLLargestNode d = new DLLLargestNode();


        d.insert(5);
        d.insert(10);
        d.insert(15);

        System.out.println("Original list:");
        d.display(d.head);

        int largest = d.largestNode();
        if (largest != Integer.MIN_VALUE) {
            System.out.println("\nLargest node value: " + largest);
        } else {
            System.out.println("\nList is empty");
        }
    }
}
