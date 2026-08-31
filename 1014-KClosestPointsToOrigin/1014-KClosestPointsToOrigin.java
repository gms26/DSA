// Last updated: 8/31/2026, 12:23:27 PM
class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        for(int i=0;i<points.length;i++){
            int z=0;
            for(int j=0;j<points[0].length;j++){
                 z+=points[i][j]*points[i][j];
            }
            pq.add(z);
        }
        ArrayList<Integer>ar=new ArrayList<>();
        for(int i=0;i<k;i++){
           ar.add( pq.poll());
        }
     //   System.out.print(ar);
        int[][]res=new int[ar.size()][2];
        int k1=0;
        for(int i=0;i<points.length;i++){
            int z=0;
            for(int j=0;j<points[0].length;j++){
                 z+=points[i][j]*points[i][j];
            }
            if(ar.contains(z)){
                res[k1][0]=points[i][0];
                res[k1++][1]=points[i][1];
            }
           // pq.add(z);
        }
return res;
    }
}