// Last updated: 5/25/2026, 11:13:45 AM
class Solution {
    public int maxArea(int[] h) {
        int i=0,j=h.length-1;
        int a=-1;
        while(i<j){
            int w=j-i;
            int b=Math.min(h[i],h[j]);
            int s=w*b;
            if(s>a){
                a=s;
            }
            if(h[i]>h[j]){
                j--;
            }else{
                i++;
            }
        }
        return a;
    }
}