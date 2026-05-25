// Last updated: 5/25/2026, 11:11:38 AM
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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> a= new ArrayList<>();
        preorder(root,a);
        return a;
    }
    private void preorder(TreeNode node,List<Integer> a){
        if(node==null)return;
        a.add(node.val);
        preorder(node.left,a);
        preorder(node.right,a);
    }
}