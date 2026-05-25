// Last updated: 5/25/2026, 11:06:06 AM
class Solution {
    class Pair{
        int node;
        int cost;
        Pair(int node,int cost){
            this.node=node;
            this.cost=cost;
        }
    }
    int c=0;
    public int minReorder(int n, int[][] connections) {
        List<List<Pair>>g=new ArrayList<>();
        for(int i=0;i<n;i++){
            g.add(new ArrayList<>());
        }
        for(int []i:connections){
            int u=i[0];
            int v=i[1];
            g.get(u).add(new Pair(v,1));
            g.get(v).add(new Pair(u,0));
        }
        boolean visted[]=new boolean[n];
        dfs(0,g,visted);
        return c;
    }
    public void dfs(int node,List<List<Pair>>g,boolean visted[]){
        visted[node]=true;
        for(Pair nei:g.get(node)){
        if(!visted[nei.node]){
            c+=nei.cost;
            dfs(nei.node,g,visted);
        }}
    }
}