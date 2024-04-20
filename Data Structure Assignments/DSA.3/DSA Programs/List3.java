public class List3 {
    
	Node head; // instance

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
        	Node new_node = new Node(new_data);	//insertion at first
        	new_node.next = head;
        	head = new_node;
    	}

	void append(int new_data) {
		Node new_node = new Node(new_data);	//insertion at last
		if(head == null) {
			head = new_node;
			return;
		}
		new_node.next = null;		//condn for last node
		Node last = head; 	//transverse till last node
		while(last.next != null) {
			last =last.next; 	//shift to next node
		}
		last.next = new_node;	//connect to new node
		return;
	}

 	public static void main(String args[]) {
        	List3 L1 = new List3();
        	L1.head = new Node(5);
        	Node second = new Node(7);
        	Node third = new Node(9);

        	L1.head.next = second;
        	second.next = third;

        	L1.display();
        	L1.insert(10);
        	System.out.println();
        	L1.display();

        	L1.insert(15);
        	System.out.println();
        	L1.display();

		L1.append(25);
		System.out.println();
		L1.display();

		L1.append(30);
		System.out.println();
		L1.display();

		
    	}
}
