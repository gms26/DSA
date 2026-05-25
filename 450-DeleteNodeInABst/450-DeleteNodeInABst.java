// Last updated: 5/25/2026, 11:09:29 AM
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
    public  TreeNode findMin(TreeNode node) {
        while (node.left != null) node = node.left;
        return node;
    }
    public TreeNode deleteNode(TreeNode root, int key) {
        TreeNode parent = null;
        TreeNode current = root;

        while (current != null && current.val != key) {
            parent = current;
            if (key < current.val)
                current = current.left;
            else
                current = current.right;
        }

        if (current == null) return root;

        if (current.left == null && current.right == null) {
            if (current != root) {
                if (parent.left == current) parent.left = null;
                else parent.right = null;
            } else {
                root = null;
            } current = null;
        }

        else if (current.left != null && current.right != null) {
            TreeNode successor = findMin(current.right);
            int val = successor.val;
            root = deleteNode(root, successor.val);
            current.val = val;
        }

        else {
            TreeNode child = (current.left != null) ? current.left : current.right;

            if (current != root) {
                if (current == parent.left) parent.left = child;
                else parent.right = child;
            } else {
                root = child;
            }
            current = null;
        }

        return root;
    }
}