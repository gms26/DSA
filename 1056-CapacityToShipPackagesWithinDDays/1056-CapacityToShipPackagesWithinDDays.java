// Last updated: 5/25/2026, 11:07:22 AM
class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low=0,total=0;
        for(int i:weights){
            low=Math.max(low,i);
            total+=i;
        }
        while(low<total){
            int s=0,p=1;
            int mid=low+(total-low)/2;
            for(int i:weights){
                if(s+i>mid){
                    p++;
                    s=i;
                }
                else{
                    s+=i;
                }
            }
            if(p>days){
                low=mid+1;
            }
            else{
                total=mid;
            }
        }
return low;
    }
}