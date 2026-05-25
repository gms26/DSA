// Last updated: 5/25/2026, 11:10:49 AM

class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null){
            return true;
        }
        ListNode s=head;
        ListNode f=head;
        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;
        }
        ListNode prev=null;
        ListNode current=s;
        while(current!=null){
        ListNode temp=current.next;
        current.next=prev;
        prev=current;
        current=temp;
        }
        ListNode l=head;
        ListNode r=prev;
        while(r!=null){
            if(l.val!=r.val){
                return false;
            }
            l=l.next;
            r=r.next;
        }return true;
    }
}