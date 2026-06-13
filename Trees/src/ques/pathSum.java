package ques;

public class pathSum {
    private static class TreeNode {
        private int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int value){
            this.val=value;
        }
    }
    private TreeNode root;

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null){
            return false;
        }
        if(root.left==null && root.right==null){
            return root.val==targetSum;
        }

        return hasPathSum(root.left,targetSum-root.val) || hasPathSum(root.right,targetSum- root.val);

    }
    boolean findPath(TreeNode node,int[] arr){
        if(root==null){
            return arr.length==0;
        }
        return findPath(node, arr,0);
    }
    private boolean findPath(TreeNode node,int[] arr,int i){
        if(node==null){
            return false;
        }

        if(i>=arr.length || node.val!=arr[i]){
            return false;
        }
        if(node.left==null && node.right==null && i==arr.length-1){
            return true;
        }

        return findPath(node.left,arr,i+1) || findPath(node.left,arr,i+1);
    }

}
