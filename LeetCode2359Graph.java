import java.util.Arrays;

public class LeetCode2359Graph {
    private static int solution(int node1, int node2, int[] edges){
        int result = -1;
        int ans = Integer.MAX_VALUE;
        int n = edges.length;

        
        int[] dist1 = new int[n];
        int[] dist2 = new int[n];
        boolean[] visited1 = new boolean[n];
        boolean[] visited2 = new boolean[n];

        Arrays.fill(dist1, -1);
        Arrays.fill(dist2, -1);
        Arrays.fill(visited1, false);
        Arrays.fill(visited2, false);
        
        dfs(node1, dist1, visited1, edges, 0);
        dfs(node2, dist2, visited2, edges, 0);

        for(int i = 0; i < n; i++){
            if(dist1[i] != -1 && dist2[i] != -1){
                if(Math.max(dist1[i], dist2[i]) < ans){
                    ans = Math.max(dist1[i], dist2[i]);
                    result = i;
                }
            }
        }
        return result;
    }

    private static void dfs(int node, int[] dist, boolean[] visited, int[] edges, int distance){
        if (node == -1 || visited[node]) return;

        visited[node] = true;
        dist[node] = distance;
        dfs(edges[node], dist, visited, edges, distance + 1);

    }

    public static void main(String[] args) {
        int[] arr1 = {2,2,3,-1};
        int[] arr2 = {1,2,-1};
        System.out.println(solution(0, 1, arr1));
        System.out.println(solution(0, 2, arr2));
    }
}
