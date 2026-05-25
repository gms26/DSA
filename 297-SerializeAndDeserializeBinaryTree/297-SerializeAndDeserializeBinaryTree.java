// Last updated: 5/25/2026, 11:10:20 AM
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root==null)return "";
        StringBuilder s=new StringBuilder();
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            TreeNode cur=q.poll();
           if(cur==null) 
           s.append("null,");
           else{
           s.append(cur.val).append(",");
           q.add(cur.left);
           q.add(cur.right);}
           
        }return s.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data==null||data.length()==0)return null;
        String[]s=data.split(",");
        TreeNode root=new TreeNode(Integer.valueOf(s[0]));
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        int i=1;
        while(!q.isEmpty()){
            TreeNode cur=q.poll();
            if(!s[i].equals("null")){
                cur.left=new TreeNode(Integer.valueOf(s[i]));
                q.add(cur.left);
            }
            i++;
            if(!s[i].equals("null")){
                cur.right=new TreeNode(Integer.valueOf(s[i]));
                q.add(cur.right);
            }
            i++;
        }
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));