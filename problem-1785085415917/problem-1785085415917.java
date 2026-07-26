// Last updated: 7/26/2026, 10:33:35 PM
1class Solution {
2    public int largestInteger(int n, int s) {
3        if(s==0)return 0;
4     if(s>9*n)   
5     return -1;   
6        StringBuilder sb=new StringBuilder();
7        for(int i=0;i<n;i++){
8            int d=Math.min(9,s);
9            sb.append(d);
10            s-=d;
11        }
12        return Integer.parseInt(sb.toString());
13    }
14}