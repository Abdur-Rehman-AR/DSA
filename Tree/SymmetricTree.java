public class SymmetricTree {

    private static boolean isSymmetric(Node left, Node right) {

        // if tree's children are null return true bcz they reached end.
        if (left == null && right == null)
            return true;

        // if corresponding nodes's data is different return false
        if (left == null || right == null || left.data != right.data)
            return false;

        // Recursively call the method to process the children
        return isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left);
    }

    public static void main(String[] args) {

        // Creating a tree
        Tree tree = new Tree(1, 2, 2, 4, 5, 5, 4);

        // Method that will check the tree
        boolean result = isSymmetric(tree.root.left, tree.root.right);

        // Printing the result
        if (result)
            System.out.println("Tree is Symmetric.");
        else
            System.out.println("Tree is not Symmetric.");
    }
}