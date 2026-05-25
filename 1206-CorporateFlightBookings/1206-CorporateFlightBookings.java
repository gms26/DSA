// Last updated: 5/25/2026, 11:07:08 AM
class Solution {
    public int[] corpFlightBookings(int[][] b, int n) {
      int[]a=new int[n];
      int start,end,val;
      for(int i=0;i<b.length;i++){
        start=b[i][0]-1;
        end=b[i][1]-1;
        val=b[i][2];
        a[start]+=val;
        if(end<n-1){
            a[end+1]-=val;
        }
      }  
      int arr[]=new int[n];
      arr[0]=a[0];
      for(int i=1;i<n;i++){
        arr[i]=arr[i-1]+a[i];
        
      }return arr;
    }
}