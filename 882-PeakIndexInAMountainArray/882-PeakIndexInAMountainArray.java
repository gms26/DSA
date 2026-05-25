// Last updated: 5/25/2026, 11:08:05 AM
class Solution {
    public int peakIndexInMountainArray(int[] arr) {
       
        int i=0,j=arr.length-1;
        while(i<j){
            int mid =i+(j-i)/2;
            if(mid!=arr.length-1 && arr[mid]>arr[mid+1]){
                j=mid;
            }
            else{
                i=mid+1;
            }
        }
        return i;
    }
}