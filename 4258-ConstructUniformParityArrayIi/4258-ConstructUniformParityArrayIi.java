// Last updated: 5/25/2026, 11:02:54 AM
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