class BTheadNode {
    Node root;

    static class Node {
        int data;
        Node left, right;

        Node(int d) {
            data = d;
            left = right = null;
        }
    }

    BTheadNode() {
        root = null;
    }

    BTheadNode(int d) {
        root = new Node(d);
    }

    // Inorder traversal with printing head node
    void printInorderWithHead(Node n) {
        if (n == null)
            return;
        printInorderWithHead(n.left);
        System.out.print("Head Node: " + root.data + ", Data: " + n.data + " ");
        printInorderWithHead(n.right);
    }

    void inorderWithHead() {
        printInorderWithHead(root);
    }

    // Preorder traversal with printing head node
    void printPreorderWithHead(Node n) {
        if (n == null)
            return;
        System.out.print("Head Node: " + root.data + ", Data: " + n.data + " ");
        printPreorderWithHead(n.left);
        printPreorderWithHead(n.right);
    }

    void preorderWithHead() {
        printPreorderWithHead(root);
    }

    // Postorder traversal with printing head node
    void printPostorderWithHead(Node n) {
        if (n == null)
            return;
        printPostorderWithHead(n.left);
        printPostorderWithHead(n.right);
        System.out.print("Head Node: " + root.data + ", Data: " + n.data + " ");
    }

    void postorderWithHead() {
        printPostorderWithHead(root);
    }

    public static void main(String args[]) {
        BTheadNode t1 = new BTheadNode();
        t1.root = new Node(20);
        t1.root.left = new Node(10);
        t1.root.right = new Node(30);
        t1.root.right.left = new Node(25);
        t1.root.right.right = new Node(35);

        System.out.println("Inorder with Head---->");
        t1.inorderWithHead();
        System.out.println();

        System.out.println("Preorder with Head---->");
        t1.preorderWithHead();
        System.out.println();

        System.out.println("Postorder with Head---->");
        t1.postorderWithHead();
        System.out.println();
    }
}
