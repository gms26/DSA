// Last updated: 5/25/2026, 11:09:21 AM
class Solution {
    public boolean makesquare(int[] matchsticks) {
        int s=0;
        for (int i:matchsticks)s+=i;
        if(s%4!=0)return false;
        int side=s/4;
        Arrays.sort(matchsticks);
        int[]sq=new int[4];
        return back(matchsticks,matchsticks.length-1,side,sq);
    }
    boolean back(int[]m,int n,int s,int[]sq){
        if(n<0)return true;
        int stick=m[n];
        for(int i=0;i<4;i++){
            if(sq[i]+stick>s)continue;
            sq[i]+=stick;
            if(back(m,n-1,s,sq))return true;
            sq[i]-=stick;
        }
        return false;
    }
}