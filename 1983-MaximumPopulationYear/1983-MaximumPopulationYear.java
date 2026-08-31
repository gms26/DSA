// Last updated: 8/31/2026, 12:21:11 PM
class Solution {
    public int maximumPopulation(int[][] l) {
        int z=0;
        int m=0;
        for(int i=1950;i<=2050;i++){
            
            int c=0;
            for(int j=0;j<l.length;j++){
                
                    if(i>=l[j][0] && l[j][1]>i){
                        c++;
                    }
                
                
            }
            if(c>m){
                    m=c;
                    z=i;
                }
        }
        return z;
    }
}