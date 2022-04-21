package main.quizzes;

public class TargetNumber {
    int answer = 0;

    public int solution(int[] numbers, int target) {
        dfs(numbers, 0, 0, target);

        return answer;
    }

    public void dfs(int[] numbers, int idx, int sum, int target) {
        if (idx == numbers.length) {
            if (sum == target) answer++;
            return;
        }

        int pSum = sum + numbers[idx];
        int nSum = sum - numbers[idx];

        dfs(numbers, idx + 1, pSum, target);
        dfs(numbers, idx + 1, nSum, target);
    }
}
