package implement;

public class Main {
    public static void main(String[] args) {
        AVLTree tree=new AVLTree();

        for(int i=0;i<1000;i++){
            tree.insert(i);
        }
        tree.display();
    }
}
