// Last updated: 5/25/2026, 11:03:10 AM
class Solution {
    public int numOfUnplacedFruits(int[] f, int[] b) {
        int[] c=new int[f.length];
        
        int m=0;
        for(int i=0;i<f.length;i++){
            boolean a=false;
            for(int j=0;j<b.length;j++){
                if(c[j]==0 && b[j]>=f[i]){
                    c[j]=1;

                    a=true;
                    break;
                }
            }
            if(!a){
                m++;
            }
        }
        return m;
    }
}