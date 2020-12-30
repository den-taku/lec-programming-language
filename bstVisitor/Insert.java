public class Insert implements BSTVisitorBST {
    private int n;

    public Insert(int n) {
        this.n = n;
    }

    public BinarySearchTree caseLeaf() {
        return new Branch(new Leaf(), n, new Leaf());
    }

    public BinarySearchTree caseBranch(BinarySearchTree left, int v, BinarySearchTree right) {
        if (n == v) {
            return new Branch(left, v, right);
        } else if (n < v) {
            return new Branch(left.accept(this), v, right);
        } else /* n > v */ {
            return new Branch(left, v, right.accept(this));
        }
    }
}