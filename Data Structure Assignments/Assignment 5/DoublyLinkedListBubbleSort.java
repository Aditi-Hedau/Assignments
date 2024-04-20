class DoublyLinkedListBubbleSort {
    static class Node {
        int data;
        Node prev;
        Node next;

        Node(int d) {
            data = d;
            prev = next = null;
        }
    }

    Node head;

    void push(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        if (head != null)
            head.prev = new_node;
        head = new_node;
    }

    void bubbleSort() {
        if (head == null || head.next == null)
            return;

        Node end = null;
        boolean swapped;

        do {
            swapped = false;
            Node current = head;

            while (current.next != end) {
                if (current.data > current.next.data) {
                    swap(current, current.next);
                    swapped = true;
                }
                current = current.next;
            }
            end = current;
        } while (swapped);
    }

    void swap(Node node1, Node node2) {
        int temp = node1.data;
        node1.data = node2.data;
        node2.data = temp;
    }

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String args[]) {
        DoublyLinkedListBubbleSort dll = new DoublyLinkedListBubbleSort();
        dll.push(64);
        dll.push(34);
        dll.push(25);
        dll.push(12);
        dll.push(22);

        System.out.println("Original Doubly Linked List:");
        dll.display();

        dll.bubbleSort();

        System.out.println("\nDoubly Linked List after Bubble Sort:");
        dll.display();
    }
}
