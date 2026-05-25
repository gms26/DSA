// Last updated: 5/25/2026, 11:05:05 AM
class Solution {
    HashMap<Integer,List<Integer>>map=new HashMap<>();
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        
        for(int i=0;i<edges.length;i++){
            int u = edges[i][0];
            int v = edges[i][1];

            map.putIfAbsent(u, new ArrayList<>());
            map.putIfAbsent(v, new ArrayList<>());

            map.get(u).add(v);
            map.get(v).add(u);
        }
       // Queue<Integer>q=new LinkedList<>();
        boolean[] vis=new boolean[n];
        return dfs(source,destination,vis);}
        // q.add(source);
        // while(!q.isEmpty()){
        //     int y=q.poll();   bfs method
        //     if(y==destination){
        //         return true;
        //     }
        //     for(int i:map.get(y)){
        //         if(vis[i]==false){
        //             q.add(i);
        //             vis[i]=true; 
        //         }
        //     }
        // }
       public boolean dfs(int source,int destination,boolean[] vis){
        vis[source]=true;
        if(source==destination)return true;
        for(int i:map.get(source)){
            if(vis[i]==false){
                if(dfs(i,destination,vis)){
                return true;}
            }
            
        }
       
       return false;
    }
}