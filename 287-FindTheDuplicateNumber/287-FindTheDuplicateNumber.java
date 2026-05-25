// Last updated: 5/25/2026, 11:10:24 AM
class Solution {
    public int findDuplicate(int[] nums) {
        int[] count = new int[nums.length];

        for (int x : nums) {
            count[x]++;
            if (count[x] > 1) {
                return x;  
            }
        }

        return -1; 
    }
}
