package ques;

import java.util.*;

public class BST {
    StringBuilder sb=new StringBuilder("123");

    public BST(){

    }
    private static class TreeNode {
        private int value;
        TreeNode left;
        TreeNode right;
        public TreeNode(int value){
            this.value=value;
        }
    }
    private TreeNode root;

    public void populate(Scanner scanner){
        System.out.println("Enter the root Node:");
        int value=scanner.nextInt();
        root=new TreeNode(value);
        populate(scanner,root);
    }

    private void populate(Scanner scanner, TreeNode node) {
        System.out.println("Do you want to enter left of"+node.value);
        boolean left=scanner.nextBoolean();
        if(left){
            System.out.println("Enter the value of the left of"+node.value);
            int value=scanner.nextInt();
            node.left=new TreeNode(value);
            populate(scanner,node.left);
        }
        System.out.println("Do you want to enter right of"+node.value);
        boolean right=scanner.nextBoolean();
        if(right){
            System.out.println("Enter the value of the right of"+node.value);
            int value=scanner.nextInt();
            node.right=new TreeNode(value);
            populate(scanner,node.right);
        }
    }
    public void display(){
        display(root,"");
    }
    private void display(TreeNode node,String indent){
        if(node==null){
            return;
        }
        System.out.println(indent+node.value);
        display(node.left,indent+"\t");
        display(node.right,indent+"\t");
    }
    public void prettyDisplay(){
        prettyDisplay(root,0);
    }

    private void prettyDisplay(TreeNode node, int level) {
        if(node==null){
            return;
        }
        prettyDisplay(node.right,level+1);
        if(level!=0){
            for(int i=0;i<level-1;i++){
                System.out.print("|\t\t");
            }
            System.out.println("|------>"+node.value );
        }else{
            System.out.println(node.value);
        }
        prettyDisplay(node.left,level+1);

    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result=new ArrayList<>();
        if(root==null){
            return result;
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int levelSize=q.size();
            List<Integer> cl=new ArrayList<>();
            for(int i=0;i<levelSize;i++){
                TreeNode curr= q.poll();
                cl.add(curr.value);
                if(curr.left!=null){
                    q.offer(curr.left);
                }
                if(curr.right!=null){
                    q.offer(curr.right);
                }
            }
            result.add(cl);

        }
        return result;

    }
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result=new ArrayList<>();
        if(root==null){
            return result;
        }
        Queue<TreeNode> q=new LinkedList<>();
        boolean rev=false;
        q.offer(root);
        while(!q.isEmpty()){
            int LevelSize=q.size();
            LinkedList<Integer> cl=new LinkedList<>();
            for(int i=0;i<LevelSize;i++){
                TreeNode curr=q.poll();
                if(curr.left!=null){
                    q.offer(curr.left);
                }
                if(curr.right!=null){
                    q.offer(curr.right);
                }
                if(rev){
                    cl.add(0,curr.value);
                }else{
                    cl.add(curr.value);
                }

            }
            result.add(cl);
            rev=!rev;
        }
        return result;

    }
    /*
    public Node connect(Node root) {
        if(root==null){
            return root;
        }
        Node leftMost=root;
        while(leftMost.left!=null){
            Node curr=leftMost;
            while(curr!=null){
                curr.left.next=curr.right;
                if(curr.next!=null){
                    curr.right.next=curr.next.left;
                }
                curr=curr.next;
            }
            leftMost=leftMost.left;
        }
        return root;
    }*/
    public TreeNode findSuccessor(TreeNode root,int key){
        if(root==null){
            return root;
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
             TreeNode curr=q.poll();
             if(curr.left!=null){
                 q.offer(curr.left);
             }
             if(curr.right!=null){
                 q.offer(curr.right);
             }
             if(curr.value==key){
                 return q.peek();
             }

        }
        return null;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        BST tree=new BST();
        tree.populate(sc);
        tree.prettyDisplay();
    }
}
