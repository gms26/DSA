// Last updated: 5/25/2026, 11:05:15 AM
class Solution {
    public boolean canReach(String s, int mj, int mi) {
        boolean[] dp=new boolean[s.length()];
        dp[0]=true;
        int p=0;
        for(int i=1;i<s.length();i++){
            if(i-mj>=0 && dp[i-mj]){
                p++;
            }
            if(i-mi-1>=0 && dp[i-mi-1]){
                p--;
            }
            if(p>0 && s.charAt(i)=='0'){
                dp[i]=true;
            }
        }
        return dp[s.length()-1];

    }
}