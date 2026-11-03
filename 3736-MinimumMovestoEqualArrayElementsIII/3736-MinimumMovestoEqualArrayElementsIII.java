// Last updated: 11/3/2026, 9:00:50 AM
1class Solution {
2    public int minMoves(int[] nums) {
3        int max=0;
4        for(int i:nums){
5            max=Math.max(i,max);
6        }
7        int c=0;
8        for(int i:nums){
9            if(i!=max){
10                c+=max-i;
11            }
12        }
13        return c;
14    }
15}