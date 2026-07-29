import java.util.*;

// Node class that represents each node of the tree
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

public class BinaryTree {

    // Points to the root node of the tree
    Node root;

    // this method puts the nodes level by level from left to right
    public void insert(int data) {

        // Creating a new node every time
        Node node = new Node(data);

        if (root == null) {
            root = node;
            return;
        }

        // Queue is used for Level Order (BFS) traversal.
        // LinkedList is one implementation of the Queue interface.
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        // Using a while loop to iteratively check the left and right of the node level
        // by level and then insert the node at correct position.
        while (!queue.isEmpty()) {
            Node current = queue.poll();

            if (current.left == null) {
                current.left = node;
                return;
            } else {
                queue.add(current.left);
            }

            if (current.right == null) {
                current.right = node;
                return;
            } else {
                queue.add(current.right);
            }
        }
    }

    // Level Order Traversal of the nodes as well as DFS concept of traversal
    public void levelOrderTraversal(Node root) {
        if (root == null)
            return;

        // Again using a queue to store left and right node of the Tree
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node current = queue.poll();
            System.out.print(current.data + " ");

            if (current.left != null)
                queue.add(current.left);

            if (current.right != null)
                queue.add(current.right);
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.insert(1);
        tree.insert(2);
        tree.insert(3);
        tree.insert(4);
        tree.insert(5);
        tree.insert(6);
        tree.insert(7);
        tree.insert(8);
        tree.insert(9);
        tree.insert(10);

        tree.levelOrderTraversal(tree.root);
    }
}