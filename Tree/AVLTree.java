public class AVLTree {

    // Node of AVL Tree
    class Node {
        int data;
        // height means the number of levels from that node down to its deepest leaf.
        int height;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.height = 1;
            left = null;
            right = null;
        }
    }

    Node root = null;

    // Get height of a node
    public int getHeight(Node node) {
        if (node == null)
            return 0;

        return node.height;
    }

    // Get balance factor
    public int getBalance(Node node) {
        if (node == null)
            return 0;

        return getHeight(node.left) - getHeight(node.right);
    }

    // Right Rotation
    public Node rightRotate(Node y) {

        Node x = y.left;
        Node temp = x.right;

        x.right = y;
        y.left = temp;

        // Update heights
        y.height = 1 + Math.max(getHeight(y.left), getHeight(y.right));
        x.height = 1 + Math.max(getHeight(x.left), getHeight(x.right));

        return x;
    }

    // Left Rotation
    public Node leftRotate(Node x) {

        Node y = x.right;
        Node temp = y.left;

        y.left = x;
        x.right = temp;

        // Update heights
        x.height = 1 + Math.max(getHeight(x.left), getHeight(x.right));
        y.height = 1 + Math.max(getHeight(y.left), getHeight(y.right));

        return y;
    }

    // Insert node into AVL Tree
    public Node insertNode(Node root, int data) {

        // Normal BST insertion
        if (root == null) {
            return new Node(data);
        }

        if (data < root.data) {
            root.left = insertNode(root.left, data);
        }
        else if (data > root.data) {
            root.right = insertNode(root.right, data);
        }
        else {
            return root; // Ignore duplicates
        }

        // Update height
        root.height = 1 + Math.max(getHeight(root.left), getHeight(root.right));

        // Check balance
        int balance = getBalance(root);

        // LL Case
        if (balance > 1 && data < root.left.data) {
            return rightRotate(root);
        }

        // RR Case
        if (balance < -1 && data > root.right.data) {
            return leftRotate(root);
        }

        // LR Case
        if (balance > 1 && data > root.left.data) {
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }

        // RL Case
        if (balance < -1 && data < root.right.data) {
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }

        return root;
    }

    // In-order traversal
    public void inOrder(Node root) {

        if (root == null)
            return;

        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static void main(String[] args) {

        AVLTree tree = new AVLTree();

        tree.root = tree.insertNode(tree.root, 30);
        tree.root = tree.insertNode(tree.root, 20);
        tree.root = tree.insertNode(tree.root, 10);

        System.out.println("In-order traversal:");
        tree.inOrder(tree.root);
    }
}