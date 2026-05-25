// Last updated: 5/25/2026, 11:06:34 AM
class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int s=0;
        for(int i=0;i<k;i++){
            s+=arr[i];
        }
        int m=0;
        if(s/k>=threshold){
                m++;
            }
        
        for(int i=1;i<arr.length-k+1;i++){
            s=s-arr[i-1]+arr[i+k-1];
            if(s/k>=threshold){
                m++;
            }
        }
        return m;
    }
}