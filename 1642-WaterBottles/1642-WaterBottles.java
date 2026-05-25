// Last updated: 5/25/2026, 11:05:55 AM
class Solution {
    public int numWaterBottles(int b, int e) {
        int t=b,empty=b;
        while(empty>=e){
            int a=empty/e;
            t+=a;
            empty=empty%e+a;
        }
        return t;
    }
}