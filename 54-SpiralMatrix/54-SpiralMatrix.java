// Last updated: 5/25/2026, 11:12:58 AM
class Solution {
    public List<Integer> spiralOrder(int[][] m) {
        ArrayList<Integer> a=new ArrayList<>();
        if(m.length==0)return a;
        int t=0,b=m.length-1;
        int l=0,r=m[0].length-1;
        while(t<=b && l<=r){
            for(int i=l;i<=r;i++){
                a.add(m[t][i]);
            }
            t++;
            for(int i=t;i<=b;i++){
                a.add(m[i][r]);
            }
            r--;
            if(t<=b){
                for(int i=r;i>=l;i--){
                    a.add(m[b][i]);
                }
                b--;
            }
            if(l<=r){
                for(int i=b;i>=t;i--){
                    a.add(m[i][l]);
                }
                l++;
            }
        }
        return a;
    }
}