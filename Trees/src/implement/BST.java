package implement;

public class BST {
    public class Node{
        private int value;
        private int height;
        Node right;
        Node left;
        public Node(int value){
            this.value=value;
        }
        public int getValue(){
            return value;
        }
    }

    private Node root;
    public BST(){

    }
}
