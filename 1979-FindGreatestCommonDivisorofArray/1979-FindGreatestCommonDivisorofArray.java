// Last updated: 7/18/2026, 9:51:20 PM
1class Solution {
2    public int findGCD(int[] n) {
3        int s=n[0],l=0;
4        for(int i=0;i<n.length;i++){
5            if(s>n[i]){
6                s=n[i];
7            }
8            if(l<n[i]){
9                l=n[i];
10            }
11        }
12        int a=0;
13        for (int i=1;i<=l;i++){
14            if(s%i==0 && l%i==0){
15               a=i;
16            }
17        }
18        return a;
19    }
20}