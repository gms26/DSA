// Last updated: 5/25/2026, 11:11:56 AM
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
    public int max_down_path(TreeNode root,int[] a){
        if(root==null)return 0;
        int l=max_down_path(root.left,a);
        if(l<0)l=0;
        int r=max_down_path(root.right,a);
        if(r<0)r=0;
        int x=root.val+l+r;
        a[0]=Math.max(a[0],x);
        return root.val+Math.max(l,r);
    }
    public int maxPathSum(TreeNode root) {
        if(root==null)return 0;
        int a[]=new int[1];
        a[0]=Integer.MIN_VALUE;
        max_down_path(root,a);
        return a[0];
    }
}