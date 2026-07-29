import java.util.Scanner;

public class BinarySearchTree {

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

    Node root = null;

    public Node insertNode(Node ptr, int data) {

        Node node = new Node(data);

        if (root == null) {
            root = node;
        } else {
            if (data < ptr.data) {
                ptr.left = node;
            } else {
                ptr.right = node;
            }
        }
        return node;
    }

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

        Node node = binarySearchTree.root;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i + 1) + " : ");
            data = sc.nextInt();
            node = binarySearchTree.insertNode(node, data);
        }

        System.out.println();
        binarySearchTree.traverseTree(binarySearchTree.root);
        sc.close();
    }
}