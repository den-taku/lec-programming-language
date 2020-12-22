public class Leaf<Elm> implements Tree<Elm> {
    // no instance variables

    public int size() { return 0; }
    
    public int depth() { return 0; }

    public Tree<Elm> reflect() { return new Leaf<Elm>(); }

    public Tree<Elm> add(Elm e) {
        return new Branch<Elm>(new Leaf<Elm>(), e, new Leaf<Elm>());
    }

    public String toString() {
        return "leaf";
    }

    /**
     * Constructor for objects of class Leaf
     */
    public Leaf() {
        // nothing to initialize
    }
}