// Last updated: 5/25/2026, 11:10:31 AM
class Solution {
    public boolean isUgly(int n) {
        
        if(n<=0) return false;
        while(n%2==0) n/=2;
        while(n%3==0) n/=3;
        while(n%5==0) n/=5;

        return n==1;
    }
}