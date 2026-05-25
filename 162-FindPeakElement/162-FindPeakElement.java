// Last updated: 5/25/2026, 11:11:31 AM
class Solution {
    public int findPeakElement(int[] n) {
        int a=n[0],j=0;
        for(int i=0;i<n.length;i++){
            if(a<n[i]){
                a=n[i];
                j=i;
            }
        }
        return j;
    }
}