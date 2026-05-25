// Last updated: 5/25/2026, 11:07:39 AM
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
    int s=0;
    public int rangeSumBST(TreeNode root, int low, int high) {
    return bfs(root,low,high);

    }
    public int bfs(TreeNode r,int l,int h){
        if(r==null)return 0;
       
        if(r.val<l){
        return bfs(r.right,l,h);
        }
        if(r.val>h){
        return bfs(r.left,l,h);
        }
        return r.val+bfs(r.left,l,h)+bfs(r.right,l,h);
    }
}