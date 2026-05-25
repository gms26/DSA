// Last updated: 5/25/2026, 11:08:48 AM
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
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        
        List<Double>d=new ArrayList<>();
        while(!q.isEmpty()){
           int a =q.size();
           long s=0;
           for(int i=0;i<a;i++){
            TreeNode t=q.poll();
            s+=t.val;
            if(t.left!=null)q.add(t.left);
            if(t.right!=null)q.add(t.right);
           }
           d.add((double)s/a);
        }
        return d;
    }
}