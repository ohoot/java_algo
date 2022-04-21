package main.quizzes;

public class Network {
    public int solution(int n, int[][] computers) {
        boolean[] visited = new boolean[n];

        int answer = 0;

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(i, visited, computers);
                answer++;
            }
        }

        return answer;
    }

    public void dfs(int n, boolean[] visited, int[][] computers) {
        if (visited[n]) return;

        visited[n] = true;

        for (int i = 0; i < computers[n].length; i++) {
            if (n != i && computers[n][i] == 1) {
                dfs(i, visited, computers);
            }
        }
    }
}
