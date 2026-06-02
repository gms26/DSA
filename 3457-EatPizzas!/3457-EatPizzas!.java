// Last updated: 6/2/2026, 11:22:26 AM
1class Solution {
2    public long maxWeight(int[] pizzas) {
3        Arrays.sort(pizzas);
4        int n=pizzas.length;
5        int d=n/4;
6        int o=(d+1)/2;
7        int e=d/2;
8        long a=0;
9        int r=n-1;
10        for(int i=0;i<o;i++){
11            a+=pizzas[r--];
12        }
13        for(int i=0;i<e;i++){
14            r--;
15            a+=pizzas[r--];
16        }
17        return a;
18            }
19}