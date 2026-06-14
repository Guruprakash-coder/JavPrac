package ques;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

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
    int countpaths(TreeNode node ,int sum){
        List<Integer> path=new LinkedList<>();
        return countpaths(node,sum,path);
    }
    int countpaths(TreeNode node,int sum,List<Integer> path){
        if(node ==null){
            return 0;
        }
        path.add(node.val);
        int count=0;
        int s=0;
        ListIterator<Integer> itr=path.listIterator(path.size());
        while(itr.hasPrevious()){
            s+=itr.previous();
            if(s==sum){
                count++;
            }
        }

        count+=countpaths(node.left,sum,path)+countpaths(node.right,sum,path);
        path.remove(path.size()-1);
        return count;
    }
    List<List<Integer>> findpaths(TreeNode node ,int sum){
        List<List<Integer>> paths=new ArrayList<>();
        List<Integer> path=new ArrayList<>();
        findpaths(node,sum,path,paths);
        return paths;
    }
    void findpaths(TreeNode node,int sum,List<Integer>path,List<List<Integer>> paths){
        if(node ==null){
            return ;
        }
        path.add(node.val);
        if(node.val==sum && node.left==null & node.right==null){
            paths.add(new ArrayList<>(path));
        }else{
            findpaths(node.left,sum-node.val,path,paths);
            findpaths(node.right,sum-node.val,path,paths)
        }


        path.remove(path.size()-1);

    }

}
