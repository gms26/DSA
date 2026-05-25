// Last updated: 5/25/2026, 11:10:57 AM
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int count = 0;
        for(int i=0;i<nums.length;i++){
            for(int j=Math.min(i+k,nums.length-1);j>i;j--){
                if(nums[i]==nums[j]) return true;
                if(count == 5000) return false;
                count++;
            }
        }
        return false;
    }
}