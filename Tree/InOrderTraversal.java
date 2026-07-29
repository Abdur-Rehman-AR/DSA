import java.util.LinkedList;
import java.util.Queue;

// Function used to construct the tree
public class InOrderTraversal {

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

        // Traverse level by level until an empty child position is found.
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

    // function used to perform the in-order traversal
    public void inOrder(Node root) {

        if (root == null)
            return;

        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static void main(String[] args) {

        InOrderTraversal inOrderTraversal = new InOrderTraversal();

        inOrderTraversal.insertNode(1);
        inOrderTraversal.insertNode(2);
        inOrderTraversal.insertNode(3);
        inOrderTraversal.insertNode(4);
        inOrderTraversal.insertNode(5);
        inOrderTraversal.insertNode(6);
        inOrderTraversal.insertNode(7);

        System.out.println();
        System.out.println("In-Order Traversal of Nodes is as follow:");
        inOrderTraversal.inOrder(inOrderTraversal.root);
    }
}