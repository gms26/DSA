// Last updated: 9/28/2026, 10:29:31 PM
class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long c=0,s=0;
        for(int i:nums){
            if(i==0){
                s+=1;
                
                c+=s;
                //System.out.print(c+" ");
            }
            else{
                
                s=0;
            }
        }
        return c;
    }
}