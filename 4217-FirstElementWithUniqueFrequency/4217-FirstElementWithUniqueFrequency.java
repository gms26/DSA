// Last updated: 5/25/2026, 11:02:56 AM
class Solution {
    public int firstUniqueFreq(int[] nums) {
        HashMap<Integer,Integer>a=new HashMap<>();
        for(int i:nums){
            a.put(i,a.getOrDefault(i,0)+1);
        }
        HashMap<Integer,Integer>f=new HashMap<>();
        for(int i:a.values()){
            f.put(i,f.getOrDefault(i,0)+1);
        }
        for(int j:nums){
            int z=a.get(j);
            if(f.get(z)==1){
                return j;
            }
        }
        return -1;
    }
}