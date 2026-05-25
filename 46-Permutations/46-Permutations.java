// Last updated: 5/25/2026, 11:13:09 AM
class Solution {
    void back(boolean[]f,List<List<Integer>>r,int[]nums,List<Integer>a){
        if(a.size()==nums.length){
            r.add(new ArrayList<>(a));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(f[i])continue;
            f[i]=true;
            a.add(nums[i]);
            back(f,r,nums,a);
            a.remove(a.size()-1);
            f[i]=false;
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        boolean[]f=new boolean[nums.length];
        List<List<Integer>>r=new ArrayList<>();
        back(f,r,nums,new ArrayList<>());
        return r;
    }
}