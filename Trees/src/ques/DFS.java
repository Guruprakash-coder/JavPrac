package ques;

import implement.BST;

import java.util.Arrays;
import java.util.Stack;

public class DFS {
        void dfsStack(TreeNode node){
            if(node==null){
                return ;
            }
            Stack<TreeNode> s=new Stack<>();
            s.push(node);
            while(!s.isEmpty()){
                TreeNode curr=s.pop();
                System.out.println(curr.val);
                if(curr.right!=null){
                    s.push(curr.right);
                }
                if(curr.left!=null){
                    s.push(curr.left);

                }

            }

        }

      public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;

          TreeNode() {
          }

          TreeNode(int val) {
              this.val = val;
          }

          TreeNode(int val, TreeNode left, TreeNode right) {
              this.val = val;
              this.left = left;
              this.right = right;
          }
      }

      int diameter;
      public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return diameter-1;
      }
      int height(TreeNode node){
          if(node==null){
              return 0;
          }

          int lefth=height(node.left);
          int righth=height(node.right);
          int dia=lefth+righth+1;
          diameter=Math.max(dia,diameter);
          return Math.max(lefth,righth)+1;
      }
//    public void flatten(TreeNode root) {
//        if(root==null){
//            return;
//        }
//        Queue<TreeNode> q=new LinkedList<>();
//        getQueue(root,q);
//        TreeNode prev=q.poll();
//        while(!q.isEmpty()){
//            TreeNode curr=q.poll();
//            prev.left=null;
//            curr.left=null;
//            prev.right=curr;
//            prev=curr;
//        }
//
//    }
//    private void getQueue(TreeNode node,Queue<TreeNode > q){{
//        if(node==null) return;
//
//        q.offer(node);
//        getQueue(node.left,q);
//        getQueue(node.right,q);
//    }
//
//    }
    public TreeNode invertTree(TreeNode root) {
        if(root==null){
            return null;
        }
        TreeNode left=invertTree(root.left);
        TreeNode right=invertTree(root.right);
        root.left=right;
        root.right=left;

        return root;

    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null){
            return null;
        }
        if(root==p || root==q){
            return root;
        }
        TreeNode left=lowestCommonAncestor(root.left,p,q);
        TreeNode right=lowestCommonAncestor(root.right,p,q);
        if(left!=null && right!=null){
            return root;
        }
        return left==null?right:left;
    }
    int count=0;
    public int kthSmallest(TreeNode root, int k) {
        TreeNode node=helper(root,k);
        return node.val;

    }
    private TreeNode helper(TreeNode node,int k){
        if(node==null){
            return null;
        }
        TreeNode left=helper(node.left,k);
        if(left!=null){
            return left;
        }
        count++;
        if(count == k){
            return node;
        }

        return helper(node.right,k);
    }
    //very very important int question
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length==0){
            return null;
        }
        int r=preorder[0];
        int index=0;

        for(int i=0;i<inorder.length;i++){
            if(inorder[i]==r){
                index=i;
                break;
            }
        }
        TreeNode node=new TreeNode(r);
        node.left=buildTree(Arrays.copyOfRange(preorder,1,index+1),Arrays.copyOfRange(inorder,0,index));
        node.right=buildTree(Arrays.copyOfRange(preorder,index+1,preorder.length),Arrays.copyOfRange(inorder,index+1,inorder.length));
        return node;
    }
}
