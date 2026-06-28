// Last updated: 6/28/2026, 11:56:19 PM
1class Solution {
2    public long minCost(String s, int[] cost) {
3     long t=0;
4     long[] ar=new long[26];
5     for(int i=0;i<s.length();i++){
6        t+=cost[i];
7        ar[s.charAt(i)-'a']+=cost[i];
8     }   
9long m=0;
10for(long i:ar){
11    m=Math.max(m,i);
12}return t-m;
13    }
14}