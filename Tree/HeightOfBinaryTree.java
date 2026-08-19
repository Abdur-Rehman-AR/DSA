import java.util.LinkedList;
import java.util.Queue;

public class HeightOfBinaryTree {

    private static int treeHeight(Node root) {
        // height stores the number of levels in the tree
        int height = 0;

        // If tree has no nodes inside it return 0
        if (root == null) {
            return 0;
        } else {
            // Creating a queue that will store each node and will process it
            Queue<Node> queue = new LinkedList<>();

            // Staring the queue by adding root node
            queue.add(root);

            // while loop will run now until all the nodes get processed
            while (!queue.isEmpty()) {

                // It will store the number of nodes at each level
                int sizeOfLevel = queue.size();

                // Loop that will go through each node of the current level
                for (int i = 0; i < sizeOfLevel; i++) {

                    // Take out the head node present in the queue
                    Node node = queue.poll();

                    // Add the children of the current node to the queue
                    if (node.left != null) {
                        queue.add(node.left);
                    }

                    if (node.right != null) {
                        queue.add(node.right);
                    }
                }
                // Increasing the height after processing every level
                height++;
            }
            return height;
        }
    }

    public static void main(String[] args) {

        // Creating the tree
        Tree tree = new Tree(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Calling a method to find height of the tree
        int height = treeHeight(tree.root);

        // Printing the height of tree
        System.out.println();
        System.out.println("Height of the tree is : " + height);
    }
}