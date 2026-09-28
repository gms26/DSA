// Last updated: 9/28/2026, 10:26:15 PM
class Solution {
    public int valueAfterKSeconds(int n, int k) {
        int[]p=new int[n];
        int MOD = 1_000_000_007;
        for(int i=0;i<n;i++){
            p[i]=1;
        }
        for(int j=0;j<k;j++){
        for(int i=1;i<n;i++){
            p[i]=(p[i-1]+p[i])%MOD;
        }}
        return p[n-1];
    }
}