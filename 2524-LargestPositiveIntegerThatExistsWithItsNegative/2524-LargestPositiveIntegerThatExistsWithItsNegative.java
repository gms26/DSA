// Last updated: 5/25/2026, 11:04:22 AM
class Solution {
    public int findMaxK(int[] n) {
        Arrays.sort(n);
        int i=0,j=n.length-1;
        while(i<j){
            if(n[i]==-n[j]){
                return n[j];
            }
            else if(-n[i]>n[j]){
            i++;}
            else{
                j--;
            }
        }
        return -1;
    }
}