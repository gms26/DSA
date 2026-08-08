// Last updated: 8/8/2026, 9:06:31 AM
1class Solution {
2    public int findMinMoves(int[] m) {
3       
4        int s=0;
5        for(int i:m){
6            s+=i;
7        }
8        int n=m.length;
9        if(s%n!=0)return -1;
10        int t=s/n,bal=0,ans=0;
11        for(int i:m){
12            int dif=i-t;
13            bal+=dif;
14            ans=Math.max(ans,Math.max(Math.abs(bal),dif));
15        }return ans;
16
17    }
18}