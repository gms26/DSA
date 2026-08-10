// Last updated: 8/10/2026, 12:26:27 PM
class Solution {
    public int maxProfit(int[] p) {
        int m=0;
        for(int i=1;i<p.length;i++){
            if(p[i]-p[i-1]>0){
                m+=p[i]-p[i-1];
            }
        }
        return m;
    }
}