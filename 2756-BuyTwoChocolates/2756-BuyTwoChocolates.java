// Last updated: 5/25/2026, 11:03:56 AM
class Solution {
    public int buyChoco(int[] p, int m) {
        int c=Integer.MAX_VALUE;
        for(int i=0;i<p.length;i++){
            for(int j=i+1;j<p.length;j++){
                
                if(p[i]+p[j]<=m){
                     c=Math.min(p[i]+p[j],c);
                    
                }
            }
        }
        if(c==Integer.MAX_VALUE){
            return m;
        }
        return m-c;
    }
}