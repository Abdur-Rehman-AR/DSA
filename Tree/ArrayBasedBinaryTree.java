import java.util.Arrays;

public class ArrayBasedBinaryTree {

    // Array stores the complete tree
    int[] tree;

    // Initializing size of array
    public ArrayBasedBinaryTree(int size) {
        tree = new int[size];

        // Put -1 in every position of the array.
        Arrays.fill(tree, -1);
    }

    // Insert root
    public void insertRoot(int data) {
        tree[0] = data;
    }

    // Insert left child
    public void insertLeft(int parentIndex, int data) {
        int index = 2 * parentIndex + 1;

        if (index < tree.length) {
            tree[index] = data;
        }
    }

    // Insert right child
    public void insertRight(int parentIndex, int data) {
        int index = 2 * parentIndex + 2;

        if (index < tree.length) {
            tree[index] = data;
        }
    }

    // this method is working as bfs which processes nodes level by level
    public void bfs() {

        for (int i = 0; i < tree.length; i++) {

            if (tree[i] != -1) {
                System.out.print(tree[i] + " ");
            }
        }
    }

    public static void main(String[] args) {

        ArrayBasedBinaryTree tree = new ArrayBasedBinaryTree(7);

        tree.insertRoot(1);

        tree.insertLeft(0, 2);
        tree.insertRight(0, 3);

        tree.insertLeft(1, 4);
        tree.insertRight(1, 5);

        tree.insertLeft(2, 6);
        tree.insertRight(2, 7);

        // Printing the tree
        System.out.print("Nodes of Tree: ");
        tree.bfs();
    }
}