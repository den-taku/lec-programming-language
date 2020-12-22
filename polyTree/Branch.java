public class Branch<Elm> implements Tree<Elm> {
    // instance variables to hold an element of type Elm and subtreess
    private Tree<Elm> left;
    private Elm v; // standing for a value
    private Tree<Elm> right;

    public int size() {
        return left.size() + right.size() + 1;
    }

    public int depth() {
        return Math.max(left.depth(), right.depth()) + 1;
    }

    public Tree<Elm> reflect() {
        return new Branch<Elm>(right.reflect(), v, left.reflect());
    }

    public Tree<Elm> add(Elm e) {
        return new Branch<Elm>(left.add(e), v, right);
    }

    public String toString() {
        return "branch(" + left + ", " + v + ", " + right + ")";
    }
    /**
     * Constructor for objects of class Branch
     */
    public Branch(Tree<Elm> left, Elm v, Tree<Elm> right) {
        this.left = left;
        this.v = v;
        this.right = right;
    }
}