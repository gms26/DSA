// Last updated: 5/25/2026, 11:06:21 AM
class Solution {
    public int[] smallerNumbersThanCurrent(int[] n) {
        int[] a=new int[n.length];
        for(int i=0;i<n.length;i++){
            int c=0;
            for(int j=0;j<n.length;j++){
                if(n[i]>n[j] && i!=j){
                    c++;
                }
            }
            a[i]=c;
        }
        return a;
    }
}