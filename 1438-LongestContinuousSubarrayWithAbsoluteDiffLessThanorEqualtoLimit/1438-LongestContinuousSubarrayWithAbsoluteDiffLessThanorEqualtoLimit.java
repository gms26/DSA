// Last updated: 6/16/2026, 9:44:54 AM
1class Solution {
2    public int longestSubarray(int[] nums, int limit) {
3        Deque<Integer> minq=new ArrayDeque<>();
4        Deque<Integer> maxq=new ArrayDeque<>();
5        int l=0,ans=Integer.MIN_VALUE;
6        for(int i=0;i<nums.length;i++){
7        while(!maxq.isEmpty() && nums[maxq.peekLast()]<nums[i]){
8            maxq.pollLast();
9        }
10        while(!minq.isEmpty() && nums[minq.peekLast()]>nums[i]){
11            minq.pollLast();
12
13        }
14        maxq.offerLast(i);
15        minq.offerLast(i);
16        while(nums[maxq.peekFirst()]-nums[minq.peekFirst()]>limit){
17            
18            if(maxq.peekFirst()==l){
19                maxq.pollFirst();
20            }
21            if(minq.peekFirst()==l){
22                minq.pollFirst();
23            }
24            l++;
25        }
26        ans=Math.max(ans,i-l+1);
27    }
28    return ans;
29    }
30}