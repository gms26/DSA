// Last updated: 6/8/2026, 10:48:38 PM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode removeElements(ListNode head, int val) {
13        
14        ListNode dummy=new ListNode(0);
15        dummy.next=head;
16        
17       ListNode z=dummy;
18        while(z.next!=null){
19            
20            
21           
22            if(z.next.val==val){
23                z.next=z.next.next;
24            }else{
25            z=z.next;}
26        }
27        return dummy.next;
28    }
29}