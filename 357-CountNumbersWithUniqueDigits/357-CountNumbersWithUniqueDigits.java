// Last updated: 8/10/2026, 12:23:27 PM
class Solution {
    public int countNumbersWithUniqueDigits(int n) {
       if(n==0) return  1;

       int un=9;
       int avail=9;
       int tot=10;
       for(int i=2;i<=n;i++){
        un*=avail;
        tot+=un;
        avail--;
       }
       return tot;
    }
}