public class BinarySearchTree {
    private BinarySearchTree left;
    private int v;
    private BinarySearchTree right;

    public boolean find(int n) {
        if (n == v) {
            return true;
        } else if (n < v) {
            // Check if the left subtree is a leaf
            // if (left != null) {
            //     return left.find(n);
            // } else {
            //     return false;
            // }
            return (left != null) && (left.find(n));
        } else /* n > v */ {
            // Check  if the right subtree is a leaf
            // if (right != null) {
            //     return right.find(n);
            // } else {
            //     return false;
            // }
            return (right != null) && (right.find(n));
        }
    }

    public BinarySearchTree insert(int n) {
        if (n == v) { return this; }
        else if (n < v) {
            if (left != null) {
            return new BinarySearchTree(left.insert(n), v, right);
            } else {
                return new BinarySearchTree(new BinarySearchTree(null, n, null), v, right);
            }
        } else /* n > v */ {
            if (right != null) {
                return new BinarySearchTree(left, v, right.insert(n));
            } else {
                return new BinarySearchTree(left, v, new BinarySearchTree(null, n, null));
            }
        }
    }

    public int min() {
        if (left != null) {
            return left.min();
        } else {
            return v;
        }
    }

    public BinarySearchTree delete(int n) {
        if (n == v) {
            if (left == null) {
                if (right == null) {
                    return null;
                } else {
                    return right;
                }
            } else {
                if (right == null) {
                    return left;
                } else {
                    int m = right.min();
                    return new BinarySearchTree(left, m, right.delete(m));
                }
            }
        } else if (n < v) {
            if (left != null) {
                return new BinarySearchTree(left.delete(n), v, right);
            } else {
                return this;
            }
        } else /* n > v */ {
            if (right != null) {
                return new BinarySearchTree(left, v, right.delete(n));
            } else {
                return this;
            }
        }
    }

    public BinarySearchTree(BinarySearchTree left, int v, BinarySearchTree right) {
        this.left = left;
        this.v = v;
        this.right = right;
    }
}