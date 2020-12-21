public interface BinarySearchTree {
    boolean find(int n);
    BinarySearchTree insert(int n);
    BinarySearchTree delete(int n);
    int min();
    boolean isLeaf();
    boolean isBranch();
}