// Last updated: 8/31/2026, 12:19:17 PM
class Solution {
    public int missingInteger(int[] nums) {
        ArrayList<Integer>ar=new ArrayList<>();
        for(int i:nums){
            ar.add(i);
        }
        int c=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]+1==nums[i]){
                c+=nums[i];
            }
            else{
                if(ar.contains(c)){
                while(ar.contains(c)){
                    c++;
                }
                return c;}
                else if(!ar.contains(c)){
                    return c;
                }
                c=nums[i];

            }
        }
        if(!ar.contains(c))return c;
        return c+1;
    }
}