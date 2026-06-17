// Last updated: 6/17/2026, 5:39:53 PM
1class Solution {
2    public int findKthLargest(int[] nums, int k) {
3        PriorityQueue<Integer>pq=new PriorityQueue<>();
4        for(int x:nums){
5            pq.add(x);
6            if(pq.size()>k)pq.poll();
7        }
8        return pq.peek();
9    }
10}