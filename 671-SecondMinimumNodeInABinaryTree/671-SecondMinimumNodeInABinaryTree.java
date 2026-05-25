// Last updated: 5/25/2026, 11:08:39 AM
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
    public int findSecondMinimumValue(TreeNode root) {
        if(root==null)return -1;
        int left=root.left!=null?root.left.val:-1;
        int right=root.right!=null?root.right.val:-1;
        if(root.left==null && root.right==null)return -1;
       if(left==root.val)left=findSecondMinimumValue(root.left);
       if(right==root.val)right=findSecondMinimumValue(root.right);
       if(left!=-1&&right!=-1)return Math.min(left,right);
       return left!=-1?left:right;
    }
}