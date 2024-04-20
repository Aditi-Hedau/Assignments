class AddTwoNumbersLinkedList {
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
    
    public static AddTwoNumbersLinkedList addTwoNumbers(AddTwoNumbersLinkedList l1, AddTwoNumbersLinkedList l2) {
        AddTwoNumbersLinkedList result = new AddTwoNumbersLinkedList();
        Node p = l1.head;
        Node q = l2.head;
        Node current = null;
        int carry = 0;
        
        while (p != null || q != null) {
            int x = (p != null) ? p.data : 0;
            int y = (q != null) ? q.data : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            
            if (result.head == null) {
                result.head = current = new Node(sum % 10);
            } else {
                current.next = new Node(sum % 10);
                current = current.next;
            }
            
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        
        if (carry > 0) {
            current.next = new Node(carry);
        }
        
        return result;
    }

    public static void main(String args[]) {
        AddTwoNumbersLinkedList l1 = new AddTwoNumbersLinkedList();
        AddTwoNumbersLinkedList l2 = new AddTwoNumbersLinkedList();
        
        l1.insert(2);
        l1.insert(4);
        l1.insert(3);

        l2.insert(5);
        l2.insert(6);
        l2.insert(4);

        System.out.println("List 1:");
        l1.display();
        System.out.println("\nList 2:");
        l2.display();

        System.out.println("\nSum of Lists:");
        AddTwoNumbersLinkedList sumList = addTwoNumbers(l1, l2);
        sumList.display();
    }
}
