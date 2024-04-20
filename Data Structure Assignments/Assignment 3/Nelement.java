class Nelement{
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

	public int nelement(int pos){	//nth element
		Node temp = head;
		int c = 0;
		while(temp != null){
			if(c == pos)
				return temp.data;
			c++;
			temp = temp.next;
		}
		assert(false);	//non-value printe arega false
		return 0;
	}


	public void display(){
		Node n = head;
		while(n!=null){
			System.out.print(n.data + "---->");
			n=n.next;
		}
	}

	public static void main(String args[]){
		Nelement p = new Nelement();

		p.insert(1);
		p.insert(2);
		p.insert(3);
		p.insert(4);
		p.insert(5);
		p.insert(6);

		int nelement = p.nelement(1);
		System.out.println("Nth element : " +nelement);

		p.display();
	}
}

