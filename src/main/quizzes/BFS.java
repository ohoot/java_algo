package main.quizzes;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    static int[][] graph = {{}, {2,3,8}, {1,6,8}, {1,5}, {5,7}, {3,4,7}, {2}, {4,5}, {1,2}};
    static boolean[] visited = new boolean[graph.length + 1];
    static Queue<Integer> queue = new LinkedList<>();

    public static void main(String[] args) {
        bfs(1);
    }

    public static void bfs(int n) {
        queue.offer(n);
        visited[n] = true;

        while (!queue.isEmpty()) {
            int x = queue.poll();

            for (int y : graph[x]) {
                if (!visited[y]) {
                    queue.offer(y);
                    visited[y] = true;
                }
            }
        }
    }

}
