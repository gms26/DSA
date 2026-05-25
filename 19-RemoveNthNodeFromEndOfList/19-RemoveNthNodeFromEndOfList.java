// Last updated: 5/25/2026, 11:13:35 AM
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode cur=head;
        int i=0;
        
        while(cur!=null){
            i++;
            cur=cur.next;
        }
        if(i==n)return head.next;
        cur=head;
        for(int j=0;j<i-n-1;j++){
            cur=cur.next;
        }
        cur.next=cur.next.next;
        return head;
    }
}