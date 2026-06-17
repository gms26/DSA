// Last updated: 6/17/2026, 6:06:04 PM
1class KthLargest {
2PriorityQueue<Integer>pq=new PriorityQueue<>();
3int k;
4    public KthLargest(int k, int[] nums) {
5        this.k=k;
6        for(int i=0;i<nums.length;i++){
7            pq.add(nums[i]);
8        
9        
10            if(pq.size()>k)pq.poll();
11
12        }
13        
14    }
15    
16    public int add(int val) {
17       pq.add(val);
18       if(pq.size()>k)pq.poll();
19       return pq.peek(); 
20    }
21}
22
23/**
24 * Your KthLargest object will be instantiated and called as such:
25 * KthLargest obj = new KthLargest(k, nums);
26 * int param_1 = obj.add(val);
27 */