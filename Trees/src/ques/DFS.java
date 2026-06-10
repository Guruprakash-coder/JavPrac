package ques;

public class DFS {


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

}
