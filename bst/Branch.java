public class Branch implements BinarySearchTree {
    // instance variables to hold a number and subtrees
    private final BinarySearchTree left;
    private final int v;
    private final BinarySearchTree right;

    public boolean find(int n) {
        if (n == v) { return true; }
        else if (n < v) { return left.find(n); }
        else /* n > v */ { return right.find(n); }
    }

    public BinarySearchTree insert(int n) {
        if (n == v) {
            return this;
        } else if (n < v) {
            // BinarySearchTree newLeft = left.insert(n);
            return new Branch(left.insert(n), v, right);
        } else /* n > v */ {
            // BinarySearchTree newRight = right.insert(n);
            return new Branch(left, v, right.insert(n));
        }
    }

    // Constructor
    public Branch(BinarySearchTree left, int v, BinarySearchTree right) {
        this.left = left;
        this.v = v;
        this.right = right;
    }
}