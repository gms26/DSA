// Last updated: 5/25/2026, 11:07:59 AM
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1,total=0;
        for(int i:piles){
            total=Math.max(total,i);
        }
        while(low<total){
            int s=0;
            int mid=low+(total-low)/2;
            for(int i:piles){
               s+=(i+mid-1)/mid;
            }
            if(s>h){
                low=mid+1;
            }else{
                total=mid;
            }
        }
        return low;
    }
}