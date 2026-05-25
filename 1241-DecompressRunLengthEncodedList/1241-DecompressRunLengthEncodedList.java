// Last updated: 5/25/2026, 11:07:00 AM
class Solution {
    public int[] decompressRLElist(int[] n) {
       
       int j=0;
        for(int i=0;i<n.length;i+=2){
           
                j+=n[i];
            }
         int[]a=new int[j];
         int t=0;
         for(int i=0;i<n.length;i+=2){
            int m=n[i];
            int z=n[i+1];
            for(int k=0;k<m;k++){
                a[t++]=z;
            }
         }
        return a;
    }
}