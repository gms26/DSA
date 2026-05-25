// Last updated: 5/25/2026, 11:08:52 AM
class Solution {
    public int findLHS(int[] nums) {
      
    //   int m=0;
    //   Map<Integer,Integer> a=new HashMap<>();
    //   for(int j:nums){
    //     a.put(j,a.getOrDefault(j,0)+1);
    //   }
    //   for(int i:a.keySet()){
    //        if(a.containsKey(i+1))m=Math.max(m,a.get(i)+a.get(i+1));
        
    //   }  
    //   return m;
    Arrays.sort(nums);
    int s1=0,l,m=0;
    for(int li=1;li<nums.length;li++){
        if(nums[li]-nums[s1]==1){
            l=li-s1+1;
            if(m<l)m=l;
        }
        while((nums[li]-nums[s1])>1 && s1<li)s1++;
    }
    return m;
    }
}
