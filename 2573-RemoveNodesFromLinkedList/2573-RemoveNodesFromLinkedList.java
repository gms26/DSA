// Last updated: 5/25/2026, 11:04:18 AM
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNodes(ListNode head) {
        Map<ListNode,Integer> map=new HashMap<>();
        Stack<ListNode> st=new Stack<>();
        ListNode t=head;
        while(t!=null){
            while(!st.isEmpty() && st.peek().val<t.val){
                map.put(st.pop(),t.val);
            }
            st.push(t);
            t=t.next;
        }
        ArrayList<Integer> z=new ArrayList<>();
        while(!st.isEmpty()){
            z.add(st.pop().val);
        }
        
        ListNode h=new ListNode(z.get(z.size()-1));
        ListNode temp=h;
        for(int i=z.size()-2;i>=0;i--){
            ListNode newnode=new ListNode(z.get(i));
            temp.next=newnode;
            temp=newnode;
        }
        
       return h;
       
    }
}