// Last updated: 5/25/2026, 11:08:19 AM
class Solution {
    public int search(int[] n, int t) {
        for(int i=0;i<n.length;i++){
            if(n[i]==t){
                return i;
            }
        }
        return -1;
    }
}