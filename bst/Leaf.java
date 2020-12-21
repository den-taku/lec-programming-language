public class Leaf implements BinarySearchTree {
    // no instance variables

    public boolean find(int n) {
        // n doesn't exist in this BST
        return false;
    }

    public BinarySearchTree insert(int n) {
        // a new singleton tree holding n
        return new Branch(new Leaf(), n, new Leaf());
    }

    // Constructor
    public Leaf() {
        // nothing to initialize
    }
}