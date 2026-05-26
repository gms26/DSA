// Last updated: 5/26/2026, 11:36:47 PM
1class Solution {
2    public int longestOnes(int[] nums, int k) {
3        int m=0,l=0,r=0,z=0;
4        while(r<nums.length){
5            if(nums[r]==0){
6                z++;
7            }
8            while(z>k){
9                if(nums[l]==0){
10                    z--;
11                }
12                l++;
13            }
14            m=Math.max(m,r-l+1);
15            r++;
16        }
17        return m;
18
19    }
20}