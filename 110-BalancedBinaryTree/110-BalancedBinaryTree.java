// Last updated: 5/25/2026, 11:12:06 AM
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
    public boolean isBalanced(TreeNode root) {
     return height(root)!=-1;
     
    }
    static int height(TreeNode r){
        if(r==null)return 0;
        int l=height(r.left);
        if(l==-1)return -1;
        int s=height(r.right);
        if(s==-1)return -1;
        if(Math.abs(l-s)>1)return -1;
        return Math.max(l,s)+1;
    }
}