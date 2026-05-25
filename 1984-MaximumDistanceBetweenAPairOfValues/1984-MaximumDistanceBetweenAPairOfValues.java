// Last updated: 5/25/2026, 11:05:20 AM
class Solution {
    public int maxDistance(int[] n1, int[] n2) {
        int c=0;
        int i=0,j=0;
        while(i<n1.length && j<n2.length){
                if(n1[i]<=n2[j]){
                    c=Math.max(c,j-i);
                    j++;
                }
                else{
                    i++;
                }
            
        }
        return c;
    }
}