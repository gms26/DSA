// Last updated: 5/25/2026, 11:04:52 AM
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
    public ListNode deleteMiddle(ListNode head) {
        ListNode f=head;
        ListNode s=head;
        ListNode temp=null;
        if(head==null || head.next==null)return null;
        while(f!=null&&f.next!=null){
            temp=s;
            s=s.next;
            f=f.next.next;
        }
        temp.next=temp.next.next;
        return head;
    }
}