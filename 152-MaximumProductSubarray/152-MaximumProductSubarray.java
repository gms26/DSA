// Last updated: 5/25/2026, 11:11:35 AM
class Solution {
    public int maxProduct(int[] nums) {
        int a=nums[0];
        int b=nums[0];
        int p=nums[0];
        for(int i=1;i<nums.length;i++){
            int c=nums[i];
            if(nums[i]<0){
                int t=a;
                a=b;
                b=t;
            }
            a=Math.max(c,a*c);
            b=Math.min(c,b*c);
            p=Math.max(a,p);
        }
        return p;
    }
}