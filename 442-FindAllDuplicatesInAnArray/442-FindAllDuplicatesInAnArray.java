// Last updated: 5/25/2026, 11:09:35 AM
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer>a=new ArrayList<>();
        int index=0;
        while(index<nums.length){
            int z=nums[index]-1;
            if(nums[index]!=nums[z]){
                int t=nums[index];
                nums[index]=nums[z];
                nums[z]=t;
            }
            else{
                index++;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i+1) a.add(nums[i]);
        }
        return a;
    }
}