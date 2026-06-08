// Last updated: 6/8/2026, 10:01:50 PM
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
12    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
13        ListNode dummy = new ListNode(0);
14        ListNode current = dummy;
15
16        
17        while (list1 != null && list2 != null) {
18            if (list1.val < list2.val) {
19                current.next = list1;
20                list1 = list1.next;
21            } else {
22                current.next = list2;
23                list2 = list2.next;
24            }
25           
26       
27            current = current.next; 
28        }
29
30      
31        if (list1 != null) {
32            current.next = list1;
33        } else {
34            current.next = list2;
35        }
36
37       
38        return dummy.next;
39    }
40}