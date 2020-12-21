public class Branch implements BinarySearchTree {
    // instance variables to hold a number and subtrees
    private BinarySearchTree left;
    private int v;
    private BinarySearchTree right;

    // Constructor
    public Branch(BinarySearchTree left, int v, BinarySearchTree right) {
        this.left = left;
        this.v = v;
        this.right = right;
    }
}