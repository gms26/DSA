// Last updated: 10/30/2026, 1:56:10 PM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    List<String> ar;
18    public List<String> binaryTreePaths(TreeNode root) {
19        ar=new ArrayList<>();
20        rec(ar,"",root);
21        return ar;
22    }
23    public void rec(List<String> ar,String s,TreeNode r){
24        if(r.left==null && r.right==null){
25            s+=String.valueOf(r.val);
26            ar.add(s);
27            
28            return;}
29        s+=String.valueOf(r.val)+"->";
30        if(r.left!=null){
31            rec(ar,s,r.left);
32        }
33        if(r.right!=null){
34            rec(ar,s,r.right);
35        }
36    }
37}