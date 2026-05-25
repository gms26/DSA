// Last updated: 5/25/2026, 11:11:57 AM
class Solution {
    public int maxProfit(int[] p) {
        int buy=p[0];
        int prof=0;
        for(int i=0;i<p.length;i++){
            if(p[i]<buy){
                buy=p[i];
            }
            else if(p[i]-buy>prof){
                prof=p[i]-buy;
            }
        }return prof;
    }
}