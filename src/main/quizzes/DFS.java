package main.quizzes;

public class DFS {
    static int[][] graph = {{}, {2,3,8}, {1,6,8}, {1,5}, {5,7}, {3,4,7}, {2}, {4,5}, {1,2}};
    static boolean[] visited = new boolean[graph.length + 1];

    public static void main(String[] args) {
        dfs(1);
    }

    public static void dfs(int n) {
        if (visited[n]) return;

        System.out.println(n + " ");
        visited[n] = true;

        for (int node : graph[n]) {
            dfs(node);
        }
    }

}
