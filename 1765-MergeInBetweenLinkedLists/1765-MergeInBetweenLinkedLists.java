// Last updated: 5/25/2026, 11:05:47 AM
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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode prev=list1; 
        for(int i=0;i<a-1;i++){
            prev=prev.next;
        }
        ListNode cur=prev;
        for(int i=a-1;i<=b;i++){
            cur=cur.next;
        }
        prev.next=list2;
        ListNode temp=list2;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=cur;
        return list1;
    }
}