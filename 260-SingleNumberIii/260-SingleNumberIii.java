// Last updated: 5/25/2026, 11:10:33 AM
class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int []a=new int[2];
        int i=0;
        for(Map.Entry<Integer,Integer>j:map.entrySet()){
            if(j.getValue()==1){
                a[i++]=j.getKey();
            }
        }
        return a;
    }
}