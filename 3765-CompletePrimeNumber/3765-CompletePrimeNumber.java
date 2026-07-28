// Last updated: 7/28/2026, 3:03:47 PM
1class Solution {
2    public int partitionDisjoint(int[] nums) {
3        int n=nums.length;
4        int sum=0;
5        int[]ma=new int[n];
6        ma[0]=nums[0];
7        int[]mi=new int[n];
8        mi[n-1]=nums[n-1];
9        for(int i=1;i<n;i++){
10            ma[i]=Math.max(ma[i-1],nums[i]);
11        }
12        for(int i=n-2;i>=0;i--){
13            mi[i]=Math.min(mi[i+1],nums[i]);
14        }
15        for(int i=1;i<n;i++){
16            if(ma[i-1]<=mi[i]) return i;
17            
18        }
19        return 0;
20    }
21}