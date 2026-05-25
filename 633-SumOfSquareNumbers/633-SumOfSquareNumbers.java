// Last updated: 5/25/2026, 11:08:49 AM
class Solution {
    public boolean judgeSquareSum(int c) {
        long s=0;
        long l=(long)Math.sqrt(c);
        while(s<=l){
            long a=s*s+l*l;
            if(a==c){
                return true;
            }
            if(a<c){
                s++;
            }
            else{
                l--;
            }
        }
        return false;
    }
}