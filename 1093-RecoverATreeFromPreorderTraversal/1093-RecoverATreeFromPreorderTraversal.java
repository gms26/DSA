// Last updated: 5/25/2026, 11:07:18 AM
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
    public TreeNode recoverFromPreorder(String t) {
        Stack<TreeNode>st=new Stack<>();
        int i=0;
        while(i<t.length()){
            int depth=0;
            while(i<t.length()&&t.charAt(i)=='-'){
                depth++;
                i++;
            }
            int val=0;
            while(i<t.length()&&Character.isDigit(t.charAt(i))){
                val=val*10+t.charAt(i)-'0';
                i++;
            }
            TreeNode node=new TreeNode(val);
            while(st.size()>depth)st.pop();
            if(!st.isEmpty()){
                TreeNode child=st.peek();
            
            if(child.left==null){
                child.left=node;
            }
            else{
                child.right=node;
            }}
            st.push(node);
        }
        return st.firstElement();
    }
}