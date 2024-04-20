class SinglyList
{
	static Node head;
	class Node
	{
		int data;
		Node next;
	
		Node(int d)
		{
			this.data = data;
			Node next;
		}	
	}

	void insertData(int data)
	{
		Node new_node = new Node(data);
		if(head == null)
		{
			head = new_node;
			new_node.next = null;
		} 
		else 
		{
			new_node.next = head.next;	
			head = new_node;	
		}
	}

	void display()
	{
		Node h = head;
		while(h!= null)
		{
			System.out.println(head.data);
			h=h.next;
		}
	}

	public static void main(String[] args)
	{
		SinglyList s = new SinglyList();
		s.insertData(12);
		s.display();
		
	}
}