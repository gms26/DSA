// Last updated: 8/10/2026, 12:27:57 PM
class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b) -> Integer.compare(a[0],b[0]));
        int a=intervals[0][0],b=intervals[0][1];
        List<int[]>m=new ArrayList<>();
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]<=b){
                b=Math.max(b,intervals[i][1]);
            }
            else{
                m.add(new int[]{a,b});
             a=intervals[i][0];
             b=intervals[i][1];
             }
        }
        m.add(new int[]{a,b});
        return m.toArray(new int[m.size()][]);
    }
}