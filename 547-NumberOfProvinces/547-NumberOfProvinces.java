// Last updated: 5/25/2026, 11:08:59 AM
import java.util.*;

class Solution {
    boolean[] visited;

    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        visited = new boolean[n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(i, isConnected);
                count++; 
            }
        }
        return count;
    }

    void dfs(int city, int[][] isConnected) {
        visited[city] = true;

        for (int j = 0; j < isConnected.length; j++) {
            if (isConnected[city][j] == 1 && !visited[j]) {
                dfs(j, isConnected);
            }
        }
    }
}
// void bfs(int start, int[][] isConnected, boolean[] visited) {
//         Queue<Integer> q = new LinkedList<>();
//         q.add(start);
//         visited[start] = true;             bfs method

//         while (!q.isEmpty()) {
//             int city = q.poll();

//             for (int j = 0; j < isConnected.length; j++) {
//                 if (isConnected[city][j] == 1 && !visited[j]) {
//                     visited[j] = true;
//                     q.add(j);
//                 }
//             }
//         }
