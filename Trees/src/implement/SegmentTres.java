package implement;

public class SegmentTres {
    public static void main(String[] args) {
        int[] arr={3,8,6,7,-2,-8,4,9};
        SegmentTres tree=new SegmentTres(arr);
        //tree.display();//
        System.out.println(tree.query(1,6));

    }
    private static class Node{
        int data;
        int startinterval;
        int endinterval;
        Node left;
        Node right;
        public Node(int startinterval,int endinterval){
            this.startinterval=startinterval;
            this.endinterval=endinterval;
        }
    }

    Node root;
    public SegmentTres(int[] arr){
        //Create a tree using this array
        this.root=constructTree(arr,0,arr.length-1);
    }

    private Node constructTree(int[] arr,int s,int e){
        if(s==e){
            //leaf Node
            Node leaf=new Node(s,e);
            leaf.data=arr[s];
            return leaf;
        }
        Node node=new Node(s,e);
        int mid=(s+e)/2;
        node.left=constructTree(arr,s,mid);
        node.right=constructTree(arr,mid+1,e);

        node.data=node.left.data+node.right.data;
        return node;
    }
    public void display(){
        display(this.root);
    }
    private void display(Node node){
        String str="";
        if(node.left!=null){
            str=str+"Interval=["+node.left.startinterval+"-"+node.left.endinterval+"] and data :"+node.left.data + "=>";
        }else{
            str=str+"No left child";
        }

        str=str+"Interval=["+node.startinterval+"-"+node.endinterval+"] and data :"+node.data + "=>";
        if(node.right!=null){
            str=str+"Interval=["+node.right.startinterval+"-"+node.right.endinterval+"] and data :"+node.right.data + "=>";
        }else{
            str=str+"No right child";
        }
        System.out.println(str);
        // rec call
        if(node.left!=null){
            display(node.left);
        }
        if(node.right!=null){
            display(node.right);
        }
    }

    public int query(int si,int ei){
        return this.query(this.root,si,ei);
    }
    private int query(Node node ,int si ,int ei){
        if(node.startinterval>=si && node.endinterval<=ei){
            return node.data;
        }else if(node.startinterval>ei || node.endinterval<si){
            return 0;
        }else{
            return this.query(node.left,si,ei)+this.query(node.right,si,ei);
        }
    }
    public void update(int index,int value){
        this.root.data=update(this.root,index,value);
    }
    private int update(Node node,int index,int value){
        if(index>=node.startinterval && index<=node.endinterval){
            if(index== node.startinterval && index==node.endinterval){
                node.data=value;
            }else{
                int leftans=update(node.left,index,value);
                int rightans=update(node.right,index,value);
                node.data=leftans+rightans;
                return node.data;
            }
        }
        return node.data;
    }


}
