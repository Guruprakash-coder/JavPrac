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

}
