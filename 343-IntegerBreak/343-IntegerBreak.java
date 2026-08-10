// Last updated: 8/10/2026, 12:23:41 PM
class Solution {
    public int integerBreak(int n) {
        if(n==2)return 1;
        if(n==3)return 2;
        else{
            int p=1;
            while(n>4){
                p*=3;
                n-=3;
            }
            p*=n;
            return p;
        }
       
    }
}