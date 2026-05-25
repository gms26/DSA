// Last updated: 5/25/2026, 11:12:00 AM
class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> r=new ArrayList<>();
        for(int i=0;i<n;i++){
            List<Integer> row=new ArrayList<>();
            int v=1;
            for(int j=0;j<=i;j++){
                row.add(v);
                v=v*(i-j)/(j+1);
            }
            r.add(row);
        }
        return r;
    }
}