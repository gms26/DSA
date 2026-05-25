// Last updated: 5/25/2026, 11:04:45 AM
class Solution {
    public int triangularSum(int[] n) {
        if(n.length==1){
            return n[0];
        }
        int a=n.length;
        while(a>1){
            for(int i=0;i<a-1;i++){
                n[i]=(n[i]+n[i+1])%10;
            }
            a--;
        }
        return n[0];
    }
}