class LinkedListBubbleSort {
    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    Node head;

    void push(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    void bubbleSort() {
        if (head == null || head.next == null)
            return;

        boolean swapped;
        Node ptr1;
        Node lptr = null;

        do {
            swapped = false;
            ptr1 = head;

            while (ptr1.next != lptr) {
                if (ptr1.data > ptr1.next.data) {
                    int temp = ptr1.data;
                    ptr1.data = ptr1.next.data;
                    ptr1.next.data = temp;
                    swapped = true;
                }
                ptr1 = ptr1.next;
            }
            lptr = ptr1;
        } while (swapped);
    }

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String args[]) {
        LinkedListBubbleSort llist = new LinkedListBubbleSort();
        llist.push(64);
        llist.push(34);
        llist.push(25);
        llist.push(12);
        llist.push(22);

        System.out.println("Original Linked List:");
        llist.display();

        llist.bubbleSort();

        System.out.println("\nLinked List after Bubble Sort:");
        llist.display();
    }
}
