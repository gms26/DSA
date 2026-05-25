// Last updated: 5/25/2026, 11:11:48 AM
class Solution {
    public int candy(int[] r) {
        int n=r.length;
        int[]a=new int[n];
        Arrays.fill(a,1);
        for(int i=1;i<n;i++){
            if(r[i-1]<r[i])a[i]=a[i-1]+1;
        }
        for(int i=n-2;i>=0;i--){
            if(r[i]>r[i+1]){
                a[i]=Math.max(a[i],a[i+1]+1);
            }
        }
        int c=0;
        for(int i=0;i<n;i++){
            c+=a[i];
        }
        return c;
    }
}