// Last updated: 5/25/2026, 11:07:07 AM
class Solution {
    public double trimMean(int[] arr) {
       Arrays.sort(arr);
       int a=arr.length;
       int b=a/20;
       
       double z=0;
       for(int i=b;i<a-b;i++){
        z+=arr[i];
       }
       return z/(a-2*b);
    }
}