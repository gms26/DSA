// Last updated: 5/25/2026, 11:07:16 AM
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
    public int maxLevelSum(TreeNode root) {
         Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        
        int d=Integer.MIN_VALUE,c=0,j=0;
        while(!q.isEmpty()){
           int a =q.size();
           int s=0;j++;
           for(int i=0;i<a;i++){
            TreeNode t=q.poll();
            s+=t.val;
            if(t.left!=null)q.add(t.left);
            if(t.right!=null)q.add(t.right);
           }
           if(d<s){
            d=s;
            c=j;
           }
        }
        return c;
    }
}