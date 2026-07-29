import java.util.LinkedList;
import java.util.Queue;

// Function used to construct the tree
public class PostOrderTraversal {

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

    // function used to perform the Post-order traversal
    public void postOrder(Node root) {

        if (root == null)
            return;

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    public static void main(String[] args) {

        PostOrderTraversal postOrderTraversal = new PostOrderTraversal();

        postOrderTraversal.insertNode(1);
        postOrderTraversal.insertNode(2);
        postOrderTraversal.insertNode(3);
        postOrderTraversal.insertNode(4);
        postOrderTraversal.insertNode(5);
        postOrderTraversal.insertNode(6);
        postOrderTraversal.insertNode(7);

        System.out.println();
        System.out.println("Post Order Traversal of Nodes is as follow:");
        postOrderTraversal.postOrder(postOrderTraversal.root);
    }
}