// Last updated: 5/25/2026, 11:05:06 AM
class Solution {
    public int countKDifference(int[] n, int k) {
        int c=0;
        for(int i=0;i<n.length;i++){
            for(int j=i+1;j<n.length;j++){
                if(Math.abs(n[i]-n[j])==k){
                    c++;
                }
            }
        }
        return c;
    }
}