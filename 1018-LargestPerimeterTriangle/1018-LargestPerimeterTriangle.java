// Last updated: 5/25/2026, 11:07:32 AM
class Solution {
    public int largestPerimeter(int[] n) {
        Arrays.sort(n);
        for(int i=n.length-1;i>=2;i--){
            if(n[i-2]+n[i-1]>n[i]){
                return n[i]+n[i-1]+n[i-2];
            }
        }
        return 0;
    }
}