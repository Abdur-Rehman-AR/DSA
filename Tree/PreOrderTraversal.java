import java.util.LinkedList;
import java.util.Queue;

public class PreOrderTraversal {
    // Node class representating nodes of tree
    static class Node {

        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // Root represents the first node of the tree
    Node root = null;

    // Inserts a new node into the tree level by level.
    public void insertNode(int data) {
        Node node = new Node(data);

        if (root == null) {
            root = node;
            return;
        }

        // Queue used to store nodes
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        // while loop used to put nodes on the correct place
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

    // function used to perform the pre-order traversal
    public void preOrder(Node root) {

        if (root == null) {
            return;
        }
        System.out.println(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String[] args) {

        PreOrderTraversal preOrderTraversal = new PreOrderTraversal();

        preOrderTraversal.insertNode(1);
        preOrderTraversal.insertNode(2);
        preOrderTraversal.insertNode(3);
        preOrderTraversal.insertNode(4);
        preOrderTraversal.insertNode(5);
        preOrderTraversal.insertNode(6);
        preOrderTraversal.insertNode(7);

        System.out.println("Pre Order Traversal of Nodes is as follow:");
        preOrderTraversal.preOrder(preOrderTraversal.root);
    }
}