// Last updated: 5/25/2026, 11:05:07 AM
class Solution {
    public int findGCD(int[] n) {
        int s=n[0],l=0;
        for(int i=0;i<n.length;i++){
            if(s>n[i]){
                s=n[i];
            }
            if(l<n[i]){
                l=n[i];
            }
        }
        int a=0;
        for (int i=1;i<=l;i++){
            if(s%i==0 && l%i==0){
               a=i;
            }
        }
        return a;
    }
}