// Last updated: 5/25/2026, 11:12:13 AM
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
    public int maxDepth(TreeNode root) {
        if(root==null) {
			return 0;
		}
		int sizel=maxDepth(root.left);
		int sizer=maxDepth(root.right);
		return 1+Math.max(sizel,sizer);

    }
}