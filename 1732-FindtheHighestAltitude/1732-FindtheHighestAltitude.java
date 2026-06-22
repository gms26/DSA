// Last updated: 6/22/2026, 9:11:01 AM
1class Solution {
2    public int largestAltitude(int[] gain) {
3        int s=0;
4        int m=0;
5        for(int i=0;i<gain.length;i++){
6            s+=gain[i];
7            System.out.println(s);
8            m=Math.max(m,s);
9        }
10        return m;
11    }
12}