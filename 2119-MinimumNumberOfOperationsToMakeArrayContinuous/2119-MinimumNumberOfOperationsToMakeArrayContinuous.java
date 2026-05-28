// Last updated: 5/28/2026, 11:38:53 PM
class Solution {
    public int minOperations(int[] nums) {
        Arrays.sort(nums);
        ArrayList<Integer>l=new ArrayList<>();
        for(int i:nums){
            if(l.isEmpty()||l.get(l.size()-1)!=i){
                l.add(i);
            }
        }
        int a=nums.length,left=0;
        for(int r=0;r<l.size();r++){
            while(l.get(r)>=l.get(left)+nums.length){
                left++;
            }
            int w=r-left+1;
            a=Math.min(a,nums.length-w);
        }
        return a;
    }
}