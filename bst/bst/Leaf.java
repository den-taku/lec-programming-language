package bst;

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

    public BinarySearchTree delete(int n) {
        // n is not in the BST, so return the same tree
        return this; // could be return new Leaf(); instead
    }

    public int min() {
        // there is no minimum number in the BST
        assert false;
        return Integer.MIN_VALUE;
    }

    public boolean isLeaf() {
        // return (this instanceof Leaf);
        return true;
    }

    public boolean isBranch() {
        // return this instanceof Branch; // this statement needs appropriate import
        return false;
    }

    // Constructor
    public Leaf() {
        // nothing to initialize
    }
}