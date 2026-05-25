// Last updated: 5/25/2026, 11:12:40 AM
class Solution {
    public int climbStairs(int n) {
      int[]a=new int[n+1];
      a[0]=1;
      if(n>=1){
        a[1]=1;
      }
      for(int i=2;i<=n;i++){
        a[i]=a[i-1]+a[i-2];
      }
      return a[n];
    }
}