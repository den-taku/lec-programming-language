public interface BSTVisitorBST {
    BinarySearchTree caseLeaf();
    BinarySearchTree caseBranch(BinarySearchTree left, int v, BinarySearchTree right);
}