// Last updated: 9/28/2026, 10:27:37 PM
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