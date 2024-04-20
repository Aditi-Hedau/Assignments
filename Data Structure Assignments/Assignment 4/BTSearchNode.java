class BTSearchNode {
    Node root;

    static class Node {
        int data;
        Node left, right;

        Node(int d) {
            data = d;
            left = right = null;
        }
    }

    BTSearchNode() {
        root = null;
    }

    BTSearchNode(int d) {
        root = new Node(d);
    }

    // Inorder traversal
    void printInorder(Node n) {
        if (n == null)
            return;
        printInorder(n.left);
        System.out.print(n.data + " ");
        printInorder(n.right);
    }

    void inorder() {
        printInorder(root);
    }

    // Preorder traversal
    void printPreorder(Node n) {
        if (n == null)
            return;
        System.out.print(n.data + " ");
        printPreorder(n.left);
        printPreorder(n.right);
    }

    void preorder() {
        printPreorder(root);
    }

    // Postorder traversal
    void printPostorder(Node n) {
        if (n == null)
            return;
        printPostorder(n.left);
        printPostorder(n.right);
        System.out.print(n.data + " ");
    }

    void postorder() {
        printPostorder(root);
    }

    // Search for a node with a given value
    boolean search(Node node, int value) {
        if (node == null)
            return false;
        if (node.data == value)
            return true;
        boolean leftSearch = search(node.left, value);
        boolean rightSearch = search(node.right, value);
        return leftSearch || rightSearch;
    }

    boolean search(int value) {
        return search(root, value);
    }

    public static void main(String args[]) {
        BTSearchNode t1 = new BTSearchNode();
        t1.root = new Node(20);
        t1.root.left = new Node(25);
        t1.root.right = new Node(56);
        t1.root.right.right = new Node(12);

        System.out.println("Inorder---->");
        t1.inorder();

        System.out.println("\nPreorder---->");
        t1.preorder();

        System.out.println("\nPostorder---->");
        t1.postorder();

        
        int valueToSearch = 25;
        boolean found = t1.search(valueToSearch);
        System.out.println("\n\nSearching for node with value " + valueToSearch + ": " + (found ? "Found" : "Not found"));
    }
}
