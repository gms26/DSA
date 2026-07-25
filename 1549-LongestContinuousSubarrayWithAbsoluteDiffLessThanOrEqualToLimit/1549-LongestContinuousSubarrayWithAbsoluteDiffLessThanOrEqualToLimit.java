// Last updated: 7/25/2026, 10:19:04 AM
class Solution {
    public int longestSubarray(int[] nums, int limit) {
        Deque<Integer> minq=new ArrayDeque<>();
        Deque<Integer> maxq=new ArrayDeque<>();
        int l=0,ans=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
        while(!maxq.isEmpty() && nums[maxq.peekLast()]<nums[i]){
            maxq.pollLast();
        }
        while(!minq.isEmpty() && nums[minq.peekLast()]>nums[i]){
            minq.pollLast();

        }
        maxq.offerLast(i);
        minq.offerLast(i);
        while(nums[maxq.peekFirst()]-nums[minq.peekFirst()]>limit){
            
            if(maxq.peekFirst()==l){
                maxq.pollFirst();
            }
            if(minq.peekFirst()==l){
                minq.pollFirst();
            }
            l++;
        }
        ans=Math.max(ans,i-l+1);
    }
    return ans;
    }
}