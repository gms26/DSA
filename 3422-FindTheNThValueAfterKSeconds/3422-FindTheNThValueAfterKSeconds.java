// Last updated: 5/25/2026, 11:03:27 AM
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