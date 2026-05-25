// Last updated: 5/25/2026, 11:07:27 AM
class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        // int c=0;
        // for(int i=0;i<nums.length;i++){
        //     Map<Integer,Integer>map=new HashMap<>();
        //     for(int j=i;j<nums.length;j++){
        //         map.put(nums[j],map.getOrDefault(nums[j],0)+1);
        //         if(map.size()==k)c++;
        //         if(map.size()>k)break;
        //     }
        // }
        // return c;
        return sub(nums,k)-sub(nums,k-1);
    }
    int sub(int[]n,int k){
        Map<Integer,Integer>map=new HashMap<>();
        int l=0,c=0;
        for(int i=0;i<n.length;i++){
            map.put(n[i],map.getOrDefault(n[i],0)+1);
            while(map.size()>k){
                map.put(n[l],map.get(n[l])-1);
                if(map.get(n[l])==0)map.remove(n[l]);
                l++;
            }
            c+=i-l+1;
        }
        return c;
    }
}