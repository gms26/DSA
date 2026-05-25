// Last updated: 5/25/2026, 11:10:45 AM
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        int  a = node.next.val;
        node.val=a;
        node.next=node.next.next;
    }
}