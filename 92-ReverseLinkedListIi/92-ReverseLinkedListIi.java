// Last updated: 5/25/2026, 11:12:24 AM

class Solution {
    public ListNode reverseBetween(ListNode head, int l, int r) {
        if(head==null || l==r){
            return head;
        }
        ListNode d=new ListNode(0);
        d.next=head;
        ListNode pre=d;
        for(int i=0;i<l-1;i++){
            pre=pre.next;
        }
        ListNode current=pre.next;
        ListNode next=null;
        ListNode tail=current;
        for(int i=0;i<=r-l;i++){
            next=current.next;
            current.next=pre.next;
            pre.next=current;
            current=next;
        }
        tail.next=current;
        return d.next;
    }
}