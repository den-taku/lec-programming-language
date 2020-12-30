package bst;

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

    public BinarySearchTree delete(int n) {
        if (n == v) {
            if (left.isLeaf()) {
                if (right.isLeaf()) {
                    return new Leaf();
                } else {
                    return right;
                }
            } else {
                if (right.isLeaf()) {
                    return left;
                } else {
                    int m = right.min();
                    BinarySearchTree newRight = right.delete(m);
                    return new Branch(left, m, newRight);
                }
            }
        } else if (n < v) {
            BinarySearchTree newLeft = left.delete(n);
            return new Branch(newLeft, v, right);
        } else /* n > v */ {
            BinarySearchTree newRight = right.delete(n);
            return new Branch(left, v, newRight);
        }
    }

    public int min() {
        if (left.isLeaf()) {
            return v;
        } else {
            return left.min();
        }
    }

    public boolean isLeaf() {
        return false;
    }

    public boolean isBranch() {
        // return (this instanceof Branch);
        return true;
    }

    // Constructor
    public Branch(BinarySearchTree left, int v, BinarySearchTree right) {
        this.left = left;
        this.v = v;
        this.right = right;
    }
}