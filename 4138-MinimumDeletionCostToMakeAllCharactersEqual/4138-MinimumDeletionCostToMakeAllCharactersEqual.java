// Last updated: 7/24/2026, 6:06:37 PM
class Solution {
    public long minCost(String s, int[] cost) {
     long t=0;
     long[] ar=new long[26];
     for(int i=0;i<s.length();i++){
        t+=cost[i];
        ar[s.charAt(i)-'a']+=cost[i];
     }   
long m=0;
for(long i:ar){
    m=Math.max(m,i);
}return t-m;
    }
}