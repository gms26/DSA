// Last updated: 8/10/2026, 12:09:03 PM
1class Solution {
2    public int countNumbersWithUniqueDigits(int n) {
3       if(n==0) return  1;
4
5       int un=9;
6       int avail=9;
7       int tot=10;
8       for(int i=2;i<=n;i++){
9        un*=avail;
10        tot+=un;
11        avail--;
12       }
13       return tot;
14    }
15}