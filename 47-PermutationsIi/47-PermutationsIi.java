// Last updated: 5/25/2026, 11:13:06 AM
class Solution {
    void back(boolean[]f,List<List<Integer>>r,int[]n,ArrayList<Integer>a){
        if(a.size()==n.length){
            r.add(new ArrayList<>(a));
            return;
        }
    for(int i=0;i<n.length;i++){
        if(f[i])continue;
       if(i>0&& n[i]==n[i-1]&&!f[i-1])continue;
        a.add(n[i]);
        f[i]=true;
        back(f,r,n,a);
        a.remove(a.size()-1);
        f[i]=false;
    }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>>r=new ArrayList<>();
        boolean[]f=new boolean[nums.length];
        Arrays.sort(nums);
        back(f,r,nums,new ArrayList<>());
        return r;
    }
}