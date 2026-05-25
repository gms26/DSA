// Last updated: 5/25/2026, 11:11:17 AM
class Solution {
    public void rotate(int[] n, int k) {
        int l=n.length;
        k%=l;
        int[]t=new int[l];
        for(int i=0;i<l;i++){
            t[(i+k)%l]=n[i];
        }
        for(int i=0;i<l;i++){
            n[i]=t[i];
        }
    }
}