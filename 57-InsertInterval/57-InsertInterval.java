// Last updated: 8/10/2026, 12:27:55 PM
class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int i=0,n=intervals.length;
        List<int[]>m=new ArrayList<>();
        while(i<n && intervals[i][1]<newInterval[0]){
            m.add(intervals[i]);
            i++;
        }
        while(i<n && intervals[i][0]<=newInterval[1]){
            newInterval[0]=Math.min(intervals[i][0],newInterval[0]);
            newInterval[1]=Math.max(intervals[i][1],newInterval[1]);
            i++;
        }
        m.add(newInterval);
        while(i<n){m.add(intervals[i]);i++;}
return m. toArray(new int[m.size()][]);
    }
}