public interface BinarySearchTree<Elm> { // Elm is a 'type' parameter!
    boolean find(Elm n);
    BinarySearchTree<Elm> insert(Elm n);
    Elm min();
    BinarySearchTree<Elm> delete(Elm n);
}