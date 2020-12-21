public class Branch implements BinarySearchTree {
    // instance variables to hold a number and subtrees
    private BinarySearchTree left;
    private int v;
    private BinarySearchTree right;

    public boolean find(int n) {
        if (n == v) { return true; }
        else if (n < v) { return left.find(n); }
        else /* n > v */ { return right.find(n); }
    }

    // Constructor
    public Branch(BinarySearchTree left, int v, BinarySearchTree right) {
        this.left = left;
        this.v = v;
        this.right = right;
    }
}