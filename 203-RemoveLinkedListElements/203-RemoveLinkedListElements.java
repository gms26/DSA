// Last updated: 5/25/2026, 11:11:10 AM
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
    public ListNode removeElements(ListNode head, int val) {
        
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        
       ListNode z=dummy;
        while(z.next!=null){
            
            
           
            if(z.next.val==val){
                z.next=z.next.next;
            }else{
            z=z.next;}
        }
        return dummy.next;
    }
}