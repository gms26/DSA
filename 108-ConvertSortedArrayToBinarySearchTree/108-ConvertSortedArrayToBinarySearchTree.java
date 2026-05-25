// Last updated: 5/25/2026, 11:12:07 AM
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
    public TreeNode sortedArrayToBST(int[] nums) {
        return insert(nums,0,nums.length);
    }
    public TreeNode insert(int[] n,int i,int j){
            if(i>=j)return null;
            int mid=(i+j)/2;
            TreeNode root=new TreeNode(n[mid]);
            root.left=insert(n,i,mid);
            root.right=insert(n,mid+1,j);
            return root;
        
    }
}