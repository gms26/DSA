// Last updated: 5/25/2026, 11:04:49 AM
class Solution {
    public boolean isSameAfterReversals(int n) {
        if(n==0)return true;
        return n%10!=0;
    }
}