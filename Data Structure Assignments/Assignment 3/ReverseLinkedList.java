class ReverseLinkedList{
	Node head;
	static class Node{
		int data;
		Node next;
	
		Node (int d){
			data = d;
			next = null;
		}

	}

	
	public void insert(int new_data){	//insert at beginning
		Node new_node = new Node(new_data);
		new_node.next = head;
		head= new_node;	
	}

	public void reverseLinkedList(Node node){	//reverse linked list
		node = head;
		Node prev = null;
		Node curr = node;
		Node next = null;
		while(curr != null){
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		} 
		head = prev;
	}

	public void display(){
		Node n = head;
		while(n!=null){
			System.out.print(n.data + "---->");
			n=n.next;
		}
	}

	public static void main(String args[]){
		ReverseLinkedList p = new ReverseLinkedList();

		p.insert(1);
		p.insert(2);
		p.insert(3);
		p.insert(4);
		p.insert(5);
		p.insert(6);

		p.reverseLinkedList(p.head);

		p.display();
	}
}

