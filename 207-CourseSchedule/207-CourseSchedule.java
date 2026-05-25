// Last updated: 5/25/2026, 11:11:05 AM
import java.util.*;

class Solution {
    HashMap<Integer, List<Integer>> map = new HashMap<>();

    public boolean canFinish(int n, int[][] prerequisites) {

        // build directed graph (prereq -> course)
        for(int i = 0; i < prerequisites.length; i++){
            int u = prerequisites[i][0];
            int v = prerequisites[i][1];

            map.putIfAbsent(v, new ArrayList<>());
            map.get(v).add(u);
        }

        boolean[] vis = new boolean[n];
        boolean[] path = new boolean[n];

        for(int i = 0; i < n; i++){
            if(dfs(i, vis, path)) return false;
        }
        return true;
    }

    public boolean dfs(int st, boolean[] vis, boolean[] path){
        if(path[st]) return true;    // cycle found
        if(vis[st]) return false;    // already processed

        vis[st] = true;
        path[st] = true;

        if(map.containsKey(st)){
            for(int i : map.get(st)){
                if(dfs(i, vis, path)) return true;
            }
        }

        path[st] = false;   // backtrack
        return false;
    }
}
