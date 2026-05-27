package implement;

public class Main {
    public static void main(String[] args) {
        BST tree=new BST();

        int[] arr= new int[]{10, 20, 30, 70, 40, 53, 78, 92, 42, 40};
        tree.populate(arr);
        tree.display();
    }
}
