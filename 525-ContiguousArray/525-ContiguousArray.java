// Last updated: 5/25/2026, 11:09:05 AM
class Solution {
    public int findMaxLength(int[] nums) {
        
        HashMap<Integer,Integer>a=new HashMap<>();
        a.put(0,-1);
        int s=0,m=0,l;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                s-=1;
            }
            else{
                s+=1;
            }
            if(a.containsKey(s)){
                l=i-a.get(s);
                m=Math.max(m,l);
            }
            else{
                a.put(s,i);
            }
        }
        return m;
    }
}