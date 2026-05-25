// Last updated: 5/25/2026, 11:13:30 AM
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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode node=head;
        for(int i=0;i<k;i++){
            if(node==null)return head;
            node=node.next;
        }
        ListNode prev=null,cur=head,next;
        for(int i=0;i<k;i++){
            next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
        }
        head.next=reverseKGroup(cur,k);
        return prev;
    }
}