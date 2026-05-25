// Last updated: 5/25/2026, 11:12:16 AM
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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> a=new ArrayList<>();
        
        if(root==null)return a;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int l=q.size();
            int []t=new int[l];
            List<Integer> m=new ArrayList<>();
            for(int i=0;i<l;i++){
                TreeNode curr=q.poll();
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
                t[i]=curr.val;
               
            }
            for(int z:t){
                m.add(z);
            }
            
            a.add(m);
        }
        return a;
    }
}