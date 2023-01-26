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
    public List<Integer> preorderTraversal(TreeNode root) {
        
        bst(root);
        return ans;
    }   
     private List<Integer> ans=new ArrayList<>();
    private void bst(TreeNode node){
    if(node==null){
        return;
    }
    ans.add(node.val);
    bst(node.left);
    bst(node.right);
}
}