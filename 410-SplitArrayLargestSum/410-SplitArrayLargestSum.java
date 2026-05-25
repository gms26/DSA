// Last updated: 5/25/2026, 11:09:47 AM
class Solution {
    public int splitArray(int[] nums, int k) {
        int low=0,total=0;
        for(int i:nums){
            low=Math.max(low,i);
            total+=i;
        }
        while(low<total){
            int s=0,p=1;
            int mid=low+(total-low)/2;
            for(int i:nums){
                if(i+s>mid){
                    p++;
                    s=i;
                }
                else{
                    s+=i;
                }
            }
            if(p>k){
                low=mid+1;
            }
            else{
                total=mid;
            }
        }
        return low;
    }
}