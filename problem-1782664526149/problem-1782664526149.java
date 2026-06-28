// Last updated: 6/28/2026, 10:05:26 PM
1class Solution {
2    public long maxSum(int[] nums, int k, int mul) {
3        Arrays.sort(nums);
4        int[]ar=new int[k];
5        int ind=0;
6        for(int i=nums.length-k;i<nums.length;i++){
7            ar[ind++]=nums[i];
8        }
9        Arrays.sort(ar);
10
11        long ans=0;
12        int m=mul;
13        for(int i=k-1;i>=0;i--){
14            long n=ar[i];
15            long x=1L*n*m;
16            ans+=Math.max(x,n);
17            m--;
18        }
19        return ans;
20    }
21}