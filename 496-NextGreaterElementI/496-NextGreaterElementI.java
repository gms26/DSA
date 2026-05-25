// Last updated: 5/25/2026, 11:09:17 AM
class Solution {
    public int[] nextGreaterElement(int[] n1, int[] n2) {
        int []a=new int[n1.length];
        
        for(int i=0;i<n1.length;i++){
            int b=n1[i];
            boolean f=false;
            boolean s=false;
            for(int j=0;j<n2.length;j++){
                if(n2[j]==b){
                    s=true;
                }
                else if(s&&n2[j]>b){
                    a[i]=n2[j];
                    f=true;
                    break;
                }
            }
            if(!f){
                a[i]=-1;
            }
        }
        return a;
    }
}