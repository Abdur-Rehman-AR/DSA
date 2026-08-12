import java.util.Scanner;

public class BinarySearchTree {

    // Structure of a node
    class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    // Pointing to the root node of the tree
    Node root = null;

    // Method that inserts the nodes in the tree
    public Node insertNode(Node root, int data) {

        if (root == null) {
            return new Node(data);
        }

        if (data < root.data) {
            root.left = insertNode(root.left, data);
        } else if (data > root.data) {
            root.right = insertNode(root.right, data);
        }
        return root;
    }

    // doing an in-order traversal for printing elements
    public void traverseTree(Node root) {

        if (root == null)
            return;

        traverseTree(root.left);
        System.out.println(root.data + " ");
        traverseTree(root.right);
    }

    public static void main(String[] args) {

        BinarySearchTree binarySearchTree = new BinarySearchTree();

        Scanner sc = new Scanner(System.in);
        int data = 0;

        System.out.println();
        System.out.print("How many nodes do you want to create ? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i + 1) + " : ");
            data = sc.nextInt();

            // Calling function each time user enter data to insert a node in the tree
            binarySearchTree.root = binarySearchTree.insertNode(binarySearchTree.root, data);
        }

        // Displaying Node's data
        System.out.println();
        binarySearchTree.traverseTree(binarySearchTree.root);
        sc.close();
    }
}