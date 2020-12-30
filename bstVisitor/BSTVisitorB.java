public interface BSTVisitorB {
    boolean caseLeaf();
    boolean caseBranch(BinarySearchTree left, int v, BinarySearchTree right);
}