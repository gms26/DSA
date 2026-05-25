// Last updated: 5/25/2026, 11:12:52 AM
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
    public ListNode rotateRight(ListNode head, int k) {
         if(head==null || head.next==null ||k==0)return head;
        
        int i=0;
        ListNode cur=head;
        while(cur!=null){
            cur=cur.next;
            i++;
        }
         k=k%i;
       if(k==0)return head;
       i=0;
       cur=head;
        while(i<k){
            while(cur.next.next!=null){
                cur=cur.next;
            }
            ListNode temp=cur.next;
            cur.next=null;
            cur=temp;
            cur.next=head;
            head=cur;
            
            i++;
        }
        return head;
    }
}