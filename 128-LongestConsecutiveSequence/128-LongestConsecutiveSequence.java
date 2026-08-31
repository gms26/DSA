// Last updated: 8/31/2026, 12:27:32 PM
class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        if(nums.length<1)return 0;
        int c=1,m=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]==nums[i]){
                continue;
            }
            else if(nums[i-1]+1==nums[i]){
                c++;
            }
            else{
                c=1;
            }
            m=Math.max(m,c);
        }
        return m;
        // ArrayList<Integer>s=new ArrayList<>();
        // for(int i:nums){
        //     if(!s.contains(i) )
        //     s.add(i);
        // }
        // System.out.print(s);
        // int j=1,c=1,z=s.get(0),m=0;
        // while(j<s.size()){
        //     if(s.get(j)==z+1){
        //         c++;
        //         z=s.get(j);if(m<c)m=c;
        //     }
        //     else if(s.get(j)!=z+1){
        //         z=s.get(j);
        //         c=1;
        //     }
        //     j++;
        // }
        // if(m<c)return c;
        // return m;
    }
}