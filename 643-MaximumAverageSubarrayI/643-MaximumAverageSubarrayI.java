// Last updated: 5/25/2026, 11:08:46 AM
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double s=0;
        for(int i=0;i<k;i++){
            s+=nums[i];
        }
        double m=s;
        for(int i=1;i<nums.length-k+1;i++){
            s=s-nums[i-1]+nums[i+k-1];
            if(m<s)m=s;
        }
        return m/k;
    }
}