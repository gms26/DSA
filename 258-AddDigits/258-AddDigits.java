// Last updated: 5/25/2026, 11:10:34 AM
class Solution {
    public int addDigits(int n) {
        int a=0;
        while(n>0){
            a+=n%10;
            n/=10;
        }
        if(a<10){
            return a;
        }
        else
        return addDigits(a);
    }
}