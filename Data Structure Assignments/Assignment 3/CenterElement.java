class CenterElement{
	Node head;
	static class Node{
		int data;
		Node next;
	
		Node (int d){
			data = d;
			next = null;
		}

	}

	public int centerElement(){	//center element
		Node ptr1 = head;
		Node ptr2 = head;
		while(ptr2 != null && ptr2.next != null){
			ptr1 = ptr1.next;
			ptr2 = ptr2.next.next;
		}
		return ptr1.data;	
	}

	public void insert(int new_data){	//insert at beginning
		Node new_node = new Node(new_data);
		new_node.next = head;
		head= new_node;	
	}
	public void display(){
		Node n = head;
		while(n!=null){
			System.out.print(n.data + "---->");
			n=n.next;
		}
	}

	public static void main(String args[]){
		CenterElement p = new CenterElement();

		p.insert(1);
		p.insert(2);
		p.insert(3);
		p.insert(4);
		p.insert(5);
		p.insert(6);

		int centerElement = p.centerElement();
		System.out.println("Center element Of Linked List is : " + centerElement);	

		p.display();
	}
}

