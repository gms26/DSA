// Last updated: 8/10/2026, 12:21:29 PM
class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        int minn=m;
        int minm=n;
        for(int[] x:ops){
            minn=Math.min(minn,x[0]);
            minm=Math.min(minm,x[1]);
        }
        return minn*minm;
    }
}