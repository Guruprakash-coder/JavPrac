package implement;

public class Main {
    public static void main(String[] args) {
        AVL tree=new AVL();

        int[] arr= new int[]{10, 20, 30, 40, 50, 60, 78, 92, 112, 440};
        tree.populatedSorted(arr);
        tree.display();
    }
}
