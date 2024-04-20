class BT1 {
    Node root;

    static class Node {
        int data;
        Node left, right;

        Node(int d) {
            data = d;
            left = right = null;
        }
    }

    BT1() {
        root = null;
    }

    BT1(int d) {
        root = new Node(d);
    }

    // Insert a node into the BST
    Node insert(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }
        if (data < root.data)
            root.left = insert(root.left, data);
        else if (data > root.data)
            root.right = insert(root.right, data);
        return root;
    }

    // Find the minimum value in the BST
    Node findMin(Node root) {
        if (root == null || root.left == null)
            return root;
        return findMin(root.left);
    }

    // Find the maximum value in the BST
    Node findMax(Node root) {
        if (root == null || root.right == null)
            return root;
        return findMax(root.right);
    }

    // Count the number of nodes in the BST
    int countNodes(Node root) {
        if (root == null)
            return 0;
        return 1 + countNodes(root.left) + countNodes(root.right);
    }

    // Print inorder traversal of the BST
    void inorderPrint(Node root) {
        if (root == null)
            return;
        inorderPrint(root.left);
        System.out.print(root.data + " ");
        inorderPrint(root.right);
    }

    // Print preorder traversal of the BST
    void preorderPrint(Node root) {
        if (root == null)
            return;
        System.out.print(root.data + " ");
        preorderPrint(root.left);
        preorderPrint(root.right);
    }
    
    // Print postorder traversal of the BST
    void postorderPrint(Node root) {
        if (root == null)
            return;
        postorderPrint(root.left);
        postorderPrint(root.right);
        System.out.print(root.data + " ");
    }

    public static void main(String args[]) {
        BT1 t1 = new BT1();
        t1.root = t1.insert(t1.root, 20);
        t1.insert(t1.root, 25);
        t1.insert(t1.root, 56);
        t1.insert(t1.root, 12);

        System.out.println("Inorder---->");
        t1.inorderPrint(t1.root);

        System.out.println();
        System.out.println("Preorder---->");
        t1.preorderPrint(t1.root);

        System.out.println();
        System.out.println("Postorder---->");
        t1.postorderPrint(t1.root);

        System.out.println();
        System.out.println("Minimum value: " + t1.findMin(t1.root).data);
        System.out.println("Maximum value: " + t1.findMax(t1.root).data);
        System.out.println("Number of nodes: " + t1.countNodes(t1.root));
    }
}
