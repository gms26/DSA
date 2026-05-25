// Last updated: 5/25/2026, 11:05:33 AM
class Solution {
    public int minimumSize(int[] nums, int maxOperations) {
     int low=1,high=0;
     for(int i:nums)high=Math.max(high,i);
     while(low<high){
        int mid=low+(high-low)/2;
        int op=0;
        for(int i:nums){
            op+=(i-1)/mid;

        }
        if(op>maxOperations)low=mid+1;
        else high=mid;
     }   
     return low;
    }
}