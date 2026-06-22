// Last updated: 6/22/2026, 9:17:15 AM
1class Solution {
2    public int maxIceCream(int[] costs, int coins) {
3        int c=0;
4        int z=0;
5        Arrays.sort(costs);
6        for(int i=0;i<costs.length;i++){
7            if(c+costs[i]<=coins){
8                c+=costs[i];
9                z++;
10            }
11        }
12        return z;
13    }
14}