// Last updated: 7/15/2026, 9:34:45 AM
1class Solution {
2    int s=0;
3    public int gcdOfOddEvenSums(int n) {
4        int od=0,ev=0;
5        // if(n==1){
6        //     od=1;ev=0;}
7        // else
8        for(int i=1;i<=2*n;i++){
9            if(i%2==0){
10                ev+=i;
11            }
12            else{
13                od+=i;
14            }
15        }
16       // System.out.print(od+" "+ev);
17        s=gcd(od,ev);
18        return s;
19    }
20    public int gcd(int a,int b){
21        if(b==0)return a;
22        return gcd(b,a%b);
23    }
24}