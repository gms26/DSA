// Last updated: 5/25/2026, 11:12:12 AM
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
    HashMap<Integer,Integer> map;
    int pi;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        map=new HashMap<>();
        for(int i=0;i<inorder.length;i++){map.put(inorder[i],i);}
            pi=0;
            return dfs(preorder,0,inorder.length-1);
        

    }
    public TreeNode dfs(int[] preorder,int si,int li){
        if(si<=li){
            int ele=preorder[pi];
            pi++;
            int mid=map.get(ele);
            TreeNode root=new TreeNode(ele);
            root.left=dfs(preorder,si,mid-1);
            root.right=dfs(preorder,mid+1,li);
            return root;
        }
        return null;
    }

}