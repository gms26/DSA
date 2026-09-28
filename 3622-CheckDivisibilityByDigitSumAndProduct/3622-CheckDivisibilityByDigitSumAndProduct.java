// Last updated: 9/28/2026, 10:24:41 PM
class Solution {
    public boolean checkDivisibility(int n) {
        int b=0;
        int c=1;
        int m=n;
       
        while(n>0){
            int a=n%10;
            // if(a==0)
            // {
            //     return true;
            // }
            b+=a;
            c*=a;
            n=n/10;
        }
        int z=b+c;
        return m%z==0;
    }
}