public class List5 {
    
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

	void insertAfter(Node prev_node, int new_data) {
		if(prev_node == null) {
			System.out.println("Empty list !!");
			return;
		}
		Node new_node = new Node(new_data);
		new_node.next = prev_node.next;
		prev_node.next = new_node;
	}

	void deleteNode(int key) {
		Node temp = head, prev = null;
		if(temp != null && temp.data == key) {		//deletion at beginning
			head = temp.next;
			return;
		}
		
		while(temp != null && temp.data != key) {	//deletion in between
			prev = temp;
			temp = temp.next;
		} 

		if(temp == null) 
		return;
		prev.next = temp.next; 
	}

    	public static void main(String args[]) {
        	List5 L1 = new List5();
        	L1.head = new Node(5);
        	Node second = new Node(7);
        	Node third = new Node(9);

        	L1.head.next = second;
        	second.next = third;

        	L1.display();
        	L1.insert(10);
        	System.out.println();
        	//L1.display();

        	L1.insert(15);
        	System.out.println();
        	//L1.display();

		L1.append(25);
		System.out.println();
		L1.display();

		L1.append(30);
		System.out.println();
		L1.display();

		L1.insertAfter(L1.head.next, 90);
		System.out.println();
		L1.display();

		L1.insertAfter(L1.head, 80);
		System.out.println();
		L1.display();

		L1.insertAfter(L1.head.next.next, 70);
		System.out.println();
		L1.display();

		L1.deleteNode(5);
		System.out.println();
		L1.display();
    	}
}
