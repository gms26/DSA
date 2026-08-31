// Last updated: 8/31/2026, 12:12:23 PM
1class Solution {
2    public int[][] kClosest(int[][] points, int k) {
3        PriorityQueue<Integer>pq=new PriorityQueue<>();
4        for(int i=0;i<points.length;i++){
5            int z=0;
6            for(int j=0;j<points[0].length;j++){
7                 z+=points[i][j]*points[i][j];
8            }
9            pq.add(z);
10        }
11        ArrayList<Integer>ar=new ArrayList<>();
12        for(int i=0;i<k;i++){
13           ar.add( pq.poll());
14        }
15     //   System.out.print(ar);
16        int[][]res=new int[ar.size()][2];
17        int k1=0;
18        for(int i=0;i<points.length;i++){
19            int z=0;
20            for(int j=0;j<points[0].length;j++){
21                 z+=points[i][j]*points[i][j];
22            }
23            if(ar.contains(z)){
24                res[k1][0]=points[i][0];
25                res[k1++][1]=points[i][1];
26            }
27           // pq.add(z);
28        }
29return res;
30    }
31}