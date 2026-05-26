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
    public int height(Node node){
        if(node==null){
            return -1;
        }
        return node.height;
    }
    public boolean isEmpty(){
        return root==null;
    }
    public void display(){
        display(root,"Root Node:");
    }
    private void display(Node node,String details){
        if(node==null){
            return;
        }
        System.out.println(details+node.getValue());

        display(node.left,"Left child of"+node.getValue()+" : ");
        display(node.right,"right child of"+node.getValue()+" : ");

    }
}
