class DLLSorted {
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

    void insertSorted(int new_data) {
        Node new_node = new Node(new_data);
        Node current;

        // If the list is empty or the new node data is smaller than the head data
        if (head == null || head.data >= new_data) {
            new_node.next = head;
            new_node.prev = null;
            if (head != null)
                head.prev = new_node;
            head = new_node;
            return;
        }

        // Find the node after which the new node should be inserted
        current = head;
        while (current.next != null && current.next.data < new_data)
            current = current.next;

        // Insert the new node
        new_node.next = current.next;
        if (current.next != null)
            current.next.prev = new_node;
        current.next = new_node;
        new_node.prev = current;
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
       DLLSorted d = new DLLSorted();

     
        d.insert(5);
        d.insert(10);
        d.insert(15);

        System.out.println("Original list:");
        d.display(d.head);

    
        d.insertSorted(12);

        System.out.println("\nList after inserting 12:");
        d.display(d.head);
    }
}
