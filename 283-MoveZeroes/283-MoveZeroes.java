// Last updated: 5/25/2026, 11:10:26 AM
class Solution {
    public void moveZeroes(int[] n) {
        int[]a=new int [n.length];
        int d=0;
        for(int i=0;i<n.length;i++){
            if(n[i]!=0){
              a[d++]=n[i];
            }
        }
        while(d<n.length){
          a[d++]=0;
        }
        for(int i=0;i<n.length;i++){
            n[i]=a[i];
        }
    }
}