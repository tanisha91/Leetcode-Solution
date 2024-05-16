/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean evaluateTree(TreeNode root) {
        boolean ans=solve(root);
        return ans;
    }
    boolean solve(TreeNode root){
        if(root==null) return false;
        
      boolean leftres=  solve(root.left);  
        boolean rightres=solve(root.right);
        if(root.val==2){
            return leftres|| rightres;
        }
        if(root.val==3){
            return leftres && rightres;
        }
        return (root.val==0) ? false:true;
    }
}