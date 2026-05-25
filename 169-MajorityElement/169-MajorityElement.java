// Last updated: 5/25/2026, 11:11:25 AM
class Solution {
    public int majorityElement(int[] n) {
       int a=n.length;
       for(int i=0;i<a;i++){
        int c=0;
        for(int j=0;j<a;j++){
            if(n[i]==n[j])
            c++;
        }if(c>a/2)
        return n[i];
       } return -1;
    }
}