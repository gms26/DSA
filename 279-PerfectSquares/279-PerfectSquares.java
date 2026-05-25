// Last updated: 5/25/2026, 11:10:27 AM
class Solution {
    public int numSquares(int n) {
        
        if(check(n)) return 1;
        for(int i=1;i*i<=n;i++){
            if(check(n-i*i)) return 2;
        }
        while(n%4==0) n/=4;
        if(n%8==7) return 4;
        return 3;
}
    public boolean check(int n){
        int sq = (int) Math.sqrt(n);
        return sq*sq==n;
    }
}