// Last updated: 7/15/2026, 9:26:21 AM
1class Solution {
2    int s=0;
3    public int gcdOfOddEvenSums(int n) {
4        int od=0,ev=0;
5        for(int i=1;i<2*n;i++){
6            if(i%2==0){
7                ev+=i;
8            }
9            else{
10                od+=i;
11            }
12        }
13        s=gcd(od,ev);
14        return s;
15    }
16    public int gcd(int a,int b){
17        if(b<=1)return a;
18        return gcd(b,a%b);
19    }
20}