// Last updated: 8/31/2026, 12:19:06 PM
class Solution {
    public int[] resultArray(int[] nums) {
       ArrayList<Integer>ar1=new ArrayList<>();
        ArrayList<Integer>ar2=new ArrayList<>();
        int []res=new int[nums.length];
        ar1.add(nums[0]);
        ar2.add(nums[1]);
        for(int i=2;i<nums.length;i++){
            if(ar1.get(ar1.size()-1)>ar2.get(ar2.size()-1)){
                ar1.add(nums[i]);
            }else if(ar1.get(ar1.size()-1)<ar2.get(ar2.size()-1)){
                ar2.add(nums[i]);
            }
        }
        int j=0;
        for(int i:ar1){
            res[j++]=i;
        }
        for(int i:ar2){
            res[j++]=i;
        }
        return res;
    }
}