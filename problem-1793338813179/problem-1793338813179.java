// Last updated: 10/30/2026, 11:10:13 AM
1class Solution {
2    public List<Integer> targetIndices(int[] nums, int target) {
3        Arrays.sort(nums);
4        List<Integer>ar=new ArrayList<>();
5        for(int i=0;i<nums.length;i++){
6            if(nums[i]==target){
7                ar.add(i);
8            }
9        }
10        return ar;
11    }
12}