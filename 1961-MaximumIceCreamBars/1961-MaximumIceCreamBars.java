// Last updated: 7/25/2026, 10:18:26 AM
class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int c=0;
        int z=0;
        Arrays.sort(costs);
        for(int i=0;i<costs.length;i++){
            if(c+costs[i]<=coins){
                c+=costs[i];
                z++;
            }
        }
        return z;
    }
}