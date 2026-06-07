// Last updated: 6/7/2026, 6:00:07 PM
1
2class Solution {
3    public boolean isPalindrome(ListNode head) {
4        if(head==null || head.next==null){
5            return true;
6        }
7        ListNode s=head;
8        ListNode f=head;
9        while(f!=null && f.next!=null){
10            s=s.next;
11            f=f.next.next;
12        }
13        ListNode prev=null;
14        ListNode current=s;
15        while(current!=null){
16        ListNode temp=current.next;
17        current.next=prev;
18        prev=current;
19        current=temp;
20        }
21        ListNode l=head;
22        ListNode r=prev;
23        while(r!=null){
24            if(l.val!=r.val){
25                return false;
26            }
27            l=l.next;
28            r=r.next;
29        }return true;
30    }
31}