// Last updated: 5/25/2026, 11:05:12 AM
class Solution {
    public boolean isThree(int n) {
        int c=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                c++;
            }
        }
        return c==3;
    }
}