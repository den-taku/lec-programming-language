public interface Tree<Elm> {
    int size();
    int depth();
    Tree<Elm> reflect();
    Tree<Elm> add(Elm e);
    String toString();
}