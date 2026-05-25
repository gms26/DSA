// Last updated: 5/25/2026, 11:03:53 AM
class Solution {
    public int maximizeSum(int[] n, int k) {
        Arrays.sort(n);
        int a=n[n.length-1];
        int s=0;
        for(int i=0;i<k;i++){
            s+=a+i;
        }
        return s;
    }
}