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

    // Get left child index
    public int leftChild(int index) {
        return 2 * index + 1;
    }

    // Get right child index
    public int rightChild(int index) {
        return 2 * index + 2;
    }

    // Insert left child
    public void insertLeft(int parentIndex, int data) {
        int index = leftChild(parentIndex);

        if (index < tree.length) {
            tree[index] = data;
        }
    }

    // Insert right child
    public void insertRight(int parentIndex, int data) {
        int index = rightChild(parentIndex);

        if (index < tree.length) {
            tree[index] = data;
        }
    }

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

        System.out.println("Array: " + Arrays.toString(tree.tree));

        System.out.print("Nodes of Tree: ");
        tree.bfs();
    }
}