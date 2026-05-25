// Last updated: 5/25/2026, 11:12:04 AM
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
    public int minDepth(TreeNode root) {
         if(root==null) {
			return 0;
		}
		int sizel=minDepth(root.left);
		int sizer=minDepth(root.right);
        if (root.left == null) {
            return 1 + sizer;
        }
        if (root.right == null) {
            return 1 + sizel;
        }
		return 1+Math.min(sizel,sizer);

    }
}