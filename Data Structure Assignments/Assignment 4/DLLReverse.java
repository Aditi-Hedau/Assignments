class DLLReverse {
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

    // Insertion methods as you provided...
	void insert(int new_data){	//insertion at beginning
		Node new_node = new Node(new_data);
		new_node.next = head;
		new_node.prev = null;
		if(head != null)
			head.prev = new_node;
		head = new_node;
	}

    	void reverse() {
        	Node temp = null;
        	Node current = head;

        	// Swap next and prev pointers for all nodes of the doubly linked list
        	while (current != null) {
            	temp = current.prev;
            	current.prev = current.next;
            	current.next = temp;
            	current = current.prev; // Move to the next node
        }

        // Before changing head, check for cases like empty list and list with only one node
        if (temp != null) {
            head = temp.prev;
        }
    }

    	void display(Node n) {
        Node p = null;
		System.out.print("Forward direction: ");
		while(n != null){
			System.out.print(n.data + "---->");
			p=n;
			n=n.next;
		}
		
		System.out.println();

		System.out.print("Backward direction: ");
		while(p != null){
			System.out.print(p.data + "---->");
			p=p.prev;
		}

    	}

    public static void main(String args[]) {
        DLLReverse d = new DLLReverse();

        // Insertion calls as you provided...
	d.insert(5);
	d.insert(10);
	d.insert(15);
	

	

        System.out.println("<----------------Original list---------------->");
        d.display(d.head);

        // Reverse the doubly linked list
        d.reverse();

	System.out.println();

        System.out.println("<-----------------Reversed list---------------->");
        d.display(d.head);
    }
}
