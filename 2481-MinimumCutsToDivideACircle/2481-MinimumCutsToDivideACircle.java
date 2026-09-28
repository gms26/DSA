// Last updated: 9/28/2026, 10:28:45 PM
class Solution {
    public int numberOfCuts(int n) {
        if (n==1){
        return 0;}
        else if( n%2==0){
            return n/2;
        }
        else{
            return n;
        }

    }
}