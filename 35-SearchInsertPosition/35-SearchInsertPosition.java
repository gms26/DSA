// Last updated: 5/25/2026, 11:13:17 AM
class Solution {
    public int searchInsert(int[] n, int t) {
        int a=0;
        for(int i=0;i<n.length;i++){
            if(n[i]>=t){
               return i;
            }
        }
        return n.length;
    }
}