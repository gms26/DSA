// Last updated: 5/25/2026, 11:04:08 AM
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
    public long kthLargestLevelSum(TreeNode root, int k) {
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        PriorityQueue<Long>pq=new PriorityQueue<>();
        while(!q.isEmpty()){
            int len=q.size();
            long c=0;
            for(int i=0;i<len;i++){
                TreeNode cur =q.poll();
                c+=cur.val;
                if(cur.left!=null)q.add(cur.left);
                if(cur.right!=null)q.add(cur.right);
            }
            pq.add(c);
            if(pq.size()>k)pq.poll();
        }
        if(pq.size()<k)return -1;
        return pq.peek();
    }
}