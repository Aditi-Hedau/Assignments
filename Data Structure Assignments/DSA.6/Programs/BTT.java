class BTT{
	Node root;
	static class Node{
		int data;
		Node left;
		Node right;

		Node(int d){
			data = d;
			left = null;
			right = null;
		}	
	}
	BTT(){
		root = null;	
	}
	BTT(int d){
		root = new Node(d);
	}

	Node insert(Node root, int data){
		if( root == null){
			root = new Node(data);
			return root;
		}
		if(data < root.data){
			root.left = insert(root.left, data);
		}
		else if(data > root.data){
			root.right = insert(root.right, data);
		}
		return root;
	}

	void inorder(Node root){	//Inorder ------> L-N-R
		if(root == null)
			return;
		inorder(root.left);
		System.out.print(root.data + " ");
		inorder(root.right);

	}

	void preorder(Node root){	P//Postorder -----> N-L-R
		if(root == null)
			return;
		System.out.print(root.data + " ");
		preorder(root.left);
		preorder(root.right);

	}

	void postorder(Node root){	//Preprder -----> L-R-N
		if(root == null)
			return;
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.data + " ");
	}

	Node findMin(Node root){	// minmum node value
		if(root == null || root.left == null)
			return root;
		return findMin(root.left);	

	}

	Node findMax(Node root){	// maximum node value
		if(root == null || root.right == null)
			return root;
		return findMin(root.right);	

	}
	
	int countNode(Node root){	//total count nodes
		if(root == null)
			return 0;
		return 1 + countNode(root.left) + countNode(root.right);
	}

	public static void main(String args[]){
		BTT b = new BTT();
		b.root = b.insert(b.root, 100);
		b.insert(b.root, 1);
		b.insert(b.root, 2);
		b.insert(b.root, 3);
		b.insert(b.root, 4);

		System.out.print("Inorder : ");
		b.inorder(b.root);

		System.out.println();

		System.out.print("Pre-order : ");
		b.preorder(b.root);

		System.out.println();

		System.out.print("Post-order : ");
		b.postorder(b.root);

		System.out.println();

		System.out.println("Minimum Value : " + b.findMin(b.root).data);
		System.out.println("Maximum Value : " + b.findMax(b.root).data);
		System.out.println("Nodes Count : " + b.countNode(b.root));		
	}
}

