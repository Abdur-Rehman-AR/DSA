public class IsBalanceTree {

    public static int isBalance(Node root) {

        // If tree is empty, it means it is balanced.
        if (root == null)
            return 0;

        int leftHeight = 0;
        int rightHeight = 0;

        leftHeight = 1 + isBalance(root.left);
        rightHeight = 1 + isBalance(root.right);

        if (Math.abs(leftHeight - rightHeight) > 1) {
            return leftHeight - rightHeight;
        }
        return 0;
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