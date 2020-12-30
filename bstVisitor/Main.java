public class Main {
    public static void main(String[] args) {
        BinarySearchTree t1 = new Branch(new Leaf(), 10, new Leaf());
        BinarySearchTree t2 = new Branch(new Leaf(), 25, new Leaf());
        BinarySearchTree t3 = new Branch(t1, 15, t2);
        BinarySearchTree t4 = new Branch(new Leaf(), 60, new Leaf());
        BinarySearchTree t5 = new Branch(new Leaf(), 48, t4);
        BinarySearchTree t6 = new Branch(t3, 30, t5);
        boolean test1 = t6.accept(new Find(30));  // should be true
        System.out.println("ture -->" + test1);
        boolean test2 = t6.accept(new Find(13));  // should be false
        System.out.println("false --> "+ test2);
    }
}