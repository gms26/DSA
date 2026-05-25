// Last updated: 5/25/2026, 11:12:03 AM
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
    
    public boolean hasPathSum(TreeNode root, int t) {
        if(root==null)return false;
        if(root.left==null && root.right==null){
            return root.val==t;
        }
        int n=t-root.val;
        return hasPathSum(root.left,n)|| hasPathSum(root.right,n);

    }
}