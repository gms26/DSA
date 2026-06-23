// Last updated: 6/23/2026, 10:06:24 AM
1class Solution {
2    public int integerBreak(int n) {
3        if(n==2)return 1;
4        if(n==3)return 2;
5        else{
6            int p=1;
7            while(n>4){
8                p*=3;
9                n-=3;
10            }
11            p*=n;
12            return p;
13        }
14       
15    }
16}