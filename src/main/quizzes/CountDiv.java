package main.quizzes;

public class CountDiv {
    public static int solution(int A, int B, int K) {
        int result = (B - A) / K;

        if (A % K == 0 || B % K == 0) result++;

        return result;
    }

    public static void main (String[] args) {
        System.out.println(solution(11, 14, 2));

        for (int i = 1; i < 21; i++) {
            System.out.println(i + ": " + i * 17);
        }
    }

}
