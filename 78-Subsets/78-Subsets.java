// Last updated: 5/25/2026, 11:12:32 AM
class Solution {
    
    void back(int[]nums,List<Integer>a,int i,List<List<Integer>>r){
        if(i==nums.length){
            r.add(new ArrayList<>(a));
            return;
        }
        
        a.add(nums[i]);
        back(nums,a,i+1,r);
        a.remove(a.size()-1);
        back(nums,a,i+1,r);

    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> r=new ArrayList<>();
        back(nums,new ArrayList<>(),0,r);
        return r;
    }
}