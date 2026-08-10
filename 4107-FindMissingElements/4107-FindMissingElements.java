// Last updated: 8/10/2026, 12:11:39 PM
class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min=nums[0],max=nums[0];
        for(int i:nums){
            if(min>i){
                min=i;
            }
            if(max<i)max=i;
        }
        ArrayList<Integer>ar=new ArrayList<>();
        for(int i=min;i<max;i++){
            boolean f=false;
            for(int j=0;j<nums.length;j++){
                if(i==nums[j]){f=true;break;}
            }
            if(!f)ar.add(i);
        }
        return ar;
    }
}