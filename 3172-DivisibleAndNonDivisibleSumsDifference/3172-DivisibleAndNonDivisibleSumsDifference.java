// Last updated: 5/25/2026, 11:03:43 AM
class Solution {
    public int differenceOfSums(int n, int m) {
        int a=0,b=0;
        for(int i=1;i<=n;i++){
            if(i%m==0){
                a+=i;
            }
            else{
                b+=i;
            }
        }
        return b-a;
    }
}