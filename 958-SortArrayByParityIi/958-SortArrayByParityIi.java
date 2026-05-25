// Last updated: 5/25/2026, 11:07:45 AM
class Solution {
    public int[] sortArrayByParityII(int[] n) {
        int[] a =new int[n.length/2];
        int[] b=new int[n.length/2];
        int j=0,m=0;
       for(int i=0;i<n.length;i++){
        if(n[i]%2==0){
            a[j++]=n[i];
        }
        else{
            b[m++]=n[i];
        }
       }
       int x=0,y=0;
       for(int i=0;i<n.length;i++){
        if(i%2==0){
            n[i]=a[x++];
        }
        else{
            n[i]=b[y++];
        }
       }
       return n;
    }
}