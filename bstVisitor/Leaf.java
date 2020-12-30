public class Leaf implements BinarySearchTree {
    public Leaf() {
    }

    public boolean accept(BSTVisitorB visitor) {
        return visitor.caseLeaf();
    }

    public BinarySearchTree accept(BSTVisitorBST visitor) {
        return visitor.caseLeaf();
    }
}