// Last updated: 5/25/2026, 11:06:47 AM
class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int c=0;
        for(int i=0;i<arr.length;i++){
            
            if(arr[i]%2!=0){
                c++;
                
            }
             if(arr[i]%2==0){
                c=0;
            }
            if(c>=3){
                return c==3;
            }
        }
        return false;
    }
}