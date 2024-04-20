class DetectLoop {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public void insert(int new_data) { // insert at beginning
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    
    public boolean detectLoop() {
        Node ptr1 = head;
        Node ptr2 = head;

        while (ptr2 != null && ptr2.next != null) {
            ptr1 = ptr1.next;
            ptr2 = ptr2.next.next;

            // If slow and fast pointers meet, it indicates a loop
            if (ptr1 == ptr2) {
                return true;
            }
        }
        // If fast reaches the end of the list, there is no loop
        return false;
    }

    public void display() {
        Node n = head;
        while (n != null) {
            System.out.print(n.data + "---->");
            n = n.next;
        }
        System.out.println("null");
    }

    public static void main(String args[]) {
        DetectLoop p = new DetectLoop();

        
        p.insert(1);
        p.insert(2);
        p.insert(3);
        p.insert(4);
        p.insert(5);
        p.insert(6);

        // Creating a loop for testing
        p.head.next.next.next.next.next.next = p.head;

        
        boolean detectLoop = p.detectLoop();
        System.out.println("Does the linked list have a loop? " + detectLoop);
    }
}
