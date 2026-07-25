// Last updated: 7/25/2026, 10:06:53 AM
1class Solution {
2    public int maxProduct(int n) {
3        //int z=1,c=0;
4        ArrayList<Integer>a=new ArrayList<>();
5        while(n>0){
6            int x=n%10;
7            a.add(x);
8            n/=10;
9        }
10        Collections.sort(a);
11        return a.get(a.size()-1)*a.get(a.size()-2);
12    }
13}