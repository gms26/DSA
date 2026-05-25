// Last updated: 5/25/2026, 11:12:19 AM
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
    boolean t=true;
    public boolean isSameTree(TreeNode p, TreeNode q) {
        same(p,q);
        return t;
    }
    void same(TreeNode p,TreeNode q){
        if(p==null && q==null){
            
            return;
        }
        if(p==null || q==null){
            t=false;
            return;
        }
        else if(p.val!=q.val){
            t=false;
            return;
        }
        same(p.left,q.left);
        same(p.right,q.right);
    }

}