// Last updated: 5/25/2026, 11:03:21 AM
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
    public ListNode modifiedList(int[] nums, ListNode head) {
        
        Set<Integer> a=new HashSet<>();
      
        for(int x:nums){a.add(x);
            }
        
       ListNode dummy=new ListNode(0);
        dummy.next=head;
      
        ListNode z=dummy;
        while(z.next!=null ){
            
            if(a.contains(z.next.val)){
                z.next=z.next.next;
            }else{
            z=z.next;}
            
        }
        return dummy.next;
    }
}