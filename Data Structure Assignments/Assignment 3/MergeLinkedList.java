class MergeLinkedList{
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
    
    void mergeSorted(MergeLinkedList list1, MergeLinkedList list2) {
        Node temp = null;
        Node current = null;
        
        Node l1 = list1.head;
        Node l2 = list2.head;
        
        while (l1 != null && l2 != null) {
            if (l1.data < l2.data) {
                if (temp == null) {
                    temp = current = l1;
                } else {
                    current.next = l1;
                    current = current.next;
                }
                l1 = l1.next;
            } else {
                if (temp == null) {
                    temp = current = l2;
                } else {
                    current.next = l2;
                    current = current.next;
                }
                l2 = l2.next;
            }
        }
        
        if (l1 != null) {
            if (temp == null) {
                temp = l1;
            } else {
                current.next = l1;
            }
        }
        
        if (l2 != null) {
            if (temp == null) {
                temp = l2;
            } else {
                current.next = l2;
            }
        }
        
        head = temp;
    }

    public static void main(String args[]) {
        MergeLinkedList L1 = new MergeLinkedList();
        MergeLinkedList L2 = new MergeLinkedList();
        
        L1.head = new Node(1);
        L1.head.next = new Node(3);
        L1.head.next.next = new Node(5);

        L2.head = new Node(2);
        L2.head.next = new Node(4);
        L2.head.next.next = new Node(6);

        System.out.println("List 1:");
        L1.display();
        System.out.println("\nList 2:");
        L2.display();

        System.out.println("\nMerged Sorted List:");
        MergeLinkedList mergedList = new MergeLinkedList();
        mergedList.mergeSorted(L1, L2);
        mergedList.display();
    }
}