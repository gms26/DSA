// Last updated: 7/24/2026, 6:06:39 PM
class Solution {
    int s=0;
    public int gcdOfOddEvenSums(int n) {
        int od=0,ev=0;
        // if(n==1){
        //     od=1;ev=0;}
        // else
        for(int i=1;i<=2*n;i++){
            if(i%2==0){
                ev+=i;
            }
            else{
                od+=i;
            }
        }
       // System.out.print(od+" "+ev);
        s=gcd(od,ev);
        return s;
    }
    public int gcd(int a,int b){
        if(b==0)return a;
        return gcd(b,a%b);
    }
}