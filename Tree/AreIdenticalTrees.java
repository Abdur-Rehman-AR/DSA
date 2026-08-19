public class AreIdenticalTrees {

    private static boolean isIdentical(Node root1, Node root2) {

        // If both trees are now empty, it means both trees are identical so return true
        if (root1 == null && root2 == null)
            return true;

        // If on the same position data is different return false
        if (root1 == null || root2 == null || root1.data != root2.data)
            return false;

        // Recursively check left and right subtree of the current node
        return isIdentical(root1.left, root2.left) && isIdentical(root1.right, root2.right);
    }

    public static void main(String[] args) {

        // Creating 2 trees to compare
        Tree tree1 = new Tree(1, 2, 3, 4, 5);
        Tree tree2 = new Tree(1, 2, 4, 3, 5);

        // Method that will compare both trees
        boolean result = isIdentical(tree1.root, tree2.root);

        // Printing the result of tree comparison
        if (result)
            System.out.println("Trees are identical.");
        else
            System.out.println("Trees are not identical.");
    }
}