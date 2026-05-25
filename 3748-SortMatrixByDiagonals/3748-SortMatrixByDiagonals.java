// Last updated: 5/25/2026, 11:03:13 AM
class Solution {
    public int[][] sortMatrix(int[][] grid) {
        Map<Integer,List<Integer>>a=new HashMap<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                int c=i-j;
                a.putIfAbsent(c,new ArrayList<>());
                a.get(c).add(grid[i][j]);
            }
        }
        for(int i:a.keySet()){
            List<Integer>list=a.get(i);
            if(i>=0)list.sort(Collections.reverseOrder());
            else Collections.sort(list);
        }
        Map<Integer,Integer>m=new HashMap<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                int c=i-j;
                m.putIfAbsent(c,0);
                int z=m.get(c);
                grid[i][j]=a.get(c).get(z);
                m.put(c,z+1);
            }
        }
        return grid;
    }
}