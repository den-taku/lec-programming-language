public class Leaf implements BinarySearchTree {
    public Leaf() {
    }

    public boolean accept(Find visitor) {
        return visitor.caseLeaf();
    }
}