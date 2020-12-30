public class Find {
    private int n;

    public Find(int n) {
        this.n = n;
    }

    public boolean caseLeaf() {
        return false;
    }

    public boolean caseBranch(BinarySearchTree left, int v, BinarySearchTree right) {
        if (n == v) {
            return true;
        } else if (n < v) {
            return left.accept(this);
        } else /* n > v */{
            return right.accept(this);
        }
    }
}