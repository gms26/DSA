// Last updated: 5/25/2026, 11:10:48 AM
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int min=Math.min(p.val,q.val);
        int max=Math.max(p.val,q.val);
       if(root==null)return null;
       while(root!=null){
       if(root.val>=min && root.val<=max){
        return root;
       }
       else if(root.val<min)root=root.right;
       else root=root.left;}
       return null;
    }
}