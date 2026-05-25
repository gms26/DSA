// Last updated: 5/25/2026, 11:52:51 AM
1class Solution {
2    public int maxProfit(int[] p) {
3        int m=0;
4        for(int i=1;i<p.length;i++){
5            if(p[i]-p[i-1]>0){
6                m+=p[i]-p[i-1];
7            }
8        }
9        return m;
10    }
11}