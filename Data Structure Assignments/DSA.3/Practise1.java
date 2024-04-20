class Practise1{
	Node head;
	static class Node{
		int data;
		Node link;
	
		Node (int d){
			data = d;
			link = null;
		}

	}

	public void insert(int new_data){	//insert at beginning
		Node new_node = new Node(new_data);
		new_node.link = head;
		head= new_node;	
	}

	public void insertAfter(Node prev_node, int new_data)	{	//insertion in between
		Node new_node = new Node(new_data);
		new_node.link = prev_node.link;
		prev_node.link = new_node;
		
	}

	public void insertEnd(int new_data){		//insertion at end
		Node new_node = new Node(new_data);
		if(head == null){
			head = new Node(new_data);
			return;
		}
		new_node.link = null;
		Node last = head;
		while(last.link != null){
			last = last.link;
		}
		last.link = new_node;
		return;
			
	}

	public void deletNode(int key){
		Node temp = head, prev = null;
		if(temp != null && temp.data == key){	//deletion at beginning
			head = temp.link;
			return;
		}
		while(temp != null && temp.data != key){	//deletion between node
			prev = temp;
			temp = temp.link;
		}
		if(temp == null)
			return;
		prev.link = temp.link;
	}

	public int count(){	// count of nodes present in list
		Node temp = head;
		int c = 0;
		while(temp != null){
			c++;
			temp = temp.link;
		}
		return c;
	}

	public int countRecursive(Node temp){	// count in recursive of nodes present in list
		//base condition
		if(temp == null)
			return 0;
		return 1 + countRecursive(temp.link);
	}

	public boolean search(int key){		//searching node	
		Node temp = head;
		while(temp != null){
			if(temp.data == key){
				return true;
			}
			temp = temp.link;
		}
		return false;
	}

	public void reverseLinkedList(Node node){	//reverse linked list
		node = head;
		Node prev = null;
		Node curr = node;
		Node next = null;
		while(curr != null){
			next = curr.link;
			curr.link = prev;
			prev = curr;
			curr = next;
		} 
		head = prev;
	}

	public int nelement(int pos){	//nth element
		Node temp = head;
		int c = 0;
		while(temp != null){
			if(c == pos)
				return temp.data;
			c++;
			temp = temp.link;
		}
		assert(false);	//non-value printe arega false
		return 0;
	}

	public int centerElement(){	//center element
		Node ptr1 = head;
		Node ptr2 = head;
		while(ptr2 != null && ptr2.link != null){
			ptr1 = ptr1.link;
			ptr2 = ptr2.link.link;
		}
		return ptr1.data;	
	}

	public void display(){
		Node n = head;
		while(n!=null){
			System.out.print(n.data + "---->");
			n=n.link;
		}
	}

	public static void main(String args[]){
		Practise1 p = new Practise1();
		p.head = new Node(1);
		
		Node second = new Node(2);
		Node third = new Node(3);
	
		p.head.link = second;
		second.link = third;

		p.insert(4);
		p.insert(6);
		p.insert(7);
		p.insertAfter(p.head.link.link, 10);

		p.insertEnd(20);
		p.insertEnd(21);

		p.deletNode(7);
		p.deletNode(21);
		p.deletNode(2);

		int count = p.count();
        	System.out.println("Number of nodes in the list: " + count);
		
		int countRecursive = p.countRecursive(p.head);
        	System.out.println("Number of nodes in the list(recursive): " + countRecursive);

		boolean search = p.search(3);
		System.out.println("key found : " +search);

		p.reverseLinkedList(p.head);

		int nelement = p.nelement(3);
		System.out.println("nth element : " +nelement);
		
		int centerElement = p.centerElement();
		System.out.println("center element : " + centerElement);		

		p.display();
	}
	
}