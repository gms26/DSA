// Last updated: 6/8/2026, 10:14:27 PM
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
12    public ListNode removeNthFromEnd(ListNode head, int n) {
13        ListNode cur=head;
14        int i=0;
15        
16        while(cur!=null){
17            i++;
18            cur=cur.next;
19        }
20        if(i==n)return head.next;
21        cur=head;
22        for(int j=0;j<i-n-1;j++){
23            cur=cur.next;
24        }
25        cur.next=cur.next.next;
26        return head;
27    }
28}