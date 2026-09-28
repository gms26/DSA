// Last updated: 9/28/2026, 10:23:34 PM
class Solution {
    public boolean uniformArray(int[] n) {
        int m=Integer.MAX_VALUE;
        boolean f=false;
        for(int i:n){
            if(i%2==1){
                f=true;
                m=Math.min(i,m);
            }
        }
        if(!f)return true;
        for(int i:n){
            if(i%2==0){
                if(i<=m){
                    return false;
                }
            }
        }
        return true;
    }
}