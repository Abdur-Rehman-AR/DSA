public class IsBalanceTree {

    public static int isBalance(Node root) {

        // Empty tree has height 0
        if (root == null)
            return 0;

        // Find height of left subtree
        int leftHeight = isBalance(root.left);

        // If left subtree is not balanced
        if (leftHeight == -1)
            return -1;

        // Find height of right subtree
        int rightHeight = isBalance(root.right);

        // If right subtree is not balanced
        if (rightHeight == -1)
            return -1;

        // If height difference is greater than 1
        if (Math.abs(leftHeight - rightHeight) > 1)
            return -1;

        // Return height of current subtree
        return 1 + Math.max(leftHeight, rightHeight);
    }

    public static void main(String[] args) {

        // Creating the tree with 6 nodes
        Tree tree = new Tree(1, 2, 3, 4, 5, 6);

        // Calling the method to check either the tree is balance or not
        int height = isBalance(tree.root);

        // Printing the final result
        System.out.println();
        if (height <= 1)
            System.out.println("Tree is Balance.");
        else
            System.err.println("Tree is not Balance.");
    }
}