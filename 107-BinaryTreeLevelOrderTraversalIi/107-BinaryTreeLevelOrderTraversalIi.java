// Last updated: 5/25/2026, 11:12:09 AM
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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> a=new ArrayList<>();
        if(root==null)return a;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int l=q.size();
            List<Integer> m=new ArrayList<>();
            for(int i=0;i<l;i++){
                TreeNode cur=q.poll();
                if(cur.left!=null)q.add(cur.left);
                if(cur.right!=null)q.add(cur.right);
                m.add(cur.val);
            }
            a.add(0,m);
        }
        return a;
    }
}