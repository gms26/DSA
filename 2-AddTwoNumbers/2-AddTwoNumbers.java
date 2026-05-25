// Last updated: 5/25/2026, 11:13:54 AM
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null && l2==null)return null;
        int c=0;
       int v=l1.val+l2.val+c; 
       ListNode newnode=new ListNode(v%10);
       c=v/10;
       ListNode temp=newnode;
       l1=l1.next;
       l2=l2.next;
       
       while(l1!=null &&l2!=null){
        int a=l1.val+l2.val+c;
        c=a/10;
        ListNode nn=new ListNode(a%10);
        temp.next=nn;
        temp=nn;
        l1=l1.next;
        l2=l2.next;
       }
       while (l1 != null) {
            int a = l1.val + c;
            ListNode nn = new ListNode(a % 10);
            c = a / 10;

            temp.next = nn;
            temp = nn;
            l1 = l1.next;
        }
         while (l2 != null) {
            int a = l2.val + c;
            ListNode nn = new ListNode(a % 10);
            c = a / 10;

            temp.next = nn;
            temp = nn;
            l2 = l2.next;
        }
        if (c > 0) {
            temp.next = new ListNode(c);
        }
       return newnode;
    }
}