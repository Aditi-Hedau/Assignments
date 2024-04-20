class BTinorderSuccessor {
    Node root;

    static class Node {
        int data;
        Node left, right;

        Node(int d) {
            data = d;
            left = right = null;
        }
    }

    BTinorderSuccessor() {
        root = null;
    }

    BTinorderSuccessor(int d) {
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

    // Search for a node with a given value
    Node search(Node node, int value) {
        if (node == null || node.data == value)
            return node;
        if (node.data < value)
            return search(node.right, value);
        return search(node.left, value);
    }

    Node search(int value) {
        return search(root, value);
    }

    // Function to find the leftmost node in a subtree
    Node leftMostNode(Node node) {
        Node current = node;
        while (current.left != null)
            current = current.left;
        return current;
    }

    // Function to find the inorder successor of a node
    Node inorderSuccessor(Node node) {

        if (node.right != null)
            return leftMostNode(node.right);

        Node successor = null;
        Node current = root;
        while (current != null) {
            if (node.data < current.data) {
                successor = current;
                current = current.left;
            } else if (node.data > current.data) {
                current = current.right;
            } else {
                break; // Node found
            }
        }
        return successor;
    }

    public static void main(String args[]) {
        BTinorderSuccessor t1 = new BTinorderSuccessor();
        t1.root = new Node(20);
        t1.root.left = new Node(10);
        t1.root.right = new Node(30);
        t1.root.right.left = new Node(25);
        t1.root.right.right = new Node(35);

        System.out.println("Inorder---->");
        t1.inorder();
        System.out.println();

        Node nodeToFindSuccessor = t1.search(25);
        if (nodeToFindSuccessor != null) {
            Node successor = t1.inorderSuccessor(nodeToFindSuccessor);
            if (successor != null) {
                System.out.println("Inorder successor of " + nodeToFindSuccessor.data + " is " + successor.data);
            } else {
                System.out.println("No inorder successor found for " + nodeToFindSuccessor.data);
            }
        } else {
            System.out.println("Node not found");
        }
    }
}
