// Last updated: 5/25/2026, 11:12:27 AM
class Solution {
    public void merge(int[] n1, int m, int[] n2, int n) {
        int b=m+n;
        int []a=new int[b];
        
        int j=0;
        for(int i=0;i<m;i++){
            a[j++]=n1[i];
        }
        
        for(int i=0;i<n;i++){
              a[j++]=n2[i];
        }
        Arrays.sort(a);
        for(int i=0;i<b;i++){
                n1[i]=a[i];
        }
    }
}