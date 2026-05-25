// Last updated: 5/25/2026, 11:07:23 AM
class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int[]f=new int[60];
        int c=0;
        for(int i:time){
            int r=i%60;
            c+=f[(60-r)%60];
            f[r]++;
        }
        return c;
            }
}