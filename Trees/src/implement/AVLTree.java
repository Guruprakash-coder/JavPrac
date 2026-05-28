package implement;

public class AVLTree {
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
    public AVLTree(){

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
    public void insert(int value){
        root=insert(value,root);
    }
    private Node insert(int value,Node node){
        if(node==null){
            node=new Node(value);
            return node;
        }
        if(value<node.value){
            node.left=insert(value,node.left);
        }
        if(value>node.value){
            node.right=insert(value, node.right);
        }
        node.height=Math.max(height(node.left),height(node.right))+1;
        return rotate(node);
    }
    private Node rotate(Node node){

        if(height(node.left)>height(node.right)){
            //left heavy
            if(height(node.left.left)-height(node.left.right)>0){
                //left left case
                return rightrotate(node);
            }
            if(height(node.left.left)-height(node.left.right)<0){
                //left right case
                node.left=leftrotate(node.left);
                return rightrotate(node);
            }
        }
        if(height(node.right)>height(node.left)){
            //right heavy
            if(height(node.right.right)-height(node.right.left)>0){
                //right right
                return leftrotate(node)
            }
            if(height(node.right.right)-height(node.right.left)<0){
                //right left
                node.right=rightrotate(node.right);
                return leftrotate(node);
            }
        }

        return node;

    }
    private Node rightrotate(Node p){
        Node c=p.left;
        Node t=c.right;
        c.right=p;
        p.left=t;
        p.height=Math.max(height(p.left),height(p.right))+1;
        c.height=Math.max(height(c.left),height(c.right))+1;
        return c;

    }
    private Node leftrotate(Node p){
        Node c=
    }
    public void populate(int[] nums){
        for(int i=0;i<nums.length;i++){
            insert(nums[i]);
        }
    }
    public void populatedSorted(int[] nums){
        populatedSorted(nums,0,nums.length-1);
    }
    private void populatedSorted(int[] nums,int start,int end){
        if(start>end){
            return;
        }
        int mid=(start+end)/2;
        insert(nums[mid]);
        populatedSorted(nums,start,mid-1);
        populatedSorted(nums,mid+1,end);

    }
    public boolean balanced(){
        return balanced(root);
    }
    private boolean balanced(Node node){
        if(node==null){
            return true;
        }
        return Math.abs(height(node.left)-height(node.right))<=1 && balanced(node.left) && balanced(node.right);
    }
    public void preOrder(){
        preOrder(root);
    }
    private void preOrder(Node node){
        if(node==null){
            return;
        }

        System.out.println(node.value+" ");
        preOrder(node.left);
        preOrder(node.right);
    }
    public void inOrder(){
        inOrder(root);
    }
    private void inOrder(Node node){
        if(node==null){
            return;
        }
        preOrder(node.left);
        System.out.println(node.value+" ");

        preOrder(node.right);
    }
    public void postOrder(){
        postOrder(root);
    }
    private void postOrder(Node node){
        if(node==null){
            return;
        }


        preOrder(node.left);
        preOrder(node.right);
        System.out.println(node.value+" ");
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
