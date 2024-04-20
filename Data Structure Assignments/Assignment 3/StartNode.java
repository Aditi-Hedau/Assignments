class StartNode {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public void insert(int new_data) { // insert at beginning
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    
    public Node detectLoop() {
        Node ptr1 = head;
        Node ptr2 = head;
	Node loopNode = null;

        while (ptr2 != null && ptr2.next != null) {
            ptr1 = ptr1.next;
            ptr2 = ptr2.next.next;

           
            if (ptr1 == ptr2) {
                loopNode = ptr1;
		break;
            }
        }
	if(loopNode != null){
		ptr1 = head;
		while(ptr1 != ptr2){
			ptr1 = ptr1.next;
			ptr2 = ptr2.next;
		}
		return ptr1;
	} 
	else {
		return null;
	} 
  
    }

    public void display() {
        Node n = head;
        while (n != null) {
            System.out.print(n.data + "---->");
            n = n.next;
        }
        System.out.println("null");
    }

    public static void main(String args[]) {
        StartNode p = new StartNode();

        
        p.insert(1);
        p.insert(2);
        p.insert(3);
        p.insert(4);
        p.insert(5);
        p.insert(6);
	
	p.display();

        // Creating a loop for testing
        p.head.next.next.next.next.next.next = p.head;

        
        Node startNode = p.detectLoop();
	if(startNode != null){
		System.out.println("Start node of loop : " +startNode.data);
	}
	else {
		System.out.println("No loop found");
	}
    }
}
