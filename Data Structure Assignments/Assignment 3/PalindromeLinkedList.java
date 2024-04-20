class PalindromeLinkedList{
    Node head; //instance
    
    static class Node {
        int data;
        Node next;
        
        Node(int d) {
            data = d;
            next = null;
        }
    }
    
    void display() {
        Node n = head;
        while (n != null) {
            System.out.print(n.data + " ---> ");
            n = n.next;
        }
    }

    void insert(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
    
    boolean isPalindrome() {
        if (head == null || head.next == null) {
            return true; // Empty or single element list is considered a palindrome
        }

        // Find the middle of the list
        Node slow = head;
        Node fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse the second half of the list
        Node secondHalf = reverse(slow.next);
        
        // Compare the first and second halves
        Node firstHalf = head;
        while (secondHalf != null) {
            if (firstHalf.data != secondHalf.data) {
                return false;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }
        
        return true;
    }
    
    Node reverse(Node node) {
        Node prev = null;
        Node current = node;
        Node next = null;
        
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        
        return prev;
    }

    public static void main(String args[]) {
        PalindromeLinkedList L1 = new PalindromeLinkedList();
        
        L1.insert(1);
        L1.insert(2);
        L1.insert(3);
        L1.insert(2);
        L1.insert(1);

        System.out.println("Original List:");
        L1.display();
        
        boolean isPal = L1.isPalindrome();
        System.out.println("\nIs Palindrome? " + isPal);
    }
}
