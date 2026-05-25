// Last updated: 5/25/2026, 11:08:56 AM
class Solution {
    public int subarraySum(int[] nums, int k) {
        int[]p=new int[nums.length];
        p[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            p[i]=p[i-1]+nums[i];}
        int c=0;
        HashMap<Integer,Integer>a=new HashMap<>();
        a.put(0,1);
        for(int i=0;i<p.length;i++){
            int t=p[i]-k;
            if(a.containsKey(t)){
                c+=a.get(t);
            }
            a.put(p[i],a.getOrDefault(p[i],0)+1);
        }
        return c;
    }
}