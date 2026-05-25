// Last updated: 5/25/2026, 11:05:57 AM
class Solution {
    public int numSub(String s) {
        long c=0,ans=0;
        int mod = 1_000_000_007;
        for(char a:s.toCharArray()){
           
            if(a=='1'){
                c++;
            }
            else{
                ans=(ans+c*(c+1)/2)%mod;
                c=0;
            }
        }
        ans=(ans+c*(c+1)/2)%mod;
        return (int)ans;
    }
}