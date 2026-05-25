// Last updated: 5/25/2026, 11:08:15 AM
import java.util.*;

class Solution {
    List<List<Integer>> r = new ArrayList<>();

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<Integer> temp = new ArrayList<>();
        temp.add(0);
        back(0, temp, graph);
        return r;
    }

    public void back(int source, List<Integer> temp, int[][] graph) {
        if (source == graph.length - 1) {
            r.add(new ArrayList<>(temp)); // ✅ add copy
            return;
        }

        for (int next : graph[source]) {
            temp.add(next);              // choose
            back(next, temp, graph);     // explore
            temp.remove(temp.size() - 1); // un-choose (backtrack)
        }
    }
}
