public class MirrorTree {

    private static boolean isMirror(Node root1, Node root2) {

        // If both reach the end return true.
        if (root1 == null && root2 == null)
            return true;

        // return false if both corresponding nodes have different data
        if (root1 == null || root2 == null || root1.data != root2.data)
            return false;

        // Recursively compare the corresponding cross nodes
        return isMirror(root1.left, root2.right) && isMirror(root1.right, root2.left);
    }

    public static void main(String[] args) {

        // Creating 2 trees to compare
        Tree tree1 = new Tree(1, 2, 3);
        Tree tree2 = new Tree(1, 3, 2);

        // Method that will compare both trees
        boolean result = isMirror(tree1.root, tree2.root);

        // Printing the result of tree comparison
        if (result)
            System.out.println("Trees are Mirror of each other.");
        else
            System.out.println("Trees are not Mirror of each other.");
    }
}