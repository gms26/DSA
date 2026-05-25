// Last updated: 5/25/2026, 11:04:33 AM
class Solution {
    long c=0;
    HashMap<Integer,List<Integer>> map;
    boolean[]vis;
    public long countPairs(int n, int[][] edges) {
        map=new HashMap<>();
        vis=new boolean[n];
        for(int i=0;i<n;i++){
            map.put(i,new ArrayList<>());
        }
        for(int[] i:edges){
            map.get(i[0]).add(i[1]);
            map.get(i[1]).add(i[0]);
        }
        long r=n,s=0;
        for(int i=0;i<n;i++){
            if(!vis[i]){
                int c=dfs(i);
                r=r-c;
                s+=r*c;
            }
        }
        return s;
    }
    int dfs(int node) {
    vis[node] = true;
    int count = 1;

    for (int nei : map.get(node)) {
        if (!vis[nei]) {
            count += dfs(nei);
        }
    }
    return count;
}

}