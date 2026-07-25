// Last updated: 7/25/2026, 10:17:18 AM
1class Solution {
2    public int maxProduct(int n) {
3        int z=0,c=0;
4       // ArrayList<Integer>a=new ArrayList<>();
5        while(n>0){
6            int x=n%10;
7           // a.add(x);
8            if(z<x){c=z;z=x;}
9            else if(c<x)c=x;
10            n/=10;
11        }
12        return z*c;
13        // Collections.sort(a);
14        // return a.get(a.size()-1)*a.get(a.size()-2);
15    }
16}