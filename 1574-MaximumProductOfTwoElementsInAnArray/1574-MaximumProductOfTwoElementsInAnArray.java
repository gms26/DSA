// Last updated: 5/25/2026, 11:06:07 AM
class Solution {
    public int maxProduct(int[] n) {
        int m=0;
        for(int i=0;i<n.length;i++){
            for(int j=i+1;j<n.length;j++){
                if(m<(n[i]-1)*(n[j]-1)){
                    m=(n[i]-1)*(n[j]-1);
                }
            }
        }
        return m;
    }
}