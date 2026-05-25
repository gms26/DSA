// Last updated: 5/25/2026, 11:12:25 AM
class Solution {
    void back(int[]nums,List<List<Integer>>r,int i,List<Integer>a){
        if(i==nums.length){
            r.add(new ArrayList<>(a));
            return;
        }
        a.add(nums[i]);
        back(nums,r,i+1,a);
        a.remove(a.size()-1);
        int n=i+1;
        while(n<nums.length && nums[n]==nums[i]){
            n++;
        }
        back(nums,r,n,a);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>>r=new ArrayList<>();
        Arrays.sort(nums);
        back(nums,r,0,new ArrayList<>());
        return r;
    }

}