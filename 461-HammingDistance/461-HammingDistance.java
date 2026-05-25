// Last updated: 5/25/2026, 11:09:23 AM
class Solution {
    public int hammingDistance(int x, int y) {
        int a=x^y;
        int c=0;
        while(a!=0){
            c+=a&1;
            a>>=1;
        }
        return c;
    }
}