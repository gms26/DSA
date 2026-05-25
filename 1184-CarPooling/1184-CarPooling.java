// Last updated: 5/25/2026, 11:07:10 AM
class Solution {
    public boolean carPooling(int[][] t, int capacity) {
        int []a=new int[1001];
        int m=0;
        for(int i=0;i<t.length;i++){
            int st=t[i][1];
            int en=t[i][2];
            int val=t[i][0];
            a[st]+=val;
            
            a[en]-=val;
            
        }
        
        for(int i=0;i<a.length;i++){
            m+=a[i];
            if(m>capacity)return false;
        }
        return true;
    }
}