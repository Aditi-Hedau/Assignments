class DLL{
	Node head;
	
	static class Node{
		int data;
		Node prev;
		Node next;

		Node(int d){
			data = d;
			prev = null;
			next = null;
		}
	}
	
	void insert(int new_data){	//insertion at beginning
		Node new_node = new Node(new_data);
		new_node.next = head;
		new_node.prev = null;
		if(head != null)
			head.prev = new_node;
		head = new_node;
	}

	void display(Node n){
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

	public static void main(String args[]){
		DLL d = new DLL();

		d.insert(5);
		d.insert(10);
		d.insert(15);
		d.display(d.head);

		System.out.println();
	}
}