// Last updated: 5/30/2026, 9:03:37 AM
1class Solution {
2    public int maxCount(int m, int n, int[][] ops) {
3        int minn=m;
4        int minm=n;
5        for(int[] x:ops){
6            minn=Math.min(minn,x[0]);
7            minm=Math.min(minm,x[1]);
8        }
9        return minn*minm;
10    }
11}